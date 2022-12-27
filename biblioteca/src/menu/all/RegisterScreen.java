package menu.all;

import javax.swing.JOptionPane;

import exceptions.AlreadyExistsException;
import exceptions.EmptyFieldException;
import exceptions.InvalidCpfException;
import exceptions.Validate;
import menu.Functionalities;

public class RegisterScreen extends javax.swing.JFrame {

	private static final long serialVersionUID = 6790827386162937234L;
	public RegisterScreen() {
        initComponents();
    }
                         
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblRegistrationNumber = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        cbbType = new javax.swing.JComboBox<>();
        lblType = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtName = new javax.swing.JTextField();
        txtRegistrationNumber = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(813, 500));
        setPreferredSize(new java.awt.Dimension(813, 513));
        setResizable(false);
        getContentPane().setLayout(null);

        lblTitle.setFont(new java.awt.Font("Maiandra GD", 1, 22)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Registre-se");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(150, 90, 380, 30);

        lblName.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblName.setText("Nome:");
        getContentPane().add(lblName);
        lblName.setBounds(180, 160, 50, 18);

        lblRegistrationNumber.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblRegistrationNumber.setText("Matrícula:");
        getContentPane().add(lblRegistrationNumber);
        lblRegistrationNumber.setBounds(160, 190, 70, 30);

        lblCPF.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblCPF.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCPF.setText("CPF:");
        getContentPane().add(lblCPF);
        lblCPF.setBounds(180, 230, 40, 40);

        lblUsername.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblUsername.setText("Usuário:");
        getContentPane().add(lblUsername);
        lblUsername.setBounds(170, 280, 60, 18);

        lblPassword.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblPassword.setText("Senha:");
        getContentPane().add(lblPassword);
        lblPassword.setBounds(180, 308, 50, 40);

        cbbType.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        cbbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aluno", "Professor" }));
        cbbType.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        cbbType.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(cbbType);
        cbbType.setBounds(240, 350, 82, 23);

        lblType.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblType.setText("Tipo:");
        getContentPane().add(lblType);
        lblType.setBounds(190, 350, 40, 18);

        txtPassword.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtPassword);
        txtPassword.setBounds(240, 310, 200, 30);

        txtName.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
            
        getContentPane().add(txtName);
        txtName.setBounds(240, 150, 200, 30);

        txtRegistrationNumber.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtRegistrationNumber);
        txtRegistrationNumber.setBounds(240, 190, 200, 30);

        txtCPF.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtCPF);
        txtCPF.setBounds(240, 232, 200, 30);

        txtUsername.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtUsername);
        txtUsername.setBounds(240, 270, 200, 30);

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
        
        getContentPane().add(btnConfirm);
        btnConfirm.setBounds(410, 390, 100, 30);
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
        lblBack.setBounds(170, 390, 30, 40);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Register.png"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 810, 480);

        setLocationRelativeTo(null);
        pack();
    }                        
                                     

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {
    	try {
    		Validate.filledField(txtName, txtRegistrationNumber, txtCPF, txtUsername, txtPassword);
    	} catch (EmptyFieldException e) {
    		JOptionPane.showMessageDialog(this, e.getMessage());
    		return;
    	}
    	
        try {
			Functionalities.registerUser
			(txtName, txtRegistrationNumber, txtCPF, txtUsername, txtPassword, cbbType);
		} catch (InvalidCpfException | AlreadyExistsException e) {
			JOptionPane.showMessageDialog(this, e.getMessage());
			return;
		}
        
        JOptionPane.showMessageDialog(this, "Cadastro Realizado! Clique Ok para ir à tela de login");
        LoginScreen ls = new LoginScreen();
        ls.setVisible(true);
        this.dispose();
    } 
    
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

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {                                     
    	LoginScreen ls = new LoginScreen();
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        
        java.awt.EventQueue.invokeLater(() -> {
            new RegisterScreen().setVisible(true);
        });
    }

    private javax.swing.JButton btnConfirm;
    private javax.swing.JComboBox<String> cbbType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblType;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRegistrationNumber;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtRegistrationNumber;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration                   
}
