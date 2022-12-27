package menu.adm;

import java.awt.event.MouseEvent;

import entities.User;
import menu.Functionalities;
import menu.all.AvailableBooks;
import menu.all.Historic;
import menu.all.MyBooksScreen;
import menu.all.MyInformations;

public class ManageLibrary extends javax.swing.JFrame {

	private static final long serialVersionUID = 150785995861230798L;
	
	private User user;
    User getUser() {
    	return this.user;
    }
    
    public ManageLibrary() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }
    
    public ManageLibrary(User user) {
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
        lblLibraryAdmin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblMyBooksIcon = new javax.swing.JLabel();
        lblHistoricBackground = new javax.swing.JLabel();
        lblBackgroundLibrary = new javax.swing.JLabel();
        lblBackgroundMyInformations = new javax.swing.JLabel();
        lblBackgroundDebt1 = new javax.swing.JLabel();
        lblBorrowBooks = new javax.swing.JLabel();
        lblEditBooks = new javax.swing.JLabel();
        lblReceiveBooks = new javax.swing.JLabel();
        lblAddBooks = new javax.swing.JLabel();
        lblReport = new javax.swing.JLabel();
        lblTextReceive = new javax.swing.JLabel();
        lblTextBorrow = new javax.swing.JLabel();
        lblTextAdd = new javax.swing.JLabel();
        lblTextEditBooks = new javax.swing.JLabel();
        lblTextReport = new javax.swing.JLabel();
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

        lblLibraryAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/librarianG.png"))); // NOI18N
        lblLibraryAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblLibraryAdmin);
        lblLibraryAdmin.setBounds(130, 280, 140, 140);

        jLabel1.setFont(new java.awt.Font("Maiandra GD", 1, 42)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Administração");
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
        lblBackgroundMyInformations.setBounds(1380, 570, 70, 80);

        lblBackgroundDebt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconDebt.png"))); // NOI18N
        lblBackgroundDebt1.setToolTipText("");
        lblBackgroundDebt1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblBackgroundDebt1);
        lblBackgroundDebt1.setBounds(1380, 670, 70, 80);

        lblBorrowBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/BorrowBooks.png"))); // NOI18N
        lblBorrowBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBorrowBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBorrowBooksMouseClicked(evt);
            }
        });
        getContentPane().add(lblBorrowBooks);
        lblBorrowBooks.setBounds(410, 500, 70, 80);

        lblEditBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editBooks.png"))); // NOI18N
        lblEditBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEditBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditBooksMouseClicked(evt);
            }
        });
        getContentPane().add(lblEditBooks);
        lblEditBooks.setBounds(780, 500, 70, 80);

        lblReceiveBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ReceiveBooks.png"))); // NOI18N
        lblReceiveBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblReceiveBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblReceiveBooksMouseClicked(evt);
            }
        });
        getContentPane().add(lblReceiveBooks);
        lblReceiveBooks.setBounds(240, 500, 70, 80);

        lblAddBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/addBook.png"))); // NOI18N
        lblAddBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAddBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbladdBooksMouseClicked(evt);
            }
        });
        getContentPane().add(lblAddBooks);
        lblAddBooks.setBounds(610, 500, 70, 80);

        lblReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Report.png"))); // NOI18N
        lblReport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblReportMouseClicked(evt);
            }
        });
        getContentPane().add(lblReport);
        lblReport.setBounds(960, 500, 70, 80);

        lblTextReceive.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblTextReceive.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTextReceive.setText("Receber");
        getContentPane().add(lblTextReceive);
        lblTextReceive.setBounds(210, 600, 120, 20);

        lblTextBorrow.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblTextBorrow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTextBorrow.setText("Emprestar");
        getContentPane().add(lblTextBorrow);
        lblTextBorrow.setBounds(390, 600, 120, 20);

        lblTextAdd.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblTextAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTextAdd.setText("Adicionar");
        lblTextAdd.setToolTipText("");
        getContentPane().add(lblTextAdd);
        lblTextAdd.setBounds(580, 600, 120, 20);

        lblTextEditBooks.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblTextEditBooks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTextEditBooks.setText("Editar");
        getContentPane().add(lblTextEditBooks);
        lblTextEditBooks.setBounds(780, 600, 70, 20);

        lblTextReport.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblTextReport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTextReport.setText("Relatório");
        getContentPane().add(lblTextReport);
        lblTextReport.setBounds(930, 600, 120, 20);

        lblBackgroundMain.setBackground(new java.awt.Color(255, 255, 255));
        lblBackgroundMain.setOpaque(true);
        getContentPane().add(lblBackgroundMain);
        lblBackgroundMain.setBounds(-90, 260, 1840, 800);

        pack();
    }// </editor-fold>                        

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
    		MyBooksScreen mbs = new MyBooksScreen(user);
        	mbs.setVisible(true);
        	this.dispose();
        }
    }                                       

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {                                     
    	if(evt.getButton()==MouseEvent.BUTTON1){
    		MainMenuAdm mma = new MainMenuAdm(user);
        	mma.setVisible(true);
        	this.dispose();
        }
    }                                    

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {                                     
    	this.dispose();
    }                                    

    private void lblReceiveBooksMouseClicked(java.awt.event.MouseEvent evt) {                                             
        if(evt.getButton()==MouseEvent.BUTTON1){
            ReceiveBooks frame = new ReceiveBooks(user);
            frame.setVisible(true);
            this.dispose();
        }
    }                                            

    private void lblBorrowBooksMouseClicked(java.awt.event.MouseEvent evt) {                                            
        if(evt.getButton()==MouseEvent.BUTTON1){
            BorrowBooks frame = new BorrowBooks(user);
            frame.setVisible(true);
            this.dispose();
        }
    }

    private void lbladdBooksMouseClicked(java.awt.event.MouseEvent evt) {                                         
        if(evt.getButton()==MouseEvent.BUTTON1){
            AddBooks frame = new AddBooks(user);
            frame.setVisible(true);
            this.dispose();            
        }
    }

    private void lblEditBooksMouseClicked(java.awt.event.MouseEvent evt) {                                          
        if(evt.getButton()==MouseEvent.BUTTON1){
            EditBooks frame = new EditBooks(user);
            frame.setVisible(true);
            this.dispose();
        }
    }

    private void lblReportMouseClicked(java.awt.event.MouseEvent evt) {                                       
        if(evt.getButton()==MouseEvent.BUTTON1){
            Report frame = new Report(user);
            frame.setVisible(true);
            this.dispose();
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
            java.util.logging.Logger.getLogger(ManageLibrary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageLibrary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageLibrary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageLibrary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageLibrary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBackgroundDebt1;
    private javax.swing.JLabel lblBackgroundHead;
    private javax.swing.JLabel lblBackgroundLibrary;
    private javax.swing.JLabel lblBackgroundMain;
    private javax.swing.JLabel lblBackgroundMyInformations;
    private javax.swing.JLabel lblBorrowBooks;
    private javax.swing.JLabel lblEditBooks;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblHistoricBackground;
    private javax.swing.JLabel lblLibrary;
    private javax.swing.JLabel lblLibraryAdmin;
    private javax.swing.JLabel lblChangeMyInformations;
    private javax.swing.JLabel lblMyBooksIcon;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblReceiveBooks;
    private javax.swing.JLabel lblReport;
    private javax.swing.JLabel lblTextAdd;
    private javax.swing.JLabel lblTextBorrow;
    private javax.swing.JLabel lblTextEditBooks;
    private javax.swing.JLabel lblTextReceive;
    private javax.swing.JLabel lblTextReport;
    private javax.swing.JLabel lblUserFullName;
    private javax.swing.JLabel lblAddBooks;
    // End of variables declaration                   
}
