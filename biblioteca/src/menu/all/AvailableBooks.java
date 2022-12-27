package menu.all;

import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import data_base.DAO;
import entities.Book;
import entities.User;
import menu.Functionalities;
import menu.adm.MainMenuAdm;
import util.TableModelSimpleBook;


public class AvailableBooks extends javax.swing.JFrame {

	private static final long serialVersionUID = -5745379397588249332L;
	
	private User user;
    User getUser() {
    	return this.user;
    }
    
    public AvailableBooks() {
        initComponents();
    }
    
    public AvailableBooks(User user) {
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
        lblBackgroundLibrary = new javax.swing.JLabel();
        lblAvailableBooksTitle = new javax.swing.JLabel();
        lblMyBooksIcon = new javax.swing.JLabel();
        lblHistoricBackground = new javax.swing.JLabel();
        lblBackgroundMyInformations = new javax.swing.JLabel();
        lblBackgroundDebt = new javax.swing.JLabel();
        scrollBooks = new javax.swing.JScrollPane();
        tableBooks = new javax.swing.JTable();
        panelImage = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        lblStock = new javax.swing.JLabel();
        lblSubtitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblSuggestBooks = new javax.swing.JLabel();
        lblAuthor = new javax.swing.JLabel();
        lblGenre = new javax.swing.JLabel();
        lblPages = new javax.swing.JLabel();
        panelSearch = new javax.swing.JPanel();
        lblSearchBook = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        panelFilterSearch = new javax.swing.JPanel();
        lblFilterSearch = new javax.swing.JLabel();
        cbbFilterSearch = new javax.swing.JComboBox<>();
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
        lblBackgroundHead.setBounds(0, 0, 1540, 260);

        lblBackgroundLibrary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LibraryG.png"))); // NOI18N
        lblBackgroundLibrary.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblBackgroundLibrary);
        lblBackgroundLibrary.setBounds(130, 280, 140, 140);

        lblAvailableBooksTitle.setFont(new java.awt.Font("Maiandra GD", 1, 42)); // NOI18N
        lblAvailableBooksTitle.setForeground(new java.awt.Color(102, 0, 0));
        lblAvailableBooksTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAvailableBooksTitle.setText("Livros Disponíveis");
        getContentPane().add(lblAvailableBooksTitle);
        lblAvailableBooksTitle.setBounds(260, 310, 410, 80);

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
        lblHistoricBackground.setBounds(1380, 400, 70, 80);

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

        scrollBooks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));

        
        DAO dao = new DAO();
        
        try {
        	tableModelBook = new TableModelSimpleBook(dao.listAllBooks(true));
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
        
        
        dao.close();
        
        scrollBooks.setViewportView(tableBooks);

        getContentPane().add(scrollBooks);
        scrollBooks.setBounds(50, 570, 770, 220);
        

        panelImage.setBackground(new java.awt.Color(255, 255, 255));
        panelImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0)));
        panelImage.setLayout(null);

        lblImage.setBackground(new java.awt.Color(255, 255, 255));
        lblImage.setOpaque(true);
        panelImage.add(lblImage);
        lblImage.setBounds(0, 0, 170, 210);

        getContentPane().add(panelImage);
        panelImage.setBounds(960, 420, 170, 210);

        lblStock.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblStock.setForeground(new java.awt.Color(51, 0, 0));
        lblStock.setText("Estoque:");
        getContentPane().add(lblStock);
        lblStock.setBounds(940, 740, 390, 18);
        lblStock.setVisible(false);

        lblSubtitle.setFont(new java.awt.Font("Maiandra GD", 1, 26)); // NOI18N
        lblSubtitle.setForeground(new java.awt.Color(102, 0, 0));
        lblSubtitle.setText("Clique em algum livro para exibir mais informações.");
        getContentPane().add(lblSubtitle);
        lblSubtitle.setBounds(50, 460, 760, 40);

        lblName.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(51, 0, 0));
        lblName.setText("Nome:");
        getContentPane().add(lblName);
        lblName.setBounds(940, 660, 380, 18);
        lblName.setVisible(false);

        lblSuggestBooks.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        lblSuggestBooks.setText("<html><u>Ver livros similares</u><html>");
        lblSuggestBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSuggestBooks.addMouseListener(new java.awt.event.MouseAdapter() {
        	public void mouseClicked(java.awt.event.MouseEvent evt) {
        		lblSuggestBooksMouseClicked(evt);
        	}
        });
        getContentPane().add(lblSuggestBooks);
        lblSuggestBooks.setBounds(1160, 760, 130, 30);
        lblSuggestBooks.setVisible(false);
        
        lblAuthor.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblAuthor.setForeground(new java.awt.Color(51, 0, 0));
        lblAuthor.setText("Autor:");
        getContentPane().add(lblAuthor);
        lblAuthor.setBounds(940, 680, 390, 18);
        lblAuthor.setVisible(false);

        lblGenre.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblGenre.setForeground(new java.awt.Color(51, 0, 0));
        lblGenre.setText("Gênero(s):");
        getContentPane().add(lblGenre);
        lblGenre.setBounds(940, 700, 390, 18);
        lblGenre.setVisible(false);

        lblPages.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblPages.setForeground(new java.awt.Color(51, 0, 0));
        lblPages.setText("Páginas:");
        getContentPane().add(lblPages);
        lblPages.setBounds(940, 720, 390, 18);
        lblPages.setVisible(false);

        panelSearch.setBackground(new java.awt.Color(255, 255, 255));
        panelSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblSearchBook.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblSearchBook.setForeground(new java.awt.Color(51, 0, 0));
        lblSearchBook.setText("Nome:");

        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0)));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(panelSearch);
        panelSearch.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblSearchBook, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSearchBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtName)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(panelSearch);
        panelSearch.setBounds(50, 510, 580, 50);
        
        panelFilterSearch.setBackground(new java.awt.Color(255, 255, 255));
        panelFilterSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelFilterSearch.setLayout(null);
        
        lblFilterSearch.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblFilterSearch.setForeground(new java.awt.Color(51, 0, 0));
        lblFilterSearch.setText("Filtro:");
        panelFilterSearch.add(lblFilterSearch);
        lblFilterSearch.setBounds(12, 12, 60, 30);

        cbbFilterSearch.setFont(new java.awt.Font("Maiandra GD", 1, 16)); // NOI18N
        cbbFilterSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Autor", "Gênero" }));
        cbbFilterSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0)));
        cbbFilterSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbFilterSearchActionPerformed(evt);
            }
        });
        panelFilterSearch.add(cbbFilterSearch);
        cbbFilterSearch.setBounds(70, 10, 96, 34);

        getContentPane().add(panelFilterSearch);
        panelFilterSearch.setBounds(640, 510, 180, 50);

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
    
    private void tableBooksMouseClicked(java.awt.event.MouseEvent evt) {
    	if(evt.getClickCount() == 1) {
    		loadInfo(tableBooks.getSelectedRow());
    	}
    }
    
    private void loadInfo(int index){
    	Book book = (Book) tableModelBook.getSelected(index);
		if(book != null){
			lblName.setText("Nome: ".concat(book.getName()));
			lblAuthor.setText("Autor: ".concat(book.getAuthor()));
			lblGenre.setText("Gênero(s)".concat(book.getGenres()));
			lblPages.setText("Páginas: ".concat(Integer.toString(book.getNumberOfPages())));
			lblStock.setText("Estoque: ".concat(Integer.toString(book.getStockQuantity())));
			
			lblName.setVisible(true);
			lblAuthor.setVisible(true);
			lblGenre.setVisible(true);
			lblPages.setVisible(true);
			lblStock.setVisible(true);
			lblSuggestBooks.setVisible(true);
			
			ImageIcon icon = new ImageIcon(book.getImage());
			icon.setImage(icon.getImage().getScaledInstance(panelImage.getWidth() -1, panelImage.getHeight() -1, 100));
			lblImage.setIcon(icon);
			
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
    
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {                                          
    	String name = txtName.getText();
    	DAO dao = new DAO();
    	
    	try {    		
    		List<Book> books = new ArrayList<>();
    		switch((String) cbbFilterSearch.getSelectedItem()) {
    		case "Nome":
    			books = dao.listBooksByName(name);
    			break;
    		case "Autor":
    			books = dao.findBooksByAuthor(name);
    			break;
    		case "Gênero":
    			books = dao.findBooksByGenre(name);
    		}
    		
    		tableModelBook = new TableModelSimpleBook(books);
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
    		e.printStackTrace();
    		JOptionPane.showMessageDialog(this, "Algo deu errado!");
    	}finally {
    		dao.close();
    	}
    }         
    
    private void lblSuggestBooksMouseClicked(java.awt.event.MouseEvent evt) {                                             
    	Book book = (Book) tableModelBook.getSelected(tableBooks.getSelectedRow());
    	if(evt.getButton()==MouseEvent.BUTTON1){
            SuggestBooks frame = new SuggestBooks(user, book);
            frame.setVisible(true);
            this.dispose();
        }
    }    
    
    private void cbbFilterSearchActionPerformed(java.awt.event.ActionEvent evt) {     
    	lblSearchBook.setText((String) cbbFilterSearch.getSelectedItem());
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
            java.util.logging.Logger.getLogger(AvailableBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AvailableBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AvailableBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AvailableBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AvailableBooks().setVisible(true);
            }
        });
    }
    
    private TableModelSimpleBook tableModelBook;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbbFilterSearch;
    private javax.swing.JPanel panelSearch;
    private javax.swing.JScrollPane scrollBooks;
    private javax.swing.JTable tableBooks;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblAvailableBooksTitle;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBackgroundDebt;
    private javax.swing.JLabel lblBackgroundHead;
    private javax.swing.JLabel lblBackgroundLibrary;
    private javax.swing.JLabel lblBackgroundMain;
    private javax.swing.JLabel lblBackgroundMyInformations;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblFilterSearch;
    private javax.swing.JLabel lblGenre;
    private javax.swing.JLabel lblHistoricBackground;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLibrary;
    private javax.swing.JLabel lblChangeMyInformations;
    private javax.swing.JLabel lblMyBooksIcon;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPages;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblSearchBook;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblSubtitle;
    private javax.swing.JLabel lblUserFullName;
    private javax.swing.JLabel lblSuggestBooks;
    private javax.swing.JPanel panelFilterSearch;
    private javax.swing.JPanel panelImage;
    private javax.swing.JTextField txtName;
    // End of variables declaration                   
}
