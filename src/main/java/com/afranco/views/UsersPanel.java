package com.afranco.views;

import com.afranco.ilib.DAOUsersImpl;
import com.afranco.ilib.Dashboard;
import com.afranco.interfaces.DAOUsers;
import com.afranco.models.Users;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UsersPanel extends javax.swing.JPanel {
    
    public UsersPanel(Dashboard dashboard) {///
        initComponents();
        this.dashboard = dashboard;
        LoadUsers();
        txtSearchUsers.putClientProperty("JTextField.placeHolderText", "Ingrese nombre de usuario a buscar");
    }
    
    private void LoadUsers(){
        try {
            DAOUsers dao = new DAOUsersImpl(); // clase impl conintiene la consulta
            DefaultTableModel model = (DefaultTableModel) jTableUsuariosPanel.getModel();
            dao.listar().forEach((u) -> model.addRow(new Object[]{u.getId(), u.getName(),u.getLastNameP(),u.getLastNameM(),u.getDomicilio(),u.getTel()}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    private Dashboard dashboard;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        btnBuscarUsuario = new javax.swing.JButton();
        txtSearchUsers = new javax.swing.JTextField();
        btnUsuarioNuevo = new javax.swing.JButton();
        btnEditarUsuario = new javax.swing.JButton();
        btnBorrarUsuario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsuariosPanel = new javax.swing.JTable();

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Usuarios");

        btnBuscarUsuario.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscarUsuario.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscarUsuario.setText("Buscar");
        btnBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarUsuarioActionPerformed(evt);
            }
        });

        txtSearchUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchUsersActionPerformed(evt);
            }
        });

        btnUsuarioNuevo.setBackground(new java.awt.Color(204, 204, 204));
        btnUsuarioNuevo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUsuarioNuevo.setForeground(new java.awt.Color(0, 0, 0));
        btnUsuarioNuevo.setText("Nuevo");
        btnUsuarioNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioNuevoActionPerformed(evt);
            }
        });

        btnEditarUsuario.setBackground(new java.awt.Color(204, 204, 204));
        btnEditarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditarUsuario.setForeground(new java.awt.Color(0, 0, 0));
        btnEditarUsuario.setText("Editar");
        btnEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUsuarioActionPerformed(evt);
            }
        });

        btnBorrarUsuario.setBackground(new java.awt.Color(204, 204, 204));
        btnBorrarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBorrarUsuario.setForeground(new java.awt.Color(0, 0, 0));
        btnBorrarUsuario.setText("Borrar");
        btnBorrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarUsuarioActionPerformed(evt);
            }
        });

        jTableUsuariosPanel.setBackground(new java.awt.Color(255, 255, 255));
        jTableUsuariosPanel.setForeground(new java.awt.Color(0, 0, 0));
        jTableUsuariosPanel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Apellid P.", "Apellido M.", "Direccíon", "Teléfono"
            }
        ));
        jTableUsuariosPanel.setShowHorizontalLines(true);
        jTableUsuariosPanel.setShowVerticalLines(true);
        jScrollPane1.setViewportView(jTableUsuariosPanel);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUsuarioNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBorrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtSearchUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addComponent(btnBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(32, 32, 32))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSearchUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUsuarioNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuarioNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioNuevoActionPerformed
       dashboard.showJPanel(new UpUser());
    }//GEN-LAST:event_btnUsuarioNuevoActionPerformed

    private void btnBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarUsuarioActionPerformed

    private void txtSearchUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchUsersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchUsersActionPerformed

    private void btnBorrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarUsuarioActionPerformed
        DAOUsers dao = new DAOUsersImpl();
        DefaultTableModel model = (DefaultTableModel) jTableUsuariosPanel.getModel();
        for( int i: jTableUsuariosPanel.getSelectedRows()){
            try {
                dao.eliminar((int) jTableUsuariosPanel.getValueAt(i, 0));
                model.removeRow(i);
            }catch (Exception e) {
                System.out.println(e.getMessage());
            } 
        }        
    }//GEN-LAST:event_btnBorrarUsuarioActionPerformed

    private void btnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUsuarioActionPerformed
        if(jTableUsuariosPanel.getSelectedRow() > -1){
            int userId = (int) jTableUsuariosPanel.getValueAt(jTableUsuariosPanel.getSelectedRow(),0);
        } else{
            
        }
    }//GEN-LAST:event_btnEditarUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarUsuario;
    private javax.swing.JButton btnBuscarUsuario;
    private javax.swing.JButton btnEditarUsuario;
    private javax.swing.JButton btnUsuarioNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUsuariosPanel;
    private java.awt.Panel panel1;
    private javax.swing.JTextField txtSearchUsers;
    // End of variables declaration//GEN-END:variables

    private Object Dashboard() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
