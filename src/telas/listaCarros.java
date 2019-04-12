/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import dao.CarroDao;
import dao.ClienteDao;
import dao.LocacaoDao;
import entidades.Carro;
import entidades.Locacao;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aNDERSON
 */
public class listaCarros extends javax.swing.JDialog {

    /**
     * Creates new form listaClientes
     */
    public listaCarros(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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
        tableCarros = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Carros");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                AoAbrirTela(evt);
            }
        });

        tableCarros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Marca", "Chassi", "Placa", "Kilometragem", "Status", "Valor Locação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableCarros);
        if (tableCarros.getColumnModel().getColumnCount() > 0) {
            tableCarros.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton7.setText("Alterar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton5.setText("Excluir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton11.setText("Novo");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(627, Short.MAX_VALUE)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton11)
                    .addComponent(jButton7))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 936, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        if (tableCarros.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Nenhum Registro Selecionado na Tabela");
            return;
        }
        Carro c = new Carro();
        c.setID((String) tableCarros.getValueAt(tableCarros.getSelectedRow(), 0));
        c.setNome((String) tableCarros.getValueAt(tableCarros.getSelectedRow(), 1));
        c.setMarca((String) tableCarros.getValueAt(tableCarros.getSelectedRow(), 2));
        c.setChassis((String) tableCarros.getValueAt(tableCarros.getSelectedRow(), 3));
        c.setPlaca((String) tableCarros.getValueAt(tableCarros.getSelectedRow(), 4));
        c.setKilometragem((String) tableCarros.getValueAt(tableCarros.getSelectedRow(), 5));
        c.setStatus((String) tableCarros.getValueAt(tableCarros.getSelectedRow(), 6));
        c.setValorLocacao((String) tableCarros.getValueAt(tableCarros.getSelectedRow(), 7));

        cadastroCarros cad = new cadastroCarros(null, rootPaneCheckingEnabled, c);
        cad.setVisible(true);
        try {
            preencheTabela();
        } catch (IOException ex) {
            Logger.getLogger(listaLocacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:    
        cadastroCarros cad = new cadastroCarros(null, rootPaneCheckingEnabled);
        cad.setVisible(true);
        try {
            preencheTabela();
        } catch (IOException ex) {
            Logger.getLogger(listaCarros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void AoAbrirTela(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_AoAbrirTela
        try {
            // TODO add your handling code here:
            preencheTabela();
        } catch (IOException ex) {
            Logger.getLogger(listaCarros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AoAbrirTela

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        if (tableCarros.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Nenhum Registro Selecionado na Tabela");
            return;
        }
        DefaultTableModel modelo = (DefaultTableModel) tableCarros.getModel();
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Deseja Excluir o Registro Selecionado?", "Atencao!", dialogButton);
        if (dialogResult == 0) {
            //sim                       
            String data = (String) tableCarros.getValueAt(tableCarros.getSelectedRow(), 0);
            int id = Integer.parseInt(data);
            CarroDao dao = new CarroDao();
            try {
                if (dao.Deletar(id)) {
                    JOptionPane.showMessageDialog(null, "Registro removido com Sucesso!", "Atencao", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (IOException ex) {
                Logger.getLogger(listaLocacao.class.getName()).log(Level.SEVERE, null, ex);
            }
            modelo.removeRow(tableCarros.getSelectedRow());
        } else {

        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void preencheTabela() throws IOException {
        DefaultTableModel modelo = (DefaultTableModel) tableCarros.getModel();
        modelo.setNumRows(0);
        CarroDao dao = new CarroDao();
        for (Carro c : dao.ListarTodos()) {
            modelo.addRow(new String[]{
                "" + c.getID(),
                c.getNome(),
                c.getMarca(),
                c.getChassis(),
                c.getPlaca(),
                c.getKilometragem(),
                c.getStatus(),
                c.getValorLocacao()
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCarros;
    // End of variables declaration//GEN-END:variables
}