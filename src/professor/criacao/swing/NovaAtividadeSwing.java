/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package professor.criacao.swing;

import conexaodb.RequisicaoHttp;
import entidades.atividade.Atividade;
import entidades.atividade.Classificacao;
import entidades.atividade.Endereco;
import entidades.atividade.Pontuacao;
import entidades.turma.Turma;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author gabrieli
 */
public class NovaAtividadeSwing extends javax.swing.JFrame {

    ArrayList<Turma> turmas;
    ArrayList<String> idTurmas;
    
    public NovaAtividadeSwing() {
        initComponents();
        
        setSize(700,500);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTFNomeAtividade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTADescricaoAtividade = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTFLocalAtividade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTFPontuacaoPrimeiro = new javax.swing.JTextField();
        jTFPontuacaoSegundo = new javax.swing.JTextField();
        jTFPontuacaoTerceiro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jBSalvarAtividade = new javax.swing.JButton();
        jBCancelarAtividade = new javax.swing.JButton();
        jLBNovaAtividade = new javax.swing.JLabel();
        jCBTerceiroLugar = new javax.swing.JComboBox<>();
        jCBSegundoLugar = new javax.swing.JComboBox<>();
        jCBPrimeiroLugar = new javax.swing.JComboBox<>();
        jDCData = new com.toedter.calendar.JDateChooser();
        jRBEmAndamento = new javax.swing.JRadioButton();
        jRBConcluida = new javax.swing.JRadioButton();
        jTFHoraAtividade = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        jCBComplemento = new javax.swing.JComboBox<>();
        jTFLocalAtividade1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTFLocalAtividade2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nova Atividade");
        setBackground(new java.awt.Color(254, 254, 254));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 252, 250));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vintequatro/format-annotation-plus.png"))); // NOI18N
        jLabel1.setText("Nome: ");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vintequatro/format-align-left.png"))); // NOI18N
        jLabel2.setText("Descrição: ");

        jTADescricaoAtividade.setColumns(20);
        jTADescricaoAtividade.setLineWrap(true);
        jTADescricaoAtividade.setRows(5);
        jScrollPane1.setViewportView(jTADescricaoAtividade);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vintequatro/calendar-check.png"))); // NOI18N
        jLabel3.setText("Data: ");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vintequatro/clock.png"))); // NOI18N
        jLabel4.setText("Hora: ");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vintequatro/map-marker.png"))); // NOI18N
        jLabel5.setText("Rua: ");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vintequatro/trophy-variant.png"))); // NOI18N
        jLabel6.setText("Pontuação: ");

        jLabel7.setText("1°");

        jLabel8.setText("2°");

        jLabel9.setText("3°");

        jTFPontuacaoPrimeiro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFPontuacaoPrimeiroKeyTyped(evt);
            }
        });

        jTFPontuacaoSegundo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPontuacaoSegundoActionPerformed(evt);
            }
        });
        jTFPontuacaoSegundo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFPontuacaoSegundoKeyTyped(evt);
            }
        });

        jTFPontuacaoTerceiro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFPontuacaoTerceiroKeyTyped(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vintequatro/clock-alert.png"))); // NOI18N
        jLabel10.setText("Situação: ");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel11.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vintequatro/trophy-award.png"))); // NOI18N
        jLabel11.setText("Vencedores");

        jLabel12.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("1° lugar");

        jLabel13.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("2° lugar");

        jLabel14.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("3° lugar");

        jBSalvarAtividade.setBackground(new java.awt.Color(1, 1, 1));
        jBSalvarAtividade.setForeground(new java.awt.Color(254, 254, 254));
        jBSalvarAtividade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vintequatro/content-save.png"))); // NOI18N
        jBSalvarAtividade.setText("Salvar");
        jBSalvarAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarAtividadeActionPerformed(evt);
            }
        });

        jBCancelarAtividade.setBackground(new java.awt.Color(1, 1, 1));
        jBCancelarAtividade.setForeground(new java.awt.Color(254, 254, 254));
        jBCancelarAtividade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vintequatro/delete.png"))); // NOI18N
        jBCancelarAtividade.setText("Cancelar");
        jBCancelarAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarAtividadeActionPerformed(evt);
            }
        });

        jLBNovaAtividade.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLBNovaAtividade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLBNovaAtividade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vintequatro/file-outline.png"))); // NOI18N
        jLBNovaAtividade.setText("Nova Atividade");

        jCBTerceiroLugar.setBackground(new java.awt.Color(254, 252, 251));
        jCBTerceiroLugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolher..." }));

        jCBSegundoLugar.setBackground(new java.awt.Color(254, 252, 251));
        jCBSegundoLugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolher..." }));

        jCBPrimeiroLugar.setBackground(new java.awt.Color(254, 252, 251));
        jCBPrimeiroLugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolher..." }));

        buttonGroup1.add(jRBEmAndamento);
        jRBEmAndamento.setText("Em andamento");
        jRBEmAndamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRBEmAndamentoMouseClicked(evt);
            }
        });
        jRBEmAndamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBEmAndamentoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRBConcluida);
        jRBConcluida.setText("Concluída");
        jRBConcluida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRBConcluidaMouseClicked(evt);
            }
        });

        try {
            jTFHoraAtividade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vintequatro/slack.png"))); // NOI18N
        jLabel16.setText("Complemento:");

        jCBComplemento.setBackground(new java.awt.Color(254, 254, 254));
        jCBComplemento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolher...", "IFSul", "Parque do Chimarrao", "Casa" }));

        jTFLocalAtividade1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFLocalAtividade1KeyTyped(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vintequatro/numeric.png"))); // NOI18N
        jLabel17.setText("Número: ");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vintequatro/home.png"))); // NOI18N
        jLabel18.setText("Bairro: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLBNovaAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel10))
                                        .addGap(42, 42, 42)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jRBEmAndamento)
                                                .addGap(19, 19, 19)
                                                .addComponent(jRBConcluida))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel9))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jTFPontuacaoSegundo)
                                                    .addComponent(jTFPontuacaoTerceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTFPontuacaoPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCBComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel17))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTFNomeAtividade)
                                        .addComponent(jScrollPane1))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTFLocalAtividade2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jDCData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTFHoraAtividade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jTFLocalAtividade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTFLocalAtividade1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, Short.MAX_VALUE)))))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jBSalvarAtividade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBCancelarAtividade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(44, 44, 44))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCBPrimeiroLugar, 0, 216, Short.MAX_VALUE)
                            .addComponent(jCBSegundoLugar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCBTerceiroLugar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel11)
                .addGap(47, 47, 47)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCBPrimeiroLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCBSegundoLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCBTerceiroLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(jBSalvarAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBCancelarAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLBNovaAtividade)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTFNomeAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDCData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFHoraAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFLocalAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFLocalAtividade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTFLocalAtividade2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jCBComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTFPontuacaoPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFPontuacaoSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFPontuacaoTerceiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBEmAndamento)
                    .addComponent(jRBConcluida)
                    .addComponent(jLabel10))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBCancelarAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarAtividadeActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Deseja cancelar o cadastro desta atividade?", "Cancelar cadastro", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (resp == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_jBCancelarAtividadeActionPerformed
    public String dataNum (String str) {
        String a = str.replaceAll("[^0-9]", "");
        String num = (a);
        return num;
    }
    
    private void jBSalvarAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarAtividadeActionPerformed
        String data = "";
        if (jDCData.getDate() != null) {
            Date pega = jDCData.getDate();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            data = formato.format(pega);
            System.out.println(data);
            //DATA SEM CARACTERE
            //dataNum = dataNum(data);
            //System.out.println("data sem caractere: "+dataNum(data));
        } else {
            JOptionPane.showMessageDialog(null, "Favor preencha todos os campos!", "Atenção!", JOptionPane.WARNING_MESSAGE);
        }

        if (!jTFNomeAtividade.getText().equals("") && !jTADescricaoAtividade.getText().equals("") && !jTFHoraAtividade.getText().equals("") && !jTFLocalAtividade.getText().equals("") && !data.equals("") && !jTFPontuacaoPrimeiro.getText().equals("") && !jTFPontuacaoSegundo.getText().equals("") && !jTFPontuacaoTerceiro.getText().equals("")) {
            if (jRBConcluida.isSelected() || jRBEmAndamento.isSelected()) {
                //salva no banco
                if (jRBConcluida.isSelected()) {
                    Atividade atividade = new Atividade();
                    atividade.setSituacao("Concluida");
                    atividade.setNome(jTFNomeAtividade.getText());
                    atividade.setDescricao(jTADescricaoAtividade.getText());
                    atividade.setData(data);
                    atividade.setHora(jTFHoraAtividade.getText());
                    atividade.setEndereco(new Endereco(
                            jTFLocalAtividade.getText(),
                            jTFLocalAtividade2.getText(),
                            Long.parseLong(jTFLocalAtividade1.getText()),
                            jCBComplemento.getSelectedItem().toString()));
                    atividade.setPontuacao(new Pontuacao(
                            Long.parseLong(jTFPontuacaoPrimeiro.getText()),
                            Long.parseLong(jTFPontuacaoSegundo.getText()),
                            Long.parseLong(jTFPontuacaoTerceiro.getText())));
                    atividade.setClassificacao(new Classificacao(
                            String.valueOf(jCBPrimeiroLugar.getSelectedItem()),
                            String.valueOf(jCBSegundoLugar.getSelectedItem()),
                            String.valueOf(jCBTerceiroLugar.getSelectedItem())));
                    
                    //System.out.println("index: " + jCBPrimeiroLugar.getSelectedIndex());
                    //System.out.println(turmas.toString());

                    try {
                        CalculaTotalPontosTurma(jCBPrimeiroLugar.getSelectedIndex(), atividade.getPontuacao().getPrimeiro());
                        CalculaTotalPontosTurma(jCBSegundoLugar.getSelectedIndex(), atividade.getPontuacao().getSegundo());
                        CalculaTotalPontosTurma(jCBTerceiroLugar.getSelectedIndex(), atividade.getPontuacao().getTerceiro());
                    } catch (Exception ex) {
                        Logger.getLogger(NovaAtividadeSwing.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    try {
                        new RequisicaoHttp().insertAtividade(atividade);
                    } catch (Exception ex) {
                        Logger.getLogger(NovaAtividadeSwing.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    Atividade atividade = new Atividade();
                    atividade.setSituacao("Em andamento");
                    atividade.setNome(jTFNomeAtividade.getText());
                    atividade.setDescricao(jTADescricaoAtividade.getText());
                    atividade.setData(data);
                    atividade.setHora(jTFHoraAtividade.getText());
                    atividade.setEndereco(new Endereco(
                            jTFLocalAtividade.getText(),
                            jTFLocalAtividade2.getText(),
                            Long.parseLong(jTFLocalAtividade1.getText()),
                            jCBComplemento.getSelectedItem().toString()));
                    atividade.setPontuacao(new Pontuacao(
                            Long.parseLong(jTFPontuacaoPrimeiro.getText()),
                            Long.parseLong(jTFPontuacaoSegundo.getText()),
                            Long.parseLong(jTFPontuacaoTerceiro.getText())));
                    atividade.setClassificacao(new Classificacao(
                            "",
                            "",
                            ""));
                    try {
                        new RequisicaoHttp().insertAtividade(atividade);
                    } catch (Exception ex) {
                        Logger.getLogger(NovaAtividadeSwing.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jTFNomeAtividade.setText("");
                    jTADescricaoAtividade.setText("");
                    jTFHoraAtividade.setText("");
                    jTFLocalAtividade.setText("");
                    jTFLocalAtividade1.setText("");
                    jTFLocalAtividade2.setText("");
                    jCBComplemento.setSelectedIndex(0);
                    jTFPontuacaoPrimeiro.setText("");
                    jTFPontuacaoSegundo.setText("");
                    jTFPontuacaoTerceiro.setText("");
                    jRBConcluida.setSelected(false);
                    jRBEmAndamento.setSelected(false);
                    
                    JOptionPane.showMessageDialog(null, "Nova atividade cadastrada com êxito!", "Operação realizada com sucesso", JOptionPane.PLAIN_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Favor informe a situação da atividade", "Atenção!", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Favor preencha todos os campos!", "Atenção!", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_jBSalvarAtividadeActionPerformed
    
    public void CalculaTotalPontosTurma (int index, long pontosAtividade) throws Exception {
        if (index != 0) {
            index --;
            long pontosAtuais = turmas.get(index).getPontos();
            long pontosTotais = pontosAtuais + pontosAtividade;
            
            System.out.println("Total pontos: " + pontosTotais);
            System.out.println("Index: " + index);
            
            turmas.get(index).setPontos(pontosTotais);
            
            new RequisicaoHttp().updateTurma(turmas.get(index));
            //CHAMAR MÉTODO DE ALTERAR TURMA E COLOCAR ESSE VALOR NA PONTUAÇÃO DELA
        }
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            turmas = new RequisicaoHttp().getTurmaTodas();
        } catch (Exception ex) {
            Logger.getLogger(NovaAtividadeSwing.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //idTurmas = new ArrayList<>();
            
        for (int i = 0; i < turmas.size(); i++) {
            jCBPrimeiroLugar.addItem(turmas.get(i).getNome());
            jCBSegundoLugar.addItem(turmas.get(i).getNome());
            jCBTerceiroLugar.addItem(turmas.get(i).getNome());
        }
    }//GEN-LAST:event_formWindowOpened

    private void jTFPontuacaoPrimeiroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFPontuacaoPrimeiroKeyTyped
        // aceita somente numeros
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar()+"")) {
            evt.consume();
        }
    }//GEN-LAST:event_jTFPontuacaoPrimeiroKeyTyped

    private void jTFPontuacaoSegundoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFPontuacaoSegundoKeyTyped
        // aceita somente numeros
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar()+"")) {
            evt.consume();
        }
    }//GEN-LAST:event_jTFPontuacaoSegundoKeyTyped

    private void jTFPontuacaoTerceiroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFPontuacaoTerceiroKeyTyped
         // aceita somente numeros
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar()+"")) {
            evt.consume();
        }
    }//GEN-LAST:event_jTFPontuacaoTerceiroKeyTyped

    private void jRBEmAndamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBEmAndamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBEmAndamentoActionPerformed

    private void jRBEmAndamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRBEmAndamentoMouseClicked
        jCBPrimeiroLugar.setEnabled(false);
        jCBSegundoLugar.setEnabled(false);
        jCBTerceiroLugar.setEnabled(false);
    }//GEN-LAST:event_jRBEmAndamentoMouseClicked

    private void jRBConcluidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRBConcluidaMouseClicked
        jCBPrimeiroLugar.setEnabled(true);
        jCBSegundoLugar.setEnabled(true);
        jCBTerceiroLugar.setEnabled(true);
    }//GEN-LAST:event_jRBConcluidaMouseClicked

    private void jTFPontuacaoSegundoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPontuacaoSegundoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPontuacaoSegundoActionPerformed

    private void jTFLocalAtividade1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFLocalAtividade1KeyTyped
        // aceita somente numeros
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar()+"")) {
            evt.consume();
        }
    }//GEN-LAST:event_jTFLocalAtividade1KeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBCancelarAtividade;
    private javax.swing.JButton jBSalvarAtividade;
    private javax.swing.JComboBox<String> jCBComplemento;
    private javax.swing.JComboBox<String> jCBPrimeiroLugar;
    private javax.swing.JComboBox<String> jCBSegundoLugar;
    private javax.swing.JComboBox<String> jCBTerceiroLugar;
    private com.toedter.calendar.JDateChooser jDCData;
    private javax.swing.JLabel jLBNovaAtividade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBConcluida;
    private javax.swing.JRadioButton jRBEmAndamento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTADescricaoAtividade;
    private javax.swing.JFormattedTextField jTFHoraAtividade;
    private javax.swing.JTextField jTFLocalAtividade;
    private javax.swing.JTextField jTFLocalAtividade1;
    private javax.swing.JTextField jTFLocalAtividade2;
    private javax.swing.JTextField jTFNomeAtividade;
    private javax.swing.JTextField jTFPontuacaoPrimeiro;
    private javax.swing.JTextField jTFPontuacaoSegundo;
    private javax.swing.JTextField jTFPontuacaoTerceiro;
    // End of variables declaration//GEN-END:variables
}
