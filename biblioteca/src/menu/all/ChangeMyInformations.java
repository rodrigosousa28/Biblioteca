package menu.all;

import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import data_base.DAO;
import entities.User;
import menu.Functionalities;
import menu.adm.MainMenuAdm;

public class ChangeMyInformations extends javax.swing.JFrame {
	
	private static final long serialVersionUID = 6852620460896920532L;
	
	private User user;
	
    public ChangeMyInformations() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }
    
    public ChangeMyInformations(User user) {
    	this.user = user;
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }
    
    User getUser() {
    	return user;
    }
                        
    private void initComponents() {

        lblExit = new javax.swing.JLabel();
        lblUserFullName = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        lblMyBooks = new javax.swing.JLabel();
        lblPerfil = new javax.swing.JLabel();
        lblLibrary = new javax.swing.JLabel();
        lblBackgroundHead = new javax.swing.JLabel();
        lblBackgroundMyInformations = new javax.swing.JLabel();
        lblChangeInformations = new javax.swing.JLabel();
        lblMyBooksIcon = new javax.swing.JLabel();
        lblHistoricBackground = new javax.swing.JLabel();
        lblBackgroundLibrary = new javax.swing.JLabel();
        lblBackgroundDebt = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblRegistrationNumber = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        btnConfirmChanges = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtRegistrationNumber = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        cbbPassword = new javax.swing.JCheckBox();
        cbbName = new javax.swing.JCheckBox();
        cbbRegistrationNumber = new javax.swing.JCheckBox();
        cbbLogin = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        lblInstructions = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblAlexandria = new javax.swing.JLabel();
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

        lblBackgroundMyInformations.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/perfilG.png"))); // NOI18N
        lblBackgroundMyInformations.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblBackgroundMyInformations);
        lblBackgroundMyInformations.setBounds(130, 280, 140, 140);

        lblChangeInformations.setFont(new java.awt.Font("Maiandra GD", 1, 42)); // NOI18N
        lblChangeInformations.setForeground(new java.awt.Color(102, 0, 0));
        lblChangeInformations.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblChangeInformations.setText("Alterar Dados de Cadastro");
        getContentPane().add(lblChangeInformations);
        lblChangeInformations.setBounds(250, 300, 600, 80);

        lblMyBooksIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/books.png"))); // NOI18N
        lblMyBooksIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMyBooksIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMyBooksIconMouseClicked(evt);
            }
        });
        getContentPane().add(lblMyBooksIcon);
        lblMyBooksIcon.setBounds(1370, 280, 60, 70);

        lblHistoricBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/historic.png"))); // NOI18N
        lblHistoricBackground.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHistoricBackground.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHistoricBackgroundMouseClicked(evt);
            }
        });
        getContentPane().add(lblHistoricBackground);
        lblHistoricBackground.setBounds(1370, 380, 70, 80);

        lblBackgroundLibrary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/library.png"))); // NOI18N
        lblBackgroundLibrary.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBackgroundLibrary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackgroundLibraryMouseClicked(evt);
            }
        });
        getContentPane().add(lblBackgroundLibrary);
        lblBackgroundLibrary.setBounds(1370, 490, 60, 70);

        lblBackgroundDebt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/divida.png"))); // NOI18N
        lblBackgroundDebt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBackgroundDebt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackgroundDebtMouseClicked(evt);
            }
        });
        getContentPane().add(lblBackgroundDebt);
        lblBackgroundDebt.setBounds(1370, 580, 70, 90);

        lblName.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(51, 0, 0));
        lblName.setText("Nome:");
        getContentPane().add(lblName);
        lblName.setBounds(320, 480, 60, 40);

        lblRegistrationNumber.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblRegistrationNumber.setForeground(new java.awt.Color(51, 0, 0));
        lblRegistrationNumber.setText("Matrícula:");
        getContentPane().add(lblRegistrationNumber);
        lblRegistrationNumber.setBounds(290, 530, 90, 40);

        lblLogin.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(51, 0, 0));
        lblLogin.setText("Login:");
        getContentPane().add(lblLogin);
        lblLogin.setBounds(320, 580, 60, 40);

        lblPassword.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(51, 0, 0));
        lblPassword.setText("Senha:");
        getContentPane().add(lblPassword);
        lblPassword.setBounds(320, 630, 60, 40);

        btnConfirmChanges.setBackground(new java.awt.Color(210, 69, 59));
        btnConfirmChanges.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        btnConfirmChanges.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmChanges.setText("Alterar");
        btnConfirmChanges.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(btnConfirmChanges);
        btnConfirmChanges.setBounds(990, 680, 130, 40);
        btnConfirmChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmChangesActionPerformed(evt);
            }
        });

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtName.setSelectionColor(new java.awt.Color(204, 0, 0));
        getContentPane().add(txtName);
        txtName.setBounds(400, 480, 420, 40);
        txtName.setEditable(false);

        txtRegistrationNumber.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        getContentPane().add(txtRegistrationNumber);
        txtRegistrationNumber.setBounds(400, 530, 420, 40);
        txtRegistrationNumber.setEditable(false);
        txtRegistrationNumber.addKeyListener(new java.awt.event.KeyAdapter() {
        	public void keyTyped(java.awt.event.KeyEvent evt) {
        		txtRegistrationNumberKeyTyped(evt);
        		}
        	}
        );

        txtLogin.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        getContentPane().add(txtLogin);
        txtLogin.setBounds(400, 580, 420, 40);
        txtLogin.setEditable(false);

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        getContentPane().add(txtPassword);
        txtPassword.setBounds(400, 630, 420, 40);
        txtPassword.setEditable(false);

        cbbPassword.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        cbbPassword.setForeground(new java.awt.Color(51, 0, 0));
        cbbPassword.setText("Senha");
        cbbPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbPasswordActionPerformed(evt);
            }
        });
        cbbPassword.setOpaque(false);
        getContentPane().add(cbbPassword);
        cbbPassword.setBounds(860, 580, 250, 30);

        cbbName.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        cbbName.setForeground(new java.awt.Color(51, 0, 0));
        cbbName.setText("Nome");
        getContentPane().add(cbbName);
        cbbName.setBounds(860, 510, 240, 19);
        cbbName.setOpaque(false);
        cbbName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbNameActionPerformed(evt);
            }
        });

        cbbRegistrationNumber.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        cbbRegistrationNumber.setForeground(new java.awt.Color(51, 0, 0));
        cbbRegistrationNumber.setText("Matrícula");
        cbbRegistrationNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbRegistrationNumberActionPerformed(evt);
            }
        });
        getContentPane().add(cbbRegistrationNumber);
        cbbRegistrationNumber.setBounds(860, 530, 230, 30);
        cbbRegistrationNumber.setOpaque(false);

        cbbLogin.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        cbbLogin.setForeground(new java.awt.Color(51, 0, 0));
        cbbLogin.setText("Login");
        cbbLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbLoginActionPerformed(evt);
            }
        });
        getContentPane().add(cbbLogin);
        cbbLogin.setBounds(860, 560, 240, 19);
        cbbLogin.setOpaque(false);

        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 2));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(850, 490, 270, 160);

        lblInstructions.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblInstructions.setForeground(new java.awt.Color(51, 0, 0));
        lblInstructions.setText("Marque os campos que deseja alterar:");
        getContentPane().add(lblInstructions);
        lblInstructions.setBounds(850, 460, 270, 30);

        jLabel2.setForeground(new java.awt.Color(51, 0, 0));
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 0), 3, true));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(260, 440, 880, 310);

        lblAlexandria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAlexandria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/quinta-de-sao-pedro-de-alexandria.png"))); // NOI18N
        getContentPane().add(lblAlexandria);
        lblAlexandria.setBounds(980, 540, 140, 120);

        lblBackgroundMain.setBackground(new java.awt.Color(255, 255, 255));
        lblBackgroundMain.setOpaque(true);
        getContentPane().add(lblBackgroundMain);
        lblBackgroundMain.setBounds(0, 260, 1540, 800);

        
        Functionalities.showInformations(user, txtName, txtRegistrationNumber, txtLogin, txtPassword);
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
            AvailableBooks ab = new AvailableBooks(user);
            ab.setVisible(true);
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

    private void lblMyBooksMouseClicked(java.awt.event.MouseEvent evt) {                                        
    	if(evt.getButton()==MouseEvent.BUTTON1){
            MyBooks mbs = new MyBooks(user);
            mbs.setVisible(true);
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
    
    private void cbbNameActionPerformed(java.awt.event.ActionEvent evt) {
    	if(cbbName.isSelected()) {
    		txtName.setEditable(true);
    	}else {
    		txtName.setEditable(false);
    	}
    }

    private void cbbPasswordActionPerformed(java.awt.event.ActionEvent evt) {                                            
    	if(cbbPassword.isSelected()) {
    		txtPassword.setEditable(true);
    	}else {
    		txtPassword.setEditable(false);
    	}
    }                                           

    private void cbbRegistrationNumberActionPerformed(java.awt.event.ActionEvent evt) {                                                      
    	if(cbbRegistrationNumber.isSelected()) {
    		txtRegistrationNumber.setEditable(true);
    	}else {
    		txtRegistrationNumber.setEditable(false);
    	}
    }

    private void cbbLoginActionPerformed(java.awt.event.ActionEvent evt) {   
    	if(cbbLogin.isSelected()) {
    		txtLogin.setEditable(true);
    	}else {
    		txtLogin.setEditable(false);
    	}
    }

    private void btnConfirmChangesActionPerformed(java.awt.event.ActionEvent evt) {
    	DAO dao = new DAO();
    	List<String> equals = new ArrayList<>();
    	List<String> valids = new ArrayList<>();
    	
    	int quantities = 0;
    	
    	if(cbbName.isSelected()) {
    		try {
    			quantities++;
    			if(txtName.getText().equals(user.getName())) {
    				equals.add("Nome");
    			}else {
    				valids.add("Nome");
    			}
				dao.updateName(user, txtName.getText());
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(this, "Não foi possível alterar o nome");
				e.printStackTrace();
				return;
			}
    	}
    	
    	if(cbbLogin.isSelected()) {
    		quantities++;
    		try {
    			if(txtLogin.getText().equals(user.getUsername())) {
    				equals.add("Login");
    			}else {
    				valids.add("Login");
    			}
				dao.updateUsername(user, txtLogin.getText());
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(this, "Não foi possível alterar o login");
				e.printStackTrace();
				return;
			}
    	}
    	
    	if(cbbRegistrationNumber.isSelected()) {
    		quantities++;
    		try {
    			if(txtRegistrationNumber.getText().equals(user.getRegistrationNumber())) {
    				equals.add("Matrícula");
    			}else {
    				valids.add("Matrícula");
    			}
				dao.updateRegistrationNumber(user, txtRegistrationNumber.getText());
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(this, "Não foi possível alterar a matrícula");
				e.printStackTrace();
				return;
			}
    	}
    	
    	if(cbbPassword.isSelected()) {
    		quantities++;
    		try {
    			String newPass = "";
    			for(int i = 0; i < txtPassword.getPassword().length; i++) {
    				newPass += txtPassword.getPassword()[i];
    			}
    			if(newPass.equals(user.getPassword())) {
    				equals.add("Senha");
    			}else {
    				valids.add("Senha");
    			}
				dao.updatePassword(user, newPass);
				
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(this, "Não foi possível alterar sua senha");
				e.printStackTrace();
				return;
			}
    	}
    	
    	if(equals.size() > 0) {
    		String equalsString = "";
    		for(int i = 0; i < equals.size(); i++) {
    			equalsString = equalsString.concat(equals.get(i));
    			if(i < equals.size() - 1) {
    				equalsString = equalsString.concat(", ");
    			}
    		}
    		JOptionPane.showMessageDialog(this, "Os seguintes itens não foram alterados por serem iguais aos anteriores: ".concat(equalsString));
    	}
    	
    	if(equals.size() < quantities) {
    		String validString = "";
    		for(int i = 0; i < valids.size(); i++) {
    			validString = validString.concat(valids.get(i));
    			if(i < valids.size() - 1) {
    				validString = validString.concat(", ");
    			}
    		}
    		JOptionPane.showMessageDialog(this, validString.concat(" alterado com sucesso. Você será redirecionado para a tela de login"));
    		Login ls = new Login();
    		ls.setVisible(true);
    		this.dispose();    		
    	}
    	
    	dao.close();
    }
    
    private void txtRegistrationNumberKeyTyped(java.awt.event.KeyEvent evt) {
    	String numbers = "0123456789";
    	
    	if(!numbers.contains(evt.getKeyChar()+"")) {
    		evt.consume();
    	}
    	
    	if(txtRegistrationNumber.getText().length() >= 7) {
    		evt.consume();
    		txtRegistrationNumber.setText(txtRegistrationNumber.getText().substring(0, 7));
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
            java.util.logging.Logger.getLogger(ChangeMyInformations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeMyInformations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeMyInformations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeMyInformations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeMyInformations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnConfirmChanges;
    private javax.swing.JCheckBox cbbLogin;
    private javax.swing.JCheckBox cbbName;
    private javax.swing.JCheckBox cbbPassword;
    private javax.swing.JCheckBox cbbRegistrationNumber;
    private javax.swing.JLabel lblChangeInformations;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblInstructions;
    private javax.swing.JLabel lblAlexandria;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBackgroundDebt;
    private javax.swing.JLabel lblBackgroundHead;
    private javax.swing.JLabel lblBackgroundLibrary;
    private javax.swing.JLabel lblBackgroundMain;
    private javax.swing.JLabel lblBackgroundMyInformations;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblHistoricBackground;
    private javax.swing.JLabel lblLibrary;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblMyBooks;
    private javax.swing.JLabel lblMyBooksIcon;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblRegistrationNumber;
    private javax.swing.JLabel lblUserFullName;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtRegistrationNumber;
    // End of variables declaration                   
}
