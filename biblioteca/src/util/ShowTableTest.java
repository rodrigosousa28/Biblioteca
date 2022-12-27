package util;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import data_base.DAO;

public class ShowTableTest extends javax.swing.JFrame {

	private static final long serialVersionUID = -7825501628336858481L;
	public ShowTableTest() {
        initComponents();
    }
                         
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(915, 555));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 160, 530, 50);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        /*jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));*/
        
        DAO dao = new DAO();
        try {
        	tableModel = new TableModelUser(dao.listAllUsersWithoutDebt());
        	jTable1 = new javax.swing.JTable(tableModel);
        } catch (SQLException e) {
        	JOptionPane.showMessageDialog(this, "Algo deu errado!");
        }
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 230, 530, 250);

        pack();
    }// </editor-fold>                        

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new ShowTableTest().setVisible(true);
        });
    }

    
    private TableModelUser tableModel;
    // Variables declaration - do not modify                     
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration                   
}
