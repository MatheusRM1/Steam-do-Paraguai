/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.steam_do_paraguai.view;

import com.steam_do_paraguai.exception.UsuarioException;
import com.steam_do_paraguai.model.Admin;
import com.steam_do_paraguai.model.Usuario;
import com.steam_do_paraguai.persistence.AdminPersistence;
import com.steam_do_paraguai.persistence.Persistence;
import com.steam_do_paraguai.persistence.UsuarioPersistence;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Matheus-PC
 */
public class AdminEditaAdmin extends javax.swing.JPanel {

    private MenuPrincipal tela;
    private List<Admin> listaAdmin;
    Persistence<Admin> adminPersistence;

    /**
     * Creates new form AdminEditaAdmin
     */
    public AdminEditaAdmin(MenuPrincipal tela) {
        this.tela = tela;
        listaAdmin = new ArrayList<>();
        adminPersistence = new AdminPersistence();
        listaAdmin = adminPersistence.findAll();
        

        initComponents();
        
        carregaUsuarios();
    }

    private void carregaUsuarios() {

        DefaultTableModel model = (DefaultTableModel) jTabelaAdmin.getModel();

        for (Admin p : this.listaAdmin) {
            model.addRow(new Object[]{
                p.getNome(),
                p.getSenha(),});
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelaAdmin = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jNomeField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSenhaField = new javax.swing.JTextField();
        jAdicionaButton = new javax.swing.JButton();
        jEditaButton = new javax.swing.JButton();
        jRemoveButton = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(61, 122, 155));
        setPreferredSize(new java.awt.Dimension(708, 368));

        jTabelaAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Senha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTabelaAdmin.getTableHeader().setReorderingAllowed(false);
        jTabelaAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTabelaAdminMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTabelaAdmin);
        if (jTabelaAdmin.getColumnModel().getColumnCount() > 0) {
            jTabelaAdmin.getColumnModel().getColumn(0).setResizable(false);
            jTabelaAdmin.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel1.setText("Nome");

        jLabel3.setText("Senha");

        jAdicionaButton.setText("Adiciona");
        jAdicionaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAdicionaButtonActionPerformed(evt);
            }
        });

        jEditaButton.setText("Edita");
        jEditaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditaButtonActionPerformed(evt);
            }
        });

        jRemoveButton.setText("Remove");
        jRemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRemoveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jNomeField)
                            .addComponent(jSenhaField)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jAdicionaButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(jEditaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRemoveButton)
                        .addGap(78, 78, 78)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jNomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSenhaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jAdicionaButton)
                            .addComponent(jEditaButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRemoveButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRemoveButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTabelaAdmin.getModel();

        if (jTabelaAdmin.getSelectedRow() != -1) {
            if(!jTabelaAdmin.getValueAt(jTabelaAdmin.getSelectedRow(), 0).equals(this.tela.getUsuario().getNome())){
                listaAdmin.remove(jTabelaAdmin.getSelectedRow());
                model.removeRow(jTabelaAdmin.getSelectedRow());
                adminPersistence.save(listaAdmin);
            } else
                JOptionPane.showMessageDialog(jNomeField, "Voce nao pode se remover do sistema");
        } else {
            JOptionPane.showMessageDialog(jNomeField, "Selecione um Usuario para remover");
        }
    }//GEN-LAST:event_jRemoveButtonActionPerformed

    private void jAdicionaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAdicionaButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTabelaAdmin.getModel();

        try {
            Admin p = new Admin(jNomeField.getText(), jSenhaField.getText(), "Usuario");
            listaAdmin.add(p);
            model.addRow(new Object[]{
                p.getNome(),
                p.getSenha(),
            });
            adminPersistence.save(listaAdmin);
        } catch (UsuarioException e) {
            JOptionPane.showMessageDialog(jNomeField, "Usuario Invalido");
        }
    }//GEN-LAST:event_jAdicionaButtonActionPerformed

    private void jEditaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditaButtonActionPerformed
        if (jTabelaAdmin.getSelectedRow() != -1) {

            Admin p = listaAdmin.get(jTabelaAdmin.getSelectedRow());

            try {

                if (jNomeField.getText().equals(p.getNome())) {
                    p.setSenha(jSenhaField.getText());
                } else {
                    p.setNome(jNomeField.getText());
                    p.setSenha(jSenhaField.getText());
                }

                jTabelaAdmin.setValueAt(jNomeField.getText(), jTabelaAdmin.getSelectedRow(), 0);
                jTabelaAdmin.setValueAt(jSenhaField.getText(), jTabelaAdmin.getSelectedRow(), 1);

                adminPersistence.save(listaAdmin);
            } catch (UsuarioException e) {
                JOptionPane.showMessageDialog(jNomeField, "Usuario Invalido");
            }
        }
    }//GEN-LAST:event_jEditaButtonActionPerformed

    private void jTabelaAdminMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelaAdminMouseReleased
        if (jTabelaAdmin.getSelectedRow() != -1) {
            jNomeField.setText(jTabelaAdmin.getValueAt(jTabelaAdmin.getSelectedRow(), 0).toString());
            jSenhaField.setText(jTabelaAdmin.getValueAt(jTabelaAdmin.getSelectedRow(), 1).toString());
        }
    }//GEN-LAST:event_jTabelaAdminMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAdicionaButton;
    private javax.swing.JButton jEditaButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jNomeField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jRemoveButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jSenhaField;
    private javax.swing.JTable jTabelaAdmin;
    // End of variables declaration//GEN-END:variables
}
