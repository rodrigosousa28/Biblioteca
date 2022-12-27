package menu.adm;

import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import data_base.DAO;
import entities.Book;
import entities.User;
import menu.Functionalities;
import menu.all.AvailableBooks;
import menu.all.Historic;
import menu.all.MyBooksScreen;
import menu.all.MyInformations;
import util.TableModelHistoric;

public class Report extends javax.swing.JFrame {

	private static final long serialVersionUID = 8637173755309281950L;
	
	private User user;
	
    public Report() {
        initComponents();
    }
    
    public Report(User user) {
    	this.user = user;
    	initComponents();
    	setExtendedState(MAXIMIZED_BOTH);
    }
                         
    private void initComponents() {

        lblBackgroundMain3 = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        lblUserFullName = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        lblMyBooks = new javax.swing.JLabel();
        lblPerfil = new javax.swing.JLabel();
        lblLibrary = new javax.swing.JLabel();
        lblBackgroundHead = new javax.swing.JLabel();
        lblMyBooksIcon = new javax.swing.JLabel();
        lblHistoricBackground = new javax.swing.JLabel();
        lblBackgroundLibrary = new javax.swing.JLabel();
        lblBackgroundMyInformations = new javax.swing.JLabel();
        lblBackgroundDebt1 = new javax.swing.JLabel();
        lblReceiveBooks = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        scrollBooks = new javax.swing.JScrollPane();
        tableBooks = new javax.swing.JTable();
        lblTitleChooseBook = new javax.swing.JLabel();
        scrollUsers = new javax.swing.JScrollPane();
        tableUsers = new javax.swing.JTable();
        lblTitleChooseUser = new javax.swing.JLabel();
        lblSearchByBook = new javax.swing.JLabel();
        txtNameBook = new javax.swing.JTextField();
        btnSearchBook = new javax.swing.JButton();
        btnSearchUser = new javax.swing.JButton();
        txtNameUser = new javax.swing.JTextField();
        lblSearchByUser = new javax.swing.JLabel();
        lblBackgroundSearchUser = new javax.swing.JLabel();
        lblBackgroundSearchBook = new javax.swing.JLabel();
        lblTotalMoney = new javax.swing.JLabel();
        lblBackgroundMain4 = new javax.swing.JLabel();

        lblBackgroundMain3.setBackground(new java.awt.Color(255, 255, 255));
        lblBackgroundMain3.setOpaque(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1542, 972));
        setResizable(false);
        getContentPane().setLayout(null);

        lblExit.setBackground(new java.awt.Color(210, 69, 59));
        lblExit.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblExit.setForeground(new java.awt.Color(255, 255, 255));
        lblExit.setText("Sair");
        lblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExit.setOpaque(true);
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });
        getContentPane().add(lblExit);
        lblExit.setBounds(1430, 10, 30, 18);

        lblUserFullName.setBackground(new java.awt.Color(210, 69, 59));
        lblUserFullName.setFont(new java.awt.Font("Maiandra GD", 1, 36)); // NOI18N
        lblUserFullName.setForeground(new java.awt.Color(255, 255, 255));
        lblUserFullName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
        //Deixando com apenas 2 nomes, para n�o poluir
        String finalUserName = Functionalities.showTwoNames(user);
        lblUserFullName.setText("Ol�, " + finalUserName + "!");
        //Deixando com apenas 2 nomes, para n�o poluir
        
        lblUserFullName.setOpaque(true);
        getContentPane().add(lblUserFullName);
        lblUserFullName.setBounds(500, 100, 520, 60);

        lblBack.setBackground(new java.awt.Color(210, 69, 59));
        lblBack.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblBack.setForeground(new java.awt.Color(255, 255, 255));
        lblBack.setText("Voltar");
        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBack.setOpaque(true);
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        getContentPane().add(lblBack);
        lblBack.setBounds(1350, 10, 50, 18);

        lblMyBooks.setBackground(new java.awt.Color(210, 69, 59));
        lblMyBooks.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblMyBooks.setForeground(new java.awt.Color(255, 255, 255));
        lblMyBooks.setText("Meus Livros");
        lblMyBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMyBooks.setOpaque(true);
        lblMyBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMyBooksMouseClicked(evt);
            }
        });
        getContentPane().add(lblMyBooks);
        lblMyBooks.setBounds(1230, 10, 100, 18);

        lblPerfil.setBackground(new java.awt.Color(210, 69, 59));
        lblPerfil.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblPerfil.setForeground(new java.awt.Color(255, 255, 255));
        lblPerfil.setText("Perfil");
        lblPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPerfil.setOpaque(true);
        lblPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPerfilMouseClicked(evt);
            }
        });
        getContentPane().add(lblPerfil);
        lblPerfil.setBounds(1170, 10, 40, 18);

        lblLibrary.setBackground(new java.awt.Color(210, 69, 59));
        lblLibrary.setFont(new java.awt.Font("Maiandra GD", 1, 22)); // NOI18N
        lblLibrary.setForeground(new java.awt.Color(255, 255, 255));
        lblLibrary.setText("Biblioteca Alexandria");
        lblLibrary.setOpaque(true);
        getContentPane().add(lblLibrary);
        lblLibrary.setBounds(20, 10, 260, 30);

        lblBackgroundHead.setBackground(new java.awt.Color(210, 69, 59));
        lblBackgroundHead.setMaximumSize(new java.awt.Dimension(1920, 300));
        lblBackgroundHead.setMinimumSize(new java.awt.Dimension(1920, 300));
        lblBackgroundHead.setOpaque(true);
        lblBackgroundHead.setPreferredSize(new java.awt.Dimension(150, 300));
        getContentPane().add(lblBackgroundHead);
        lblBackgroundHead.setBounds(0, 0, 1550, 260);

        lblMyBooksIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/books.png"))); // NOI18N
        lblMyBooksIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMyBooksIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMyBooksIconMouseClicked(evt);
            }
        });
        getContentPane().add(lblMyBooksIcon);
        lblMyBooksIcon.setBounds(1380, 290, 70, 80);

        lblHistoricBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/historic.png"))); // NOI18N
        lblHistoricBackground.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHistoricBackground.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHistoricBackgroundMouseClicked(evt);
            }
        });
        getContentPane().add(lblHistoricBackground);
        lblHistoricBackground.setBounds(1380, 380, 70, 80);

        lblBackgroundLibrary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/library.png"))); // NOI18N
        lblBackgroundLibrary.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBackgroundLibrary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackgroundLibraryMouseClicked(evt);
            }
        });
        getContentPane().add(lblBackgroundLibrary);
        lblBackgroundLibrary.setBounds(1380, 480, 70, 80);

        lblBackgroundMyInformations.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/perfil.png"))); // NOI18N
        lblBackgroundMyInformations.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBackgroundMyInformations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackgroundMyInformationsMouseClicked(evt);
            }
        });
        getContentPane().add(lblBackgroundMyInformations);
        lblBackgroundMyInformations.setBounds(1380, 580, 70, 80);

        lblBackgroundDebt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconDebt.png"))); // NOI18N
        lblBackgroundDebt1.setToolTipText("");
        getContentPane().add(lblBackgroundDebt1);
        lblBackgroundDebt1.setBounds(1380, 680, 70, 80);

        lblReceiveBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ReportG.png"))); // NOI18N
        lblReceiveBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblReceiveBooks);
        lblReceiveBooks.setBounds(130, 280, 140, 140);

        lblTitle.setFont(new java.awt.Font("Maiandra GD", 1, 42)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(102, 0, 0));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Relat�rios de Empr�stimos");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(250, 310, 560, 80);

        scrollBooks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        
        DAO dao = new DAO();
        try {
			modelHistoricBook = new TableModelHistoric(dao.findAllRecords());
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(this, "Aconteceu um erro chato");
			e.printStackTrace();
		}
    	tableBooks = new javax.swing.JTable(modelHistoricBook);
    	tableBooks.setSelectionBackground(new java.awt.Color(210, 69, 59));
        tableBooks.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        scrollBooks.setViewportView(tableBooks);

        getContentPane().add(scrollBooks);
        scrollBooks.setBounds(730, 550, 550, 220);

        lblTitleChooseBook.setFont(new java.awt.Font("Maiandra GD", 1, 22)); // NOI18N
        lblTitleChooseBook.setForeground(new java.awt.Color(51, 0, 0));
        lblTitleChooseBook.setText("Empr�stimos por livro");
        getContentPane().add(lblTitleChooseBook);
        lblTitleChooseBook.setBounds(730, 450, 550, 40);

        scrollUsers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));

        try {
			modelHistoricUser = new TableModelHistoric(dao.findAllRecords());
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(this, "Aconteceu um erro chato");
			e.printStackTrace();
		}
        tableUsers = new javax.swing.JTable(modelHistoricUser);
        tableUsers.setSelectionBackground(new java.awt.Color(210, 69, 59));
        tableUsers.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableUsers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        scrollUsers.setViewportView(tableUsers);

        getContentPane().add(scrollUsers);
        scrollUsers.setBounds(130, 550, 560, 220);

        lblTitleChooseUser.setFont(new java.awt.Font("Maiandra GD", 1, 22)); // NOI18N
        lblTitleChooseUser.setForeground(new java.awt.Color(51, 0, 0));
        lblTitleChooseUser.setText("Empr�stimos por usu�rio");
        getContentPane().add(lblTitleChooseUser);
        lblTitleChooseUser.setBounds(130, 450, 560, 40);

        lblSearchByBook.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblSearchByBook.setForeground(new java.awt.Color(51, 0, 0));
        lblSearchByBook.setText("Livro:");
        getContentPane().add(lblSearchByBook);
        lblSearchByBook.setBounds(740, 500, 60, 30);

        txtNameBook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0)));
        getContentPane().add(txtNameBook);
        txtNameBook.setBounds(800, 500, 310, 30);

        btnSearchBook.setBackground(new java.awt.Color(210, 69, 59));
        btnSearchBook.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        btnSearchBook.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchBook.setText("Pesquisar");
        btnSearchBook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        btnSearchBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchBookActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearchBook);
        btnSearchBook.setBounds(1150, 500, 110, 30);

        btnSearchUser.setBackground(new java.awt.Color(210, 69, 59));
        btnSearchUser.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        btnSearchUser.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchUser.setText("Pesquisar");
        btnSearchUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        btnSearchUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchUserActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearchUser);
        btnSearchUser.setBounds(560, 500, 110, 30);

        txtNameUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0)));
        getContentPane().add(txtNameUser);
        txtNameUser.setBounds(220, 500, 300, 30);

        lblSearchByUser.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblSearchByUser.setForeground(new java.awt.Color(51, 0, 0));
        lblSearchByUser.setText("Nome:");
        getContentPane().add(lblSearchByUser);
        lblSearchByUser.setBounds(150, 500, 66, 30);

        lblBackgroundSearchUser.setBackground(new java.awt.Color(255, 255, 255));
        lblBackgroundSearchUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        lblBackgroundSearchUser.setOpaque(true);
        getContentPane().add(lblBackgroundSearchUser);
        lblBackgroundSearchUser.setBounds(130, 490, 560, 50);

        lblBackgroundSearchBook.setBackground(new java.awt.Color(255, 255, 255));
        lblBackgroundSearchBook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        lblBackgroundSearchBook.setOpaque(true);
        getContentPane().add(lblBackgroundSearchBook);
        lblBackgroundSearchBook.setBounds(730, 490, 550, 50);
        
        lblTotalMoney.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        lblTotalMoney.setForeground(new java.awt.Color(51, 0, 0));
        lblTotalMoney.setText("Total gasto: R$");
        getContentPane().add(lblTotalMoney);
        lblTotalMoney.setBounds(130, 730, 560, 40);

        lblBackgroundMain4.setBackground(new java.awt.Color(255, 255, 255));
        lblBackgroundMain4.setOpaque(true);
        getContentPane().add(lblBackgroundMain4);
        lblBackgroundMain4.setBounds(0, 260, 1840, 800);

        pack();
    }

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {
    	this.dispose();
    }                                    

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {
    	if(evt.getButton()==MouseEvent.BUTTON1){
            ManageLibrary frame = new ManageLibrary(user);
            frame.setVisible(true);
            this.dispose();
        }
    }                                    

    private void lblMyBooksMouseClicked(java.awt.event.MouseEvent evt) {                                        
    	if(evt.getButton()==MouseEvent.BUTTON1){
            MyBooksScreen frame = new MyBooksScreen(user);
            frame.setVisible(true);
            this.dispose();
        }
    }                                       

    private void lblPerfilMouseClicked(java.awt.event.MouseEvent evt) {                                       
    	if(evt.getButton()==MouseEvent.BUTTON1){
            MyInformations frame = new MyInformations(user);
            frame.setVisible(true);
            this.dispose();
        }
    }                                      

    private void lblMyBooksIconMouseClicked(java.awt.event.MouseEvent evt) {                                            
        if(evt.getButton()==MouseEvent.BUTTON1){
            MyBooksScreen frame = new MyBooksScreen(user);
            frame.setVisible(true);
            this.dispose();
        }
    }                                           

    private void lblHistoricBackgroundMouseClicked(java.awt.event.MouseEvent evt) {
        if(evt.getButton()==MouseEvent.BUTTON1){
            Historic frame = new Historic(user);
            frame.setVisible(true);
            this.dispose();
        }
    }                                                  

    private void lblBackgroundLibraryMouseClicked(java.awt.event.MouseEvent evt) {
        if(evt.getButton()==MouseEvent.BUTTON1){
            AvailableBooks frame = new AvailableBooks(user);
            frame.setVisible(true);
            this.dispose();
        }
    }                                                 

    private void lblBackgroundMyInformationsMouseClicked(java.awt.event.MouseEvent evt) {
        if(evt.getButton()==MouseEvent.BUTTON1){
            MyInformations frame = new MyInformations(user);
            frame.setVisible(true);
            this.dispose();
        }
    }                                                        

    private void btnSearchBookActionPerformed(java.awt.event.ActionEvent evt) {                                              
        
    	DAO dao = new DAO();
    	String nameBook = txtNameBook.getText();
    	
    	try {
    		Book book = dao.findBookByName(nameBook);
			modelSearchBook = new TableModelHistoric(dao.findRecordsByItem(book, false));
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	tableBooks = new javax.swing.JTable(modelSearchBook);
    	tableBooks.setSelectionBackground(new java.awt.Color(210, 69, 59));
        tableBooks.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
    	scrollBooks.setViewportView(tableBooks);
    	
    	dao.close();
    }                                             

    private void btnSearchUserActionPerformed(java.awt.event.ActionEvent evt) {                                              
    	DAO dao = new DAO();
    	String nameUser = txtNameUser.getText();
    	User user = null;
    	User userFinal = null;
    	try {
    		user = dao.findUserByName(nameUser);
    		userFinal = dao.findUserByUsername(user.getUsername());
    		
			modelSearchUser = new TableModelHistoric(dao.findRecordsByItem(userFinal, false));
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
    	tableUsers = new javax.swing.JTable(modelSearchUser);
    	tableUsers.setSelectionBackground(new java.awt.Color(210, 69, 59));
        tableUsers.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableUsers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
    	scrollUsers.setBounds(130, 550, 560, 170);
    	
    	try {
			Double totalDebt = dao.totalDebtByUser(userFinal, false);
			lblTotalMoney.setText("Total gasto: R$".concat(String.format("%.2f", totalDebt)));
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
    	scrollUsers.setViewportView(tableUsers);
    	
    	dao.close();
    }                                             

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows XP".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Report().setVisible(true);
            }
        });
    }
    
    private TableModelHistoric modelHistoricBook;
    private TableModelHistoric modelHistoricUser;
    private TableModelHistoric modelSearchBook;
    private TableModelHistoric modelSearchUser;
    // Variables declaration - do not modify                     
    private javax.swing.JButton btnSearchBook;
    private javax.swing.JButton btnSearchUser;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JScrollPane scrollBooks;
    private javax.swing.JScrollPane scrollUsers;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBackgroundDebt1;
    private javax.swing.JLabel lblBackgroundHead;
    private javax.swing.JLabel lblBackgroundLibrary;
    private javax.swing.JLabel lblBackgroundMain3;
    private javax.swing.JLabel lblBackgroundMain4;
    private javax.swing.JLabel lblBackgroundMyInformations;
    private javax.swing.JLabel lblBackgroundSearchBook;
    private javax.swing.JLabel lblBackgroundSearchUser;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblHistoricBackground;
    private javax.swing.JLabel lblLibrary;
    private javax.swing.JLabel lblMyBooks;
    private javax.swing.JLabel lblMyBooksIcon;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblReceiveBooks;
    private javax.swing.JLabel lblSearchByBook;
    private javax.swing.JLabel lblSearchByUser;
    private javax.swing.JLabel lblTitleChooseBook;
    private javax.swing.JLabel lblTitleChooseUser;
    private javax.swing.JLabel lblTotalMoney;
    private javax.swing.JLabel lblUserFullName;
    private javax.swing.JTable tableBooks;
    private javax.swing.JTable tableUsers;
    private javax.swing.JTextField txtNameBook;
    private javax.swing.JTextField txtNameUser;
    // End of variables declaration                   
}
