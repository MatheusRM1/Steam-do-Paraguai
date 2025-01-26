/*
Nome: Lukas Freitas de Carvalho - Matrícula: 202376033
Nome: Matheus Ribeiro Menezes - Matrícula: 202376023
Nome: João Víctor Nicácio Silva - Matrícula: 202365565C
*/
package com.steam_do_paraguai.view;

import com.steam_do_paraguai.model.Admin;
import com.steam_do_paraguai.model.User;
import com.steam_do_paraguai.model.Usuario;
import javax.swing.JOptionPane;

public class MenuPrincipal extends javax.swing.JFrame {
    
    private User usuario;
    
    public MenuPrincipal() {
        this.usuario = null;
        initComponents();
        LoginPanel log = new LoginPanel(this);
        this.mudaPanel(log); //Muda painel para o Login no inicio
    }

    public User getUsuario() {
            return this.usuario;
    }
    
    /***
     * Muda o painel do template
     * @param temp 
     */
    public void mudaPanel(javax.swing.JPanel temp)
    {
        temp.setSize(708,368);
        temp.setLocation(0,0);
        template.removeAll(); //O template e o panel cinza escuro no MenuPrincipal que permite que as outras telas sejam substituidas por ele
        template.add(temp);
        template.revalidate();
        template.repaint();
    }

    
    public void setDeslogado() {
        this.usuario = null;

        iniciarSessaoButton.setText("INICIAR SESSAO"); //Redefine o botao de iniciar sessao
        java.awt.event.ActionListener[] acao = iniciarSessaoButton.getActionListeners();
        iniciarSessaoButton.removeActionListener(acao[0]);
        iniciarSessaoButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                iniciarSessaoButtonActionPerformed(e);
            }
        });

        LoginPanel log = new LoginPanel(this);
        this.mudaPanel(log);
        this.configurarLayoutUsuario();
    }

    public void setUsuario(LoginPanel login) {
        

        if (login.getUsuario() instanceof Usuario) {
            this.usuario = (Admin) this.usuario;
            Usuario user = (Usuario) login.getUsuario();
            this.usuario = user;
            iniciarSessaoButton.setText("USUARIO");
            java.awt.event.ActionListener[] acao = iniciarSessaoButton.getActionListeners();
            iniciarSessaoButton.removeActionListener(acao[0]);
            iniciarSessaoButton.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    userButtonActionPerformed(e);
                }
            });
            
        } else if (login.getUsuario() instanceof Admin) {
            
            this.usuario = (Admin) this.usuario;
            Admin user = (Admin) login.getUsuario();
            this.usuario = user;
            iniciarSessaoButton.setText("ADMIN");
            java.awt.event.ActionListener[] acao = iniciarSessaoButton.getActionListeners();
            iniciarSessaoButton.removeActionListener(acao[0]);
            iniciarSessaoButton.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    adminButtonActionPerformed(e);
                }
            });
           this.configurarLayoutAdmin();
           
        } else {
            iniciarSessaoButton.setText("INICIAR SESSAO");
            java.awt.event.ActionListener[] acao = iniciarSessaoButton.getActionListeners();
            iniciarSessaoButton.removeActionListener(acao[0]);
            iniciarSessaoButton.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    iniciarSessaoButtonActionPerformed(e);
                }
            });
        }

        LojaPanel loja = new LojaPanel(this);
        this.mudaPanel(loja);
    }
    /***
     * Faz com que o botao da loja fique centralizado e esconde os outros botoes para o Admin
     */
    private void configurarLayoutAdmin() {
        this.fundosButton.setVisible(false);
        this.bibliotecaButton.setVisible(false);
         this.carrinhoButton.setVisible(false);
        lojaButton.setPreferredSize(new java.awt.Dimension(708, 22));
        javax.swing.GroupLayout barraSuperiorPanelLayout = new javax.swing.GroupLayout(barraSuperiorPanel);
        barraSuperiorPanel.setLayout(barraSuperiorPanelLayout);
        barraSuperiorPanelLayout.setHorizontalGroup(
            barraSuperiorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraSuperiorPanelLayout.createSequentialGroup()
                .addGroup(barraSuperiorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(barraSuperiorPanelLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(steamLabel)
                        .addGap(53, 53, 53)
                        .addComponent(iniciarSessaoButton, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
                    .addComponent(lojaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        barraSuperiorPanelLayout.setVerticalGroup(
            barraSuperiorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraSuperiorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(barraSuperiorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iniciarSessaoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(steamLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lojaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        template.setBackground(new java.awt.Color(30, 30, 29));

        javax.swing.GroupLayout templateLayout = new javax.swing.GroupLayout(template);
        template.setLayout(templateLayout);
        templateLayout.setHorizontalGroup(
            templateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        templateLayout.setVerticalGroup(
            templateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fundoPanelLayout = new javax.swing.GroupLayout(fundoPanel);
        fundoPanel.setLayout(fundoPanelLayout);
        fundoPanelLayout.setHorizontalGroup(
            fundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraSuperiorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(fundoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(template, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        fundoPanelLayout.setVerticalGroup(
            fundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoPanelLayout.createSequentialGroup()
                .addComponent(barraSuperiorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(template, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }
    
    
    /***
     * Retoma os botoes da NavBar para o usuario
     */
    private void configurarLayoutUsuario()
    {
        this.bibliotecaButton.setVisible(true);
        this.fundosButton.setVisible(true);
        this.carrinhoButton.setVisible(true);
        javax.swing.GroupLayout barraSuperiorPanelLayout = new javax.swing.GroupLayout(barraSuperiorPanel);
        barraSuperiorPanel.setLayout(barraSuperiorPanelLayout);
        barraSuperiorPanelLayout.setHorizontalGroup(
            barraSuperiorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraSuperiorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(barraSuperiorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(barraSuperiorPanelLayout.createSequentialGroup()
                        .addComponent(lojaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bibliotecaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraSuperiorPanelLayout.createSequentialGroup()
                        .addComponent(steamLabel)
                        .addGap(53, 53, 53)))
                .addGroup(barraSuperiorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(barraSuperiorPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(carrinhoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fundosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(iniciarSessaoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        barraSuperiorPanelLayout.setVerticalGroup(
            barraSuperiorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraSuperiorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(barraSuperiorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iniciarSessaoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(steamLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(barraSuperiorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lojaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bibliotecaButton)
                    .addComponent(carrinhoButton)
                    .addComponent(fundosButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        template.setBackground(new java.awt.Color(30, 30, 29));

        javax.swing.GroupLayout templateLayout = new javax.swing.GroupLayout(template);
        template.setLayout(templateLayout);
        templateLayout.setHorizontalGroup(
            templateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        templateLayout.setVerticalGroup(
            templateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fundoPanelLayout = new javax.swing.GroupLayout(fundoPanel);
        fundoPanel.setLayout(fundoPanelLayout);
        fundoPanelLayout.setHorizontalGroup(
            fundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraSuperiorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(fundoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(template, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        fundoPanelLayout.setVerticalGroup(
            fundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoPanelLayout.createSequentialGroup()
                .addComponent(barraSuperiorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(template, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundoPanel = new javax.swing.JPanel();
        barraSuperiorPanel = new javax.swing.JPanel();
        steamLabel = new javax.swing.JLabel();
        bibliotecaButton = new javax.swing.JButton();
        carrinhoButton = new javax.swing.JButton();
        lojaButton = new javax.swing.JButton();
        iniciarSessaoButton = new javax.swing.JButton();
        fundosButton = new javax.swing.JButton();
        template = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(720, 480));
        setResizable(false);

        fundoPanel.setBackground(new java.awt.Color(62, 122, 155));

        barraSuperiorPanel.setBackground(new java.awt.Color(30, 30, 29));
        barraSuperiorPanel.setForeground(new java.awt.Color(30, 30, 30));

        steamLabel.setFont(new java.awt.Font("Cascadia Code", 0, 30)); // NOI18N
        steamLabel.setForeground(new java.awt.Color(255, 255, 255));
        steamLabel.setText("STEAM DO PARAGUAI");

        bibliotecaButton.setBackground(new java.awt.Color(30, 30, 29));
        bibliotecaButton.setForeground(new java.awt.Color(255, 255, 255));
        bibliotecaButton.setText("BIBLIOTECA");
        bibliotecaButton.setBorder(null);
        bibliotecaButton.setBorderPainted(false);
        bibliotecaButton.setContentAreaFilled(false);
        bibliotecaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bibliotecaButtonActionPerformed(evt);
            }
        });

        carrinhoButton.setBackground(new java.awt.Color(30, 30, 29));
        carrinhoButton.setForeground(new java.awt.Color(255, 255, 255));
        carrinhoButton.setText("CARRINHO");
        carrinhoButton.setBorder(null);
        carrinhoButton.setBorderPainted(false);
        carrinhoButton.setContentAreaFilled(false);
        carrinhoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carrinhoButtonActionPerformed(evt);
            }
        });

        lojaButton.setBackground(new java.awt.Color(30, 30, 29));
        lojaButton.setForeground(new java.awt.Color(255, 255, 255));
        lojaButton.setText("LOJA");
        lojaButton.setBorder(null);
        lojaButton.setBorderPainted(false);
        lojaButton.setContentAreaFilled(false);
        lojaButton.setMaximumSize(new java.awt.Dimension(708, 22));
        lojaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lojaButtonActionPerformed(evt);
            }
        });

        iniciarSessaoButton.setBackground(new java.awt.Color(30, 30, 29));
        iniciarSessaoButton.setFont(new java.awt.Font("Cascadia Code", 0, 24)); // NOI18N
        iniciarSessaoButton.setForeground(new java.awt.Color(255, 255, 255));
        iniciarSessaoButton.setText("INICIAR SESSAO");
        iniciarSessaoButton.setBorder(null);
        iniciarSessaoButton.setBorderPainted(false);
        iniciarSessaoButton.setContentAreaFilled(false);
        iniciarSessaoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarSessaoButtonActionPerformed(evt);
            }
        });

        fundosButton.setBackground(new java.awt.Color(30, 30, 29));
        fundosButton.setForeground(new java.awt.Color(255, 255, 255));
        fundosButton.setText("FUNDOS");
        fundosButton.setBorder(null);
        fundosButton.setBorderPainted(false);
        fundosButton.setContentAreaFilled(false);
        fundosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fundosButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraSuperiorPanelLayout = new javax.swing.GroupLayout(barraSuperiorPanel);
        barraSuperiorPanel.setLayout(barraSuperiorPanelLayout);
        barraSuperiorPanelLayout.setHorizontalGroup(
            barraSuperiorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraSuperiorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(barraSuperiorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(barraSuperiorPanelLayout.createSequentialGroup()
                        .addComponent(lojaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bibliotecaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraSuperiorPanelLayout.createSequentialGroup()
                        .addComponent(steamLabel)
                        .addGap(53, 53, 53)))
                .addGroup(barraSuperiorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(barraSuperiorPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(carrinhoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fundosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(iniciarSessaoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        barraSuperiorPanelLayout.setVerticalGroup(
            barraSuperiorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraSuperiorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(barraSuperiorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iniciarSessaoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(steamLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(barraSuperiorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lojaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bibliotecaButton)
                    .addComponent(carrinhoButton)
                    .addComponent(fundosButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        template.setBackground(new java.awt.Color(30, 30, 29));

        javax.swing.GroupLayout templateLayout = new javax.swing.GroupLayout(template);
        template.setLayout(templateLayout);
        templateLayout.setHorizontalGroup(
            templateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        templateLayout.setVerticalGroup(
            templateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fundoPanelLayout = new javax.swing.GroupLayout(fundoPanel);
        fundoPanel.setLayout(fundoPanelLayout);
        fundoPanelLayout.setHorizontalGroup(
            fundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraSuperiorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(fundoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(template, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        fundoPanelLayout.setVerticalGroup(
            fundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoPanelLayout.createSequentialGroup()
                .addComponent(barraSuperiorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(template, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarSessaoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarSessaoButtonActionPerformed
        LoginPanel log = new LoginPanel(this);
        this.mudaPanel(log);
    }//GEN-LAST:event_iniciarSessaoButtonActionPerformed

    private void lojaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lojaButtonActionPerformed
        if(this.usuario != null)
        {
            LojaPanel loja = new LojaPanel(this);
            this.mudaPanel(loja);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Inicie sessao primeiro!");
        }
    }//GEN-LAST:event_lojaButtonActionPerformed

    private void fundosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fundosButtonActionPerformed
        if(this.usuario != null && !(this.usuario instanceof Admin))
        {
            FundosPanel saldo = new FundosPanel(this);
            this.mudaPanel(saldo);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Inicie sessao primeiro!");
        }
    }//GEN-LAST:event_fundosButtonActionPerformed

    private void carrinhoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carrinhoButtonActionPerformed
        if(this.usuario != null && !(this.usuario instanceof Admin))
        {
            CarrinhoPanel carrinho = new CarrinhoPanel(this);
            this.mudaPanel(carrinho);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Inicie sessao primeiro!");
        }
    }//GEN-LAST:event_carrinhoButtonActionPerformed

    private void bibliotecaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bibliotecaButtonActionPerformed
         if(this.usuario != null && !(this.usuario instanceof Admin))
        {
            BibliotecaPanel bib = new BibliotecaPanel(this);
            this.mudaPanel(bib);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Inicie sessao primeiro!");
        }
    }//GEN-LAST:event_bibliotecaButtonActionPerformed

      private void userButtonActionPerformed(java.awt.event.ActionEvent evt) {
        EscolhaUsuario log = new EscolhaUsuario(this);
        this.mudaPanel(log);
    }

    private void adminButtonActionPerformed(java.awt.event.ActionEvent evt) {
        EscolhaAdmin log = new EscolhaAdmin(this);
        this.mudaPanel(log);
    }
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraSuperiorPanel;
    private javax.swing.JButton bibliotecaButton;
    private javax.swing.JButton carrinhoButton;
    private javax.swing.JPanel fundoPanel;
    private javax.swing.JButton fundosButton;
    private javax.swing.JButton iniciarSessaoButton;
    private javax.swing.JButton lojaButton;
    private javax.swing.JLabel steamLabel;
    private javax.swing.JPanel template;
    // End of variables declaration//GEN-END:variables
}
