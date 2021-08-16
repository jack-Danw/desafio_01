package interfaces;

import dao.DaoCliente;
import classes.Cliente;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class RelatorioClientes extends javax.swing.JFrame {

    
    public RelatorioClientes() {
        initComponents();
        setLocationRelativeTo(null);
        preenche_tabela();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
    
     public void preenche_tabela(){
        
        tbClientes.getColumnModel().getColumn(0).setPreferredWidth(5);
        tbClientes.getColumnModel().getColumn(1).setPreferredWidth(50);
        tbClientes.getColumnModel().getColumn(2).setPreferredWidth(50);
        tbClientes.getColumnModel().getColumn(3).setPreferredWidth(50);      
        DefaultTableModel modelo=(DefaultTableModel)tbClientes.getModel();
        modelo.setNumRows(0);
        
        DaoCliente dao=new DaoCliente();
        
        List<Cliente> clientes = dao.PreencheClientes();
        
        for(Cliente cliente: clientes){
            
            modelo.addRow(new Object[]{cliente.getCodCliente(),
                cliente.getCpf(),cliente.getFIdade(), cliente.getConvenio(),
                cliente.getFSalario(),cliente.getREmprestimo()});
            
        }
        
    
    
     }  

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setToolTipText("");
        jScrollPane1.setName(""); // NOI18N

        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código do Cliente", "CPF do Cliente", "Faixa de Idade", "Convênio", "Faixa Salarial", "Motivo do Empréstimo"
            }
        ));
        tbClientes.setToolTipText("");
        tbClientes.setAutoscrolls(false);
        tbClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tbClientes);
        tbClientes.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RelatorioClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbClientes;
    // End of variables declaration//GEN-END:variables
}
