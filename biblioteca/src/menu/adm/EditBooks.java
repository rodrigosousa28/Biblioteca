package menu.adm;

import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import data_base.DAO;
import entities.Book;
import entities.User;
import menu.Functionalities;
import menu.all.AvailableBooks;
import menu.all.ChangeMyInformations;
import menu.all.Historic;
import menu.all.MyBooksScreen;
import menu.all.MyInformations;
import util.TableModelSimpleBook;


public class EditBooks extends javax.swing.JFrame {

	private static final long serialVersionUID = 1756610772132703262L;
	
	private User user;
	
    public EditBooks() {
        initComponents();
    }

    public EditBooks(User user) {
    	this.user = user;
		initComponents();
		setExtendedState(MAXIMIZED_BOTH);
    }
    
    User getUser() {
    	return user;
    }
                         
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lblBackgroundMain2 = new javax.swing.JLabel();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblAuthor = new javax.swing.JLabel();
        lblPages = new javax.swing.JLabel();
        lblGenreOne = new javax.swing.JLabel();
        btnDeleteBook = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtAuthor = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        lblAlexandria = new javax.swing.JLabel();
        cbbStock = new javax.swing.JCheckBox();
        cbbName = new javax.swing.JCheckBox();
        cbbAuthor = new javax.swing.JCheckBox();
        cbbPages = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        lblStock = new javax.swing.JLabel();
        txtPages = new javax.swing.JTextField();
        txtGenreOne = new javax.swing.JTextField();
        lblGenreTwo = new javax.swing.JLabel();
        txtGenreTwo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbbGenreOne = new javax.swing.JCheckBox();
        cbbGenreTwo = new javax.swing.JCheckBox();
        btnConfirmChanges1 = new javax.swing.JButton();
        scrollBooks = new javax.swing.JScrollPane();
        tableBooks = new javax.swing.JTable();
        lblSubtitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblSearchBook = new javax.swing.JLabel();
        txtSearchBook = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lblBackgroundMain1 = new javax.swing.JLabel();

        jLabel2.setForeground(new java.awt.Color(51, 0, 0));
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 0), 3, true));

        lblBackgroundMain2.setBackground(new java.awt.Color(255, 255, 255));
        lblBackgroundMain2.setOpaque(true);

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
        lblMyBooksIcon.setBounds(1390, 280, 70, 80);

        lblHistoricBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/historic.png"))); // NOI18N
        lblHistoricBackground.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHistoricBackground.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHistoricBackgroundMouseClicked(evt);
            }
        });
        getContentPane().add(lblHistoricBackground);
        lblHistoricBackground.setBounds(1390, 360, 70, 80);

        lblBackgroundLibrary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/library.png"))); // NOI18N
        lblBackgroundLibrary.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBackgroundLibrary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackgroundLibraryMouseClicked(evt);
            }
        });
        getContentPane().add(lblBackgroundLibrary);
        lblBackgroundLibrary.setBounds(1390, 450, 70, 80);

        lblBackgroundMyInformations.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/perfil.png"))); // NOI18N
        lblBackgroundMyInformations.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBackgroundMyInformations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackgroundMyInformationsMouseClicked(evt);
            }
        });
        getContentPane().add(lblBackgroundMyInformations);
        lblBackgroundMyInformations.setBounds(1390, 540, 70, 80);

        lblBackgroundDebt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconDebt.png"))); // NOI18N
        lblBackgroundDebt1.setToolTipText("");
        getContentPane().add(lblBackgroundDebt1);
        lblBackgroundDebt1.setBounds(1390, 640, 70, 80);

        lblReceiveBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editBooksG.png"))); // NOI18N
        lblReceiveBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblReceiveBooks);
        lblReceiveBooks.setBounds(120, 260, 140, 130);

        jLabel1.setFont(new java.awt.Font("Maiandra GD", 1, 42)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Editar ou remover Livros");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 280, 530, 80);

        jLabel3.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 0));
        jLabel3.setText("Nome:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(560, 450, 60, 40);

        lblAuthor.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblAuthor.setForeground(new java.awt.Color(51, 0, 0));
        lblAuthor.setText("Autor:");
        getContentPane().add(lblAuthor);
        lblAuthor.setBounds(560, 500, 60, 40);

        lblPages.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblPages.setForeground(new java.awt.Color(51, 0, 0));
        lblPages.setText("Páginas:");
        getContentPane().add(lblPages);
        lblPages.setBounds(540, 550, 90, 40);

        lblGenreOne.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblGenreOne.setForeground(new java.awt.Color(51, 0, 0));
        lblGenreOne.setText("Gênero 1:");
        getContentPane().add(lblGenreOne);
        lblGenreOne.setBounds(530, 600, 90, 40);

        btnDeleteBook.setBackground(new java.awt.Color(210, 69, 59));
        btnDeleteBook.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        btnDeleteBook.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteBook.setText("Excluir");
        btnDeleteBook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnDeleteBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteBookActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeleteBook);
        btnDeleteBook.setBounds(990, 700, 110, 40);

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtName.setSelectionColor(new java.awt.Color(204, 0, 0));
        getContentPane().add(txtName);
        txtName.setBounds(640, 450, 290, 40);

        txtAuthor.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        getContentPane().add(txtAuthor);
        txtAuthor.setBounds(640, 500, 290, 40);

        txtStock.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        getContentPane().add(txtStock);
        txtStock.setBounds(640, 700, 290, 40);

        lblAlexandria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAlexandria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/quinta-de-sao-pedro-de-alexandria.png"))); // NOI18N
        getContentPane().add(lblAlexandria);
        lblAlexandria.setBounds(1130, 540, 140, 120);

        cbbStock.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        cbbStock.setForeground(new java.awt.Color(51, 0, 0));
        cbbStock.setText("Estoque");
        cbbStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbStockActionPerformed(evt);
            }
        });
        cbbStock.setOpaque(false);
        getContentPane().add(cbbStock);
        cbbStock.setBounds(990, 610, 140, 30);

        cbbName.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        cbbName.setForeground(new java.awt.Color(51, 0, 0));
        cbbName.setText("Nome");
        getContentPane().add(cbbName);
        cbbName.setBounds(990, 480, 240, 19);
        cbbName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbNameActionPerformed(evt);
            }
        });
        cbbName.setOpaque(false);

        cbbAuthor.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        cbbAuthor.setForeground(new java.awt.Color(51, 0, 0));
        cbbAuthor.setText("Autor");
        cbbAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbAuthorActionPerformed(evt);
            }
        });
        getContentPane().add(cbbAuthor);
        cbbAuthor.setBounds(990, 500, 230, 30);
        cbbAuthor.setOpaque(false);


        cbbPages.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        cbbPages.setForeground(new java.awt.Color(51, 0, 0));
        cbbPages.setText("Páginas");
        cbbPages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbPagesActionPerformed(evt);
            }
        });
        getContentPane().add(cbbPages);
        cbbPages.setBounds(990, 530, 240, 19);
        cbbPages.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 0));
        jLabel5.setText("Marque os campos que deseja alterar:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(980, 430, 270, 30);

        lblStock.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblStock.setForeground(new java.awt.Color(51, 0, 0));
        lblStock.setText("Estoque:");
        getContentPane().add(lblStock);
        lblStock.setBounds(540, 700, 90, 40);

        txtPages.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        getContentPane().add(txtPages);
        txtPages.setBounds(640, 550, 290, 40);

        txtGenreOne.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        getContentPane().add(txtGenreOne);
        txtGenreOne.setBounds(640, 600, 290, 40);

        lblGenreTwo.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblGenreTwo.setForeground(new java.awt.Color(51, 0, 0));
        lblGenreTwo.setText("Gênero 2:");
        getContentPane().add(lblGenreTwo);
        lblGenreTwo.setBounds(530, 650, 90, 40);

        txtGenreTwo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        getContentPane().add(txtGenreTwo);
        txtGenreTwo.setBounds(640, 650, 290, 40);

        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 2));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(980, 460, 300, 200);

        cbbGenreOne.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        cbbGenreOne.setForeground(new java.awt.Color(51, 0, 0));
        cbbGenreOne.setText("Gênero 1");
        cbbGenreOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbGenreOneActionPerformed(evt);
            }
        });
        getContentPane().add(cbbGenreOne);
        cbbGenreOne.setBounds(990, 550, 150, 30);
        cbbGenreOne.setOpaque(false);


        cbbGenreTwo.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        cbbGenreTwo.setForeground(new java.awt.Color(51, 0, 0));
        cbbGenreTwo.setText("Gênero 2");
        cbbGenreTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbGenreTwoActionPerformed(evt);
            }
        });
        getContentPane().add(cbbGenreTwo);
        cbbGenreTwo.setOpaque(false);

        cbbGenreTwo.setBounds(990, 580, 250, 30);

        btnConfirmChanges1.setBackground(new java.awt.Color(210, 69, 59));
        btnConfirmChanges1.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        btnConfirmChanges1.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmChanges1.setText("Alterar");
        btnConfirmChanges1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnConfirmChanges1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmChangesActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirmChanges1);
        btnConfirmChanges1.setBounds(1170, 700, 110, 40);

        scrollBooks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        
        DAO dao = new DAO();
        
        try {
        	tableModelBook = new TableModelSimpleBook(dao.listAllBooks(false));
        	tableBooks = new javax.swing.JTable(tableModelBook);
        	tableBooks.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    tableBooksMouseClicked(evt);
                }
            });
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
        scrollBooks.setBounds(40, 530, 450, 220);

        lblSubtitle.setFont(new java.awt.Font("Maiandra GD", 1, 26)); // NOI18N
        lblSubtitle.setForeground(new java.awt.Color(102, 0, 0));
        lblSubtitle.setText("Clique em um livro para editar");
        getContentPane().add(lblSubtitle);
        lblSubtitle.setBounds(40, 420, 400, 40);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblSearchBook.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblSearchBook.setForeground(new java.awt.Color(51, 0, 0));
        lblSearchBook.setText("Livro:");

        txtSearchBook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0)));

        btnSearch.setBackground(new java.awt.Color(210, 69, 59));
        btnSearch.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Pesquisar");
        btnSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblSearchBook, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearchBook, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSearchBook, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtSearchBook))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 470, 450, 50);

        lblBackgroundMain1.setBackground(new java.awt.Color(255, 255, 255));
        lblBackgroundMain1.setOpaque(true);
        getContentPane().add(lblBackgroundMain1);
        lblBackgroundMain1.setBounds(0, 260, 1540, 800);

        txtName.setEditable(false);
		txtAuthor.setEditable(false);
		txtGenreOne.setEditable(false);
		txtGenreTwo.setEditable(false);
		txtPages.setEditable(false);
		txtStock.setEditable(false);
		
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
    
    private void cbbNameActionPerformed(java.awt.event.ActionEvent evt) {
    	if(cbbName.isSelected()) {
    		txtName.setEditable(true);
    	}else {
    		txtName.setEditable(false);
    	}
    }

    private void cbbStockActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	if(cbbStock.isSelected()) {
    		txtStock.setEditable(true);
    	}else {
    		txtStock.setEditable(false);
    	}
    }                                        

    private void cbbAuthorActionPerformed(java.awt.event.ActionEvent evt) {                                          
    	if(cbbAuthor.isSelected()) {
    		txtAuthor.setEditable(true);
    	}else {
    		txtAuthor.setEditable(false);
    	}
    }                                         

    private void cbbPagesActionPerformed(java.awt.event.ActionEvent evt) {   
    	if(cbbPages.isSelected()) {
    		txtPages.setEditable(true);
    	}else {
    		txtPages.setEditable(false);
    	}
    }                                        

    private void cbbGenreOneActionPerformed(java.awt.event.ActionEvent evt) {                                            
    	if(cbbGenreOne.isSelected()) {
    		txtGenreOne.setEditable(true);
    	}else {
    		txtGenreOne.setEditable(false);
    	}
    }                                           

    private void cbbGenreTwoActionPerformed(java.awt.event.ActionEvent evt) {                                             
    	if(cbbGenreTwo.isSelected()) {
    		txtGenreTwo.setEditable(true);
    	}else {
    		txtGenreTwo.setEditable(false);
    	}
    }                                            

    private void btnDeleteBookActionPerformed(java.awt.event.ActionEvent evt) {                                                  
    	Book book = (Book) tableModelBook.getSelected(tableBooks.getSelectedRow());
    	DAO dao = new DAO();
    	
    	try {
			dao.deleteBook(book);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(this, "Não foi possível deletar o livro porque existe algum usuário que não o devolveu");
			return;
		}
    	JOptionPane.showMessageDialog(this, "Livro deletado");
    	try {
			tableModelBook.refreshData(dao.listAllBooks(false));
		} catch (SQLException e) {
			
		}
    }                                                 

    private void btnConfirmChangesActionPerformed(java.awt.event.ActionEvent evt) {                                                   
    	DAO dao = new DAO();    	
    	Book book = (Book) tableModelBook.getSelected(tableBooks.getSelectedRow());
    	
    	if(cbbName.isSelected()) {
    		try {
				dao.updateBookName(book, txtName.getText());
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(this, "Não foi possível alterar o nome do livro");
				e.printStackTrace();
				return;
			}
    	}
    	
    	if(cbbAuthor.isSelected()) {
    		try {
				dao.updateBookAuthor(book, txtAuthor.getText());
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(this, "Não foi possível alterar o autor");
				e.printStackTrace();
				return;
			}
    	}
    	
    	if(cbbPages.isSelected()) {
    		try {
    			Integer pages = Integer.parseInt(txtPages.getText());
				dao.updateBookPages(book, pages);
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(this, "Não foi possível alterar a quantidade de páginas");
				e.printStackTrace();
				return;
			}
    	}
    	
    	if(cbbGenreOne.isSelected()) {
    		try {
				dao.updateGenreOne(book, txtGenreOne.getText());
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(this, "Não foi possível alterar o Gênero 1");
				e.printStackTrace();
				return;
			}
    	}
    	
    	if(cbbGenreTwo.isSelected()) {
    		try {
				dao.updateGenreTwo(book, txtGenreTwo.getText());
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(this, "Não foi possível alterar o Gênero 2");
				e.printStackTrace();
				return;
			}
    	}
    	
    	if(cbbStock.isSelected()) {
    		try {
    			Integer stock = Integer.parseInt(txtStock.getText());
				dao.updateBookStock(book, stock);
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(this, "Não foi possível alterar o estoque");
				e.printStackTrace();
				return;
			}
    	}
    	
    	JOptionPane.showMessageDialog(this, "Alterações realizadas");
    	
    	try {
			tableModelBook.refreshData(dao.listAllBooks(false));
		} catch (SQLException e) {
			
		}
    	
    	dao.close();
    } 
    
    private void tableBooksMouseClicked(java.awt.event.MouseEvent evt) {
    	if(evt.getClickCount() == 1) {
    		loadInfo(tableBooks.getSelectedRow());
    	}
    }
    
    private void loadInfo(int index){
		Book book = (Book) tableModelBook.getSelected(index);
		
		if(book != null){
			txtName.setText(book.getName());
			txtAuthor.setText(book.getAuthor());
			txtGenreOne.setText(book.getGenreOne());
			txtGenreTwo.setText(book.getGenreTwo());			
			txtPages.setText(Integer.toString(book.getNumberOfPages()));
			txtStock.setText(Integer.toString(book.getStockQuantity()));
			
		}
	}

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {                                          
    	String name = txtName.getText();
    	DAO dao = new DAO();
    	
    	try {    		
    		tableModelBook = new TableModelSimpleBook(dao.listBooksByName(name));
        	tableBooks = new javax.swing.JTable(tableModelBook);
        	tableBooks.setSelectionBackground(new java.awt.Color(210, 69, 59));
            tableBooks.setSelectionForeground(new java.awt.Color(255, 255, 255));
            tableBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        	tableBooks.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    tableBooksMouseClicked(evt);
                }
            });
        	scrollBooks.setViewportView(tableBooks);
    	} catch (SQLException e) {
    		e.printStackTrace();
    		JOptionPane.showMessageDialog(this, "Algo deu errado!");
    	}finally {
    		dao.close();
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
            java.util.logging.Logger.getLogger(EditBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditBooks().setVisible(true);
            }
        });
    }

    private TableModelSimpleBook tableModelBook;
    private javax.swing.JButton btnDeleteBook;
    private javax.swing.JButton btnConfirmChanges1;
    private javax.swing.JButton btnSearch;
    private javax.swing.JCheckBox cbbAuthor;
    private javax.swing.JCheckBox cbbGenreOne;
    private javax.swing.JCheckBox cbbName;
    private javax.swing.JCheckBox cbbPages;
    private javax.swing.JCheckBox cbbGenreTwo;
    private javax.swing.JCheckBox cbbStock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane scrollBooks;
    private javax.swing.JTable tableBooks;
    private javax.swing.JLabel lblAlexandria;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBackgroundDebt1;
    private javax.swing.JLabel lblBackgroundHead;
    private javax.swing.JLabel lblBackgroundLibrary;
    private javax.swing.JLabel lblBackgroundMain1;
    private javax.swing.JLabel lblBackgroundMain2;
    private javax.swing.JLabel lblBackgroundMyInformations;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblGenreOne;
    private javax.swing.JLabel lblGenreTwo;
    private javax.swing.JLabel lblHistoricBackground;
    private javax.swing.JLabel lblLibrary;
    private javax.swing.JLabel lblChangeMyInformations;
    private javax.swing.JLabel lblMyBooksIcon;
    private javax.swing.JLabel lblPages;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblReceiveBooks;
    private javax.swing.JLabel lblSearchBook;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblSubtitle;
    private javax.swing.JLabel lblUserFullName;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtGenreOne;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtGenreTwo;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPages;
    private javax.swing.JTextField txtSearchBook;
    // End of variables declaration                   
}
