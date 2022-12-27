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
import menu.all.Historic;
import menu.all.MyBooksScreen;
import menu.all.MyInformations;
import util.TableModelRecord;


public class ReceiveBooks extends javax.swing.JFrame {

    
	private static final long serialVersionUID = 699292467272040295L;
	
	Object type;
	private User user;
    User getUser() {
    	return this.user;
    }
    
    public ReceiveBooks() {
        initComponents();
    }
                          
    public ReceiveBooks(User user) {
    	this.user = user;
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
        lblMyBooksIcon = new javax.swing.JLabel();
        lblHistoricBackground = new javax.swing.JLabel();
        lblBackgroundLibrary = new javax.swing.JLabel();
        lblBackgroundMyInformations = new javax.swing.JLabel();
        lblBackgroundDebt1 = new javax.swing.JLabel();
        lblReceiveBooks = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblSearchBy = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        panelFilterSearch = new javax.swing.JPanel();
        cbbFilterSearch = new javax.swing.JComboBox<>();
        lblFilterSearch = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cbbChoiceType = new javax.swing.JComboBox<>();
        lblSearchBy1 = new javax.swing.JLabel();
        jCalendar = new com.toedter.calendar.JCalendar();
        btnReceive = new javax.swing.JButton();
        lblChooseDay = new javax.swing.JLabel();
        lblBackgroundMain3 = new javax.swing.JLabel();

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
        lblBackgroundHead.setBounds(0, 0, 1550, 260);

        lblMyBooksIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/books.png"))); // NOI18N
        lblMyBooksIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMyBooksIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMyBooksIconMouseClicked(evt);
            }
        });
        getContentPane().add(lblMyBooksIcon);
        lblMyBooksIcon.setBounds(1360, 280, 70, 80);

        lblHistoricBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/historic.png"))); // NOI18N
        lblHistoricBackground.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHistoricBackground.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHistoricBackgroundMouseClicked(evt);
            }
        });
        getContentPane().add(lblHistoricBackground);
        lblHistoricBackground.setBounds(1360, 370, 70, 80);

        lblBackgroundLibrary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/library.png"))); // NOI18N
        lblBackgroundLibrary.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBackgroundLibrary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackgroundLibraryMouseClicked(evt);
            }
        });
        getContentPane().add(lblBackgroundLibrary);
        lblBackgroundLibrary.setBounds(1360, 460, 70, 80);

        lblBackgroundMyInformations.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/perfil.png"))); // NOI18N
        lblBackgroundMyInformations.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBackgroundMyInformations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackgroundMyInformationsMouseClicked(evt);
            }
        });
        getContentPane().add(lblBackgroundMyInformations);
        lblBackgroundMyInformations.setBounds(1360, 560, 70, 80);

        lblBackgroundDebt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconDebt.png"))); // NOI18N
        lblBackgroundDebt1.setToolTipText("");
        getContentPane().add(lblBackgroundDebt1);
        lblBackgroundDebt1.setBounds(1360, 660, 70, 80);

        lblReceiveBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ReceiveBooksG.png"))); // NOI18N
        lblReceiveBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblReceiveBooks);
        lblReceiveBooks.setBounds(130, 280, 140, 140);

        jLabel1.setFont(new java.awt.Font("Maiandra GD", 1, 42)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Receber Livro ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 310, 300, 80);

        scroll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));

        scroll.setViewportView(table);

        getContentPane().add(scroll);
        scroll.setBounds(120, 600, 590, 190);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblSearchBy.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblSearchBy.setForeground(new java.awt.Color(51, 0, 0));
        lblSearchBy.setText("Nome:");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblSearchBy, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(lblSearchBy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtName)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(120, 530, 590, 50);
        
        panelFilterSearch.setBackground(new java.awt.Color(255, 255, 255));
        panelFilterSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelFilterSearch.setLayout(null);

        cbbFilterSearch.setFont(new java.awt.Font("Maiandra GD", 1, 16)); // NOI18N
        cbbFilterSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0)));
    	cbbFilterSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Login", "Matrícula" }));
    	cbbFilterSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbFilterSearchActionPerformed(evt);
            }
        });
        
        panelFilterSearch.add(cbbFilterSearch);
        cbbFilterSearch.setBounds(157, 8, 95, 34);

        lblFilterSearch.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblFilterSearch.setForeground(new java.awt.Color(51, 0, 0));
        lblFilterSearch.setText("Filtrar por:");
        panelFilterSearch.add(lblFilterSearch);
        lblFilterSearch.setBounds(12, 8, 128, 34);

        getContentPane().add(panelFilterSearch);
        panelFilterSearch.setBounds(450, 470, 260, 50);


        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        cbbChoiceType.setFont(new java.awt.Font("Maiandra GD", 1, 16)); // NOI18N
        cbbChoiceType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuário", "Livro"}));
        cbbChoiceType.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0)));
        cbbChoiceType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbChoiceTypeActionPerformed(evt);
            }
        });

        lblSearchBy1.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblSearchBy1.setForeground(new java.awt.Color(51, 0, 0));
        lblSearchBy1.setText("Pesquisar por:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblSearchBy1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(cbbChoiceType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbbChoiceType, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(lblSearchBy1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(120, 470, 260, 50);

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
        jCalendar.setBounds(780, 470, 360, 250);

        btnReceive.setBackground(new java.awt.Color(210, 69, 59));
        btnReceive.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        btnReceive.setForeground(new java.awt.Color(255, 255, 255));
        btnReceive.setText("Receber Livro");
        btnReceive.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 0), 3, true));
        btnReceive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceiveActionPerformed(evt);
            }
        });
        getContentPane().add(btnReceive);
        btnReceive.setBounds(990, 740, 130, 40);

        lblChooseDay.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        lblChooseDay.setForeground(new java.awt.Color(51, 0, 0));
        lblChooseDay.setText("Selecione a Data:");
        getContentPane().add(lblChooseDay);
        lblChooseDay.setBounds(800, 400, 200, 60);

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

    private void lblMyBooksMouseClicked(java.awt.event.MouseEvent evt) {                                        
    	if(evt.getButton()==MouseEvent.BUTTON1){
            MyBooksScreen frame = new MyBooksScreen(user);
            frame.setVisible(true);
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
    
    private void cbbFilterSearchActionPerformed(java.awt.event.ActionEvent evt) {                                                
        lblSearchBy.setText((String) cbbFilterSearch.getSelectedItem());
    }  

    private void cbbChoiceTypeActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if(cbbChoiceType.getSelectedItem().equals("Livro")) {
        	lblSearchBy.setText("Livro:");
        	cbbFilterSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Autor", "Gênero"}));
        }else {
        	lblSearchBy.setText("Nome:");
        	cbbFilterSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Login", "Matrícula" }));
        }
        
    }                                          

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) { 
    	String option = (String) cbbChoiceType.getSelectedItem();
    	String name = txtName.getText();
    	DAO dao = new DAO();
        try {
        	List<entities.Record> recordsFinal = new ArrayList<>();
        	
        	if(option.equalsIgnoreCase("Usuário")) {
        		switch((String) cbbFilterSearch.getSelectedItem()) {
        		case "Nome":
        			User u = dao.findUserByName(name);
        			type = dao.findUserByUsername(u.getUsername());
        			break;
        		case "Login":
        			type = dao.findUserByUsername(name);
        			break;
        		case "Matrícula":
        			type = dao.findUserByRegistrationNumber(name);
        		}
        		recordsFinal = dao.findRecordsByItem(type, true);
        		
        	}else {
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
        		
        		for(int i = 0; i < books.size(); i++) {
        			List<entities.Record> records = dao.findRecordsByItem(books.get(i), true);
        			for(int j = 0; j < records.size(); j++) {
        				recordsFinal.add(records.get(j));
        			}
        		}
        	}
        	tableModel = new TableModelRecord(recordsFinal);
        	
        	table = new javax.swing.JTable(tableModel);
        	table.setSelectionBackground(new java.awt.Color(210, 69, 59));
            table.setSelectionForeground(new java.awt.Color(255, 255, 255));
            table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            
        	scroll.setViewportView(table);
        	
        } catch (SQLException e) {
        	JOptionPane.showMessageDialog(this, "Login (Nome de usuário) inexistente");
        	return;
        }
    }                                         

    private void btnReceiveActionPerformed(java.awt.event.ActionEvent evt) {                                          
    	DAO dao = new DAO();
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        String formatedDate = sd.format(this.jCalendar.getDate());
        
        int row = table.getSelectedRow();
        if(row >= 0) {
        	entities.Record record = (entities.Record) tableModel.getSelected(row);
        	
        	String nameUser = record.getNameUser();
        	String nameBook = record.getNameBook();
        	
        	String endDate = formatedDate;
        	try {
				Book book = dao.findBookByName(nameBook);
				User userInit = dao.findUserByName(nameUser);
				User user = dao.findUserByUsername(userInit.getUsername());
								
				int daysLate = dao.daysLate(record);
				
				if(daysLate < 0) {
					JOptionPane.showMessageDialog(this, "O dia de devolução deve ser igual ou posterior ao do empréstimo");
				} else {
					dao.cleanDebt(user, book);
					dao.returnBook(book, user, endDate);					
				}
				
				JOptionPane.showMessageDialog(this, book.getName().concat(" recebido com sucesso!"));
				
			} catch (SQLException | ParseException e) {
				JOptionPane.showMessageDialog(rootPane, e.getMessage());
				e.printStackTrace();
				return;
			} 
        }
        
        try {
			tableModel.refreshData(dao.findRecordsByItem(type, true));
		} catch (SQLException e) {
			e.printStackTrace();
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
            java.util.logging.Logger.getLogger(ReceiveBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReceiveBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReceiveBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReceiveBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReceiveBooks().setVisible(true);
            }
        });
    }
    
    private TableModelRecord tableModel;
    // Variables declaration - do not modify                     
    private javax.swing.JButton btnReceive;
    private javax.swing.JComboBox<String> cbbFilterSearch;
    private javax.swing.JButton btnSearch;
    private com.toedter.calendar.JCalendar jCalendar;
    private javax.swing.JComboBox<String> cbbChoiceType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable table;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBackgroundDebt1;
    private javax.swing.JLabel lblBackgroundHead;
    private javax.swing.JLabel lblBackgroundLibrary;
    private javax.swing.JLabel lblBackgroundMain3;
    private javax.swing.JLabel lblBackgroundMyInformations;
    private javax.swing.JLabel lblChooseDay;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblFilterSearch;
    private javax.swing.JLabel lblHistoricBackground;
    private javax.swing.JLabel lblLibrary;
    private javax.swing.JLabel lblMyBooks;
    private javax.swing.JLabel lblMyBooksIcon;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblReceiveBooks;
    private javax.swing.JLabel lblSearchBy;
    private javax.swing.JLabel lblSearchBy1;
    private javax.swing.JLabel lblUserFullName;
    private javax.swing.JPanel panelFilterSearch;
    private javax.swing.JTextField txtName;
    // End of variables declaration                   
}
