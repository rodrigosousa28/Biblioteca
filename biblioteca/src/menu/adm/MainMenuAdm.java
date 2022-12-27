package menu.adm;

import java.awt.event.MouseEvent;

import entities.User;
import menu.Functionalities;
import menu.all.AvailableBooks;
import menu.all.ChangeMyInformations;
import menu.all.Historic;
import menu.all.MyBooksScreen;
import menu.all.MyDebts;
import menu.all.MyInformations;


public class MainMenuAdm extends javax.swing.JFrame {

	private static final long serialVersionUID = -9107050915124972938L;
	private User user;
    User getUser() {
    	return this.user;
    }
    
	public MainMenuAdm() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }
	
	public MainMenuAdm(User user) {
		this.user = user;
		initComponents();
        setExtendedState(MAXIMIZED_BOTH);
	}
        
    private void initComponents() {

        lblExit = new javax.swing.JLabel();
        lblUserFullName = new javax.swing.JLabel();
        lblHistory = new javax.swing.JLabel();
        lblChangeMyInformations = new javax.swing.JLabel();
        lblPerfil = new javax.swing.JLabel();
        lblLibrary = new javax.swing.JLabel();
        lblBackgroundHead = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblMyBooksIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblHistoricBackground = new javax.swing.JLabel();
        lblHistoric = new javax.swing.JLabel();
        lblBackgroundLibrary = new javax.swing.JLabel();
        lblAvailableBooks = new javax.swing.JLabel();
        lblBackgroundMyInformations = new javax.swing.JLabel();
        lblLibraryAdmin = new javax.swing.JLabel();
        lblMyInformations = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblBackgroundAlexandria = new javax.swing.JLabel();
        lblBackgroundDebt1 = new javax.swing.JLabel();
        lblManageLibrary = new javax.swing.JLabel();
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
        lblUserFullName.setFont(new java.awt.Font("Maiandra GD", 0, 36)); // NOI18N
        lblUserFullName.setForeground(new java.awt.Color(255, 255, 255));
        lblUserFullName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
        //Deixando com apenas 2 nomes, para não poluir
        String finalUserName = Functionalities.showTwoNames(user);
        lblUserFullName.setText("Bem Vindo, " + finalUserName + "!");
        //Deixando com apenas 2 nomes, para não poluir
        
        lblUserFullName.setOpaque(true);
        getContentPane().add(lblUserFullName);
        lblUserFullName.setBounds(500, 100, 520, 60);

        lblHistory.setBackground(new java.awt.Color(210, 69, 59));
        lblHistory.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblHistory.setForeground(new java.awt.Color(255, 255, 255));
        lblHistory.setText("Histórico");
        lblHistory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHistory.setOpaque(true);
        lblHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHistoryMouseClicked(evt);
            }
        });
        getContentPane().add(lblHistory);
        lblHistory.setBounds(1350, 10, 70, 19);

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
        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(600, 300, 2, 2);

        lblMyBooksIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/books.png"))); // NOI18N
        lblMyBooksIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMyBooksIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMyBooksIconMouseClicked(evt);
            }
        });
        getContentPane().add(lblMyBooksIcon);
        lblMyBooksIcon.setBounds(130, 300, 70, 80);

        jLabel1.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Meus Livros");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 390, 120, 20);

        lblHistoricBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/historic.png"))); // NOI18N
        lblHistoricBackground.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHistoricBackground.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHistoricBackgroundMouseClicked(evt);
            }
        });
        getContentPane().add(lblHistoricBackground);
        lblHistoricBackground.setBounds(350, 300, 70, 80);

        lblHistoric.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblHistoric.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHistoric.setText("Histórico");
        getContentPane().add(lblHistoric);
        lblHistoric.setBounds(330, 390, 100, 20);

        lblBackgroundLibrary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/library.png"))); // NOI18N
        lblBackgroundLibrary.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBackgroundLibrary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackgroundLibraryMouseClicked(evt);
            }
        });
        getContentPane().add(lblBackgroundLibrary);
        lblBackgroundLibrary.setBounds(570, 290, 70, 80);

        lblAvailableBooks.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblAvailableBooks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAvailableBooks.setText("Livros Disponíveis");
        getContentPane().add(lblAvailableBooks);
        lblAvailableBooks.setBounds(520, 380, 170, 20);

        lblBackgroundMyInformations.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/perfil.png"))); // NOI18N
        lblBackgroundMyInformations.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBackgroundMyInformations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackgroundMyInformationsMouseClicked(evt);
            }
        });
        getContentPane().add(lblBackgroundMyInformations);
        lblBackgroundMyInformations.setBounds(820, 290, 70, 80);

        lblLibraryAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/librarian.png"))); // NOI18N
        lblLibraryAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLibraryAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLibraryAdminMouseClicked(evt);
            }
        });
        getContentPane().add(lblLibraryAdmin);
        lblLibraryAdmin.setBounds(1300, 290, 70, 80);

        lblMyInformations.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblMyInformations.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMyInformations.setText("Meus Dados");
        getContentPane().add(lblMyInformations);
        lblMyInformations.setBounds(790, 380, 120, 20);

        jLabel3.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Minhas Dívidas");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1010, 380, 140, 20);

        lblBackgroundAlexandria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alexandria.png"))); // NOI18N
        getContentPane().add(lblBackgroundAlexandria);
        lblBackgroundAlexandria.setBounds(630, 520, 250, 310);

        lblBackgroundDebt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/divida.png"))); // NOI18N
        lblBackgroundDebt1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBackgroundDebt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackgroundDebt1MouseClicked(evt);
            }
        });
        getContentPane().add(lblBackgroundDebt1);
        lblBackgroundDebt1.setBounds(1050, 290, 70, 80);

        lblManageLibrary.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblManageLibrary.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageLibrary.setText("Gerenciar Biblioteca");
        lblManageLibrary.setPreferredSize(new java.awt.Dimension(132, 24));
        getContentPane().add(lblManageLibrary);
        lblManageLibrary.setBounds(1240, 380, 180, 20);

        lblBackgroundMain.setBackground(new java.awt.Color(255, 255, 255));
        lblBackgroundMain.setOpaque(true);
        getContentPane().add(lblBackgroundMain);
        lblBackgroundMain.setBounds(0, 260, 1540, 710);

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

    private void lblBackgroundDebt1MouseClicked(java.awt.event.MouseEvent evt) {                                                
        if(evt.getButton()==MouseEvent.BUTTON1){
        	MyDebts frame = new MyDebts(user);
        	frame.setVisible(true);
        	this.dispose();
        }
    }                                               

    private void lblLibraryAdminMouseClicked(java.awt.event.MouseEvent evt) {                                             
        if(evt.getButton()==MouseEvent.BUTTON1){
            ManageLibrary frame = new ManageLibrary(user);
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
    	if(evt.getButton()==MouseEvent.BUTTON1) {
    		ChangeMyInformations cmi = new ChangeMyInformations(user);
    		cmi.setVisible(true);
    		this.dispose();	
    	}
    }

    private void lblHistoryMouseClicked(java.awt.event.MouseEvent evt) {                                        
    	if(evt.getButton()==MouseEvent.BUTTON1){
            Historic frame = new Historic(user);
            frame.setVisible(true);
            this.dispose();
        }
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
            java.util.logging.Logger.getLogger(MainMenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAvailableBooks;
    private javax.swing.JLabel lblBackgroundAlexandria;
    private javax.swing.JLabel lblBackgroundDebt1;
    private javax.swing.JLabel lblBackgroundHead;
    private javax.swing.JLabel lblBackgroundLibrary;
    private javax.swing.JLabel lblBackgroundMain;
    private javax.swing.JLabel lblBackgroundMyInformations;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblHistoric;
    private javax.swing.JLabel lblHistoricBackground;
    private javax.swing.JLabel lblHistory;
    private javax.swing.JLabel lblLibrary;
    private javax.swing.JLabel lblLibraryAdmin;
    private javax.swing.JLabel lblManageLibrary;
    private javax.swing.JLabel lblChangeMyInformations;
    private javax.swing.JLabel lblMyBooksIcon;
    private javax.swing.JLabel lblMyInformations;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblUserFullName;
    // End of variables declaration                   
}
