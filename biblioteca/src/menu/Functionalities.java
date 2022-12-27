package menu;

import java.sql.SQLException;
import java.text.ParseException;
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
import menu.all.MyBooksScreen;
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
	(MyBooksScreen screen,
			JLabel lblName1, JLabel lblName2, JLabel lblName3,
			JLabel lblAuthor1, JLabel lblAuthor2, JLabel lblAuthor3,
			JLabel lblGenre1, JLabel lblGenre2, JLabel lblGenre3,
			JLabel lblPages1, JLabel lblPages2, JLabel lblPages3,
			JPanel panelImage1,JPanel panelImage2, JPanel panelImage3,
			JLabel lblImageBook1, JLabel lblImageBook2, JLabel lblImageBook3,
			JLabel lblNoBooks
	) {
		if(screen.getUser() != null) {
        	DAO dao = new DAO();
        	try {
				List<Book> myBooks = dao.findBooksByUser(screen.getUser());
				int quantityBooks = dao.getBooksQuantity(myBooks);
				
				
				for(int i = 0; i < myBooks.size(); i++) {
					if(myBooks.get(i) == null) {
						myBooks.remove(i);
					}
				}
				
				
				if(quantityBooks == 0) {
					
					lblName1.setVisible(false);
					lblAuthor1.setVisible(false);
					lblGenre1.setVisible(false);
					lblPages1.setVisible(false);
					panelImage1.setVisible(false);
					
					lblName2.setVisible(false);
					lblAuthor2.setVisible(false);
					lblGenre2.setVisible(false);
					lblPages2.setVisible(false);
					panelImage2.setVisible(false);
					
					lblName3.setVisible(false);
					lblAuthor3.setVisible(false);
					lblGenre3.setVisible(false);
					lblPages3.setVisible(false);
					panelImage3.setVisible(false);
					
					lblNoBooks.setVisible(true);
					
				}
				
				else if(quantityBooks == 1) {
					lblName1.setText(lblName1.getText().concat(myBooks.get(0).getName()));
					lblAuthor1.setText(lblAuthor1.getText().concat(myBooks.get(0).getAuthor()));
					lblGenre1.setText(lblGenre1.getText().concat(myBooks.get(0).getGenres()));
					lblPages1.setText(lblPages1.getText().concat(Integer.toString(myBooks.get(0).getNumberOfPages())));
					
					if(myBooks.get(0).getImage() != null) {
						ImageIcon icon = new ImageIcon(myBooks.get(0).getImage());
						icon.setImage(icon.getImage().getScaledInstance(panelImage1.getWidth(), panelImage2.getHeight(), 100));
						lblImageBook1.setIcon(icon);						
					}
					
					lblName2.setVisible(false);
					lblAuthor2.setVisible(false);
					lblGenre2.setVisible(false);
					lblPages2.setVisible(false);
					panelImage2.setVisible(false);
					
					lblName3.setVisible(false);
					lblAuthor3.setVisible(false);
					lblGenre3.setVisible(false);
					lblPages3.setVisible(false);
					panelImage3.setVisible(false);
				}
				
				else if(quantityBooks == 2) {
					lblName1.setText(lblName1.getText().concat(myBooks.get(0).getName()));
					lblAuthor1.setText(lblAuthor1.getText().concat(myBooks.get(0).getAuthor()));
					lblGenre1.setText(lblGenre1.getText().concat(myBooks.get(0).getGenres()));
					lblPages1.setText(lblPages1.getText().concat(Integer.toString(myBooks.get(0).getNumberOfPages())));
					
					if (myBooks.get(0).getImage() != null) {
						ImageIcon iconOne = new ImageIcon(myBooks.get(0).getImage());
						iconOne.setImage(iconOne.getImage().getScaledInstance(panelImage1.getWidth(),
								panelImage2.getHeight(), 100));
						lblImageBook1.setIcon(iconOne);
					}
					
					lblName2.setText(lblName2.getText().concat(myBooks.get(1).getName()));
					lblAuthor2.setText(lblAuthor2.getText().concat(myBooks.get(1).getAuthor()));
					lblGenre2.setText(lblGenre2.getText().concat(myBooks.get(1).getGenres()));
					lblPages2.setText(lblPages2.getText().concat(Integer.toString(myBooks.get(1).getNumberOfPages())));
					
					if (myBooks.get(1).getImage() != null) {
						ImageIcon iconTwo = new ImageIcon(myBooks.get(1).getImage());
						iconTwo.setImage(iconTwo.getImage().getScaledInstance(panelImage2.getWidth(),
								panelImage2.getHeight(), 100));
						lblImageBook2.setIcon(iconTwo);
					}
					lblName3.setVisible(false);
					lblAuthor3.setVisible(false);
					lblGenre3.setVisible(false);
					lblPages3.setVisible(false);
					panelImage3.setVisible(false);
				}
				
				else if(quantityBooks == 3) {
					lblName1.setText(lblName1.getText().concat(myBooks.get(0).getName()));
					lblAuthor1.setText(lblAuthor1.getText().concat(myBooks.get(0).getAuthor()));
					lblGenre1.setText(lblGenre1.getText().concat(myBooks.get(0).getGenres()));
					lblPages1.setText(lblPages1.getText().concat(Integer.toString(myBooks.get(0).getNumberOfPages())));
					
					if (myBooks.get(0).getImage() != null) {
						ImageIcon iconOne = new ImageIcon(myBooks.get(0).getImage());
						iconOne.setImage(iconOne.getImage().getScaledInstance(panelImage1.getWidth(),
								panelImage2.getHeight(), 100));
						lblImageBook1.setIcon(iconOne);
					}
					lblName2.setText(lblName2.getText().concat(myBooks.get(1).getName()));
					lblAuthor2.setText(lblAuthor2.getText().concat(myBooks.get(1).getAuthor()));
					lblGenre2.setText(lblGenre2.getText().concat(myBooks.get(1).getGenres()));
					lblPages2.setText(lblPages2.getText().concat(Integer.toString(myBooks.get(1).getNumberOfPages())));
					
					if (myBooks.get(1).getImage() != null) {
						ImageIcon iconTwo = new ImageIcon(myBooks.get(1).getImage());
						iconTwo.setImage(iconTwo.getImage().getScaledInstance(panelImage2.getWidth() - 2,
								panelImage2.getHeight() -2, 100));
						lblImageBook2.setIcon(iconTwo);
					}
					lblName3.setText(lblName3.getText().concat(myBooks.get(2).getName()));
					lblAuthor3.setText(lblAuthor3.getText().concat(myBooks.get(2).getAuthor()));
					lblGenre3.setText(lblGenre3.getText().concat(myBooks.get(2).getGenres()));
					lblPages3.setText(lblPages3.getText().concat(Integer.toString(myBooks.get(2).getNumberOfPages())));
					
					if (myBooks.get(0).getImage() != null) {
						ImageIcon iconThree = new ImageIcon(myBooks.get(2).getImage());
						iconThree.setImage(iconThree.getImage().getScaledInstance(panelImage2.getWidth(),
								panelImage2.getHeight(), 100));
						lblImageBook3.setIcon(iconThree);
					}
				}
				
				
			} catch (SQLException e) {
				
			}
        	
        	dao.close();
        }
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

