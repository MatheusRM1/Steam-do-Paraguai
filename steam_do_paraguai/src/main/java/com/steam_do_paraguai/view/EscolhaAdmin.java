/*
Nome: Lukas Freitas de Carvalho - Matrícula: 202376033
Nome: Matheus Ribeiro Menezes - Matrícula: 202376023
Nome: João Víctor Nicácio Silva - Matrícula: 202365565C
*/
package com.steam_do_paraguai.view;

public class EscolhaAdmin extends javax.swing.JPanel {
    private MenuPrincipal tela;

    public EscolhaAdmin(MenuPrincipal tela) {
        this.tela = tela;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editaLojaButton = new javax.swing.JButton();
        editaUserButton = new javax.swing.JButton();
        sairDaContaButton = new javax.swing.JButton();
        editaAdminsButton = new javax.swing.JButton();
        cupomButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(61, 122, 155));
        setMaximumSize(new java.awt.Dimension(708, 368));
        setMinimumSize(new java.awt.Dimension(708, 368));
        setPreferredSize(new java.awt.Dimension(708, 368));

        editaLojaButton.setText("Editar loja");
        editaLojaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarLojaActionPerformed(evt);
            }
        });

        editaUserButton.setText("Editar Usuários");
        editaUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditaUsuarioActionPerformed(evt);
            }
        });

        sairDaContaButton.setText("Sair da conta");
        sairDaContaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairDaContaButtonActionPerformed(evt);
            }
        });

        editaAdminsButton.setText("Editar Admins");
        editaAdminsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editaAdminsButtonActionPerformed(evt);
            }
        });

        cupomButton.setText("Editar cupons");
        cupomButton.setMaximumSize(new java.awt.Dimension(140, 40));
        cupomButton.setMinimumSize(new java.awt.Dimension(140, 40));
        cupomButton.setPreferredSize(new java.awt.Dimension(140, 40));
        cupomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cupomButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cupomButton, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(editaUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                        .addComponent(editaAdminsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editaLojaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sairDaContaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(191, 191, 191))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(cupomButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editaUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editaAdminsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editaLojaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sairDaContaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sairDaContaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairDaContaButtonActionPerformed
        this.tela.setDeslogado();
    }//GEN-LAST:event_sairDaContaButtonActionPerformed

    private void editarLojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarLojaActionPerformed
            AdminEditaJogo editarloja = new AdminEditaJogo(this.tela);
            this.tela.mudaPanel(editarloja);
    }//GEN-LAST:event_editarLojaActionPerformed

    private void jEditaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditaUsuarioActionPerformed
        AdminEditaUsuarios editausuarios = new AdminEditaUsuarios(this.tela);
        this.tela.mudaPanel(editausuarios);
       
    }//GEN-LAST:event_jEditaUsuarioActionPerformed

    private void editaAdminsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editaAdminsButtonActionPerformed
        AdminEditaAdmin editaadmins = new AdminEditaAdmin(this.tela);
        this.tela.mudaPanel(editaadmins);
        
    }//GEN-LAST:event_editaAdminsButtonActionPerformed

    private void cupomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cupomButtonActionPerformed
        AdminEditaCupom editacupom = new AdminEditaCupom(this.tela);
        this.tela.mudaPanel(editacupom);
    }//GEN-LAST:event_cupomButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cupomButton;
    private javax.swing.JButton editaAdminsButton;
    private javax.swing.JButton editaLojaButton;
    private javax.swing.JButton editaUserButton;
    private javax.swing.JButton sairDaContaButton;
    // End of variables declaration//GEN-END:variables
}
