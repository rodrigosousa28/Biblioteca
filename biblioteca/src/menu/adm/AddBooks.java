package menu.adm;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import data_base.DAO;
import entities.Book;
import entities.User;
import exceptions.AlreadyExistsException;
import menu.Functionalities;
import menu.all.AvailableBooks;
import menu.all.ChangeMyInformations;
import menu.all.Historic;
import menu.all.MyBooks;
import menu.all.MyInformations;


public class AddBooks extends javax.swing.JFrame {

	private static final long serialVersionUID = -684095033593358003L;
	private User user;
    User getUser() {
    	return this.user;
    }
    
	public AddBooks() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }
                            
    public AddBooks(User user) {
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
        lblMyBooksIcon = new javax.swing.JLabel();
        lblHistoricBackground = new javax.swing.JLabel();
        lblBackgroundLibrary = new javax.swing.JLabel();
        lblBackgroundMyInformations = new javax.swing.JLabel();
        lblBackgroundDebt1 = new javax.swing.JLabel();
        lblReceiveBooks = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblBackgroundMain1 = new javax.swing.JLabel();
        panelImage = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        btnSelectImage = new javax.swing.JToggleButton();
        btnSave = new javax.swing.JToggleButton();
        txtName = new javax.swing.JTextField();
        txtAuthor = new javax.swing.JTextField();
        txtGenreOne = new javax.swing.JTextField();
        txtGenreTwo = new javax.swing.JTextField();
        txtPages = new javax.swing.JTextField();
        lblStock = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        lblName1 = new javax.swing.JLabel();
        lblAuthor = new javax.swing.JLabel();
        lblGenreOne = new javax.swing.JLabel();
        lblGenreTwo = new javax.swing.JLabel();
        lblPages = new javax.swing.JLabel();
        lblBookImage = new javax.swing.JLabel();
        lblBackgroundMyInfoB = new javax.swing.JLabel();
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
        lblHistoricBackground.setBounds(1360, 380, 70, 80);

        lblBackgroundLibrary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/library.png"))); // NOI18N
        lblBackgroundLibrary.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBackgroundLibrary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackgroundLibraryMouseClicked(evt);
            }
        });
        getContentPane().add(lblBackgroundLibrary);
        lblBackgroundLibrary.setBounds(1360, 480, 70, 80);

        lblBackgroundMyInformations.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/perfil.png"))); // NOI18N
        lblBackgroundMyInformations.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBackgroundMyInformations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackgroundMyInformationsMouseClicked(evt);
            }
        });
        getContentPane().add(lblBackgroundMyInformations);
        lblBackgroundMyInformations.setBounds(1360, 590, 70, 80);

        lblBackgroundDebt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconDebt.png"))); // NOI18N
        lblBackgroundDebt1.setToolTipText("");
        getContentPane().add(lblBackgroundDebt1);
        lblBackgroundDebt1.setBounds(1360, 700, 70, 80);

        lblReceiveBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/addbookG.png"))); // NOI18N
        lblReceiveBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblReceiveBooks);
        lblReceiveBooks.setBounds(130, 290, 140, 140);

        jLabel1.setFont(new java.awt.Font("Maiandra GD", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Adicionar Livro");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 280, 340, 80);

        lblBackgroundMain1.setBackground(new java.awt.Color(255, 255, 255));
        lblBackgroundMain1.setOpaque(true);
        getContentPane().add(lblBackgroundMain1);
        lblBackgroundMain1.setBounds(-90, 880, 1840, 800);

        panelImage.setBackground(new java.awt.Color(255, 255, 255));
        panelImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0)));
        panelImage.setLayout(null);

        lblImage.setBackground(new java.awt.Color(244, 244, 244));
        lblImage.setOpaque(true);
        panelImage.add(lblImage);
        lblImage.setBounds(0, 0, 150, 150);

        getContentPane().add(panelImage);
        panelImage.setBounds(870, 460, 148, 150);

        btnSelectImage.setBackground(new java.awt.Color(210, 69, 59));
        btnSelectImage.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        btnSelectImage.setForeground(new java.awt.Color(255, 255, 255));
        btnSelectImage.setText("Selecionar Imagem");
        btnSelectImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnSelectImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSelectImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectImageActionPerformed(evt);
            }
        });
        getContentPane().add(btnSelectImage);
        btnSelectImage.setBounds(850, 660, 200, 38);

        btnSave.setBackground(new java.awt.Color(210, 69, 59));
        btnSave.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Salvar");
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave);
        btnSave.setBounds(880, 720, 130, 38);

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        getContentPane().add(txtName);
        txtName.setBounds(370, 510, 290, 30);

        txtAuthor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtAuthor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        
        getContentPane().add(txtAuthor);
        txtAuthor.setBounds(370, 550, 290, 30);

        txtGenreOne.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtGenreOne.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        getContentPane().add(txtGenreOne);
        txtGenreOne.setBounds(370, 590, 290, 30);

        txtGenreTwo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtGenreTwo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        
        getContentPane().add(txtGenreTwo);
        txtGenreTwo.setBounds(370, 630, 290, 30);

        txtPages.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPages.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        getContentPane().add(txtPages);
        txtPages.setBounds(370, 670, 290, 30);

        lblStock.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblStock.setForeground(new java.awt.Color(51, 0, 0));
        lblStock.setText("Estoque:");
        getContentPane().add(lblStock);
        lblStock.setBounds(290, 710, 80, 30);

        txtStock.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtStock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        getContentPane().add(txtStock);
        txtStock.setBounds(370, 710, 290, 30);

        lblName1.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblName1.setForeground(new java.awt.Color(51, 0, 0));
        lblName1.setText("Nome: ");
        getContentPane().add(lblName1);
        lblName1.setBounds(303, 510, 70, 30);

        lblAuthor.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblAuthor.setForeground(new java.awt.Color(51, 0, 0));
        lblAuthor.setText("Autor:");
        getContentPane().add(lblAuthor);
        lblAuthor.setBounds(310, 550, 60, 30);

        lblGenreOne.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblGenreOne.setForeground(new java.awt.Color(51, 0, 0));
        lblGenreOne.setText("Gênero 1:");
        getContentPane().add(lblGenreOne);
        lblGenreOne.setBounds(280, 590, 90, 30);

        lblGenreTwo.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblGenreTwo.setForeground(new java.awt.Color(51, 0, 0));
        lblGenreTwo.setText("Gênero 2:");
        getContentPane().add(lblGenreTwo);
        lblGenreTwo.setBounds(280, 630, 90, 30);

        lblPages.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblPages.setForeground(new java.awt.Color(51, 0, 0));
        lblPages.setText("Páginas:");
        getContentPane().add(lblPages);
        lblPages.setBounds(290, 670, 80, 30);

        lblBookImage.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblBookImage.setForeground(new java.awt.Color(51, 0, 0));
        lblBookImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBookImage.setText("Capa do Livro");
        getContentPane().add(lblBookImage);
        lblBookImage.setBounds(870, 610, 150, 30);

        lblBackgroundMyInfoB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 3));
        getContentPane().add(lblBackgroundMyInfoB);
        lblBackgroundMyInfoB.setBounds(260, 430, 830, 370);

        lblBackgroundMain.setBackground(new java.awt.Color(255, 255, 255));
        lblBackgroundMain.setOpaque(true);
        getContentPane().add(lblBackgroundMain);
        lblBackgroundMain.setBounds(0, 260, 1540, 710);

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
            MyBooks frame = new MyBooks(user);
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

    private void btnSelectImageActionPerformed(java.awt.event.ActionEvent evt) {                                               
    	image = chooseImage();
        openImage(image);
    }
    
    private void openImage(Object source){
        if(source instanceof File){
            ImageIcon icon = new ImageIcon(image.getAbsolutePath());
            icon.setImage(icon.getImage().getScaledInstance(panelImage.getWidth()-1, panelImage.getHeight() -1, 100));
            lblImage.setSize(panelImage.getWidth()-1, panelImage.getHeight() -1);
            lblImage.setIcon(icon);
        }
    }

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {                                        
    	DAO dao = new DAO();
    	String name = txtName.getText().equals("") ? null : txtName.getText();
    	String author = txtAuthor.getText().equals("") ? null : txtAuthor.getText();
    	String genreOne = txtGenreOne.getText().equals("") ? null : txtGenreOne.getText();
    	String genreTwo = txtGenreTwo.getText().equals("") ? null : txtGenreTwo.getText();
    	String numberPages = txtPages.getText().equals("") ? null : txtPages.getText();
    	String stockQuantity = txtStock.getText().equals("") ? null : txtStock.getText();
    	int numberOfPages = 0;
    	int stock = 0;
    	try 
    	{
    		numberOfPages = Integer.parseInt(numberPages);
    		stock = Integer.parseInt(stockQuantity);
    	} 
    	catch(NullPointerException e) {
    		this.dispose();
    	}
    	
    	Book book = new Book(name, author, genreOne, genreTwo, numberOfPages, stock);
    	if(image != null)
    		book.setImage(getImage());
    	
    	try {
			dao.insertBook(book);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(this, "Ocorreu algum erro!");
			return;
		} catch (AlreadyExistsException e) {
			JOptionPane.showMessageDialog(this, e.getMessage());
			return;
		}
    	JOptionPane.showMessageDialog(this, "Livro cadastrado com sucesso!");
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
            java.util.logging.Logger.getLogger(AddBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBooks().setVisible(true);
            }
        });        
    }
    
    private File chooseImage() {
    	JFileChooser fileChooser = new JFileChooser();
    	FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagens em jpg e png", "jpg", "png");
    	fileChooser.addChoosableFileFilter(filter);
    	fileChooser.setAcceptAllFileFilterUsed(false);
    	fileChooser.setDialogType(JFileChooser.OPEN_DIALOG);
    	fileChooser.setCurrentDirectory(new File("C:/"));
    	fileChooser.showOpenDialog(this);
    	
    	return fileChooser.getSelectedFile();
    }
    
    private byte[] getImage(){
        boolean isPng = false;
        
        if(image != null){
            isPng = image.getName().endsWith(".png");
            try {
                BufferedImage bffImage = ImageIO.read(image);
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                int type = BufferedImage.TYPE_INT_RGB;
                
                if(isPng){
                    type = BufferedImage.BITMASK;
                }
                
                BufferedImage newImage = new BufferedImage(panelImage.getWidth() - 1, panelImage.getHeight() - 1, type);
                Graphics2D g = newImage.createGraphics();
                g.setComposite(AlphaComposite.Src);
                g.drawImage(bffImage, 0, 0, panelImage.getWidth() - 1, panelImage.getHeight() - 1, null);
                
                if(isPng){
                    ImageIO.write(newImage, "png", out);
                }else{
                    ImageIO.write(newImage, "jpg", out);
                }
                
                out.flush();
                byte[] byteArray = out.toByteArray();
                out.close();
                
                return byteArray;
                
            } catch (IOException ex) {
                
            }
        }
        return null;
    }

    private File image;
    private javax.swing.JToggleButton btnSave;
    private javax.swing.JToggleButton btnSelectImage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBackgroundDebt1;
    private javax.swing.JLabel lblBackgroundHead;
    private javax.swing.JLabel lblBackgroundLibrary;
    private javax.swing.JLabel lblBackgroundMain;
    private javax.swing.JLabel lblBackgroundMain1;
    private javax.swing.JLabel lblBackgroundMyInfoB;
    private javax.swing.JLabel lblBackgroundMyInformations;
    private javax.swing.JLabel lblBookImage;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblGenreOne;
    private javax.swing.JLabel lblGenreTwo;
    private javax.swing.JLabel lblHistoricBackground;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLibrary;
    private javax.swing.JLabel lblChangeMyInformations;
    private javax.swing.JLabel lblMyBooksIcon;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblPages;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblReceiveBooks;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblUserFullName;
    private javax.swing.JPanel panelImage;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtGenreOne;
    private javax.swing.JTextField txtGenreTwo;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPages;
    private javax.swing.JTextField txtStock;
}
// End of variables declaration                   
