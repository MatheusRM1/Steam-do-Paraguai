/*
Nome: Lukas Freitas de Carvalho - Matrícula: 202376033
Nome: Matheus Ribeiro Menezes - Matrícula: 202376023
Nome: João Víctor Nicácio Silva - Matrícula: 202365565C
*/
package com.steam_do_paraguai.view;

import com.steam_do_paraguai.exception.JogoException;
import com.steam_do_paraguai.model.Admin;
import com.steam_do_paraguai.model.Jogo;
import com.steam_do_paraguai.model.Usuario;
import com.steam_do_paraguai.persistence.JogoPersistence;
import com.steam_do_paraguai.persistence.Persistence;
import com.steam_do_paraguai.persistence.UsuarioPersistence;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class LojaPanel extends javax.swing.JPanel {

    private MenuPrincipal tela;
    private Persistence<Usuario> usuarioPersistence;
    private List<Usuario> lista;
    private List<Jogo> listaJogos;
    private Persistence<Jogo> jogoPersistence;

    
    public LojaPanel(MenuPrincipal t) {
        this.tela = t;

        listaJogos = new ArrayList<>();
        jogoPersistence = new JogoPersistence();
        listaJogos = jogoPersistence.findAll();
        usuarioPersistence = new UsuarioPersistence();
        lista = usuarioPersistence.findAll();
        initComponents();
        if (this.tela.getUsuario() instanceof Admin) {
            this.addToCartButton.setVisible(false);
            carregaJogos();
        } else {
            this.addToCartButton.setVisible(true);
            carregaJogos();
        }
    }

    private void carregaJogos() {

        DefaultTableModel model = (DefaultTableModel) shopTableGames.getModel();

        for (Jogo p : this.listaJogos) {
            model.addRow(new Object[]{
                p.getNome(),
                p.getDescricao(),
                p.getPreco(),});
        }
    }
    
    /***
     * Adiciona os jogos à tabela
     * @return 
     */
    private DefaultTableModel modelListaJogos() {
        DefaultTableModel jogosModel = new DefaultTableModel(new String[]{"Nome", "Gênero", "Preço"}, 0);

        if (listaJogos.size() > 0) {
            for (Jogo game : listaJogos) {
                Object[] row = {game.getNome(), game.getDescricao(), game.getPreco()};
                jogosModel.addRow(row);
            }
        }

        return jogosModel;
    }
    /***
     * Permite a procura dos jogos atraves do text field como uma barra de pesquisa
     * @param gamesModel
     * @param searchGame 
     */
    private void searchFilter(DefaultTableModel gamesModel, String searchGame) {
        DefaultTableModel modelNew = new DefaultTableModel(new String[]{"Nome", "Gênero", "Preço"}, 0);

        for (int i = 0; i < gamesModel.getRowCount(); i++) {
            String gameName = gamesModel.getValueAt(i, 0).toString().toLowerCase();

            if (gameName.contains(searchGame.toLowerCase())) {
                Object[] row = {
                    gamesModel.getValueAt(i, 0),
                    gamesModel.getValueAt(i, 1),
                    gamesModel.getValueAt(i, 2)
                };
                modelNew.addRow(row);
            }
        }

        shopTableGames.setModel(modelNew);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        shopTable = new javax.swing.JScrollPane();
        shopTableGames = new javax.swing.JTable();
        searchShopField = new javax.swing.JTextField();
        addToCartButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(61, 122, 155));
        setMaximumSize(new java.awt.Dimension(708, 368));
        setMinimumSize(new java.awt.Dimension(708, 368));
        setPreferredSize(new java.awt.Dimension(708, 368));

        shopTable.setBorder(null);
        shopTable.setForeground(new java.awt.Color(40, 40, 40));

        shopTableGames.setForeground(new java.awt.Color(40, 40, 40));
        shopTableGames.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Descrição", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        shopTableGames.setGridColor(new java.awt.Color(40, 40, 40));
        shopTableGames.setMaximumSize(new java.awt.Dimension(696, 240));
        shopTableGames.setMinimumSize(new java.awt.Dimension(696, 240));
        shopTableGames.setOpaque(false);
        shopTableGames.setSelectionBackground(new java.awt.Color(40, 40, 40));
        shopTableGames.setSelectionForeground(new java.awt.Color(255, 255, 255));
        shopTableGames.getTableHeader().setReorderingAllowed(false);
        shopTable.setViewportView(shopTableGames);
        if (shopTableGames.getColumnModel().getColumnCount() > 0) {
            shopTableGames.getColumnModel().getColumn(0).setResizable(false);
            shopTableGames.getColumnModel().getColumn(1).setResizable(false);
            shopTableGames.getColumnModel().getColumn(2).setResizable(false);
        }

        searchShopField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchShopFieldKeyReleased(evt);
            }
        });

        addToCartButton.setText("Adicionar ao Carrinho");
        addToCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(searchShopField, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(181, 181, 181))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(addToCartButton)
                        .addContainerGap())))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(shopTable, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchShopField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 256, Short.MAX_VALUE)
                .addComponent(addToCartButton)
                .addGap(34, 34, 34))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addComponent(shopTable, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(72, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addToCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartButtonActionPerformed
        int indexRow = this.shopTableGames.getSelectedRow();
        if (indexRow != -1) {
            Jogo jogo = this.listaJogos.get(indexRow);
            if (!verificaJogosUsuario(jogo)) {
                if (!verificaCarrinhoUsuario(jogo)) {
                    ((Usuario) this.tela.getUsuario()).getCarrinho().adicionaJogo(jogo);
                    int indice = this.indiceUser();
                    if (indice != -1) {
                        this.lista.get(this.indiceUser()).getCarrinho().adicionaJogo(jogo);
                    }
                    usuarioPersistence.save(lista);
                    JOptionPane.showMessageDialog(null, "Jogo adicionado ao carrinho!");
                } else {
                    JOptionPane.showMessageDialog(null, "O jogo já está no seu carrinho!");
                }

            } else {
                JOptionPane.showMessageDialog(null, "O jogo já está presente na sua conta!");
            }

        }
    }//GEN-LAST:event_addToCartButtonActionPerformed

    /***
     * Faz com que a aplicaçao do filtro de busca seja feita para cada tecla que o usario digitar
     * @param evt 
     */
    private void searchShopFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchShopFieldKeyReleased
        this.searchFilter(this.modelListaJogos(),this.searchShopField.getText());
    }//GEN-LAST:event_searchShopFieldKeyReleased

    /***
     * Pega o indice do usuario atual dentro da lista no persistence de usuarios
     * @return 
     */
    private int indiceUser() {
        for (int i = 0; i < this.lista.size(); i += 1) {
            if (this.tela.getUsuario().getNome().equals(this.lista.get(i).getNome())) {
                return i;
            }
        }
        return -1;
    }
    /***
     * Verifica se o jogo passado esta na conta do usuario
     * @param jogo
     * @return 
     */
    private boolean verificaJogosUsuario(Jogo jogo) {
        List<Jogo> jogos = ((Usuario) this.tela.getUsuario()).getJogos();
        
        for (int i = 0; i < jogos.size(); i += 1) {
            if (jogos.get(i).getNome().toLowerCase().equals(jogo.getNome().toLowerCase())) {
                return true;
            }
        }
        return false;
    }
    
    /***
     * Verifica se o jogo ja esta no carrinho do usuario
     * @param jogo
     * @return 
     */
    private boolean verificaCarrinhoUsuario(Jogo jogo) {
        List<Jogo> jogos = ((Usuario) this.tela.getUsuario()).getCarrinho().getJogos();
        for (int i = 0; i < jogos.size(); i += 1) {
            if (jogos.get(i).getNome().toLowerCase().equals(jogo.getNome().toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCartButton;
    private javax.swing.JTextField searchShopField;
    private javax.swing.JScrollPane shopTable;
    private javax.swing.JTable shopTableGames;
    // End of variables declaration//GEN-END:variables
}
