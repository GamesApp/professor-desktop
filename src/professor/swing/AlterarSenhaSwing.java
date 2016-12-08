/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package professor.swing;

import Criptografia.CodCifraDeVigenere;
import Criptografia.ExemploCriptografia;
import conexaodb.RequisicaoHttp;
import entidades.pessoa.Professor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author gabrieli
 */
public class AlterarSenhaSwing extends javax.swing.JFrame {

    Professor professor;
    
    public AlterarSenhaSwing(Professor professor) {
        initComponents();
        
        this.professor = professor;
        
        setSize(700,500);
        setLocationRelativeTo(null);
        
        jPFSenhaAtualProfessor.setText("");
        jPFNovaSenhaProfessor.setText("");
        jPFConfirmaNovaSenhaProfessor.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPFNovaSenhaProfessor = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jPFConfirmaNovaSenhaProfessor = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLbInfo = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jBSalvarNovaSenha = new javax.swing.JButton();
        jPFSenhaAtualProfessor = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vintequatro/settings.png"))); // NOI18N
        jLabel3.setText("Alterar senha: ");

        jPFNovaSenhaProfessor.setText("jPasswordField1");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(133, 130, 130));
        jLabel4.setText("Nova senha: ");

        jPFConfirmaNovaSenhaProfessor.setText("jPasswordField1");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(133, 130, 130));
        jLabel5.setText("Digite a senha atual:  ");

        jLabel10.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(133, 130, 130));
        jLabel10.setText("Repita a nova senha: ");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gamesapp/logo_escrita_250_86.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/trintaseis/num1-ver (2).png"))); // NOI18N

        jLbInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vintequatro/comment-question-outline (1).png"))); // NOI18N
        jLbInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbInfoMouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/trintaseis/num2-ver.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/trintaseis/num3-ver.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/trintaseis/num4-cinza.png"))); // NOI18N

        jBSalvarNovaSenha.setBackground(new java.awt.Color(12, 12, 4));
        jBSalvarNovaSenha.setForeground(new java.awt.Color(248, 241, 241));
        jBSalvarNovaSenha.setText("Salvar");
        jBSalvarNovaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarNovaSenhaActionPerformed(evt);
            }
        });

        jPFSenhaAtualProfessor.setText("jPasswordField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel6)
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel7)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel8)
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel9))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel3))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(jLabel5))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(jLabel10))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(jPFConfirmaNovaSenhaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(jBSalvarNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPFSenhaAtualProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                            .addComponent(jPFNovaSenhaProfessor))
                        .addGap(3, 3, 3)
                        .addComponent(jLbInfo))
                    .addComponent(jLabel4)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9))
                .addGap(43, 43, 43)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addComponent(jLabel5)
                .addGap(5, 5, 5)
                .addComponent(jPFSenhaAtualProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPFNovaSenhaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbInfo))
                .addGap(6, 6, 6)
                .addComponent(jLabel10)
                .addGap(6, 6, 6)
                .addComponent(jPFConfirmaNovaSenhaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jBSalvarNovaSenha))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLbInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbInfoMouseClicked
        
        JOptionPane.showMessageDialog(null, "Por favor, sua senha não deverá conter acentos! \nDica: utilize letras maiúsculas, minúsculas, números e caracteres especiais.\nIsso irá garantir uma maior segurança de suas senhas!" );
        
    }//GEN-LAST:event_jLbInfoMouseClicked

    private void jBSalvarNovaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarNovaSenhaActionPerformed
        String senhaAtual = String.valueOf(jPFSenhaAtualProfessor.getPassword());
       
        //cifra senha atual informada
        ExemploCriptografia criptografarSenhaInformada = new ExemploCriptografia();
        String SenhaCriptografada = criptografarSenhaInformada.GeraCriptografia(senhaAtual, 1);
        
        if (SenhaCriptografada.equals(professor.getSenha())) {//pegar senha no banco do respectivo professor
            if (String.valueOf(jPFNovaSenhaProfessor.getPassword()).equals(String.valueOf(jPFConfirmaNovaSenhaProfessor.getPassword()))) {
                String novaSenha = String.valueOf(jPFNovaSenhaProfessor.getPassword());
                
                ExemploCriptografia ex = new ExemploCriptografia();
                String NovaSenhaCriptografada = ex.GeraCriptografia(novaSenha, 1);
                
                professor.setSenha(NovaSenhaCriptografada);
                try {
                    //Alterar no banco
                    new RequisicaoHttp().updateProfessor(professor);
                } catch (Exception ex1) {
                    Logger.getLogger(AlterarSenhaSwing.class.getName()).log(Level.SEVERE, null, ex1);
                }
                jPFSenhaAtualProfessor.setText("");
                jPFNovaSenhaProfessor.setText("");
                jPFConfirmaNovaSenhaProfessor.setText("");
                JOptionPane.showMessageDialog(null, "Alteração de senha realizada com sucesso!", "Alteração de senha", JOptionPane.PLAIN_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Os campos de nova senha não coincidem!");
                jPFNovaSenhaProfessor.setText("");
                jPFConfirmaNovaSenhaProfessor.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Senha atual errada!");
        }
       
       
    }//GEN-LAST:event_jBSalvarNovaSenhaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalvarNovaSenha;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLbInfo;
    private javax.swing.JPasswordField jPFConfirmaNovaSenhaProfessor;
    private javax.swing.JPasswordField jPFNovaSenhaProfessor;
    private javax.swing.JPasswordField jPFSenhaAtualProfessor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
