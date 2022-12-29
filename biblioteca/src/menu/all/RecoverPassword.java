package menu.all;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import data_base.DAO;
import entities.User;


public class RecoverPassword extends javax.swing.JFrame {

	private static final long serialVersionUID = 1140258797584999600L;
	
    public RecoverPassword() {
        initComponents();
    }
                         
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblRegistrationNumber = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        txtRegistrationNumber = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        confirmNewPass = new javax.swing.JPasswordField();
        lblUsername1 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        txtNewPassword = new javax.swing.JPasswordField();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        lblTitle.setFont(new java.awt.Font("Maiandra GD", 1, 22)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Redefinir Senha");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(150, 90, 380, 30);

        lblRegistrationNumber.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblRegistrationNumber.setText("Matrícula:");
        getContentPane().add(lblRegistrationNumber);
        lblRegistrationNumber.setBounds(190, 230, 70, 30);

        lblCPF.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblCPF.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCPF.setText("CPF:");
        getContentPane().add(lblCPF);
        lblCPF.setBounds(210, 140, 50, 50);

        lblUsername.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblUsername.setText("Usuário:");
        getContentPane().add(lblUsername);
        lblUsername.setBounds(200, 190, 60, 30);

        lblPassword.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblPassword.setText("Confirmar \nsenha:");
        getContentPane().add(lblPassword);
        lblPassword.setBounds(150, 310, 120, 30);
        lblPassword.getAccessibleContext().setAccessibleName("Redigitar Senha");

        txtCPF.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtCPF);
        txtCPF.setBounds(270, 150, 200, 30);

        txtRegistrationNumber.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        
        getContentPane().add(txtRegistrationNumber);
        txtRegistrationNumber.setBounds(270, 230, 200, 30);

        btnConfirm.setBackground(new java.awt.Color(210, 69, 59));
        btnConfirm.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm.setText("Confirmar");
        btnConfirm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnConfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirm);
        btnConfirm.setBounds(400, 390, 100, 30);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 400, 0, 0);

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/goBack.png"))); // NOI18N
        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        getContentPane().add(lblBack);
        lblBack.setBounds(180, 380, 30, 40);

        confirmNewPass.setText("");
        confirmNewPass.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, new java.awt.Color(0, 0, 0)));
        getContentPane().add(confirmNewPass);
        confirmNewPass.setBounds(270, 310, 200, 30);

        lblUsername1.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblUsername1.setText("Nova Senha:");
        getContentPane().add(lblUsername1);
        lblUsername1.setBounds(170, 270, 90, 30);

        txtLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        
        getContentPane().add(txtLogin);
        txtLogin.setBounds(270, 190, 200, 30);

        txtNewPassword.setText("");
        txtNewPassword.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtNewPassword);
        txtNewPassword.setBounds(270, 270, 200, 30);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Register.png"))); // NOI18N
        lblBackground.setToolTipText("");
        lblBackground.setMaximumSize(new java.awt.Dimension(825, 495));
        lblBackground.setMinimumSize(new java.awt.Dimension(825, 495));
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 810, 480);
        
      //Evento de tecla pressionada
        txtCPF.addKeyListener(new java.awt.event.KeyAdapter() {
        	public void keyTyped(java.awt.event.KeyEvent evt) {
        		txtCPFKeyTyped(evt);
        		}
        	}
        );
        
        //Evento de tecla pressionada
        txtRegistrationNumber.addKeyListener(new java.awt.event.KeyAdapter() {
        	public void keyTyped(java.awt.event.KeyEvent evt) {
        		txtRegistrationNumberKeyTyped(evt);
        		}
        	}
        );

        setLocationRelativeTo(null);
        pack();
    }// </editor-fold> 
    
    private void txtCPFKeyTyped(java.awt.event.KeyEvent evt) {
    	String numbers = "0123456789";
    	
    	if(!numbers.contains(evt.getKeyChar()+"")) {
    		evt.consume();
    	}
    	
    	if(txtCPF.getText().length() >= 11) {
    		evt.consume();
    		txtCPF.setText(txtCPF.getText().substring(0, 11));
    	}
    	
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

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {                                           
        DAO dao = new DAO();
        try {
			User user = dao.findUserByCPF(txtCPF.getText());
			if(user == null) {
				JOptionPane.showMessageDialog(this, "Usuário não encontrado. Este cpf não está cadastrado");
				return;
			}
			boolean c1 = user.getUsername().equals(txtLogin.getText());
			boolean c2 = user.getRegistrationNumber().equals(txtRegistrationNumber.getText());
			char[] newPass = txtNewPassword.getPassword();
			char[] confirmNewPassword = confirmNewPass.getPassword();
			
			String newPassword = "";
			String confirmPassword = "";
			
			for(int i = 0; i < newPass.length; i++) {
				newPassword = newPassword.concat(newPass[i]+"");
			}
			
			for(int i = 0; i < confirmNewPassword.length; i++) {
				confirmPassword = confirmPassword.concat(confirmNewPassword[i]+"");
			}
			
			if(c1 && c2) {
				if(newPassword.equalsIgnoreCase(confirmPassword)) {
					dao.updatePassword(user, newPassword);
					JOptionPane.showMessageDialog(this, "Senha alterada com sucesso. Clique em OK para ir à tela de login");
				}else {
					JOptionPane.showMessageDialog(this, "As senhas devem coincidir!");
				}
			}else {
				JOptionPane.showMessageDialog(this, "Os dados não estão corretos. Por favor, tente novamente");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
    }                                          

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {                                     
        Login ls = new Login();
        ls.setVisible(true);
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
            java.util.logging.Logger.getLogger(RecoverPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecoverPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecoverPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecoverPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecoverPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnConfirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField confirmNewPass;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRegistrationNumber;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsername1;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JTextField txtRegistrationNumber;
    // End of variables declaration                   
}
