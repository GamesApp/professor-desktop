/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package professor.swing;

import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author gabrieli
 */
public class NovaTurmaSwing extends javax.swing.JFrame {

    /**
     * Creates new form NovaTurma
     */
    public NovaTurmaSwing() {
        initComponents();
        
        setSize(700,500);
        setLocationRelativeTo(null);
    }

   /*"nome":"",
	"ano_inicio":"",
	"curso":"",
	"pontos":"",
	"cor":"",
	"alunos":[
		"12039123",
		"12301923",
		"20310923",
		"12310239"
	]*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLbNomeTurma = new javax.swing.JLabel();
        jTFNomeTurma = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTFAnoInicialTurma = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTFPontuacaoTurma = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFCorTurma = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListaAlunosTurma = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTFMatriculaAluno = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jBSalvar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(253, 252, 251));

        jLabel15.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vintequatro/school.png"))); // NOI18N
        jLabel15.setText("Nova Turma");

        jLbNomeTurma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vintequatro/format-annotation-plus.png"))); // NOI18N
        jLbNomeTurma.setText("Nome: ");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vintequatro/calendar-check.png"))); // NOI18N
        jLabel2.setText("Ano Inicial:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vintequatro/school.png"))); // NOI18N
        jLabel1.setText("Curso:");

        jComboBox1.setBackground(new java.awt.Color(254, 254, 254));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Informática", "Refrigeração e Climatização" }));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vintequatro/trophy-variant.png"))); // NOI18N
        jLabel3.setText("Pontuação: ");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vintequatro/slack.png"))); // NOI18N
        jLabel4.setText("Cor da turma: ");

        jListaAlunosTurma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListaAlunosTurmaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListaAlunosTurma);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vintequatro/emoticon-cool.png"))); // NOI18N
        jLabel5.setText("Alunos:");

        jLabel6.setText("Inserir alunos na turma:");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vintequatro/account-card-details.png"))); // NOI18N
        jLabel7.setText("Matrícula: ");

        jButton1.setBackground(new java.awt.Color(1, 1, 1));
        jButton1.setForeground(new java.awt.Color(254, 242, 242));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vintequatro/send.png"))); // NOI18N
        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jBSalvar.setBackground(new java.awt.Color(1, 1, 1));
        jBSalvar.setForeground(new java.awt.Color(255, 250, 250));
        jBSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vintequatro/content-save.png"))); // NOI18N
        jBSalvar.setText("Salvar");
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });

        jBCancelar.setBackground(new java.awt.Color(1, 1, 1));
        jBCancelar.setForeground(new java.awt.Color(255, 250, 250));
        jBCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vintequatro/delete.png"))); // NOI18N
        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jBExcluir.setBackground(new java.awt.Color(1, 1, 1));
        jBExcluir.setForeground(new java.awt.Color(254, 247, 247));
        jBExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vintequatro/delete.png"))); // NOI18N
        jBExcluir.setText("Excluir");
        jBExcluir.setPreferredSize(new java.awt.Dimension(87, 28));
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLbNomeTurma))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTFAnoInicialTurma, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFNomeTurma, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFMatriculaAluno)
                            .addComponent(jTFCorTurma)
                            .addComponent(jTFPontuacaoTurma)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addComponent(jBExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel15)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jBExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLbNomeTurma)
                            .addComponent(jTFNomeTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTFAnoInicialTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTFPontuacaoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTFCorTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTFMatriculaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    DefaultListModel listaAlunos = new DefaultListModel();
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String mat = jTFMatriculaAluno.getText();
        
        //Lista de alunos 
        
        listaAlunos.addElement(mat);
        jListaAlunosTurma.setModel(listaAlunos);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jListaAlunosTurmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListaAlunosTurmaMouseClicked
        // TODO add your handling code here:
        //clique da lista
        
        // int linhaSelecionada = jListaAlunosTurma.getSelectedIndex();//pegar a linha selecionada
        
        String mat = jListaAlunosTurma.getSelectedValue();
        jTFMatriculaAluno.setText(mat);
        
        
    }//GEN-LAST:event_jListaAlunosTurmaMouseClicked

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        // TODO add your handling code here:
        int[] selecionados = jListaAlunosTurma.getSelectedIndices();
        int tamanho = selecionados.length-1;
        for(int i = tamanho; i >= 0; i--) {
            listaAlunos.remove(selecionados[i]);
        }
       
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
        ArrayList<String> lista = new ArrayList<>();
        int tamanho = jListaAlunosTurma.getModel().getSize();
        
        for (int i = 0; i < tamanho; i++) {
            lista.add(jListaAlunosTurma.getModel().getElementAt(i));
        }
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        
    }//GEN-LAST:event_jBSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(NovaTurmaSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovaTurmaSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovaTurmaSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovaTurmaSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovaTurmaSwing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLbNomeTurma;
    private javax.swing.JList<String> jListaAlunosTurma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFAnoInicialTurma;
    private javax.swing.JTextField jTFCorTurma;
    private javax.swing.JTextField jTFMatriculaAluno;
    private javax.swing.JTextField jTFNomeTurma;
    private javax.swing.JTextField jTFPontuacaoTurma;
    // End of variables declaration//GEN-END:variables
}
