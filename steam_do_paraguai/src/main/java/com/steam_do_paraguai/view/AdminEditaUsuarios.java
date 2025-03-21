/*
Nome: Lukas Freitas de Carvalho - Matrícula: 202376033
Nome: Matheus Ribeiro Menezes - Matrícula: 202376023
Nome: João Víctor Nicácio Silva - Matrícula: 202365565C
*/
package com.steam_do_paraguai.view;

import com.steam_do_paraguai.exception.UsuarioException;
import com.steam_do_paraguai.model.Usuario;
import com.steam_do_paraguai.persistence.Persistence;
import com.steam_do_paraguai.persistence.UsuarioPersistence;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
public class AdminEditaUsuarios extends javax.swing.JPanel {

    private MenuPrincipal tela;
    private List<Usuario> listaUsuarios;
    Persistence<Usuario> usuarioPersistence;

    public AdminEditaUsuarios(MenuPrincipal tela) {
        this.tela = tela;
        listaUsuarios = new ArrayList<>();
        usuarioPersistence = new UsuarioPersistence();
        listaUsuarios = usuarioPersistence.findAll();
        

        initComponents();
        
        carregaUsuarios();
    }

    private void carregaUsuarios() {

        DefaultTableModel model = (DefaultTableModel) jTabelaUsuarios.getModel();

        for (Usuario p : this.listaUsuarios) {
            model.addRow(new Object[]{
                p.getNome(),
                p.getSenha(),
                p.getSaldo(),
                p.acessoAoSistema()
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jEditButton = new javax.swing.JButton();
        jRemoveButton = new javax.swing.JButton();
        jAdicionaButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabelaUsuarios = new javax.swing.JTable();
        nomeLabel = new javax.swing.JLabel();
        jNomeField = new javax.swing.JTextField();
        senhaLabel = new javax.swing.JLabel();
        jSenhaField = new javax.swing.JTextField();
        jFundosField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(61, 122, 155));
        setMaximumSize(new java.awt.Dimension(708, 368));
        setMinimumSize(new java.awt.Dimension(708, 368));

        jEditButton.setText("Editar");
        jEditButton.setMaximumSize(new java.awt.Dimension(110, 37));
        jEditButton.setMinimumSize(new java.awt.Dimension(110, 37));
        jEditButton.setPreferredSize(new java.awt.Dimension(110, 37));
        jEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditButtonActionPerformed(evt);
            }
        });

        jRemoveButton.setText("Remover");
        jRemoveButton.setMaximumSize(new java.awt.Dimension(110, 37));
        jRemoveButton.setMinimumSize(new java.awt.Dimension(110, 37));
        jRemoveButton.setPreferredSize(new java.awt.Dimension(110, 37));
        jRemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRemoveButtonActionPerformed(evt);
            }
        });

        jAdicionaButton.setText("Adicionar");
        jAdicionaButton.setMaximumSize(new java.awt.Dimension(110, 37));
        jAdicionaButton.setMinimumSize(new java.awt.Dimension(110, 37));
        jAdicionaButton.setPreferredSize(new java.awt.Dimension(110, 37));
        jAdicionaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAdicionaButtonActionPerformed(evt);
            }
        });

        jTabelaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Senha", "Fundos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTabelaUsuarios.getTableHeader().setReorderingAllowed(false);
        jTabelaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTabelaUsuariosMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTabelaUsuarios);
        if (jTabelaUsuarios.getColumnModel().getColumnCount() > 0) {
            jTabelaUsuarios.getColumnModel().getColumn(0).setResizable(false);
            jTabelaUsuarios.getColumnModel().getColumn(1).setResizable(false);
            jTabelaUsuarios.getColumnModel().getColumn(2).setResizable(false);
        }

        nomeLabel.setText("Nome");

        jNomeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNomeFieldActionPerformed(evt);
            }
        });

        senhaLabel.setText("Senha");

        jLabel2.setText("Fundos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jNomeField, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addComponent(jSenhaField))
                            .addComponent(jFundosField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(senhaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jRemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jAdicionaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jNomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(senhaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSenhaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jFundosField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAdicionaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRemoveButtonActionPerformed

        DefaultTableModel model = (DefaultTableModel) jTabelaUsuarios.getModel();

        if (jTabelaUsuarios.getSelectedRow() != -1) {

            listaUsuarios.remove(jTabelaUsuarios.getSelectedRow());
            model.removeRow(jTabelaUsuarios.getSelectedRow());
            usuarioPersistence.save(listaUsuarios);
        } else {
            JOptionPane.showMessageDialog(jNomeField, "Selecione um Usuario para remover");
        }
    }//GEN-LAST:event_jRemoveButtonActionPerformed

    private void jEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditButtonActionPerformed
        if (jTabelaUsuarios.getSelectedRow() != -1) {

            Usuario p = listaUsuarios.get(jTabelaUsuarios.getSelectedRow());

            try {

                if (jNomeField.getText().equals(p.getNome())) {
                    if (jSenhaField.getText().equals(p.getSenha())) {
                        p.setSaldo(Float.parseFloat(jFundosField.getText()));
                    } else {
                        p.setSenha(jSenhaField.getText());
                        p.setSaldo(Float.parseFloat(jFundosField.getText()));
                    }
                } else {
                    p.setNome(jNomeField.getText());
                    p.setSenha(jSenhaField.getText());
                    p.setSaldo(Float.parseFloat(jFundosField.getText()));
                }

                jTabelaUsuarios.setValueAt(jNomeField.getText(), jTabelaUsuarios.getSelectedRow(), 0);
                jTabelaUsuarios.setValueAt(jSenhaField.getText(), jTabelaUsuarios.getSelectedRow(), 1);
                jTabelaUsuarios.setValueAt(jFundosField.getText(), jTabelaUsuarios.getSelectedRow(), 2);

                usuarioPersistence.save(listaUsuarios);
            } catch (UsuarioException e) {
                JOptionPane.showMessageDialog(jNomeField, "Usuario Invalido");
            }
        }


    }//GEN-LAST:event_jEditButtonActionPerformed

    private void jAdicionaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAdicionaButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTabelaUsuarios.getModel();

        try {
            Usuario p = new Usuario(jNomeField.getText(), jSenhaField.getText(), "Usuario");
            listaUsuarios.add(p);
            p.setSaldo(Float.parseFloat(jFundosField.getText()));
            model.addRow(new Object[]{
                p.getNome(),
                p.getSenha(),
                p.getSaldo(),
                p.acessoAoSistema()
            });
            usuarioPersistence.save(listaUsuarios);
        } catch (UsuarioException e) {
            JOptionPane.showMessageDialog(jNomeField, "Usuario Invalido");
        }


    }//GEN-LAST:event_jAdicionaButtonActionPerformed

    /***
     * Faz com que ao clicar na tabela, sejam atualizados os campos
     * @param evt 
     */
    private void jTabelaUsuariosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelaUsuariosMouseReleased
        if (jTabelaUsuarios.getSelectedRow() != -1) {
            jNomeField.setText(jTabelaUsuarios.getValueAt(jTabelaUsuarios.getSelectedRow(), 0).toString());
            jSenhaField.setText(jTabelaUsuarios.getValueAt(jTabelaUsuarios.getSelectedRow(), 1).toString());
            jFundosField.setText(jTabelaUsuarios.getValueAt(jTabelaUsuarios.getSelectedRow(), 2).toString());
        }
    }//GEN-LAST:event_jTabelaUsuariosMouseReleased

    private void jNomeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNomeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNomeFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jAdicionaButton;
    private javax.swing.JButton jEditButton;
    private javax.swing.JTextField jFundosField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jNomeField;
    private javax.swing.JButton jRemoveButton;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jSenhaField;
    private javax.swing.JTable jTabelaUsuarios;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JLabel senhaLabel;
    // End of variables declaration//GEN-END:variables
}
