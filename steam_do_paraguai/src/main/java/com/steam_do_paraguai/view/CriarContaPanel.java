/*
Nome: Lukas Freitas de Carvalho - Matrícula: 202376033
Nome: Matheus Ribeiro Menezes - Matrícula: 202376023
Nome: João Víctor Nicácio Silva - Matrícula: 202365565C
*/
package com.steam_do_paraguai.view;

import com.steam_do_paraguai.model.*;

import com.steam_do_paraguai.exception.UsuarioException;
import com.steam_do_paraguai.persistence.AdminPersistence;
import com.steam_do_paraguai.persistence.Persistence;
import com.steam_do_paraguai.persistence.UsuarioPersistence;

import java.util.List;

import javax.swing.JOptionPane;

public class CriarContaPanel extends javax.swing.JPanel {

    private MenuPrincipal tela;

    public CriarContaPanel(MenuPrincipal t) {
        this.tela = t;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        createAccountLabel = new javax.swing.JLabel();
        createAccountPane = new javax.swing.JPanel();
        createAccountButton = new javax.swing.JButton();
        userLabel = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        confirmPasswordLabel = new javax.swing.JLabel();
        usuarioRadio = new javax.swing.JRadioButton();
        adminRadio = new javax.swing.JRadioButton();
        passwordField = new javax.swing.JPasswordField();
        confirmPasswordField = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(61, 122, 155));
        setMaximumSize(new java.awt.Dimension(708, 368));
        setMinimumSize(new java.awt.Dimension(708, 368));
        setPreferredSize(new java.awt.Dimension(708, 368));

        createAccountLabel.setFont(new java.awt.Font("Source Sans Pro", 0, 24)); // NOI18N
        createAccountLabel.setForeground(new java.awt.Color(255, 255, 255));
        createAccountLabel.setText("CRIAR CONTA");

        createAccountPane.setBackground(new java.awt.Color(30, 30, 29));

        createAccountButton.setText("Criar Conta");
        createAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarConta(evt);
            }
        });

        userLabel.setForeground(new java.awt.Color(255, 255, 255));
        userLabel.setText("Usuário");

        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Senha");

        confirmPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        confirmPasswordLabel.setText("Confirmar Senha");

        buttonGroup1.add(usuarioRadio);
        usuarioRadio.setForeground(new java.awt.Color(255, 255, 255));
        usuarioRadio.setText("Usuário");

        buttonGroup1.add(adminRadio);
        adminRadio.setForeground(new java.awt.Color(255, 255, 255));
        adminRadio.setText("Admin");

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout createAccountPaneLayout = new javax.swing.GroupLayout(createAccountPane);
        createAccountPane.setLayout(createAccountPaneLayout);
        createAccountPaneLayout.setHorizontalGroup(
            createAccountPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createAccountPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(createAccountPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmPasswordField)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createAccountPaneLayout.createSequentialGroup()
                        .addComponent(usuarioRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adminRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createAccountButton))
                    .addComponent(userField, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                    .addComponent(passwordField)
                    .addGroup(createAccountPaneLayout.createSequentialGroup()
                        .addGroup(createAccountPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userLabel)
                            .addComponent(passwordLabel)
                            .addComponent(confirmPasswordLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        createAccountPaneLayout.setVerticalGroup(
            createAccountPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createAccountPaneLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(userLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmPasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(createAccountPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createAccountButton)
                    .addComponent(usuarioRadio)
                    .addComponent(adminRadio))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createAccountPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createAccountLabel))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createAccountLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createAccountPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void criarConta(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarConta
        try {

            if (passwordField.getText().equals(confirmPasswordField.getText())) {
                if (usuarioRadio.isSelected()) {
                    Persistence<Usuario> usuarioPersistence = new UsuarioPersistence();
                    List<Usuario> listaUsuarios = usuarioPersistence.findAll();
                    
                    listaUsuarios.add(new Usuario(userField.getText(), passwordField.getText(), "Usuario"));
                    LoginPanel criarConta = new LoginPanel(this.tela);
                    criarConta.setSize(708, 368);
                    criarConta.setLocation(0, 0);

                    this.removeAll();
                    this.add(criarConta);
                    this.revalidate();
                    this.repaint();

                    usuarioPersistence.save(listaUsuarios);

                } else if (adminRadio.isSelected()) {
                    Persistence<Admin> adminPersistence = new AdminPersistence();
                    List<Admin> listaAdmin = adminPersistence.findAll();
                    
                    listaAdmin.add(new Admin(userField.getText(), passwordField.getText(), "Admin"));
                    LoginPanel criarConta = new LoginPanel(this.tela);
                    criarConta.setSize(708, 368);
                    criarConta.setLocation(0, 0);

                    this.removeAll();
                    this.add(criarConta);
                    this.revalidate();
                    this.repaint();
                    
                    adminPersistence.save(listaAdmin);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Senha nao confirmada");
            }

        } catch (UsuarioException e) {
            JOptionPane.showMessageDialog(null, "Nome de usuario invalido(tem que ter obrigatoriamente uma letra) ou usuario ja existente");
        }

    }//GEN-LAST:event_criarConta

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton adminRadio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JLabel confirmPasswordLabel;
    private javax.swing.JButton createAccountButton;
    private javax.swing.JLabel createAccountLabel;
    private javax.swing.JPanel createAccountPane;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField userField;
    private javax.swing.JLabel userLabel;
    private javax.swing.JRadioButton usuarioRadio;
    // End of variables declaration//GEN-END:variables
}
