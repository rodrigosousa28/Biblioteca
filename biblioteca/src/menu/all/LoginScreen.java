package menu.all;

import menu.Functionalities;

public class LoginScreen extends javax.swing.JFrame {

	private static final long serialVersionUID = -1630497106798834635L;
	
	public LoginScreen() {
        initComponents();
    }
                       
    private void initComponents() {

        txtLogin = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JToggleButton();
        lblForgotPass = new javax.swing.JLabel();
        lblRegister = new javax.swing.JLabel();
        lblImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(812, 510));
        setPreferredSize(new java.awt.Dimension(812, 520));
        setResizable(false);
        getContentPane().setLayout(null);

        txtLogin.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14));
        txtLogin.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(txtLogin);
        txtLogin.setBounds(390, 190, 190, 30);

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(txtPassword);
        txtPassword.setBounds(390, 270, 190, 30);

        jLabel1.setFont(new java.awt.Font("Maiandra GD", 1, 22));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(360, 120, 240, 30);

        btnLogin.setBackground(new java.awt.Color(210, 69, 59));
        btnLogin.setFont(new java.awt.Font("Maiandra GD", 1, 14));
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("ENTRAR");
        btnLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(430, 390, 120, 30);

        lblForgotPass.setText("<html><u>Esqueceu a senha?</u></html>");
        lblForgotPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblForgotPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblForgotPassMouseClicked(evt);
            }
        });
        getContentPane().add(lblForgotPass);
        lblForgotPass.setBounds(330, 350, 120, 30);

        lblRegister.setText("<html><u>Cadastre-se</u></html>");
        lblRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegisterMouseClicked(evt);
            }
        });
        getContentPane().add(lblRegister);
        lblRegister.setBounds(550, 350, 70, 30);

        lblImg.setBackground(new java.awt.Color(51, 51, 51));
        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logScreen.png")));
        lblImg.setOpaque(true);
        lblImg.setPreferredSize(new java.awt.Dimension(960, 520));
        getContentPane().add(lblImg);
        lblImg.setBounds(0, 0, 810, 510);
        
        setLocationRelativeTo(null);
        pack();
    }                        

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Functionalities.Login(this, txtLogin, txtPassword);
    }                                        

    private void lblForgotPassMouseClicked(java.awt.event.MouseEvent evt) {                                           
        RecoverPassword rp = new RecoverPassword();
        rp.setVisible(true);
        this.dispose();
    }

    private void lblRegisterMouseClicked(java.awt.event.MouseEvent evt) {                                         
    	RegisterScreen rs = new RegisterScreen();
    	this.dispose();
    	rs.setVisible(true);
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
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new LoginScreen().setVisible(true);
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JToggleButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblForgotPass;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration                   
}
