/*
Nome: Lukas Freitas de Carvalho - Matrícula: 202376033
Nome: Matheus Ribeiro Menezes - Matrícula: 202376023
Nome: João Víctor Nicácio Silva - Matrícula: 202365565C
*/
package com.steam_do_paraguai.view;

import com.steam_do_paraguai.model.*;
import com.steam_do_paraguai.persistence.AdminPersistence;
import com.steam_do_paraguai.persistence.Persistence;
import com.steam_do_paraguai.persistence.UsuarioPersistence;
import java.util.List;
import javax.swing.JOptionPane;

public class LoginPanel extends javax.swing.JPanel {

    private User usuario;
    private MenuPrincipal tela;


    public LoginPanel(MenuPrincipal t) {
        this.tela = t;
        initComponents();
    }

    public User getUsuario() {
        return this.usuario;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iniciaSessaoLabel = new javax.swing.JLabel();
        loginAreaPanel = new javax.swing.JPanel();
        enterAccountButton = new javax.swing.JButton();
        createAccountButton = new javax.swing.JButton();
        userLabel = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(61, 122, 155));
        setMaximumSize(new java.awt.Dimension(708, 368));
        setMinimumSize(new java.awt.Dimension(708, 368));
        setPreferredSize(new java.awt.Dimension(708, 368));

        iniciaSessaoLabel.setFont(new java.awt.Font("Source Sans Pro", 0, 24)); // NOI18N
        iniciaSessaoLabel.setForeground(new java.awt.Color(255, 255, 255));
        iniciaSessaoLabel.setText("INICIAR SESSÃO");

        loginAreaPanel.setBackground(new java.awt.Color(30, 30, 29));

        enterAccountButton.setBackground(new java.awt.Color(221, 221, 221));
        enterAccountButton.setForeground(new java.awt.Color(30, 30, 29));
        enterAccountButton.setText("Entrar");
        enterAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entraNaConta(evt);
            }
        });

        createAccountButton.setBackground(new java.awt.Color(221, 221, 221));
        createAccountButton.setForeground(new java.awt.Color(30, 30, 29));
        createAccountButton.setText("Criar Conta");
        createAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redirecionaParaCriarConta(evt);
            }
        });

        userLabel.setForeground(new java.awt.Color(255, 255, 255));
        userLabel.setText("Usuário:");

        userField.setBackground(new java.awt.Color(221, 221, 221));
        userField.setForeground(new java.awt.Color(30, 30, 29));

        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Senha:");

        javax.swing.GroupLayout loginAreaPanelLayout = new javax.swing.GroupLayout(loginAreaPanel);
        loginAreaPanel.setLayout(loginAreaPanelLayout);
        loginAreaPanelLayout.setHorizontalGroup(
            loginAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginAreaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordField)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginAreaPanelLayout.createSequentialGroup()
                        .addGap(0, 334, Short.MAX_VALUE)
                        .addComponent(createAccountButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enterAccountButton))
                    .addComponent(userField)
                    .addGroup(loginAreaPanelLayout.createSequentialGroup()
                        .addGroup(loginAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userLabel)
                            .addComponent(passwordLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        loginAreaPanelLayout.setVerticalGroup(
            loginAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginAreaPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(userLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(loginAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterAccountButton)
                    .addComponent(createAccountButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginAreaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iniciaSessaoLabel))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(iniciaSessaoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginAreaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void redirecionaParaCriarConta(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redirecionaParaCriarConta
        CriarContaPanel criarConta = new CriarContaPanel(this.tela);
        criarConta.setSize(708, 368);
        criarConta.setLocation(0, 0);

        this.removeAll();
        this.add(criarConta);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_redirecionaParaCriarConta

    private void entraNaConta(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entraNaConta

        if (this.tela.getUsuario() == null) {
            Persistence<Usuario> usuarioPersistence = new UsuarioPersistence();
            List<Usuario> listaUsuarios = usuarioPersistence.findAll();

            Persistence<Admin> adminPersistence = new AdminPersistence();
            List<Admin> listaAdmin = adminPersistence.findAll();

            
            for (Usuario p : listaUsuarios) {
                if (p.getNome().equals(userField.getText())) {
                    
                    if (p.getSenha().equals(passwordField.getText())) {
                        JOptionPane.showMessageDialog(loginAreaPanel, "Bem Vindo " + p.getNome() + " (Usuario)");

                        this.usuario = p;

                        tela.setUsuario(this);
                        return;
                    } else {
                        JOptionPane.showMessageDialog(loginAreaPanel, "Senha Invalida");
                        return;
                    }
                }
            }

            for (Admin p : listaAdmin) {
                if (p.getNome().equals(userField.getText())) {
                    if (p.getSenha().equals(passwordField.getText())) {
                        JOptionPane.showMessageDialog(loginAreaPanel, "Bem Vindo " + p.getNome() + " (Admin)");
                        this.usuario = p;
                        tela.setUsuario(this);
                        return;
                    } else {
                        JOptionPane.showMessageDialog(loginAreaPanel, "Senha Invalida");
                        return;
                    }
                }
            }
            
                JOptionPane.showMessageDialog(loginAreaPanel, "Usuario nao encontrado, crie uma conta");
        }

    }//GEN-LAST:event_entraNaConta


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createAccountButton;
    private javax.swing.JButton enterAccountButton;
    private javax.swing.JLabel iniciaSessaoLabel;
    private javax.swing.JPanel loginAreaPanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField userField;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables

}
