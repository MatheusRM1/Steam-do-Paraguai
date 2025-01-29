/*
Nome: Lukas Freitas de Carvalho - Matrícula: 202376033
Nome: Matheus Ribeiro Menezes - Matrícula: 202376023
Nome: João Víctor Nicácio Silva - Matrícula: 202365565C
*/
package com.steam_do_paraguai.view;

import com.steam_do_paraguai.model.Cupom;
import com.steam_do_paraguai.model.CupomFixo;
import com.steam_do_paraguai.model.CupomPorcentagem;
import com.steam_do_paraguai.model.Jogo;
import com.steam_do_paraguai.model.Usuario;
import com.steam_do_paraguai.persistence.CupomPersistence;
import com.steam_do_paraguai.persistence.Persistence;
import com.steam_do_paraguai.persistence.UsuarioPersistence;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CarrinhoPanel extends javax.swing.JPanel {
    private MenuPrincipal tela;
    private Persistence<Usuario> usuarioPersistence;
    private List<Usuario> lista;
    private List<Cupom> cupons;
    private Persistence<Cupom> cupomPersistence;
    private float total;
    private Cupom cupomAplicado;

    public CarrinhoPanel(MenuPrincipal tela) {
    this.tela = tela;
    usuarioPersistence = new UsuarioPersistence();
    this.lista = usuarioPersistence.findAll();
    cupomPersistence = new CupomPersistence();
    this.cupons = cupomPersistence.findAll();
    
    this.total = 0;
    this.cupomAplicado = null;
    
    initComponents();
    this.carregaCarrinho();
    this.calculaTotal();
    this.exibeTotal();
    String valor = String.format("%.2f", ((Usuario) this.tela.getUsuario()).getSaldo());
    valor = valor.replaceAll("[.]",",");
    this.saldoValueLabel.setText(valor);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableCartGames = new javax.swing.JTable();
        buyButton = new javax.swing.JButton();
        totalLabel = new javax.swing.JLabel();
        saldoTextLabel = new javax.swing.JLabel();
        saldoValueLabel = new javax.swing.JLabel();
        cupomLabel = new javax.swing.JLabel();
        cupomTextField = new javax.swing.JTextField();
        validaCupomButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(61, 122, 155));
        setMaximumSize(new java.awt.Dimension(708, 368));
        setMinimumSize(new java.awt.Dimension(708, 368));
        setPreferredSize(new java.awt.Dimension(708, 368));

        tableCartGames.setModel(new javax.swing.table.DefaultTableModel(
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
        tableCartGames.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableCartGames);
        if (tableCartGames.getColumnModel().getColumnCount() > 0) {
            tableCartGames.getColumnModel().getColumn(0).setResizable(false);
            tableCartGames.getColumnModel().getColumn(1).setResizable(false);
            tableCartGames.getColumnModel().getColumn(2).setResizable(false);
        }

        buyButton.setText("Comprar");
        buyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyButtonActionPerformed(evt);
            }
        });

        totalLabel.setBackground(new java.awt.Color(30, 30, 29));
        totalLabel.setForeground(new java.awt.Color(255, 255, 255));
        totalLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        totalLabel.setText("TOTAL: R$ 0,00");

        saldoTextLabel.setForeground(new java.awt.Color(255, 255, 255));
        saldoTextLabel.setText("Saldo:   R$");

        saldoValueLabel.setForeground(new java.awt.Color(255, 255, 255));
        saldoValueLabel.setText("0,00");

        cupomLabel.setForeground(new java.awt.Color(255, 255, 255));
        cupomLabel.setText("Cupom:");

        validaCupomButton.setText("Validar Cupom");
        validaCupomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validaCupomButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(saldoTextLabel)
                                .addGap(4, 4, 4)
                                .addComponent(saldoValueLabel))
                            .addComponent(totalLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buyButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cupomLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cupomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(validaCupomButton)))
                        .addGap(11, 11, 11)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(totalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saldoTextLabel)
                            .addComponent(saldoValueLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buyButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(validaCupomButton)
                            .addComponent(cupomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cupomLabel))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyButtonActionPerformed
        compraJogos();
    }//GEN-LAST:event_buyButtonActionPerformed

    
    private void validaCupomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validaCupomButtonActionPerformed
         if(!this.cupomTextField.getText().isEmpty())
        {
            for(int i = 0; i<this.cupons.size(); i+=1)
            {
                     if(this.cupomTextField.getText().toUpperCase().equals(this.cupons.get(i).getCodigo()) && !this.cupons.get(i).getUsado())
                    {
                        this.total = this.cupons.get(i).calculaDesconto(total);
                        this.exibeTotal();
                        if(this.cupomAplicado != null)
                        {
                                this.calculaTotal();
                        }
                        if(this.cupons.get(i) instanceof CupomFixo)
                        {
                            this.cupomAplicado = (CupomFixo)this.cupons.get(i);
                            JOptionPane.showMessageDialog(null, "O cupom é válido e garante  R$" + String.format("%.2f", this.cupons.get(i).getDesconto()).replaceAll("[.]",",")+ " de desconto na sua compra!");
                        }
                        else
                        {
                            this.cupomAplicado = (CupomPorcentagem)this.cupons.get(i);
                            JOptionPane.showMessageDialog(null, "O cupom é válido e garante " + String.format("%.2f", this.cupons.get(i).getDesconto()).replaceAll("[.]",",")+ "% de desconto na sua compra!");
                        }
                        
                        return;
                }
                else if(this.cupons.get(i).getUsado()){
                    JOptionPane.showMessageDialog(null, "O cupom não pode mais ser utilizado!");
                    return;
            }
            }
        }
         JOptionPane.showMessageDialog(null, "O cupom é inválido!");
        
         
    }//GEN-LAST:event_validaCupomButtonActionPerformed

    
    private void carregaCarrinho()
    {
            List<Jogo> jogos = ((Usuario) this.tela.getUsuario()).getCarrinho().getJogos();
            
        if(jogos.size()>0)
        {
            DefaultTableModel model = (DefaultTableModel)tableCartGames.getModel();
            for(int i = 0; i<jogos.size(); i+=1)
            {
                model.addRow(new Object[]{jogos.get(i).getNome(), jogos.get(i).getDescricao(), jogos.get(i).getPreco()});
            }
        }
    }

    private void compraJogos() {
        List<Jogo> jogos =  ((Usuario) this.tela.getUsuario()).getCarrinho().getJogos();
        if(jogos.size()>0)
        {
            if(this.total<=((Usuario) this.tela.getUsuario()).getSaldo())
            {
                DefaultTableModel model = (DefaultTableModel)tableCartGames.getModel();
                ((Usuario) this.tela.getUsuario()).removeSaldo(total);
                while(jogos.size()!=0)
                {
                    ((Usuario) this.tela.getUsuario()).getJogos().add(jogos.get(0));
                    ((Usuario) this.tela.getUsuario()).getCarrinho().removeJogo(jogos.get(0));
                    model.removeRow(0);
                }
                for(int i = 0; i< lista.size(); i+=1)
                {
                    if(this.tela.getUsuario().getNome().equals(lista.get(i).getNome()))
                    {
                        lista.set(i, (Usuario) this.tela.getUsuario());
                        
                    }
                }
                this.cupomAplicado.setUsado(true);
                cupomPersistence.save(cupons);
                usuarioPersistence.save(lista);
                this.lista = usuarioPersistence.findAll();
                this.calculaTotal();
                this.exibeTotal();
                
                this.carregaCarrinho();
                String valor = String.format("%.2f", ((Usuario) this.tela.getUsuario()).getSaldo());
                valor = valor.replaceAll("[.]",",");
                this.saldoValueLabel.setText(valor);
                JOptionPane.showMessageDialog(null, "Jogo(s) adquirido(s) com sucesso");
                
            }
            else
            {
                 JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Carrinho está vazio!");
        }
        
    }
    private void calculaTotal()
    {
        
        this.total = 0;
        List<Jogo> jogos =  ((Usuario) this.tela.getUsuario()).getCarrinho().getJogos();
        if(jogos.size()>0)
        {
            for(int i = 0; i<jogos.size(); i+=1)
            {
                this.total+=jogos.get(i).getPreco();
            }
        }
        
    }
    
    private void exibeTotal()
    {
        String textLabel = this.totalLabel.getText();
        textLabel = "TOTAL: R$ " + String.format("%.2f", this.total);
        textLabel.replaceAll("[.]", ",");
        this.totalLabel.setText(textLabel);
    }
        
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buyButton;
    private javax.swing.JLabel cupomLabel;
    private javax.swing.JTextField cupomTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel saldoTextLabel;
    private javax.swing.JLabel saldoValueLabel;
    private javax.swing.JTable tableCartGames;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JButton validaCupomButton;
    // End of variables declaration//GEN-END:variables
}
