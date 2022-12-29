package menu.all;

import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import data_base.DAO;
import entities.Book;
import entities.User;
import menu.Functionalities;
import menu.adm.MainMenuAdm;
import util.TableModelHistoric;


public class Historic extends javax.swing.JFrame {


	private static final long serialVersionUID = -5165256826972253255L;
	private User user;
	
    public Historic() {
        initComponents();
    }
    
    public Historic(User user) {
    	this.user = user;
		initComponents();
		setExtendedState(MAXIMIZED_BOTH);
    }
                          
    private void initComponents() {

        lblBackgroundMain = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        lblUserFullName = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        lblChangeMyInformations = new javax.swing.JLabel();
        lblPerfil = new javax.swing.JLabel();
        lblLibrary = new javax.swing.JLabel();
        lblBackgroundHead = new javax.swing.JLabel();
        lblHistoricBackground = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblMyBooksIcon = new javax.swing.JLabel();
        lblBackgroundLibrary = new javax.swing.JLabel();
        lblBackgroundMyInformations = new javax.swing.JLabel();
        lblBackgroundDebt = new javax.swing.JLabel();
        scrollRecords = new javax.swing.JScrollPane();
        tableUsers = new javax.swing.JTable();
        lblTotalMoney = new javax.swing.JLabel();
        panelImage = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        lblDebt = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblBook = new javax.swing.JLabel();
        lblBeginDate = new javax.swing.JLabel();
        lblEndDate = new javax.swing.JLabel();
        lblSubtitle = new javax.swing.JLabel();
        lblBackgroundMain1 = new javax.swing.JLabel();

        lblBackgroundMain.setBackground(new java.awt.Color(255, 255, 255));
        lblBackgroundMain.setOpaque(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1542, 972));
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
        lblUserFullName.setText("Bem Vindo, " + finalUserName + "!");
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
        lblBackgroundHead.setBounds(0, 0, 1540, 260);

        lblHistoricBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/HistoricG.png"))); // NOI18N
        lblHistoricBackground.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblHistoricBackground);
        lblHistoricBackground.setBounds(120, 270, 130, 140);

        jLabel1.setFont(new java.awt.Font("Maiandra GD", 1, 42)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Meu Histórico de empréstimos ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 300, 660, 70);

        lblMyBooksIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/books.png"))); // NOI18N
        lblMyBooksIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMyBooksIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMyBooksIconMouseClicked(evt);
            }
        });
        getContentPane().add(lblMyBooksIcon);
        lblMyBooksIcon.setBounds(1370, 290, 70, 80);

        lblBackgroundLibrary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/library.png"))); // NOI18N
        lblBackgroundLibrary.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBackgroundLibrary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackgroundLibraryMouseClicked(evt);
            }
        });
        getContentPane().add(lblBackgroundLibrary);
        lblBackgroundLibrary.setBounds(1370, 390, 70, 80);

        lblBackgroundMyInformations.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/perfil.png"))); // NOI18N
        lblBackgroundMyInformations.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBackgroundMyInformations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackgroundMyInformationsMouseClicked(evt);
            }
        });
        getContentPane().add(lblBackgroundMyInformations);
        lblBackgroundMyInformations.setBounds(1370, 490, 70, 80);

        lblBackgroundDebt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/divida.png"))); // NOI18N
        lblBackgroundDebt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBackgroundDebt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackgroundDebtMouseClicked(evt);
            }
        });
        getContentPane().add(lblBackgroundDebt);
        lblBackgroundDebt.setBounds(1370, 600, 70, 80);

        scrollRecords.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));

        
        DAO dao = new DAO();
        try {
        	modelHistoricUser = new TableModelHistoric(dao.findRecordsByItem(user, false));
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(this, "Aconteceu um erro chato");
			e.printStackTrace();
		}
        tableUsers = new javax.swing.JTable(modelHistoricUser);
        scrollRecords.setViewportView(tableUsers);
        
        tableUsers.setSelectionBackground(new java.awt.Color(210, 69, 59));
        tableUsers.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableUsers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        getContentPane().add(scrollRecords);
        tableUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUsersMouseClicked(evt);
            }
        });
        
        scrollRecords.setViewportView(tableUsers);

        getContentPane().add(scrollRecords);
        scrollRecords.setBounds(130, 470, 580, 260);

        lblTotalMoney.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        lblTotalMoney.setForeground(new java.awt.Color(51, 0, 0));
        lblTotalMoney.setText("Total gasto: R$");
        try {
			Double totalDebt = dao.totalDebtByUser(user, false);
			lblTotalMoney.setText(lblTotalMoney.getText().concat(String.format("%.2f", totalDebt)));
		} catch (SQLException e) {
			e.printStackTrace();
		}
        getContentPane().add(lblTotalMoney);
        lblTotalMoney.setBounds(130, 730, 560, 40);

        panelImage.setBackground(new java.awt.Color(255, 255, 255));
        panelImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0)));
        panelImage.setLayout(null);

        lblImage.setBackground(new java.awt.Color(255, 255, 255));
        lblImage.setOpaque(true);
        panelImage.add(lblImage);
        lblImage.setBounds(0, 0, 170, 210);

        getContentPane().add(panelImage);
        panelImage.setBounds(760, 470, 170, 210);

        lblDebt.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblDebt.setForeground(new java.awt.Color(51, 0, 0));
        lblDebt.setText("Multa associada:");
        getContentPane().add(lblDebt);
        lblDebt.setBounds(950, 610, 310, 18);
        lblDebt.setVisible(false);

        lblUser.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblUser.setForeground(new java.awt.Color(51, 0, 0));
        lblUser.setText("Usuário:");
        getContentPane().add(lblUser);
        lblUser.setBounds(950, 490, 360, 18);
        lblUser.setVisible(false);

        lblBook.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblBook.setForeground(new java.awt.Color(51, 0, 0));
        lblBook.setText("Livro:");
        getContentPane().add(lblBook);
        lblBook.setBounds(950, 520, 340, 18);
        lblBook.setVisible(false);

        lblBeginDate.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblBeginDate.setForeground(new java.awt.Color(51, 0, 0));
        lblBeginDate.setText("Data de empréstimo: ");
        getContentPane().add(lblBeginDate);
        lblBeginDate.setBounds(950, 550, 350, 18);
        lblBeginDate.setVisible(false);

        lblEndDate.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblEndDate.setForeground(new java.awt.Color(51, 0, 0));
        lblEndDate.setText("Data de devolução:");
        getContentPane().add(lblEndDate);
        lblEndDate.setBounds(950, 580, 340, 18);
        lblEndDate.setVisible(false);

        lblSubtitle.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblSubtitle.setForeground(new java.awt.Color(51, 0, 0));
        lblSubtitle.setText("Clique em alguma transação para exibir mais informações");
        getContentPane().add(lblSubtitle);
        lblSubtitle.setBounds(130, 430, 560, 40);

        lblBackgroundMain1.setBackground(new java.awt.Color(255, 255, 255));
        lblBackgroundMain1.setOpaque(true);
        getContentPane().add(lblBackgroundMain1);
        lblBackgroundMain1.setBounds(0, 260, 1540, 800);

        pack();
    }                       

    private void lblMyBooksIconMouseClicked(java.awt.event.MouseEvent evt) {
        if(evt.getButton()==MouseEvent.BUTTON1){
            MyBooks frame = new MyBooks(user);
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

    private void lblBackgroundDebtMouseClicked(java.awt.event.MouseEvent evt) {
        if(evt.getButton()==MouseEvent.BUTTON1){
            MyDebts frame = new MyDebts(user);
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
    
    private void lblChangeMyInformationsMouseClicked(java.awt.event.MouseEvent evt) {                                        
    	if(evt.getButton()==MouseEvent.BUTTON1){
    		ChangeMyInformations frame = new ChangeMyInformations(user);
            frame.setVisible(true);
            this.dispose();
        }
    }                                       

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {
    	if(user.getType().equals("Administrator")) {
    		MainMenuAdm mma = new MainMenuAdm(user);
    		mma.setVisible(true);
    	}else {
    		MainMenu mm = new MainMenu(user);
    		mm.setVisible(true);
    	}
    	this.dispose();
    }                                    

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {
    	this.dispose();
    }                                    

    private void loadInfo(int index) {
    	entities.Record record = (entities.Record) modelHistoricUser.getSelected(index);
    	DAO dao = new DAO();
    	if(record != null){
    		String nameBook = record.getNameBook();
    		Book book = null;
    		try {
				book = dao.findBookByName(nameBook);
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(this, "Não foi possível encontrar o livro");
				e.printStackTrace();
			}
    		
    		lblUser.setText("Usuário: ".concat(record.getNameUser()));
    		lblUser.setVisible(true);
    		
    		lblBook.setText("Livro: ".concat(nameBook));
    		lblBook.setVisible(true);
    		
    		lblBeginDate.setText("Data de empréstimo: ".concat(record.getBeginDate()));
    		lblBeginDate.setVisible(true);
    		
    		lblEndDate.setText("Data de devolução: ".concat(record.getEndDate()));
    		lblEndDate.setVisible(true);
    		
    		double debt = record.getDebt();
    		String formatedDebt = String.format("%.2f", debt);
    		lblDebt.setText("Multa associada: R$".concat(formatedDebt));
    		lblDebt.setVisible(true);
    		
    		ImageIcon icon = new ImageIcon(book.getImage());
			icon.setImage(icon.getImage().getScaledInstance(panelImage.getWidth() -1, panelImage.getHeight() -1, 100));
			lblImage.setIcon(icon);			
    	}	
    	
    }
    
    private void tableUsersMouseClicked(java.awt.event.MouseEvent evt) {                                        
    	if(evt.getClickCount() == 1) {
    		loadInfo(tableUsers.getSelectedRow());
    	}
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
            java.util.logging.Logger.getLogger(Historic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Historic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Historic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Historic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Historic().setVisible(true);
            }
        });
    }

    private TableModelHistoric modelHistoricUser;
    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBackgroundDebt;
    private javax.swing.JLabel lblBackgroundHead;
    private javax.swing.JLabel lblBackgroundLibrary;
    private javax.swing.JLabel lblBackgroundMain;
    private javax.swing.JLabel lblBackgroundMain1;
    private javax.swing.JLabel lblBackgroundMyInformations;
    private javax.swing.JLabel lblBeginDate;
    private javax.swing.JLabel lblBook;
    private javax.swing.JLabel lblDebt;
    private javax.swing.JLabel lblEndDate;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblHistoricBackground;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLibrary;
    private javax.swing.JLabel lblChangeMyInformations;
    private javax.swing.JLabel lblMyBooksIcon;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblSubtitle;
    private javax.swing.JLabel lblTotalMoney;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblUserFullName;
    private javax.swing.JPanel panelImage;
    private javax.swing.JScrollPane scrollRecords;
    private javax.swing.JTable tableUsers;
    // End of variables declaration                   
}
