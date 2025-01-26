/*
Nome: Lukas Freitas de Carvalho - Matrícula: 202376033
Nome: Matheus Ribeiro Menezes - Matrícula: 202376023
Nome: João Víctor Nicácio Silva - Matrícula: 202365565C
*/
package com.steam_do_paraguai.view;

import com.steam_do_paraguai.exception.CupomException;
import com.steam_do_paraguai.model.Cupom;
import com.steam_do_paraguai.model.CupomFixo;
import com.steam_do_paraguai.model.CupomPorcentagem;
import com.steam_do_paraguai.persistence.CupomPersistence;
import com.steam_do_paraguai.persistence.Persistence;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class AdminEditaCupom extends javax.swing.JPanel {
    private Persistence<Cupom> cupomPersistence;
    private List<Cupom> listaCupons;
    private MenuPrincipal tela;

    public AdminEditaCupom(MenuPrincipal tela) {
        this.tela = tela;
        this.cupomPersistence = new CupomPersistence();
        this.listaCupons = cupomPersistence.findAll();
        initComponents();
        this.carregaLista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo1 = new javax.swing.ButtonGroup();
        cupomListScrollPane = new javax.swing.JScrollPane();
        cupomList = new javax.swing.JList<>();
        codigoLabel = new javax.swing.JLabel();
        codigoTextField = new javax.swing.JTextField();
        descontoLabel = new javax.swing.JLabel();
        removerButton = new javax.swing.JButton();
        editarButton = new javax.swing.JButton();
        adicionarButton = new javax.swing.JButton();
        fixoRadioButton = new javax.swing.JRadioButton();
        porcentagemRadioButton = new javax.swing.JRadioButton();
        descontoScrollPane = new javax.swing.JScrollPane();
        descontoTextPane = new javax.swing.JTextPane();

        setBackground(new java.awt.Color(61, 122, 155));
        setForeground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(708, 368));
        setMinimumSize(new java.awt.Dimension(708, 368));
        setPreferredSize(new java.awt.Dimension(708, 368));

        cupomList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cupomListMouseClicked(evt);
            }
        });
        cupomListScrollPane.setViewportView(cupomList);

        codigoLabel.setForeground(new java.awt.Color(255, 255, 255));
        codigoLabel.setText("Código no formato A000:");

        codigoTextField.setForeground(new java.awt.Color(0, 0, 0));

        descontoLabel.setForeground(new java.awt.Color(255, 255, 255));
        descontoLabel.setText("Desconto");

        removerButton.setText("Remover");
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerButtonActionPerformed(evt);
            }
        });

        editarButton.setText("Editar");
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });

        adicionarButton.setText("Adicionar");
        adicionarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarButtonActionPerformed(evt);
            }
        });

        grupo1.add(fixoRadioButton);
        fixoRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        fixoRadioButton.setText("Fixo");

        grupo1.add(porcentagemRadioButton);
        porcentagemRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        porcentagemRadioButton.setText("Porcentagem");

        descontoTextPane.setEditable(false);
        descontoTextPane.setRequestFocusEnabled(false);
        descontoScrollPane.setViewportView(descontoTextPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cupomListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 100, Short.MAX_VALUE)
                        .addComponent(removerButton)
                        .addGap(18, 18, 18)
                        .addComponent(editarButton)
                        .addGap(18, 18, 18)
                        .addComponent(adicionarButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fixoRadioButton)
                            .addComponent(codigoLabel)
                            .addComponent(porcentagemRadioButton)
                            .addComponent(descontoLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(descontoScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                .addComponent(codigoTextField, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cupomListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(codigoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(codigoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(descontoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(descontoScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(fixoRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(porcentagemRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adicionarButton)
                            .addComponent(editarButton)
                            .addComponent(removerButton))))
                .addGap(0, 62, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void carregaLista()
    {
        DefaultListModel<Cupom> model = new DefaultListModel<Cupom>();
        for(int i = 0; i<this.listaCupons.size(); i+=1)
        {
            model.addElement(this.listaCupons.get(i));
        }
        cupomList.setModel(model);
    }
    
    /***
     * Verifica se existe outro cupom com o mesmo codigo
     * @return 
     */
    private boolean verificaExistente()
    {
        for(int i = 0; i<this.listaCupons.size();i+=1)
        {
            if(this.codigoTextField.getText().toUpperCase().equals(this.listaCupons.get(i).getCodigo()))
            {
                return true;
            }
        }
        return false;
    }
    
    private void removerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerButtonActionPerformed
        if(this.cupomList.getSelectedIndex() != -1)
        {
            DefaultListModel<Cupom> model = (DefaultListModel<Cupom>)this.cupomList.getModel();
            this.listaCupons.remove(this.cupomList.getSelectedIndex());
            model.remove(this.cupomList.getSelectedIndex());
            this.cupomPersistence.save(listaCupons);
        }
        
        this.carregaLista();
    }//GEN-LAST:event_removerButtonActionPerformed

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
        if(this.cupomList.getSelectedIndex() != -1)
        {
            if(!this.verificaExistente())
            {
                
                DefaultListModel<Cupom> model = (DefaultListModel<Cupom>)this.cupomList.getModel();
                if(this.fixoRadioButton.isSelected())
                {
                    
                    try{
                        CupomFixo novoCupom = new CupomFixo(this.codigoTextField.getText());
                        this.listaCupons.remove(this.cupomList.getSelectedIndex());
                        model.remove(this.cupomList.getSelectedIndex());
                        this.listaCupons.add(novoCupom);
                        model.addElement(this.listaCupons.get(this.listaCupons.size()-1));
                        this.cupomPersistence.save(listaCupons);
                    }
                    catch(CupomException e)
                    {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                }
                else if(this.porcentagemRadioButton.isSelected())
                {
                    
                    try{
                        CupomPorcentagem novoCupom = new CupomPorcentagem(this.codigoTextField.getText());
                        this.listaCupons.remove(this.cupomList.getSelectedIndex());
                        model.remove(this.cupomList.getSelectedIndex());
                        this.listaCupons.add(novoCupom);
                        model.addElement(this.listaCupons.get(this.listaCupons.size()-1));
                        this.cupomPersistence.save(listaCupons);

                    }
                    catch(CupomException e)
                    {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                }
                this.carregaLista();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Cupom já existe!");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Selecione um cupom para editar!");
        }
             
        
            
    }//GEN-LAST:event_editarButtonActionPerformed

    private void adicionarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarButtonActionPerformed
       if(this.fixoRadioButton.isSelected())
       {
             try
             {
                  CupomFixo novoCupom = new CupomFixo(this.codigoTextField.getText());
                  if(!this.verificaExistente())
                  {
                       listaCupons.add(novoCupom);
                       cupomPersistence.save(listaCupons);
                  }
                  else
                  {
                          JOptionPane.showMessageDialog(null, "Código de cupom já existe");
                  }
             }
             catch(CupomException e)
             {
                 JOptionPane.showMessageDialog(null, e.getMessage());
             }
       }
       else if(this.porcentagemRadioButton.isSelected())
       {
            try
             {
                  CupomPorcentagem novoCupom = new CupomPorcentagem(this.codigoTextField.getText());
                  if(!this.verificaExistente())
                  {
                       listaCupons.add(novoCupom);
                       cupomPersistence.save(listaCupons);
                  }
                  else
                  {
                          JOptionPane.showMessageDialog(null, "Código de cupom já existe");
                  }
             }
             catch(CupomException e)
             {
                 JOptionPane.showMessageDialog(null, e.getMessage());
             }
       }
       this.carregaLista();
        
    }//GEN-LAST:event_adicionarButtonActionPerformed
/***
 * Atualiza os campos ao clicar na lista de cupons
 * @param evt 
 */
    private void cupomListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cupomListMouseClicked
       if(this.cupomList.getSelectedValue() != null)
       {
           this.codigoTextField.setText(this.cupomList.getSelectedValue().getCodigo());
           this.descontoTextPane.setText("" + this.cupomList.getSelectedValue().getDesconto());
           if(this.cupomList.getSelectedValue() instanceof CupomFixo)
           {
               this.descontoLabel.setText("Desconto fixo:");
               this.fixoRadioButton.setSelected(true);
               this.porcentagemRadioButton.setSelected(false);
           }
           else if(this.cupomList.getSelectedValue() instanceof CupomPorcentagem)
           {
               this.descontoLabel.setText("Desconto em porcentagem:");
               this.fixoRadioButton.setSelected(false);
               this.porcentagemRadioButton.setSelected(true);
           }
           
       }
    }//GEN-LAST:event_cupomListMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarButton;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JTextField codigoTextField;
    private javax.swing.JList<Cupom> cupomList;
    private javax.swing.JScrollPane cupomListScrollPane;
    private javax.swing.JLabel descontoLabel;
    private javax.swing.JScrollPane descontoScrollPane;
    private javax.swing.JTextPane descontoTextPane;
    private javax.swing.JButton editarButton;
    private javax.swing.JRadioButton fixoRadioButton;
    private javax.swing.ButtonGroup grupo1;
    private javax.swing.JRadioButton porcentagemRadioButton;
    private javax.swing.JButton removerButton;
    // End of variables declaration//GEN-END:variables
}
