/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.mysql.jdbc.PreparedStatement;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Cliente;
import model.bean.Funcionario;
import model.dao.ClienteDAO;
import model.dao.FuncionarioDAO;

/**
 *
 * @author FelipeDerkian
 */
public class TelaPesquisarFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form TelaPesquisarFuncionario
     */
    public TelaPesquisarFuncionario() {
        initComponents();
        
        DefaultTableModel model = (DefaultTableModel) tabelaFuncionario.getModel();
        tabelaFuncionario.setRowSorter(new TableRowSorter(model));
        
    }
    
    public void readJTable(){
        
        DefaultTableModel modelo = (DefaultTableModel) tabelaFuncionario.getModel();
        modelo.setNumRows(0);
        ClienteDAO cdao = new ClienteDAO();
        
        for(Cliente c: cdao.read()){
            
            modelo.addRow(new Object[]{
                c.getNome(),
                c.getCpf(),
                c.getTelefone()
                    
            });
            
        }       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtCPF = new javax.swing.JTextField();
        jvoltar3 = new javax.swing.JButton();
        jvoltar2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFuncionario = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jvoltar4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setMinimumSize(new java.awt.Dimension(800, 600));

        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });

        jvoltar3.setBackground(new java.awt.Color(153, 153, 153));
        jvoltar3.setText("Pesquisar");
        jvoltar3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jvoltar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jvoltar3ActionPerformed(evt);
            }
        });

        jvoltar2.setBackground(new java.awt.Color(153, 153, 153));
        jvoltar2.setText("Voltar");
        jvoltar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jvoltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jvoltar2ActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(102, 255, 153));
        jLabel5.setFont(new java.awt.Font("Maiandra GD", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Pesquisar Funcionario");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 3, true));

        tabelaFuncionario.setAutoCreateRowSorter(true);
        tabelaFuncionario.setBackground(new java.awt.Color(204, 204, 204));
        tabelaFuncionario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tabelaFuncionario.setForeground(new java.awt.Color(51, 51, 51));
        tabelaFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Telefone", "Endereço", "Especialidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaFuncionario);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("CPF:");

        jvoltar4.setBackground(new java.awt.Color(153, 153, 153));
        jvoltar4.setText("Pesquisar Todos");
        jvoltar4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jvoltar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jvoltar4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jvoltar2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(354, 354, 354)
                                .addComponent(jvoltar4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jvoltar3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 28, Short.MAX_VALUE))
                    .addComponent(txtCPF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jvoltar3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jvoltar4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jvoltar2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

    private void jvoltar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jvoltar3ActionPerformed
        // seleciona o funcionario no banco de dados
       
               
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        DefaultTableModel modelo = (DefaultTableModel) tabelaFuncionario.getModel();
        modelo.setNumRows(0);
        
        FuncionarioDAO dao = new FuncionarioDAO();
        ArrayList<Funcionario> Funcionario = new ArrayList<Funcionario>();
        
        
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM funcionario WHERE cpf=?");
            int cpff = Integer.parseInt(txtCPF.getText());
            stmt.setInt(1,cpff);
                       
            rs = stmt.executeQuery();
                        
            while(rs.next()){
                          
                 Funcionario f = new Funcionario();
                                  
                 f.setCpf(rs.getInt("cpf"));
                 f.setNome(rs.getString("nome"));
                 f.setTelefone(rs.getString("telefone"));
                 f.setEndereco(rs.getString("endereco"));
                 f.setEspecialidade(rs.getString("especialidade"));
                 
                modelo.addRow(new Object[]{
                    f.getNome(),
                    f.getCpf(),
                    f.getTelefone(),
                    f.getEndereco(),
                    f.getEspecialidade()                    
                });
            
            }
                    
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: "+ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
            
        }
        
        
    }//GEN-LAST:event_jvoltar3ActionPerformed

    private void jvoltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jvoltar2ActionPerformed
        //volta a tela menu funcionario
        
        TelaFuncionarioOpcoes t = new TelaFuncionarioOpcoes();
        t.setVisible(true);
        dispose();
        
        
        
    }//GEN-LAST:event_jvoltar2ActionPerformed

    private void jvoltar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jvoltar4ActionPerformed
        // TODO add your handling code here:
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        DefaultTableModel modelo = (DefaultTableModel) tabelaFuncionario.getModel();
        modelo.setNumRows(0);
        
        
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM funcionario;");
                       
            rs = stmt.executeQuery();
                        
            while(rs.next()){
                          
                 Funcionario f = new Funcionario();
                                  
                 f.setCpf(rs.getInt("cpf"));
                 f.setNome(rs.getString("nome"));
                 f.setTelefone(rs.getString("telefone"));
                 f.setEndereco(rs.getString("endereco"));
                 f.setEspecialidade(rs.getString("especialidade"));
                 
                modelo.addRow(new Object[]{
                    f.getNome(),
                    f.getCpf(),
                    f.getTelefone(),
                    f.getEndereco(),
                    f.getEspecialidade()                    
                });
            
            }
                    
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: "+ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
            
        }
        
        
        
    }//GEN-LAST:event_jvoltar4ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPesquisarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPesquisarFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jvoltar2;
    private javax.swing.JButton jvoltar3;
    private javax.swing.JButton jvoltar4;
    private javax.swing.JTable tabelaFuncionario;
    private javax.swing.JTextField txtCPF;
    // End of variables declaration//GEN-END:variables
}