package poo.trabalho.view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import poo.trabalho.controller.ControleCliente;
import poo.trabalho.model.Cliente;

public class ListarCliente extends javax.swing.JFrame {

    ControleCliente controleCliente = new ControleCliente();

    /**
     * Creates new form ListarCliente
     */
    public ListarCliente() {
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

        painelTabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCliente = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        tituloPesquisarCliente = new javax.swing.JLabel();
        campoPesquisar = new javax.swing.JTextField();
        botaoPesquisar = new javax.swing.JButton();
        imgFundoPesquisarCliente = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        botaoRemover = new javax.swing.JButton();
        botaoAlterar = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pesquisa de Clientes");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        painelTabela.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Cliente", "Nome", "Telefone", "E-mail"
            }
        ));
        jScrollPane1.setViewportView(tabelaCliente);

        painelTabela.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 150));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloPesquisarCliente.setFont(new java.awt.Font("ONE PIECE", 0, 30)); // NOI18N
        tituloPesquisarCliente.setForeground(new java.awt.Color(255, 255, 255));
        tituloPesquisarCliente.setText("Pesquisar Clientes Cadastrados");
        jPanel2.add(tituloPesquisarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        campoPesquisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesquisarActionPerformed(evt);
            }
        });
        campoPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoPesquisarKeyPressed(evt);
            }
        });
        jPanel2.add(campoPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 430, 40));

        botaoPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/trabalho/img/iconPesquisarverde.png"))); // NOI18N
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarActionPerformed(evt);
            }
        });
        jPanel2.add(botaoPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 40, 40));
        jPanel2.add(imgFundoPesquisarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 130));

        botaoRemover.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/trabalho/img/iconRemover.png"))); // NOI18N
        botaoRemover.setText("Remover");
        botaoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverActionPerformed(evt);
            }
        });

        botaoAlterar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/trabalho/img/iconAlterar.png"))); // NOI18N
        botaoAlterar.setText("Alterar");
        botaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarActionPerformed(evt);
            }
        });

        botaoVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/trabalho/img/iconVoltar.png"))); // NOI18N
        botaoVoltar.setText(" Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoRemover)
                .addGap(18, 18, 18)
                .addComponent(botaoAlterar)
                .addGap(18, 18, 18)
                .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoRemover)
                    .addComponent(botaoAlterar)
                    .addComponent(botaoVoltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(634, 455));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPesquisarActionPerformed

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
        int i = 0;
        System.out.println("Pesquisar por:" + campoPesquisar.getText());
        DefaultTableModel dtmCliente = (DefaultTableModel) tabelaCliente.getModel();
        for (Cliente c : controleCliente.clientelist()) {
            if (campoPesquisar.getText().equals(c.getNome())) {
                dtmCliente = (DefaultTableModel) tabelaCliente.getModel();
                dtmCliente.setNumRows(0);
                Object[] dados = {c.getIdCliente(), c.getNome(), c.getTelefone(), c.getEmail()};
                dtmCliente.addRow(dados);
                System.out.println("Clinete encontrado: " + c.getNome());
                i++;
            }
            System.out.println(c.getIdCliente() + c.getNome() + c.getTelefone() + c.getEmail());
        }
        if (i == 0) {
            System.out.println("Cliente nao encontrado");
            JOptionPane.showMessageDialog(this, " Cliente não encontrado!");
            campoPesquisar.requestFocus();
        }


    }//GEN-LAST:event_botaoPesquisarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        campoPesquisar.requestFocus();

        DefaultTableModel dtmCliente = (DefaultTableModel) tabelaCliente.getModel();

        controleCliente.mostrarCliente();

        for (Cliente c : controleCliente.clientelist()) {
            System.out.println(c.getIdCliente() + c.getNome() + c.getTelefone() + c.getEmail());
            Object[] dados = {c.getIdCliente(), c.getNome(), c.getTelefone(), c.getEmail()};
            dtmCliente.addRow(dados);
        }

    }//GEN-LAST:event_formWindowOpened

    private void botaoRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverActionPerformed

        if (tabelaCliente.getSelectedRow() == -1) {
            System.out.println("Selecione uma linha para deletar");
            JOptionPane.showMessageDialog(this, " Selecione uma linha para deletar! ");
        } else {

            controleCliente.clientelist().remove(tabelaCliente.getSelectedRow());

            System.out.println("idClienteRemove " + tabelaCliente.getSelectedRow());

            ((DefaultTableModel) tabelaCliente.getModel()).removeRow(tabelaCliente.getSelectedRow());

            controleCliente.clientelist().forEach((c) -> {
                System.out.println(c);
            });
        }


    }//GEN-LAST:event_botaoRemoverActionPerformed

    private void botaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarActionPerformed
        //aqui chama o cadastrar cliente com os dados do cliente selecionado para editar os dados

        if (tabelaCliente.getSelectedRow() == -1) {
            System.out.println("Selecione uma linha para alterar");
            JOptionPane.showMessageDialog(this, " Selecione uma linha para alterar! ");
        } else {

            CadastrarCliente cadastro = new CadastrarCliente();

            System.out.println("id Cliente Alterar " + tabelaCliente.getSelectedRow());

            cadastro.setVisible(true);//para cod do cliente
            dispose();
            System.out.println("lista " + controleCliente.clientelist().get(tabelaCliente.getSelectedRow()).getNome());

            cadastro.setCampoNomeCliente(controleCliente.clientelist().get(tabelaCliente.getSelectedRow()).getNome());
            cadastro.setCampoEnderecoCliente(controleCliente.clientelist().get(tabelaCliente.getSelectedRow()).getEndereco());
            cadastro.setCampoBairroCliente(controleCliente.clientelist().get(tabelaCliente.getSelectedRow()).getBairro());
            cadastro.setCampoCidadeCliente(controleCliente.clientelist().get(tabelaCliente.getSelectedRow()).getCidade());
            cadastro.setCampoCEP(controleCliente.clientelist().get(tabelaCliente.getSelectedRow()).getCep());
            cadastro.setCampoCelular(controleCliente.clientelist().get(tabelaCliente.getSelectedRow()).getCelular());
            cadastro.setCampoTelefone(controleCliente.clientelist().get(tabelaCliente.getSelectedRow()).getTelefone());
            cadastro.setCampoEmail(controleCliente.clientelist().get(tabelaCliente.getSelectedRow()).getEmail());
            cadastro.setIdCliente(controleCliente.clientelist().get(tabelaCliente.getSelectedRow()).getIdCliente());
            cadastro.setDataNascimentoCliente(controleCliente.clientelist().get(tabelaCliente.getSelectedRow()).getDataNascimento());
            cadastro.setDataCadastroCliente(controleCliente.clientelist().get(tabelaCliente.getSelectedRow()).getDataCadastro());
            cadastro.setNomeBotaoCadastrar();
            controleCliente.clientelist().remove(tabelaCliente.getSelectedRow());

            System.out.println("idClienteRemove " + tabelaCliente.getSelectedRow());

            ((DefaultTableModel) tabelaCliente.getModel()).removeRow(tabelaCliente.getSelectedRow());
            DefaultTableModel dtmCliente = (DefaultTableModel) tabelaCliente.getModel();
            for (Cliente c : controleCliente.clientelist()) {
                System.out.println(c.getIdCliente() + c.getNome() + c.getTelefone() + c.getEmail());
                Object[] dados = {c.getIdCliente(), c.getNome(), c.getTelefone(), c.getEmail()};
                dtmCliente.addRow(dados);
            }
        }
    }//GEN-LAST:event_botaoAlterarActionPerformed

    private void campoPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPesquisarKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            botaoPesquisar.doClick();
        }
    }//GEN-LAST:event_campoPesquisarKeyPressed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        dispose();
        new Principal().setVisible(true);
    }//GEN-LAST:event_botaoVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(ListarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAlterar;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField campoPesquisar;
    private javax.swing.JLabel imgFundoPesquisarCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelTabela;
    private javax.swing.JTable tabelaCliente;
    private javax.swing.JLabel tituloPesquisarCliente;
    // End of variables declaration//GEN-END:variables
}
