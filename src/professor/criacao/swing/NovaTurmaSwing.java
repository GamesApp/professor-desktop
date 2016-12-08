/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package professor.criacao.swing;

import conexaodb.RequisicaoHttp;
import entidades.turma.Turma;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author gabrieli
 */
public class NovaTurmaSwing extends javax.swing.JFrame {
 
        public NovaTurmaSwing() {
        initComponents();
        
        setSize(700,500);
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLBNovaTurma = new javax.swing.JLabel();
        jLbNomeTurma = new javax.swing.JLabel();
        jTFNomeTurma = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jCBCursoTurma = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTFPontuacaoTurma = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListaAlunosTurma = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTFMatriculaAluno = new javax.swing.JTextField();
        jBSalvarTurma = new javax.swing.JButton();
        jBCancelarTurma = new javax.swing.JButton();
        jYCAnoInicialTurma = new com.toedter.calendar.JYearChooser();
        jLExcluirAluno = new javax.swing.JLabel();
        jLEnviarMatAluno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(253, 252, 251));

        jLBNovaTurma.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLBNovaTurma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLBNovaTurma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vintequatro/school.png"))); // NOI18N
        jLBNovaTurma.setText("Nova Turma");

        jLbNomeTurma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vintequatro/format-annotation-plus.png"))); // NOI18N
        jLbNomeTurma.setText("Nome: ");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vintequatro/calendar-check.png"))); // NOI18N
        jLabel2.setText("Ano Inicial:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vintequatro/school.png"))); // NOI18N
        jLabel1.setText("Curso:");

        jCBCursoTurma.setBackground(new java.awt.Color(254, 254, 254));
        jCBCursoTurma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Informatica", "Refrigeracao" }));
        jCBCursoTurma.setToolTipText("");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vintequatro/trophy-variant.png"))); // NOI18N
        jLabel3.setText("Pontuação: ");

        jTFPontuacaoTurma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFPontuacaoTurmaKeyTyped(evt);
            }
        });

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

        jTFMatriculaAluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFMatriculaAlunoKeyTyped(evt);
            }
        });

        jBSalvarTurma.setBackground(new java.awt.Color(1, 1, 1));
        jBSalvarTurma.setForeground(new java.awt.Color(255, 250, 250));
        jBSalvarTurma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vintequatro/content-save.png"))); // NOI18N
        jBSalvarTurma.setText("Salvar");
        jBSalvarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarTurmaActionPerformed(evt);
            }
        });

        jBCancelarTurma.setBackground(new java.awt.Color(1, 1, 1));
        jBCancelarTurma.setForeground(new java.awt.Color(255, 250, 250));
        jBCancelarTurma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vintequatro/delete.png"))); // NOI18N
        jBCancelarTurma.setText("Cancelar");
        jBCancelarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarTurmaActionPerformed(evt);
            }
        });

        jLExcluirAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vintequatro/delete (1).png"))); // NOI18N
        jLExcluirAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLExcluirAlunoMouseClicked(evt);
            }
        });

        jLEnviarMatAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vintequatro/send (1).png"))); // NOI18N
        jLEnviarMatAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLEnviarMatAlunoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLBNovaTurma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(55, 55, 55))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jBSalvarTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jBCancelarTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLbNomeTurma))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTFNomeTurma, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCBCursoTurma, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jYCAnoInicialTurma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(27, 27, 27)
                                .addComponent(jTFPontuacaoTurma))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addGap(37, 37, 37)
                        .addComponent(jTFMatriculaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLEnviarMatAluno))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLExcluirAluno)
                        .addContainerGap())
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLBNovaTurma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLbNomeTurma)
                                    .addComponent(jTFNomeTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jYCAnoInicialTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jCBCursoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTFPontuacaoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLEnviarMatAluno)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(jTFMatriculaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jBSalvarTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBCancelarTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLExcluirAluno)
                        .addGap(0, 0, Short.MAX_VALUE))))
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
    DefaultListModel listaAlunosModel = new DefaultListModel();
    
    private void jBCancelarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarTurmaActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Deseja cancelar o cadastro desta turma?", "Cancelar cadastro", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (resp == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_jBCancelarTurmaActionPerformed

    private void jListaAlunosTurmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListaAlunosTurmaMouseClicked
        // TODO add your handling code here:
        //clique da lista
        
        // int linhaSelecionada = jListaAlunosTurma.getSelectedIndex();//pegar a linha selecionada
        
        String mat = jListaAlunosTurma.getSelectedValue();
        jTFMatriculaAluno.setText(mat);
    }//GEN-LAST:event_jListaAlunosTurmaMouseClicked

    private void jBSalvarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarTurmaActionPerformed
        //salvar turma no banco
        
        if (!jTFNomeTurma.getText().equals("") && jYCAnoInicialTurma.getYear()!=0 && !jTFPontuacaoTurma.getText().equals("") && jCBCursoTurma.getSelectedIndex() != 0 ) {
            if (jListaAlunosTurma.getModel().getSize()!= 0) {
                //alunos inscritos
                Turma turma = new Turma();
                turma.setNome(jTFNomeTurma.getText());
                turma.setAnoInicio(jYCAnoInicialTurma.getYear());
                
                if (jCBCursoTurma.getSelectedIndex() == 1) {
                    turma.setCurso("Informatica");
                }
                else if (jCBCursoTurma.getSelectedIndex() == 2) {
                    turma.setCurso("Refrigeracao");
                }
                
                turma.setPontos(Long.parseLong(jTFPontuacaoTurma.getText()));
                
                //lista dos alunos
                ArrayList<String> listaAlunos = new ArrayList<>();
                int tamanho = jListaAlunosTurma.getModel().getSize();
        
                for (int i = 0; i < tamanho; i++) {
                    listaAlunos.add(jListaAlunosTurma.getModel().getElementAt(i));
                }
                turma.setAlunos(listaAlunos);
                
                try {
                    //salvar turma no banco
                    new RequisicaoHttp().insertTurma(turma);
                } catch (Exception ex) {
                    Logger.getLogger(NovaTurmaSwing.class.getName()).log(Level.SEVERE, null, ex);
                }
                jTFNomeTurma.setText("");
                jYCAnoInicialTurma.setYear(2016);
                jCBCursoTurma.setSelectedIndex(0);
                jTFPontuacaoTurma.setText("");
                jTFMatriculaAluno.setText("");
                //remover itens lista
                listaAlunosModel.removeAllElements();
                jListaAlunosTurma.setModel(listaAlunosModel);
                JOptionPane.showMessageDialog(null, "Nova turma cadastrada com êxito!", "Operação realizada com sucesso", JOptionPane.PLAIN_MESSAGE);
                
            }else{
                JOptionPane.showMessageDialog(null, "Favor inserir alunos na turma!", "Atenção!", JOptionPane.WARNING_MESSAGE);
            }     
        }else{
            JOptionPane.showMessageDialog(null, "Favor informar todos os campos!", "Atenção!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jBSalvarTurmaActionPerformed

    private void jTFMatriculaAlunoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFMatriculaAlunoKeyTyped
        // aceita somente numeros
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar()+"")) {
            evt.consume();
        }
    }//GEN-LAST:event_jTFMatriculaAlunoKeyTyped

    private void jLExcluirAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLExcluirAlunoMouseClicked
        // deleta mat de alunos da lista da turma
        int[] selecionados = jListaAlunosTurma.getSelectedIndices();
        int tamanho = selecionados.length-1;
        for(int i = tamanho; i >= 0; i--) {
            listaAlunosModel.remove(selecionados[i]);
        }
    }//GEN-LAST:event_jLExcluirAlunoMouseClicked

    private void jLEnviarMatAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLEnviarMatAlunoMouseClicked
        // adicionando mat na lista de alunos da turma
        String mat = jTFMatriculaAluno.getText();
        
        //Lista de alunos
        listaAlunosModel.addElement(mat);
        jListaAlunosTurma.setModel(listaAlunosModel);
        jTFMatriculaAluno.setText("");
        
    }//GEN-LAST:event_jLEnviarMatAlunoMouseClicked

    private void jTFPontuacaoTurmaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFPontuacaoTurmaKeyTyped
        String caracteres = "0987654321,.";
        if (!caracteres.contains(evt.getKeyChar()+"")) {
            evt.consume();
        }
    }//GEN-LAST:event_jTFPontuacaoTurmaKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelarTurma;
    private javax.swing.JButton jBSalvarTurma;
    private javax.swing.JComboBox<String> jCBCursoTurma;
    private javax.swing.JLabel jLBNovaTurma;
    private javax.swing.JLabel jLEnviarMatAluno;
    private javax.swing.JLabel jLExcluirAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLbNomeTurma;
    private javax.swing.JList<String> jListaAlunosTurma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFMatriculaAluno;
    private javax.swing.JTextField jTFNomeTurma;
    private javax.swing.JTextField jTFPontuacaoTurma;
    private com.toedter.calendar.JYearChooser jYCAnoInicialTurma;
    // End of variables declaration//GEN-END:variables
}
