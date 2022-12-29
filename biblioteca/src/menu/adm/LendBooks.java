package menu.adm;

import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import data_base.DAO;
import entities.Book;
import entities.User;
import menu.Functionalities;
import menu.all.AvailableBooks;
import menu.all.ChangeMyInformations;
import menu.all.Historic;
import menu.all.MyBooks;
import menu.all.MyInformations;
import util.TableModelBook;
import util.TableModelUser;


public class LendBooks extends javax.swing.JFrame {

	private static final long serialVersionUID = 2369251302836935409L;
	
	private User user;
	
	public LendBooks() {
        initComponents();
    }
	
	public LendBooks(User user) {
		this.user = user;
		initComponents();
		setExtendedState(MAXIMIZED_BOTH);
	}
                    
    private void initComponents() {

        lblBackgroundMain1 = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        lblUserFullName = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        lblChangeMyInformations = new javax.swing.JLabel();
        lblPerfil = new javax.swing.JLabel();
        lblLibrary = new javax.swing.JLabel();
        lblBackgroundHead = new javax.swing.JLabel();
        lblMyBooksIcon = new javax.swing.JLabel();
        lblHistoricBackground = new javax.swing.JLabel();
        lblBackgroundLibrary = new javax.swing.JLabel();
        lblBackgroundMyInformations = new javax.swing.JLabel();
        lblBackgroundDebt1 = new javax.swing.JLabel();
        lblReceiveBooks = new javax.swing.JLabel();
        lblLend = new javax.swing.JLabel();
        scrollBooks = new javax.swing.JScrollPane();
        tableBooks = new javax.swing.JTable();
        jCalendar = new com.toedter.calendar.JCalendar();
        btnLend = new javax.swing.JButton();
        lblTitleChooseBook = new javax.swing.JLabel();
        scrollUsers = new javax.swing.JScrollPane();
        tableUsers = new javax.swing.JTable();
        lblChooseDay = new javax.swing.JLabel();
        lblTitleChooseUser = new javax.swing.JLabel();
        lblSearchByBook = new javax.swing.JLabel();
        txtNameBook = new javax.swing.JTextField();
        btnSearchBook = new javax.swing.JButton();
        btnSearchUser = new javax.swing.JButton();
        txtNameUser = new javax.swing.JTextField();
        lblSearchByUser = new javax.swing.JLabel();
        lblBackgroundSearchUser = new javax.swing.JLabel();
        lblBackgroundSearchBook = new javax.swing.JLabel();
        lblBackgroundMain3 = new javax.swing.JLabel();

        lblBackgroundMain1.setBackground(new java.awt.Color(255, 255, 255));
        lblBackgroundMain1.setOpaque(true);

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

        //Deixando com apenas 2 nomes, para não poluir
        String finalUserName = Functionalities.showTwoNames(user);
        lblUserFullName.setText("Olá, " + finalUserName + "!");
        //Deixando com apenas 2 nomes, para não poluir
        
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

        lblChangeMyInformations.setBackground(new java.awt.Color(210, 69, 59));
        lblChangeMyInformations.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblChangeMyInformations.setForeground(new java.awt.Color(255, 255, 255));
        lblChangeMyInformations.setText("Alterar Dados");
        lblChangeMyInformations.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblChangeMyInformations.setOpaque(true);
        lblChangeMyInformations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblChangeMyInformationsMouseClicked(evt);
            }
        });
        getContentPane().add(lblChangeMyInformations);
        lblChangeMyInformations.setBounds(1230, 10, 100, 18);

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
        lblMyBooksIcon.setBounds(1370, 280, 70, 80);

        lblHistoricBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/historic.png"))); // NOI18N
        lblHistoricBackground.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHistoricBackground.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHistoricBackgroundMouseClicked(evt);
            }
        });
        getContentPane().add(lblHistoricBackground);
        lblHistoricBackground.setBounds(1370, 370, 70, 80);

        lblBackgroundLibrary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/library.png"))); // NOI18N
        lblBackgroundLibrary.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBackgroundLibrary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackgroundLibraryMouseClicked(evt);
            }
        });
        getContentPane().add(lblBackgroundLibrary);
        lblBackgroundLibrary.setBounds(1370, 460, 70, 80);

        lblBackgroundMyInformations.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/perfil.png"))); // NOI18N
        lblBackgroundMyInformations.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBackgroundMyInformations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackgroundMyInformationsMouseClicked(evt);
            }
        });
        getContentPane().add(lblBackgroundMyInformations);
        lblBackgroundMyInformations.setBounds(1370, 560, 70, 80);

        lblBackgroundDebt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconDebt.png"))); // NOI18N
        lblBackgroundDebt1.setToolTipText("");
        getContentPane().add(lblBackgroundDebt1);
        lblBackgroundDebt1.setBounds(1370, 660, 70, 80);

        lblReceiveBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/BorrowBooksG.png"))); // NOI18N
        lblReceiveBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblReceiveBooks);
        lblReceiveBooks.setBounds(130, 280, 140, 140);

        lblLend.setFont(new java.awt.Font("Maiandra GD", 1, 42)); // NOI18N
        lblLend.setForeground(new java.awt.Color(102, 0, 0));
        lblLend.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLend.setText("Emprestar");
        getContentPane().add(lblLend);
        lblLend.setBounds(260, 310, 300, 80);

        scrollBooks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        DAO dao = new DAO();
        
        try {
        	tableModelBook = new TableModelBook(dao.listAllBooks(true));
        	tableBooks = new javax.swing.JTable(tableModelBook);
        	tableBooks.setSelectionBackground(new java.awt.Color(210, 69, 59));
            tableBooks.setSelectionForeground(new java.awt.Color(255, 255, 255));
            tableBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        	scrollBooks.setViewportView(tableBooks);
        	
        } catch (SQLException e) {
        	JOptionPane.showMessageDialog(this, "Algo deu errado!");
        	return;
        }
        
        scrollBooks.setViewportView(tableBooks);

        getContentPane().add(scrollBooks);
        scrollBooks.setBounds(500, 540, 360, 220);

        jCalendar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        jCalendar.setDate(new java.util.Date(1671395538000L));
        jCalendar.setDecorationBackgroundColor(new java.awt.Color(210, 69, 59));
        jCalendar.setDecorationBordersVisible(true);
        jCalendar.setDoubleBuffered(false);
        jCalendar.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        jCalendar.setNullDateButtonText("");
        jCalendar.setRequestFocusEnabled(false);
        jCalendar.setWeekOfYearVisible(false);
        jCalendar.setWeekdayForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jCalendar);
        jCalendar.setBounds(930, 500, 360, 250);

        btnLend.setBackground(new java.awt.Color(210, 69, 59));
        btnLend.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        btnLend.setForeground(new java.awt.Color(255, 255, 255));
        btnLend.setText("Emprestar");
        btnLend.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 0), 3, true));
        btnLend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLendActionPerformed(evt);
            }
        });
        getContentPane().add(btnLend);
        btnLend.setBounds(1140, 770, 130, 40);

        lblTitleChooseBook.setFont(new java.awt.Font("Maiandra GD", 1, 22)); // NOI18N
        lblTitleChooseBook.setForeground(new java.awt.Color(51, 0, 0));
        lblTitleChooseBook.setText("Selecione o Livro:");
        getContentPane().add(lblTitleChooseBook);
        lblTitleChooseBook.setBounds(500, 440, 200, 40);

        scrollUsers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        
    	
        try {
        	tableModelUser = new TableModelUser(dao.listAllUsersWithoutDebt());
        	tableUsers = new javax.swing.JTable(tableModelUser);
        	tableUsers.setSelectionBackground(new java.awt.Color(210, 69, 59));
            tableUsers.setSelectionForeground(new java.awt.Color(255, 255, 255));
            tableUsers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            
        	scrollUsers.setViewportView(tableUsers);
        	
        } catch (SQLException e) {
        	JOptionPane.showMessageDialog(this, "Algo deu errado!");
        	return;
        }
        
        dao.close();
        
        scrollUsers.setViewportView(tableUsers);
        getContentPane().add(scrollUsers);
        scrollUsers.setBounds(110, 540, 370, 220);

        lblChooseDay.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        lblChooseDay.setForeground(new java.awt.Color(51, 0, 0));
        lblChooseDay.setText("Selecione a Data:");
        getContentPane().add(lblChooseDay);
        lblChooseDay.setBounds(950, 430, 200, 60);

        lblTitleChooseUser.setFont(new java.awt.Font("Maiandra GD", 1, 22)); // NOI18N
        lblTitleChooseUser.setForeground(new java.awt.Color(51, 0, 0));
        lblTitleChooseUser.setText("Selecione o Nome do Usuário:");
        getContentPane().add(lblTitleChooseUser);
        lblTitleChooseUser.setBounds(110, 440, 360, 40);

        lblSearchByBook.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblSearchByBook.setForeground(new java.awt.Color(51, 0, 0));
        lblSearchByBook.setText("Livro:");
        getContentPane().add(lblSearchByBook);
        lblSearchByBook.setBounds(510, 490, 60, 30);

        txtNameBook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0)));
        getContentPane().add(txtNameBook);
        txtNameBook.setBounds(570, 490, 144, 30);

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
        btnSearchBook.setBounds(730, 490, 110, 30);

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
        btnSearchUser.setBounds(350, 490, 110, 30);

        txtNameUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0)));
        getContentPane().add(txtNameUser);
        txtNameUser.setBounds(190, 490, 144, 30);

        lblSearchByUser.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblSearchByUser.setForeground(new java.awt.Color(51, 0, 0));
        lblSearchByUser.setText("Nome:");
        getContentPane().add(lblSearchByUser);
        lblSearchByUser.setBounds(120, 490, 66, 30);

        lblBackgroundSearchUser.setBackground(new java.awt.Color(255, 255, 255));
        lblBackgroundSearchUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        lblBackgroundSearchUser.setOpaque(true);
        getContentPane().add(lblBackgroundSearchUser);
        lblBackgroundSearchUser.setBounds(110, 480, 360, 50);

        lblBackgroundSearchBook.setBackground(new java.awt.Color(255, 255, 255));
        lblBackgroundSearchBook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        lblBackgroundSearchBook.setOpaque(true);
        getContentPane().add(lblBackgroundSearchBook);
        lblBackgroundSearchBook.setBounds(500, 480, 360, 50);

        lblBackgroundMain3.setBackground(new java.awt.Color(255, 255, 255));
        lblBackgroundMain3.setOpaque(true);
        getContentPane().add(lblBackgroundMain3);
        lblBackgroundMain3.setBounds(0, 260, 1840, 800);

        pack();
    }// </editor-fold>                        

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

    private void lblChangeMyInformationsMouseClicked(java.awt.event.MouseEvent evt) {                                        
    	if(evt.getButton()==MouseEvent.BUTTON1){
    		ChangeMyInformations frame = new ChangeMyInformations(user);
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
            MyBooks frame = new MyBooks(user);
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

    private void btnSearchUserActionPerformed(java.awt.event.ActionEvent evt) {                                              
    	String name = txtNameUser.getText();
    	List<User> users = new ArrayList<>();
    	
    	DAO dao = new DAO();
    	try {
			User user = dao.findUserByName(name);
			User realUser = dao.findUserByUsername(user.getUsername());
			users.add(realUser);
			
			for(int i = 0; i < users.size(); i++) {
				if(dao.totalDebtByUser(users.get(i), true) > 0) {
					users.remove(users.get(i));
				}
			}
			
			tableModelUser = new TableModelUser(users);
			tableUsers = new javax.swing.JTable(tableModelUser);
			tableUsers.setSelectionBackground(new java.awt.Color(210, 69, 59));
	        tableUsers.setSelectionForeground(new java.awt.Color(255, 255, 255));
	        tableUsers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
	        
			scrollUsers.setViewportView(tableUsers);
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
    	dao.close();
        
    }                                             

    private void btnLendActionPerformed(java.awt.event.ActionEvent evt) {                                          
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        String formatedDate = sd.format(this.jCalendar.getDate());
        
        int rowUser = tableUsers.getSelectedRow();
        int rowBook = tableBooks.getSelectedRow();
        DAO dao = new DAO();
        
        if(rowUser >= 0 && rowBook >= 0) {
        	User user = (User) tableModelUser.getSelected(rowUser);
        	Book book = (Book) tableModelBook.getSelected(rowBook);
        	
        	String username = user.getUsername();
        	try {
				User userFinal = dao.findUserByUsername(username);
				List<Book> booksOfThisUser = dao.findBooksByUser(userFinal);
				
				if(booksOfThisUser.contains(book)) {
					JOptionPane.showMessageDialog(this, "Usuário já está com esse livro!");
					return;
				}
				
				if(dao.lendBook(book, userFinal, formatedDate)) {
					JOptionPane.showMessageDialog(this, "Livro " + book.getName() + " emprestado para " + userFinal.getName());	
				} else {
					JOptionPane.showMessageDialog(this, "Usuário já está com o máximo de livros permitidos");
				}
			} catch (SQLException | ParseException  e) {
				e.printStackTrace();
			}	
        }
        
        try {
			tableModelBook.refreshData(dao.listAllBooks(true));
			tableModelUser.refreshData(dao.listAllUsersWithoutDebt());
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }                                         

    private void btnSearchBookActionPerformed(java.awt.event.ActionEvent evt) {                                              
    	String name = txtNameBook.getText();
    	DAO dao = new DAO();
    	
    	try {
    		tableModelBook = new TableModelBook(dao.listBooksByName(name));
        	tableBooks = new javax.swing.JTable(tableModelBook);
        	tableBooks.setSelectionBackground(new java.awt.Color(210, 69, 59));
            tableBooks.setSelectionForeground(new java.awt.Color(255, 255, 255));
            tableBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        	scrollBooks.setViewportView(tableBooks);
    	} catch (SQLException e) {
    		e.printStackTrace();
    		JOptionPane.showMessageDialog(this, "Algo deu errado!");
    	}
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
            java.util.logging.Logger.getLogger(LendBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LendBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LendBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LendBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LendBooks().setVisible(true);
            }
        });
    }

    private TableModelUser tableModelUser;
    private TableModelBook tableModelBook;
    // Variables declaration - do not modify                     
    private javax.swing.JButton btnLend;
    private javax.swing.JButton btnSearchBook;
    private javax.swing.JButton btnSearchUser;
    private com.toedter.calendar.JCalendar jCalendar;
    private javax.swing.JLabel lblLend;
    private javax.swing.JScrollPane scrollBooks;
    private javax.swing.JScrollPane scrollUsers;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBackgroundDebt1;
    private javax.swing.JLabel lblBackgroundHead;
    private javax.swing.JLabel lblBackgroundLibrary;
    private javax.swing.JLabel lblBackgroundMain1;
    private javax.swing.JLabel lblBackgroundMain3;
    private javax.swing.JLabel lblBackgroundMyInformations;
    private javax.swing.JLabel lblBackgroundSearchBook;
    private javax.swing.JLabel lblBackgroundSearchUser;
    private javax.swing.JLabel lblChooseDay;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblHistoricBackground;
    private javax.swing.JLabel lblLibrary;
    private javax.swing.JLabel lblChangeMyInformations;
    private javax.swing.JLabel lblMyBooksIcon;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblReceiveBooks;
    private javax.swing.JLabel lblSearchByBook;
    private javax.swing.JLabel lblSearchByUser;
    private javax.swing.JLabel lblTitleChooseBook;
    private javax.swing.JLabel lblTitleChooseUser;
    private javax.swing.JLabel lblUserFullName;
    private javax.swing.JTable tableBooks;
    private javax.swing.JTable tableUsers;
    private javax.swing.JTextField txtNameBook;
    private javax.swing.JTextField txtNameUser;
    // End of variables declaration                   
}
