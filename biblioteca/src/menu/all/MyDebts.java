package menu.all;

import java.awt.event.MouseEvent;
import java.sql.SQLException;

import data_base.DAO;
import entities.User;
import menu.Functionalities;
import menu.adm.MainMenuAdm;


public class MyDebts extends javax.swing.JFrame {

	private static final long serialVersionUID = 3941328776642349319L;
	private User user;
    User getUser() {
    	return this.user;
    }
    
	public MyDebts() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }
	
	public MyDebts(User user) {
		this.user = user;
    	initComponents();
    	setExtendedState(MAXIMIZED_BOTH);
    }

    private void initComponents() {

        lblExit = new javax.swing.JLabel();
        lblUserFullName = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        lblChangeMyInformations = new javax.swing.JLabel();
        lblPerfil = new javax.swing.JLabel();
        lblLibrary = new javax.swing.JLabel();
        lblBackgroundHead = new javax.swing.JLabel();
        lblBackgroundDebt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblMyBooksIcon = new javax.swing.JLabel();
        lblHistoricBackground = new javax.swing.JLabel();
        lblBackgroundLibrary = new javax.swing.JLabel();
        lblBackgroundMyInformations = new javax.swing.JLabel();
        lblDebtQuantity = new javax.swing.JLabel();
        lblBackgroundMain = new javax.swing.JLabel();

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

        lblBackgroundDebt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconDebtG.png"))); // NOI18N
        lblBackgroundDebt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblBackgroundDebt);
        lblBackgroundDebt.setBounds(130, 280, 140, 140);

        jLabel1.setFont(new java.awt.Font("Maiandra GD", 1, 42)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Minhas Dívidas");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 310, 300, 80);

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
        lblHistoricBackground.setBounds(1380, 390, 70, 80);

        lblBackgroundLibrary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/library.png"))); // NOI18N
        lblBackgroundLibrary.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBackgroundLibrary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackgroundLibraryMouseClicked(evt);
            }
        });
        getContentPane().add(lblBackgroundLibrary);
        lblBackgroundLibrary.setBounds(1380, 500, 70, 80);

        lblBackgroundMyInformations.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/perfil.png"))); // NOI18N
        lblBackgroundMyInformations.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBackgroundMyInformations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackgroundMyInformationsMouseClicked(evt);
            }
        });
        getContentPane().add(lblBackgroundMyInformations);
        lblBackgroundMyInformations.setBounds(1380, 610, 70, 80);

        lblDebtQuantity.setFont(new java.awt.Font("Maiandra GD", 1, 48)); // NOI18N
        lblDebtQuantity.setForeground(new java.awt.Color(51, 0, 0));
        
        DAO dao = new DAO();
        double debt = 0;
        try {
			debt = dao.totalDebtByUser(user, true);
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
        if(debt == 0)
        	lblDebtQuantity.setText("Você não tem nenhuma pendência no momento");
        else
        	lblDebtQuantity.setText(String.format("Sua dívida atual é de R$%.2f", debt));
        	
        getContentPane().add(lblDebtQuantity);
        lblDebtQuantity.setBounds(80, 530, 1230, 150);

        lblBackgroundMain.setBackground(new java.awt.Color(255, 255, 255));
        lblBackgroundMain.setOpaque(true);
        getContentPane().add(lblBackgroundMain);
        lblBackgroundMain.setBounds(0, 260, 1540, 800);

        pack();
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

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows XP".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MyDebts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyDebts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyDebts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyDebts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyDebts().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBackgroundDebt;
    private javax.swing.JLabel lblBackgroundHead;
    private javax.swing.JLabel lblBackgroundLibrary;
    private javax.swing.JLabel lblBackgroundMain;
    private javax.swing.JLabel lblBackgroundMyInformations;
    private javax.swing.JLabel lblDebtQuantity;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblHistoricBackground;
    private javax.swing.JLabel lblLibrary;
    private javax.swing.JLabel lblChangeMyInformations;
    private javax.swing.JLabel lblMyBooksIcon;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblUserFullName;
}
