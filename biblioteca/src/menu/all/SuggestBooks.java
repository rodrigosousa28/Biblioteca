package menu.all;

import java.awt.event.MouseEvent;

import entities.Book;
import entities.User;
import menu.Functionalities;


public class SuggestBooks extends javax.swing.JFrame {

	private static final long serialVersionUID = -2818967678208129986L;
	
	private User user;
	private Book book;
	
	User getUser() {
		return user;
	}
	
	Book getBook() {
		return book;
	}
	
	public SuggestBooks() {
        initComponents();
    }
	
	public SuggestBooks(User user, Book book){
		this.user = user;
		this.book = book;
		initComponents();
		setExtendedState(MAXIMIZED_BOTH);
	}
                             
    private void initComponents() {

        lblExit = new javax.swing.JLabel();
        lblUserFullName = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        lblMyBooks = new javax.swing.JLabel();
        lblPerfil = new javax.swing.JLabel();
        lblLibrary = new javax.swing.JLabel();
        lblBackgroundHead = new javax.swing.JLabel();
        lblHistoricBackground = new javax.swing.JLabel();
        lblBackgroundLibrary = new javax.swing.JLabel();
        lblBackgroundMyInformations = new javax.swing.JLabel();
        lblBackgroundDebt = new javax.swing.JLabel();
        lblSuggestBooks = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        panelBackgroundBooks = new javax.swing.JPanel();
        panelImage1 = new javax.swing.JPanel();
        lblImageBook1 = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        lblAuthor1 = new javax.swing.JLabel();
        lblPages1 = new javax.swing.JLabel();
        panelImage2 = new javax.swing.JPanel();
        lblImageBook2 = new javax.swing.JLabel();
        lblName2 = new javax.swing.JLabel();
        lblGenre1 = new javax.swing.JLabel();
        panelImage3 = new javax.swing.JPanel();
        lblImageBook3 = new javax.swing.JLabel();
        lblGenre2 = new javax.swing.JLabel();
        lblPages2 = new javax.swing.JLabel();
        lblName3 = new javax.swing.JLabel();
        lblAuthor3 = new javax.swing.JLabel();
        lblGenre3 = new javax.swing.JLabel();
        lblPages3 = new javax.swing.JLabel();
        lblAuthor2 = new javax.swing.JLabel();
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
        lblBackgroundHead.setBounds(0, 0, 1540, 260);

        lblHistoricBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/historic.png"))); // NOI18N
        lblHistoricBackground.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHistoricBackground.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHistoricBackgroundMouseClicked(evt);
            }
        });
        getContentPane().add(lblHistoricBackground);
        lblHistoricBackground.setBounds(1380, 290, 70, 80);

        lblBackgroundLibrary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/library.png"))); // NOI18N
        lblBackgroundLibrary.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBackgroundLibrary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackgroundLibraryMouseClicked(evt);
            }
        });
        getContentPane().add(lblBackgroundLibrary);
        lblBackgroundLibrary.setBounds(1380, 400, 70, 80);

        lblBackgroundMyInformations.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/perfil.png"))); // NOI18N
        lblBackgroundMyInformations.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBackgroundMyInformations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackgroundMyInformationsMouseClicked(evt);
            }
        });
        getContentPane().add(lblBackgroundMyInformations);
        lblBackgroundMyInformations.setBounds(1380, 520, 70, 80);

        lblBackgroundDebt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/divida.png"))); // NOI18N
        lblBackgroundDebt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBackgroundDebt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackgroundDebtMouseClicked(evt);
            }
        });
        getContentPane().add(lblBackgroundDebt);
        lblBackgroundDebt.setBounds(1380, 640, 70, 80);

        lblSuggestBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/SuggestBooksG.png"))); // NOI18N
        lblSuggestBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblSuggestBooks);
        lblSuggestBooks.setBounds(150, 270, 140, 140);

        lblTitle.setFont(new java.awt.Font("Maiandra GD", 1, 42)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(102, 0, 0));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Sugestões de Livros");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(280, 310, 390, 80);

        panelBackgroundBooks.setBackground(new java.awt.Color(255, 255, 255));
        panelBackgroundBooks.setMinimumSize(new java.awt.Dimension(390, 630));
        panelBackgroundBooks.setLayout(null);

        panelImage1.setLayout(null);
        panelImage1.add(lblImageBook1);
        panelImage1.setBackground(new java.awt.Color(255, 255, 255));
        lblImageBook1.setBounds(6, 5, 100, 130);

        panelBackgroundBooks.add(panelImage1);
        panelImage1.setBounds(118, 76, 110, 140);

        lblName1.setBackground(new java.awt.Color(102, 204, 255));
        lblName1.setText("Nome:");
        panelBackgroundBooks.add(lblName1);
        lblName1.setBounds(110, 230, 250, 20);

        lblAuthor1.setText("Autor:");
        panelBackgroundBooks.add(lblAuthor1);
        lblAuthor1.setBounds(110, 250, 220, 30);

        lblPages1.setText("Páginas:");
        panelBackgroundBooks.add(lblPages1);
        lblPages1.setBounds(110, 300, 220, 30);

        panelImage2.setLayout(null);
        panelImage2.add(lblImageBook2);
        panelImage2.setBackground(new java.awt.Color(255, 255, 255));
        lblImageBook2.setBounds(0, 0, 110, 140);

        panelBackgroundBooks.add(panelImage2);
        panelImage2.setBounds(520, 70, 110, 140);

        lblName2.setText("Nome:");
        panelBackgroundBooks.add(lblName2);
        lblName2.setBounds(510, 220, 250, 20);

        lblGenre1.setText("Gênero(s):");
        panelBackgroundBooks.add(lblGenre1);
        lblGenre1.setBounds(110, 280, 220, 20);

        panelImage3.setLayout(null);
        panelImage3.add(lblImageBook3);
        lblImageBook3.setBounds(0, 0, 110, 140);
        panelImage3.setBackground(new java.awt.Color(255, 255, 255));

        panelBackgroundBooks.add(panelImage3);
        panelImage3.setBounds(940, 80, 110, 140);

        lblGenre2.setText("Gênero(s):");
        panelBackgroundBooks.add(lblGenre2);
        lblGenre2.setBounds(510, 270, 210, 20);

        lblPages2.setText("Páginas:");
        panelBackgroundBooks.add(lblPages2);
        lblPages2.setBounds(510, 290, 210, 30);

        lblName3.setText("Nome:");
        panelBackgroundBooks.add(lblName3);
        lblName3.setBounds(930, 230, 250, 20);

        lblAuthor3.setText("Autor:");
        panelBackgroundBooks.add(lblAuthor3);
        lblAuthor3.setBounds(930, 250, 200, 30);

        lblGenre3.setText("Gênero(s):");
        panelBackgroundBooks.add(lblGenre3);
        lblGenre3.setBounds(930, 270, 200, 40);

        lblPages3.setText("Páginas:");
        panelBackgroundBooks.add(lblPages3);
        lblPages3.setBounds(930, 300, 200, 30);

        lblAuthor2.setText("Autor:");
        panelBackgroundBooks.add(lblAuthor2);
        lblAuthor2.setBounds(510, 240, 210, 30);

        getContentPane().add(panelBackgroundBooks);
        panelBackgroundBooks.setBounds(30, 410, 1200, 390);

        lblBackgroundMain.setBackground(new java.awt.Color(255, 255, 255));
        lblBackgroundMain.setOpaque(true);
        getContentPane().add(lblBackgroundMain);
        lblBackgroundMain.setBounds(0, 260, 1570, 1150);

        loadInformations();
        pack();
    }// </editor-fold>  
    
    private void loadInformations(){
        Functionalities.loadInformations
        (book, lblName1, lblName2, lblName3,
        		lblAuthor1, lblAuthor2, lblAuthor3,
        		lblGenre1, lblGenre2, lblGenre3,
        		lblPages1, lblPages2, lblPages3,
        		panelImage1, panelImage2, panelImage3,
        		lblImageBook1, lblImageBook2, lblImageBook3);
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

    private void lblMyBooksMouseClicked(java.awt.event.MouseEvent evt) {                                        
    	if(evt.getButton()==MouseEvent.BUTTON1){
            MyBooksScreen frame = new MyBooksScreen(user);
            frame.setVisible(true);
            this.dispose();
        }
    }                                       

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {                                     
    	if(evt.getButton()==MouseEvent.BUTTON1){
            AvailableBooks frame = new AvailableBooks(user);
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
            java.util.logging.Logger.getLogger(SuggestBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuggestBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuggestBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuggestBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuggestBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel lblAuthor1;
    private javax.swing.JLabel lblAuthor2;
    private javax.swing.JLabel lblAuthor3;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBackgroundDebt;
    private javax.swing.JLabel lblBackgroundHead;
    private javax.swing.JLabel lblBackgroundLibrary;
    private javax.swing.JLabel lblBackgroundMain;
    private javax.swing.JLabel lblBackgroundMyInformations;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblGenre1;
    private javax.swing.JLabel lblGenre2;
    private javax.swing.JLabel lblGenre3;
    private javax.swing.JLabel lblHistoricBackground;
    private javax.swing.JLabel lblImageBook1;
    private javax.swing.JLabel lblImageBook2;
    private javax.swing.JLabel lblImageBook3;
    private javax.swing.JLabel lblLibrary;
    private javax.swing.JLabel lblMyBooks;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblName2;
    private javax.swing.JLabel lblName3;
    private javax.swing.JLabel lblPages1;
    private javax.swing.JLabel lblPages2;
    private javax.swing.JLabel lblPages3;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblSuggestBooks;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserFullName;
    private javax.swing.JPanel panelBackgroundBooks;
    private javax.swing.JPanel panelImage1;
    private javax.swing.JPanel panelImage2;
    private javax.swing.JPanel panelImage3;
    // End of variables declaration                   
}
