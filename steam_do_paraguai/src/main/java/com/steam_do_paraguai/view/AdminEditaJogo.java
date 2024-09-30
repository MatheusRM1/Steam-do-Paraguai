/*
Nome: Lukas Freitas de Carvalho - Matrícula: 202376033
Nome: Matheus Ribeiro Menezes - Matrícula: 202376023
Nome: João Víctor Nicácio Silva - Matrícula: 202365565C
*/
package com.steam_do_paraguai.view;

import com.steam_do_paraguai.exception.JogoException;
import com.steam_do_paraguai.model.Jogo;
import com.steam_do_paraguai.persistence.JogoPersistence;
import com.steam_do_paraguai.persistence.Persistence;
import java.util.List;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class AdminEditaJogo extends javax.swing.JPanel {

    private MenuPrincipal tela;
    private List<Jogo> listaJogos = new ArrayList<>();
    Persistence<Jogo> jogoPersistence = new JogoPersistence();

    public AdminEditaJogo(MenuPrincipal tela) {
        this.tela = tela;

        listaJogos = jogoPersistence.findAll();

        initComponents();
        carregaJogos();
    }

    private void carregaJogos() {

        DefaultListModel<String> model = new DefaultListModel<>();

        for (Jogo jogo : this.listaJogos) {
            model.addElement(jogo.getNome());
        }

        gamesList.setModel(model);
    }

    
    private void nomeValido(String nome) throws JogoException {
        for (Jogo jogo : this.listaJogos) {
            if (jogo.getNome().equals(nome)) {
                throw new JogoException("Já existe um jogo com esse nome");
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminGamesList = new javax.swing.JScrollPane();
        gamesList = new javax.swing.JList<>();
        nomeField = new javax.swing.JTextField();
        nomeLabel = new javax.swing.JLabel();
        descricaoLabel = new javax.swing.JLabel();
        preçoLabel = new javax.swing.JLabel();
        adicionarButton = new javax.swing.JButton();
        editarButton = new javax.swing.JButton();
        removerButton = new javax.swing.JButton();
        descricaoField = new javax.swing.JTextField();
        preçoField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(61, 122, 155));
        setMaximumSize(new java.awt.Dimension(708, 368));
        setMinimumSize(new java.awt.Dimension(708, 368));
        setPreferredSize(new java.awt.Dimension(708, 368));

        gamesList.setBackground(new java.awt.Color(30, 30, 29));
        gamesList.setForeground(new java.awt.Color(255, 255, 255));
        gamesList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                gamesListMouseReleased(evt);
            }
        });
        adminGamesList.setViewportView(gamesList);

        nomeField.setBackground(new java.awt.Color(30, 30, 29));
        nomeField.setForeground(new java.awt.Color(255, 255, 255));
        nomeField.setText("Nome do Jogo");

        nomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        nomeLabel.setText("Nome:");

        descricaoLabel.setForeground(new java.awt.Color(255, 255, 255));
        descricaoLabel.setText("Descrição:");

        preçoLabel.setForeground(new java.awt.Color(255, 255, 255));
        preçoLabel.setText("Preço:");

        adicionarButton.setBackground(new java.awt.Color(30, 30, 29));
        adicionarButton.setForeground(new java.awt.Color(255, 255, 255));
        adicionarButton.setText("Adicionar");
        adicionarButton.setBorderPainted(false);
        adicionarButton.setMaximumSize(new java.awt.Dimension(110, 37));
        adicionarButton.setMinimumSize(new java.awt.Dimension(110, 37));
        adicionarButton.setPreferredSize(new java.awt.Dimension(110, 37));
        adicionarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarButtonActionPerformed(evt);
            }
        });

        editarButton.setBackground(new java.awt.Color(30, 30, 29));
        editarButton.setForeground(new java.awt.Color(255, 255, 255));
        editarButton.setText("Editar");
        editarButton.setMaximumSize(new java.awt.Dimension(110, 37));
        editarButton.setMinimumSize(new java.awt.Dimension(110, 37));
        editarButton.setPreferredSize(new java.awt.Dimension(110, 37));
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });

        removerButton.setBackground(new java.awt.Color(30, 30, 29));
        removerButton.setForeground(new java.awt.Color(255, 255, 255));
        removerButton.setText("Remover");
        removerButton.setMaximumSize(new java.awt.Dimension(110, 37));
        removerButton.setMinimumSize(new java.awt.Dimension(110, 37));
        removerButton.setPreferredSize(new java.awt.Dimension(110, 37));
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerButtonActionPerformed(evt);
            }
        });

        descricaoField.setBackground(new java.awt.Color(30, 30, 29));
        descricaoField.setForeground(new java.awt.Color(255, 255, 255));
        descricaoField.setText("Descrição do jogo");

        preçoField.setBackground(new java.awt.Color(30, 30, 29));
        preçoField.setForeground(new java.awt.Color(255, 255, 255));
        preçoField.setText("Preço do jogo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminGamesList, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 117, Short.MAX_VALUE)
                        .addComponent(removerButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adicionarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nomeField)
                    .addComponent(descricaoField)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeLabel)
                            .addComponent(descricaoLabel)
                            .addComponent(preçoLabel)
                            .addComponent(preçoField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(nomeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descricaoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descricaoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(preçoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(preçoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adicionarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removerButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(adminGamesList, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /***
     * Atualiza os campos ao clicar em algum elemento da lista
     * @param evt 
     */
    private void gamesListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gamesListMouseReleased
        if (gamesList.getSelectedIndex() != -1) {
            Jogo jogoSelecionado = listaJogos.get(gamesList.getSelectedIndex());

            nomeField.setText(jogoSelecionado.getNome());
            descricaoField.setText(jogoSelecionado.getDescricao());
            preçoField.setText(String.valueOf(jogoSelecionado.getPreco()));
        }
    }//GEN-LAST:event_gamesListMouseReleased

    private void removerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerButtonActionPerformed
        int selectedIndex = gamesList.getSelectedIndex();

        if (selectedIndex != -1) {
            listaJogos.remove(selectedIndex);
            jogoPersistence.save(listaJogos);
            carregaJogos();
            javax.swing.JOptionPane.showMessageDialog(this, "Jogo removido com sucesso!", "Sucesso", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione um jogo para remover.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_removerButtonActionPerformed

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
        int selectedIndex = gamesList.getSelectedIndex();

        if (selectedIndex != -1) {
            Jogo jogoSelecionado = listaJogos.get(selectedIndex);

            try {
                String nome = nomeField.getText();
                String descricao = descricaoField.getText();
                float preco = Float.parseFloat(preçoField.getText());

                if (nomeField.getText().equals(jogoSelecionado.getNome())) {
                    if (descricaoField.getText().equals(jogoSelecionado.getDescricao())) {
                        jogoSelecionado.setPreco(preco);
                    } else {
                        jogoSelecionado.setDescricao(descricao);
                        jogoSelecionado.setPreco(preco);
                    }
                } else {
                    jogoSelecionado.setNome(nome);
                    jogoSelecionado.setDescricao(descricao);
                    jogoSelecionado.setPreco(preco);
                }
               
                jogoPersistence.save(listaJogos);
                carregaJogos();
                javax.swing.JOptionPane.showMessageDialog(this, "Jogo atualizado com sucesso!", "Sucesso", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            } catch (JogoException e) {
                javax.swing.JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
            } catch (NumberFormatException e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Preço inválido! Por favor, insira um valor válido", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione um jogo para editar.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editarButtonActionPerformed

    private void adicionarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarButtonActionPerformed
        try {
            String nome = nomeField.getText();
            String descricao = descricaoField.getText();
            float preco = Float.parseFloat(preçoField.getText());
            this.nomeValido(nome);

            Jogo novoJogo = new Jogo();
            novoJogo.setNome(nome);
            novoJogo.setDescricao(descricao);
            novoJogo.setPreco(preco);

            listaJogos.add(novoJogo);
            jogoPersistence.save(listaJogos);
            carregaJogos();

            javax.swing.JOptionPane.showMessageDialog(this, "Jogo adicionado com sucesso!", "Sucesso", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } catch (JogoException e) {
            javax.swing.JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Preço inválido! Por favor, insira um valor válido", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_adicionarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarButton;
    private javax.swing.JScrollPane adminGamesList;
    private javax.swing.JTextField descricaoField;
    private javax.swing.JLabel descricaoLabel;
    private javax.swing.JButton editarButton;
    private javax.swing.JList<String> gamesList;
    private javax.swing.JTextField nomeField;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField preçoField;
    private javax.swing.JLabel preçoLabel;
    private javax.swing.JButton removerButton;
    // End of variables declaration//GEN-END:variables
}
