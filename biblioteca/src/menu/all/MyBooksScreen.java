package menu.all;

import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;

import entities.User;
import menu.Functionalities;
import menu.adm.MainMenuAdm;

public class MyBooksScreen extends javax.swing.JFrame {
    
	private static final long serialVersionUID = 1131169882558835871L;
	private User user;
	
    public MyBooksScreen() {
        initComponents();
    }
    
    public MyBooksScreen(User user) {
    	this.user = user;
    	initComponents();
    	setExtendedState(MAXIMIZED_BOTH);
    }

    public User getUser() {
    	return this.user;
    }
    
    private void initComponents() {
    	setExtendedState(MAXIMIZED_BOTH);
        lblExit = new javax.swing.JLabel();
        lblUserFullName = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        lblChangeMyInformations = new javax.swing.JLabel();
        lblPerfil = new javax.swing.JLabel();
        lblLibrary = new javax.swing.JLabel();
        lblBackgroundHead = new javax.swing.JLabel();
        lblMyBooksIcon = new javax.swing.JLabel();
        lblMyBooksBig = new javax.swing.JLabel();
        lblHistoricBackground = new javax.swing.JLabel();
        lblBackgroundLibrary = new javax.swing.JLabel();
        lblBackgroundMyInformations = new javax.swing.JLabel();
        lblBackgroundDebt = new javax.swing.JLabel();
        panelBackgroundBooks = new javax.swing.JPanel();
        lblNoBooks = new javax.swing.JLabel();
        //lblBackgroundMain = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 920));
        getContentPane().setLayout(null);

        lblExit.setBackground(new java.awt.Color(210, 69, 59));
        lblExit.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblExit.setForeground(new java.awt.Color(255, 255, 255));
        lblExit.setText("Sair");
        lblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExit.setOpaque(true);
        lblExit.setBounds(1430, 10, 30, 18);
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });
        getContentPane().add(lblExit);

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
        lblBack.setBounds(1350, 10, 50, 18);
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        getContentPane().add(lblBack);

        lblChangeMyInformations.setBackground(new java.awt.Color(210, 69, 59));
        lblChangeMyInformations.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblChangeMyInformations.setForeground(new java.awt.Color(255, 255, 255));
        lblChangeMyInformations.setText("Alterar Dados");
        lblChangeMyInformations.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblChangeMyInformations.setOpaque(true);
        lblChangeMyInformations.setBounds(1230, 10, 100, 18);
        lblChangeMyInformations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblChangeMyInformationsMouseClicked(evt);
            }
        });
        getContentPane().add(lblChangeMyInformations);

        lblPerfil.setBackground(new java.awt.Color(210, 69, 59));
        lblPerfil.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblPerfil.setForeground(new java.awt.Color(255, 255, 255));
        lblPerfil.setText("Perfil");
        lblPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPerfil.setOpaque(true);
        lblPerfil.setBounds(1170, 10, 40, 18);
        lblPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPerfilMouseClicked(evt);
            }
        });
        getContentPane().add(lblPerfil);

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

        lblMyBooksIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconBooks.png"))); // NOI18N
        lblMyBooksIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblMyBooksIcon);
        lblMyBooksIcon.setBounds(130, 280, 140, 140);

        lblMyBooksBig.setFont(new java.awt.Font("Maiandra GD", 1, 42)); // NOI18N
        lblMyBooksBig.setForeground(new java.awt.Color(102, 0, 0));
        lblMyBooksBig.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMyBooksBig.setText("Meus Livros");
        getContentPane().add(lblMyBooksBig);
        lblMyBooksBig.setBounds(260, 310, 300, 80);

        lblHistoricBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/historic.png"))); // NOI18N
        lblHistoricBackground.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblHistoricBackground);
        lblHistoricBackground.setBounds(1380, 290, 60, 70);
        lblHistoricBackground.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHistoricBackgroundMouseClicked(evt);
            }
        });
        
        
        lblBackgroundLibrary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/library.png"))); // NOI18N
        lblBackgroundLibrary.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblBackgroundLibrary);
        lblBackgroundLibrary.setBounds(1380, 400, 70, 80);
        lblBackgroundLibrary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackgroundLibraryMouseClicked(evt);
            }
        });

        lblBackgroundMyInformations.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/perfil.png"))); // NOI18N
        lblBackgroundMyInformations.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblBackgroundMyInformations);
        lblBackgroundMyInformations.setBounds(1380, 520, 60, 70);
        lblBackgroundMyInformations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackgroundMyInformationsMouseClicked(evt);
            }
        });

        lblBackgroundDebt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/divida.png"))); // NOI18N
        lblBackgroundDebt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblBackgroundDebt);
        lblBackgroundDebt.setBounds(1380, 640, 70, 90);
        lblBackgroundDebt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackgroundDebtMouseClicked(evt);
            }
        });

        panelBackgroundBooks.setBackground(new java.awt.Color(255, 255, 255));
        panelBackgroundBooks.setMinimumSize(new java.awt.Dimension(390, 630));
        panelBackgroundBooks.setLayout(null);

        lblNoBooks.setFont(new java.awt.Font("Maiandra GD", 1, 48)); // NOI18N
        lblNoBooks.setForeground(new java.awt.Color(102, 0, 0));
        lblNoBooks.setText("Você não possui livros no momento...");
        panelBackgroundBooks.add(lblNoBooks);
        lblNoBooks.setBounds(10, -20, 870, 370);
        lblNoBooks.setVisible(false);

        getContentPane().add(panelBackgroundBooks);
        panelBackgroundBooks.setBounds(220, 430, 900, 440);

        //lblBackgroundMain.setBackground(new java.awt.Color(255, 255, 255));
        //lblBackgroundMain.setOpaque(true);
        //getContentPane().add(lblBackgroundMain);
        //lblBackgroundMain.setBounds(10, 260, 1540, 800);

        loadInformations();
        pack();
    }
    
    private void loadInformations(){
        Functionalities.loadInformations(panelBackgroundBooks, user);
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
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows XP".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyBooksScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyBooksScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel lblMyBooksBig;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBackgroundDebt;
    private javax.swing.JLabel lblBackgroundHead;
    private javax.swing.JLabel lblBackgroundLibrary;
    private javax.swing.JLabel lblBackgroundMain;
    private javax.swing.JLabel lblBackgroundMyInformations;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblHistoricBackground;
    private javax.swing.JLabel lblLibrary;
    private javax.swing.JLabel lblChangeMyInformations;
    private javax.swing.JLabel lblMyBooksIcon;
    private javax.swing.JLabel lblNoBooks;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblUserFullName;
    private javax.swing.JPanel panelBackgroundBooks;
    // End of variables declaration                   
}
