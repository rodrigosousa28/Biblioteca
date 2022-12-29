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
	
	//used at Login
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
	(JPanel panelBackgroundBooks, List<Book> books) {
		JLabel lblNoBooks = new JLabel();
		lblNoBooks.setFont(new java.awt.Font("Maiandra GD", 1, 48)); // NOI18N
        lblNoBooks.setForeground(new java.awt.Color(102, 0, 0));
        lblNoBooks.setText("Você não possui livros no momento...");
        panelBackgroundBooks.add(lblNoBooks);
        lblNoBooks.setVisible(false);
        lblNoBooks.setBounds(10, -20, 870, 370);
        
		int xPanel = 70;
	    int widthPanel = 110;
	    int heightPanel = 140;
	    
	    int xLabel = 30;
	    int yLabel = 240;
	    
		JPanel panelImage;
        JLabel lblImageBook;
        JLabel lblName;
        JLabel lblAuthor;
        JLabel lblGenres;
        JLabel lblPages;
        
		for(int i = 0; i < books.size(); i++) {
			if(books.get(i) == null) {
				books.remove(i);
			}
		}
		
		if(books.size() == 0) {
			lblNoBooks.setVisible(true);
			return;
		}

		for(int i = 0; i < books.size(); i++) {
			//Maximum of 4 books in suggestBooks
			if(i > 3) {
				break;
			}
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
			
			panelImage.setBounds(xPanel, 80, widthPanel, heightPanel);
			lblImageBook.setBounds(6, 5, 108, 130);
			panelBackgroundBooks.add(panelImage);
			
			for(int j = 0; j < 4; j++) {
				Component item = (Component) itens.get(j);
				item.setBounds(xLabel, yLabel, 220, 20);
				switch(j) {
				case 0:
					((JLabel) item).setText("Nome: ".concat(books.get(i).getName()));
					break;
				case 1:
					((JLabel) item).setText("Autor: ".concat(books.get(i).getAuthor()));
					break;
				case 2:
					((JLabel) item).setText("Gêneros: ".concat(books.get(i).getGenres()));
					break;
				case 3:
					((JLabel) item).setText("Páginas: ".concat(Integer.toString(books.get(i).getNumberOfPages())));					
					
				}
				panelBackgroundBooks.add(item);
				yLabel += 30;
			}
			yLabel = 240;
			xLabel += 320;
			
			if(books.get(i).getImage() != null) {
				ImageIcon icon = new ImageIcon(books.get(i).getImage());
				icon.setImage(icon.getImage().getScaledInstance(panelImage.getWidth(),
						panelImage.getHeight(), 100));
				lblImageBook.setIcon(icon);
				
				panelImage.setBounds(xPanel, 80, 110, 140);
				lblImageBook.setBounds(0, 5, 108, 130);
			}
			
			xPanel += 320;
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

