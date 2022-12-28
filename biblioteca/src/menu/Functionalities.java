package menu;

import java.awt.Component;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import data_base.DAO;
import entities.Book;
import entities.User;
import exceptions.AlreadyExistsException;
import exceptions.IncorrectPasswordException;
import exceptions.InvalidCpfException;
import exceptions.Validate;
import menu.adm.MainMenuAdm;
import menu.all.MainMenu;
import util.TableModelRecord;

public class Functionalities {

	private Functionalities() {}
	
	//used at LoginScreen
	public static void Login(JFrame screen, JTextField txtLogin, JPasswordField txtPassword) {
		DAO dao = new DAO();
        String username = txtLogin.getText();
        User user = null;
        int mistakes = 0;
        
        try {
			user = dao.findUserByUsername(username);
			String type = user.getType();
			String realPassword = user.getPassword();			
			
			String passwordPassed = "";

			char[] passwordPassedChar = txtPassword.getPassword();
			
			for(int i = 0; i < passwordPassedChar.length; i++) {
				passwordPassed = passwordPassed.concat(passwordPassedChar[i]+"");
			}
			
			if(realPassword.equalsIgnoreCase(passwordPassed)) {
				if(type.equals("Administrator")) {
					MainMenuAdm menu = new MainMenuAdm(user);
					menu.setVisible(true);				
				}else {
					MainMenu menu = new MainMenu(user);
					menu.setVisible(true);
				}
			}else {
				throw new IncorrectPasswordException();	
			}
			
		} catch (SQLException | NullPointerException e) {
			if(user == null)
				JOptionPane.showMessageDialog(screen, "Usuário não encontrado!");
			mistakes++;
		} catch (IncorrectPasswordException i) {
			JOptionPane.showMessageDialog(screen, i.getMessage());
			mistakes++;
		}
        finally {
			dao.close();
		}
        
        if(mistakes == 0)
        	screen.dispose();
	}

	//used at MainMenu
	public static void loadInformations
	(JPanel panelBackgroundBooks, User user) {
		
		int xPanel = 70;
	    int yPanel = 80;
	    int widthPanel = 110;
	    int heightPanel = 140;
	    
	    int xLabel = 30;
	    int yLabel = 240;
	    int widthLabel = 220;
	    int heightLabel = 20;
	    
		JPanel panelImage;
        JLabel lblImageBook;
        JLabel lblName;
        JLabel lblAuthor;
        JLabel lblGenres;
        JLabel lblPages;
        
        DAO dao = new DAO();
        List<Book> myBooks = new ArrayList<>();
		try {
			myBooks = dao.findBooksByUser(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		for(int i = 0; i < myBooks.size(); i++) {
			if(myBooks.get(i) == null) {
				myBooks.remove(i);
			}
		}
		

		for(int i = 0; i < myBooks.size(); i++) {
			panelImage = new JPanel();
			lblImageBook = new JLabel();
			lblName = new JLabel();
			lblAuthor = new JLabel();
			lblGenres = new JLabel();
			lblPages = new JLabel();
			
			List<Object> itens = new ArrayList<>();
			itens.add(lblName);
			itens.add(lblAuthor);
			itens.add(lblGenres);
			itens.add(lblPages);
			
			panelImage.setLayout(null);
			panelImage.add(lblImageBook);
			panelImage.setBackground(new java.awt.Color(255, 255, 255));
			panelImage.setBounds(xPanel, yPanel, widthPanel, heightPanel);
			lblImageBook.setBounds(6, 5, widthPanel - 2, heightPanel - 10);
			panelBackgroundBooks.add(panelImage);
			
			for(int j = 0; j < 4; j++) {
				Component item = (Component) itens.get(j);
				item.setBounds(xLabel, yLabel, widthLabel, heightLabel);
				switch(j) {
				case 0:
					((JLabel) item).setText("Nome: ".concat(myBooks.get(i).getName()));
					break;
				case 1:
					((JLabel) item).setText("Autor: ".concat(myBooks.get(i).getAuthor()));
					break;
				case 2:
					((JLabel) item).setText("Gêneros: ".concat(myBooks.get(i).getGenres()));
					break;
				case 3:
					((JLabel) item).setText("Páginas: ".concat(Integer.toString(myBooks.get(i).getNumberOfPages())));					
					
				}
				panelBackgroundBooks.add(item);
				yLabel += 30;
			}
			yLabel = 240;
			xLabel += 320;
			
			if(myBooks.get(i).getImage() != null) {
				ImageIcon icon = new ImageIcon(myBooks.get(i).getImage());
				icon.setImage(icon.getImage().getScaledInstance(panelImage.getWidth(),
						panelImage.getHeight(), 100));
				lblImageBook.setIcon(icon);
				
				panelImage.setBounds(xPanel, yPanel, widthPanel, heightPanel);
				lblImageBook.setBounds(0, 5, widthPanel - 2, heightPanel - 10);
			}
			
			xPanel += 320;
		}
		
        dao.close();
	}
	
	public static void loadInformations(Book book,
			JLabel lblName1, JLabel lblName2, JLabel lblName3,
			JLabel lblAuthor1, JLabel lblAuthor2, JLabel lblAuthor3,
			JLabel lblGenre1, JLabel lblGenre2, JLabel lblGenre3,
			JLabel lblPages1, JLabel lblPages2, JLabel lblPages3,
			JPanel panelImage1,JPanel panelImage2, JPanel panelImage3,
			JLabel lblImageBook1, JLabel lblImageBook2, JLabel lblImageBook3) {
		
		DAO dao = new DAO();
		try {
			List<Book> suggestedBooks = dao.suggestBooks(book);
			
			try {
				if(suggestedBooks.get(0) != null) {
					lblName1.setText("Nome: ".concat(suggestedBooks.get(0).getName()));
					lblAuthor1.setText("Autor: ".concat(suggestedBooks.get(0).getAuthor()));
					lblGenre1.setText("Gênero(s): ".concat(suggestedBooks.get(0).getGenres()));
					lblPages1.setText("Páginas: ".concat(Integer.toString(suggestedBooks.get(0).getNumberOfPages())));
					ImageIcon iconOne = new ImageIcon(suggestedBooks.get(0).getImage());
					iconOne.setImage(iconOne.getImage().getScaledInstance(panelImage1.getWidth(),
							panelImage1.getHeight(), 100));
					lblImageBook1.setIcon(iconOne);					
				}else {
					lblName1.setVisible(false);
					lblAuthor1.setVisible(false);
					lblGenre1.setVisible(false);
					lblImageBook1.setVisible(false);
				}
				
				if(suggestedBooks.get(1) != null) {
					lblName2.setText("Nome: ".concat(suggestedBooks.get(1).getName()));
					lblAuthor2.setText("Autor: ".concat(suggestedBooks.get(1).getAuthor()));
					lblGenre2.setText("Gênero(s): ".concat(suggestedBooks.get(1).getGenres()));
					lblPages2.setText("Páginas: ".concat(Integer.toString(suggestedBooks.get(1).getNumberOfPages())));
					ImageIcon iconTwo = new ImageIcon(suggestedBooks.get(1).getImage());
					iconTwo.setImage(iconTwo.getImage().getScaledInstance(panelImage2.getWidth(),
							panelImage2.getHeight(), 100));
					lblImageBook2.setIcon(iconTwo);
				}else {
					lblName2.setVisible(false);
					lblAuthor2.setVisible(false);
					lblGenre2.setVisible(false);
					lblImageBook2.setVisible(false);					
				}
				
				if(suggestedBooks.get(2) != null) {
					lblName3.setText("Nome: ".concat(suggestedBooks.get(2).getName()));
					lblAuthor3.setText("Autor: ".concat(suggestedBooks.get(2).getAuthor()));
					lblGenre3.setText("Gênero(s): ".concat(suggestedBooks.get(2).getGenres()));
					lblPages3.setText("Páginas: ".concat(Integer.toString(suggestedBooks.get(2).getNumberOfPages())));
					ImageIcon iconThree = new ImageIcon(suggestedBooks.get(2).getImage());
					iconThree.setImage(iconThree.getImage().getScaledInstance(panelImage3.getWidth(),
							panelImage3.getHeight(), 100));
					lblImageBook3.setIcon(iconThree);	
				}else {
					lblName3.setVisible(false);
					lblAuthor3.setVisible(false);
					lblGenre3.setVisible(false);
					lblImageBook3.setVisible(false);							
				}
				
			} catch(IndexOutOfBoundsException e) {
				int i = suggestedBooks.size();
				if(i == 0) {
					lblName1.setVisible(false);
					lblAuthor1.setVisible(false);
					lblGenre1.setVisible(false);
					lblPages1.setVisible(false);
					lblImageBook1.setVisible(false);
					
					lblName2.setVisible(false);
					lblAuthor2.setVisible(false);
					lblGenre2.setVisible(false);
					lblPages2.setVisible(false);
					lblImageBook2.setVisible(false);
					
					lblName3.setVisible(false);
					lblAuthor3.setVisible(false);
					lblGenre3.setVisible(false);
					lblPages3.setVisible(false);
					lblImageBook3.setVisible(false);
				}else if(i == 1) {
					lblName2.setVisible(false);
					lblAuthor2.setVisible(false);
					lblGenre2.setVisible(false);
					lblPages2.setVisible(false);
					lblImageBook2.setVisible(false);
					
					lblName3.setVisible(false);
					lblAuthor3.setVisible(false);
					lblGenre3.setVisible(false);
					lblPages3.setVisible(false);
					lblImageBook3.setVisible(false);
				}else if(i == 2) {
					lblName3.setVisible(false);
					lblAuthor3.setVisible(false);
					lblGenre3.setVisible(false);
					lblPages3.setVisible(false);
					lblImageBook3.setVisible(false);
					lblImageBook3.setVisible(false);
				}
			}
			
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}

	public static void registerUser
	(JTextField txtName, JTextField txtRegistrationNumber, JTextField txtCPF,
	JTextField txtUsername, JPasswordField txtPassword, JComboBox<String> cbbType) throws InvalidCpfException, AlreadyExistsException {
		DAO dao = new DAO();
		
		String name = txtName.getText();
		String registrationNumber = txtRegistrationNumber.getText();
		String CPF = txtCPF.getText();
		String login = txtUsername.getText();
		char[] passwordChar = txtPassword.getPassword();
		String type = (String) cbbType.getSelectedItem();
		
		String password = "";
		
		for(char c: passwordChar) {
			password += c;
		}
		
		if(!Validate.cpf(CPF)) {
			throw new InvalidCpfException();
		}
		
		if(type.equals("Aluno")) {
			type = "Student";
		}
		
		try {
			dao.insertUser(new User(name, CPF, registrationNumber, type, login, password));
		} catch (SQLException e) {
			
		} 
		
		dao.close();
		
	}

	public static String showTwoNames(User user) {
		String userName = user.getName();
        String[] userNameList = userName.split(" ");
        String finalUserName = "";
        
        for(int i = 0; i < 2; i++) {
        	try {
        		finalUserName += userNameList[i].concat(" ");
        	} catch (IndexOutOfBoundsException e) {
        		break;
        	}
        }
        
        finalUserName.trim();
		return finalUserName;
	}

	public static void showInformations
	(User user, JLabel lblName, JLabel lblRegistrationNumber,
	JLabel lblCPF, JLabel lblLogin, JLabel lblType) {
		
		lblName.setText(lblName.getText().concat(user.getName()));
		lblRegistrationNumber.setText(lblRegistrationNumber.getText().concat(user.getRegistrationNumber()));
		lblCPF.setText(lblCPF.getText().concat(formatCpf(user.getCPF())));
		lblLogin.setText(lblLogin.getText().concat(user.getUsername()));
		
		String type = user.getType();
		switch(user.getType()) {
		case "Administrator":
			type = "Administrador";
			break;
		case "Student":
			type = "Aluno";
		}
		
		lblType.setText(lblType.getText().concat(type));
		
	}
	
	public static void showInformations(User user, JTextField txtName, JTextField txtRegistrationNumber, JTextField txtLogin, JPasswordField txtPassword) {
		txtName.setText(user.getName());
		txtRegistrationNumber.setText(user.getRegistrationNumber());
		txtLogin.setText(user.getUsername());
		txtPassword.setText(user.getPassword());
	}
	
	public static void loadTable
	(JComboBox<String> cbbChoiceType, JTextField txtName,
	TableModelRecord tableModel, JTable jTable1, JScrollPane jScrollPane1) throws SQLException {
		
		String option = (String) cbbChoiceType.getSelectedItem();
    	String name = txtName.getText();
    	Object type;
    	
    	DAO dao = new DAO();
    	if(option.equalsIgnoreCase("Usuário")) {
    		type = dao.findUserByUsername(name);
    	}else {
    		type = dao.findBookByName(name);
    	}
    	
    	tableModel = new TableModelRecord(dao.findRecordsByItem(type, true));
    	jTable1 = new javax.swing.JTable(tableModel);
    	jScrollPane1.setViewportView(jTable1);
	}
	
	public static double calculateTaxe(entities.Record record) {
		User user = record.getUser();
		DAO dao = new DAO();
		double taxe = 0;
		try {
			int daysLate = dao.daysLate(record);
			if(daysLate > 7) {
				if(user.getType().equalsIgnoreCase("Student")) {
					taxe = 0.5 * daysLate;
				}else {
					taxe = 0.8 * daysLate;				
				}
			}
		} catch (SQLException | ParseException e) {
			e.printStackTrace();
		}
		
		dao.close();
		return taxe;
	}
	
	public static String formatCpf(String cpf) {
		
		String subCpfOne = cpf.substring(0,3);
		String subCpfTwo = cpf.substring(3,6);
		String subCpfThree = cpf.substring(6,9);
		String subCpfFour = cpf.substring(9);
		
		String cpfFormat = subCpfOne.concat(".")
							.concat(subCpfTwo)
							.concat(".")
							.concat(subCpfThree)
							.concat("-")
							.concat(subCpfFour);
		
		return cpfFormat;
	}
	
	
}

