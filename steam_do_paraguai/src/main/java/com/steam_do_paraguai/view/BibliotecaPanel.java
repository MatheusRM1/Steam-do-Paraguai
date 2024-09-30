/*
Nome: Lukas Freitas de Carvalho - Matrícula: 202376033
Nome: Matheus Ribeiro Menezes - Matrícula: 202376023
Nome: João Víctor Nicácio Silva - Matrícula: 202365565C
*/
package com.steam_do_paraguai.view;
        
import com.steam_do_paraguai.model.Jogo;

import com.steam_do_paraguai.model.Usuario;
import java.util.List;
import javax.swing.DefaultListModel;

public class BibliotecaPanel extends javax.swing.JPanel {
    private MenuPrincipal tela;
    
    public BibliotecaPanel(MenuPrincipal tela) {
        this.tela = tela;
        initComponents();
        this.carregaJogos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        libraryDescriptionPanel = new javax.swing.JPanel();
        gameName = new javax.swing.JLabel();
        gameDescription = new javax.swing.JLabel();
        gamePrice = new javax.swing.JLabel();
        gamesListLibrary = new javax.swing.JScrollPane();
        DefaultListModel<Jogo> model = new DefaultListModel<>();
        gamesList = new javax.swing.JList<>(model);
        librarySearchField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(61, 122, 155));
        setMaximumSize(new java.awt.Dimension(708, 368));
        setMinimumSize(new java.awt.Dimension(708, 368));
        setPreferredSize(new java.awt.Dimension(708, 368));

        gameName.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N

        gameDescription.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        gameDescription.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gameDescription.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        gamePrice.setFont(new java.awt.Font("Source Sans Pro", 0, 36)); // NOI18N
        gamePrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout libraryDescriptionPanelLayout = new javax.swing.GroupLayout(libraryDescriptionPanel);
        libraryDescriptionPanel.setLayout(libraryDescriptionPanelLayout);
        libraryDescriptionPanelLayout.setHorizontalGroup(
            libraryDescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(libraryDescriptionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(libraryDescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gameName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(libraryDescriptionPanelLayout.createSequentialGroup()
                        .addComponent(gameDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(libraryDescriptionPanelLayout.createSequentialGroup()
                        .addComponent(gamePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 242, Short.MAX_VALUE))))
        );
        libraryDescriptionPanelLayout.setVerticalGroup(
            libraryDescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(libraryDescriptionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gameName, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gamePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gameDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        gamesList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gamesListMouseClicked(evt);
            }
        });
        gamesListLibrary.setViewportView(gamesList);

        librarySearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                librarySearchFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gamesListLibrary, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(librarySearchField, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(libraryDescriptionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(librarySearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gamesListLibrary, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(libraryDescriptionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5)))
                .addGap(11, 11, 11))
        );
    }// </editor-fold>//GEN-END:initComponents
    /***
     * Permite o filtro de busca dos jogos atraves do campo de pesquisa
     * @param games
     * @param searchGame 
     */
    private void searchFilter(DefaultListModel<Jogo> games,String searchGame)
    {
        DefaultListModel<Jogo> modelNew = new DefaultListModel<Jogo>();
        for(int i = 0; i<games.size(); i+=1)
            {
                if(games.get(i).getNome().toLowerCase().contains(searchGame.toLowerCase()))
                {
                    modelNew.addElement(games.get(i));
                }
            }
        gamesList.setModel(modelNew);
    }

    /***
     * Faz com que a cada tecla digitada seja feita uma nova lista com os jogos que contem aquela letra
     * @param evt 
     */
    private void librarySearchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_librarySearchFieldKeyReleased
        this.searchFilter(this.listaJogos(),this.librarySearchField.getText());
    }//GEN-LAST:event_librarySearchFieldKeyReleased

    private void gamesListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gamesListMouseClicked
        if(this.gamesList.getSelectedValue() != null)
        {
            
            this.gameName.setText(this.gamesList.getSelectedValue().getNome());
            this.gameDescription.setText(this.gamesList.getSelectedValue().getDescricao());
            String preco = String.format("%.2f", this.gamesList.getSelectedValue().getPreco());
            this.gamePrice.setText("R$ " + preco.replaceAll("[.]", ","));
        }
    }//GEN-LAST:event_gamesListMouseClicked

    private DefaultListModel<Jogo> listaJogos()
    {
        DefaultListModel<Jogo> jogosModel= new DefaultListModel<Jogo>();
        List<Jogo> jogos = ((Usuario)this.tela.getUsuario()).getJogos();
        if(jogos.size()>0)
        {
            
            for(Jogo game: jogos)
            {
                  jogosModel.addElement(game);
            }
        }
        return jogosModel;
    }
    
   public void carregaJogos()
    {
            this.gamesList.setModel(this.listaJogos());
    }
   
   
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gameDescription;
    private javax.swing.JLabel gameName;
    private javax.swing.JLabel gamePrice;
    private javax.swing.JList<Jogo> gamesList;
    private javax.swing.JScrollPane gamesListLibrary;
    private javax.swing.JPanel libraryDescriptionPanel;
    private javax.swing.JTextField librarySearchField;
    // End of variables declaration//GEN-END:variables
}
