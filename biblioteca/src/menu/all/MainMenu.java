package menu.all;

import java.awt.event.MouseEvent;

import entities.User;
import menu.Functionalities;


public class MainMenu extends javax.swing.JFrame {

	private static final long serialVersionUID = 2445302970296024361L;
	private User user;
    User getUser() {
    	return this.user;
    }
    
    public MainMenu() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }
    
    public MainMenu(User user) {
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
        lblMyBooks = new javax.swing.JLabel();
        lblHistoricBackground = new javax.swing.JLabel();
        lblHistoric = new javax.swing.JLabel();
        lblBackgroundLibrary = new javax.swing.JLabel();
        lblAvailableBooks = new javax.swing.JLabel();
        lblBackgroundMyInformations = new javax.swing.JLabel();
        lblMyInformations = new javax.swing.JLabel();
        lblBackgroundDebt = new javax.swing.JLabel();
        lblMyDebts = new javax.swing.JLabel();
        lblBackgroundAlexandria = new javax.swing.JLabel();
        lblBackgroundMain = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 920));
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
        jScrollPane1.setBounds(520, 300, 2, 2);

        lblMyBooksIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/books.png"))); // NOI18N
        lblMyBooksIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMyBooksIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMyBooksIconMouseClicked(evt);
            }
        });
        getContentPane().add(lblMyBooksIcon);
        lblMyBooksIcon.setBounds(260, 290, 70, 80);

        lblMyBooks.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblMyBooks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMyBooks.setText("Meus Livros");
        getContentPane().add(lblMyBooks);
        lblMyBooks.setBounds(230, 370, 120, 23);

        lblHistoricBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/historic.png"))); // NOI18N
        lblHistoricBackground.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHistoricBackground.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHistoricBackgroundMouseClicked(evt);
            }
        });
        getContentPane().add(lblHistoricBackground);
        lblHistoricBackground.setBounds(500, 300, 60, 70);

        lblHistoric.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblHistoric.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHistoric.setText("Histórico");
        getContentPane().add(lblHistoric);
        lblHistoric.setBounds(480, 370, 100, 30);

        lblBackgroundLibrary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/library.png"))); // NOI18N
        lblBackgroundLibrary.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBackgroundLibrary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackgroundLibraryMouseClicked(evt);
            }
        });
        getContentPane().add(lblBackgroundLibrary);
        lblBackgroundLibrary.setBounds(730, 290, 70, 80);

        lblAvailableBooks.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblAvailableBooks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAvailableBooks.setText("Livros Disponíveis");
        getContentPane().add(lblAvailableBooks);
        lblAvailableBooks.setBounds(680, 370, 170, 23);

        lblBackgroundMyInformations.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/perfil.png"))); // NOI18N
        lblBackgroundMyInformations.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBackgroundMyInformations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackgroundMyInformationsMouseClicked(evt);
            }
        });
        getContentPane().add(lblBackgroundMyInformations);
        lblBackgroundMyInformations.setBounds(990, 290, 60, 70);

        lblMyInformations.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblMyInformations.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMyInformations.setText("Meus Dados");
        getContentPane().add(lblMyInformations);
        lblMyInformations.setBounds(960, 370, 120, 23);

        lblBackgroundDebt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/divida.png"))); // NOI18N
        lblBackgroundDebt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBackgroundDebt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackgroundDebtMouseClicked(evt);
            }
        });
        getContentPane().add(lblBackgroundDebt);
        lblBackgroundDebt.setBounds(1230, 280, 70, 90);

        lblMyDebts.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblMyDebts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMyDebts.setText("Minhas Dívidas");
        getContentPane().add(lblMyDebts);
        lblMyDebts.setBounds(1200, 370, 130, 20);

        lblBackgroundAlexandria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alexandria.png"))); // NOI18N
        getContentPane().add(lblBackgroundAlexandria);
        lblBackgroundAlexandria.setBounds(630, 540, 250, 310);

        lblBackgroundMain.setBackground(new java.awt.Color(255, 255, 255));
        lblBackgroundMain.setOpaque(true);
        getContentPane().add(lblBackgroundMain);
        lblBackgroundMain.setBounds(0, 260, 1540, 710);

        pack();
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
    		Historic h = new Historic(user);
        	h.setVisible(true);
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
    		MyInformations mi = new MyInformations(user);
        	mi.setVisible(true);
        	this.dispose();
        }
    }                                                        

    private void lblBackgroundDebtMouseClicked(java.awt.event.MouseEvent evt) {
    	if(evt.getButton()==MouseEvent.BUTTON1){
    		MyDebts md = new MyDebts(user);
        	md.setVisible(true);
        	this.dispose();
        }
    }                                              

    private void lblPerfilMouseClicked(java.awt.event.MouseEvent evt) {                                       
    	if(evt.getButton()==MouseEvent.BUTTON1){
    		MyInformations mi = new MyInformations(user);
        	mi.setVisible(true);
        	this.dispose();
        }
    }                                      

    private void lblChangeMyInformationsMouseClicked(java.awt.event.MouseEvent evt) {
    	if(evt.getButton()==MouseEvent.BUTTON1){
    		ChangeMyInformations mbs = new ChangeMyInformations(user);
        	mbs.setVisible(true);
        	this.dispose();
        }
    }                                       

    private void lblHistoryMouseClicked(java.awt.event.MouseEvent evt) {                                        
    	if(evt.getButton()==MouseEvent.BUTTON1){
    		Historic h = new Historic(user);
        	h.setVisible(true);
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(() -> {
            new MainMenu().setVisible(true);
                });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel lblMyBooks;
    private javax.swing.JLabel lblMyDebts;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAvailableBooks;
    private javax.swing.JLabel lblBackgroundAlexandria;
    private javax.swing.JLabel lblBackgroundDebt;
    private javax.swing.JLabel lblBackgroundHead;
    private javax.swing.JLabel lblBackgroundLibrary;
    private javax.swing.JLabel lblBackgroundMain;
    private javax.swing.JLabel lblBackgroundMyInformations;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblHistoric;
    private javax.swing.JLabel lblHistoricBackground;
    private javax.swing.JLabel lblHistory;
    private javax.swing.JLabel lblLibrary;
    private javax.swing.JLabel lblChangeMyInformations;
    private javax.swing.JLabel lblMyBooksIcon;
    private javax.swing.JLabel lblMyInformations;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblUserFullName;
    // End of variables declaration                   
}
