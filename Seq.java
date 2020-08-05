package Taestar;

import javax.swing.*;
import java.util.*;

public class Seq extends javax.swing.JFrame {

    public Seq () {
        
        initComponents();
        
        seq1.setVisible (false);
        seq2.setVisible (false);
        seq3.setVisible (false);
        seq4.setVisible (false);
        seq5.setVisible (false);
        seq6.setVisible (false);
        seq7.setVisible (false);
        tnome1.setVisible (false);
        tnome2.setVisible (false);
        tnome3.setVisible (false);
        tnome4.setVisible (false);
        tnome5.setVisible (false);
        tnome6.setVisible (false);
        tnome7.setVisible (false);
        tmod1.setVisible (false);
        tmod2.setVisible (false);
        tmod3.setVisible (false);
        tmod4.setVisible (false);
        tmod5.setVisible (false);
        tmod6.setVisible (false);
        tmod7.setVisible (false);
        broll1.setVisible (false);
        broll2.setVisible (false);
        broll3.setVisible (false);
        broll4.setVisible (false);
        broll5.setVisible (false);
        broll6.setVisible (false);
        broll7.setVisible (false);
        tRes1.setVisible (false);
        tRes2.setVisible (false);
        tRes3.setVisible (false);
        tRes4.setVisible (false);
        tRes5.setVisible (false);
        tRes6.setVisible (false);
        tRes7.setVisible (false);
        tRes1.setEnabled (false);
        tRes2.setEnabled (false);
        tRes3.setEnabled (false);
        tRes4.setEnabled (false);
        tRes5.setEnabled (false);
        tRes6.setEnabled (false);
        tRes7.setEnabled (false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Painel1 = new javax.swing.JPanel();
        lseq = new javax.swing.JLabel();
        lnomes = new javax.swing.JLabel();
        ldados = new javax.swing.JLabel();
        seq1 = new javax.swing.JLabel();
        seq2 = new javax.swing.JLabel();
        seq3 = new javax.swing.JLabel();
        seq4 = new javax.swing.JLabel();
        seq5 = new javax.swing.JLabel();
        seq6 = new javax.swing.JLabel();
        seq7 = new javax.swing.JLabel();
        tnome1 = new javax.swing.JTextField();
        tnome2 = new javax.swing.JTextField();
        tnome3 = new javax.swing.JTextField();
        tnome4 = new javax.swing.JTextField();
        tnome5 = new javax.swing.JTextField();
        tnome6 = new javax.swing.JTextField();
        tnome7 = new javax.swing.JTextField();
        lplayers = new javax.swing.JLabel();
        combox1 = new javax.swing.JComboBox<>();
        breset = new javax.swing.JButton();
        tmod1 = new javax.swing.JTextField();
        tmod2 = new javax.swing.JTextField();
        tmod3 = new javax.swing.JTextField();
        tmod4 = new javax.swing.JTextField();
        tmod5 = new javax.swing.JTextField();
        tmod6 = new javax.swing.JTextField();
        tmod7 = new javax.swing.JTextField();
        broll1 = new javax.swing.JButton();
        broll2 = new javax.swing.JButton();
        broll3 = new javax.swing.JButton();
        broll4 = new javax.swing.JButton();
        broll5 = new javax.swing.JButton();
        broll6 = new javax.swing.JButton();
        broll7 = new javax.swing.JButton();
        lresult = new javax.swing.JLabel();
        tRes1 = new javax.swing.JTextField();
        tRes2 = new javax.swing.JTextField();
        tRes3 = new javax.swing.JTextField();
        tRes4 = new javax.swing.JTextField();
        tRes5 = new javax.swing.JTextField();
        tRes6 = new javax.swing.JTextField();
        tRes7 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lseq.setText("Sequência:");

        lnomes.setText("Nomes:");

        ldados.setText("Dados:");

        seq1.setLabelFor(tnome1);
        seq1.setText("1");
        seq1.setToolTipText("");

        seq2.setLabelFor(tnome2);
        seq2.setText("2");

        seq3.setLabelFor(tnome3);
        seq3.setText("3");

        seq4.setLabelFor(tnome4);
        seq4.setText("4");

        seq5.setLabelFor(tnome5);
        seq5.setText("5");

        seq6.setLabelFor(tnome6);
        seq6.setText("6");

        seq7.setLabelFor(tnome7);
        seq7.setText("7");

        tnome1.setText("Nome 1");

        tnome2.setText("Nome 2");

        tnome3.setText("Nome 3");

        tnome4.setText("Nome 4");

        tnome5.setText("Nome 5");

        tnome6.setText("Nome 6");

        tnome7.setText("Nome 7");

        lplayers.setText("Qtd. de players:");

        combox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nro. de players", "2", "3", "4", "5", "6", "7" }));
        combox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combox1ActionPerformed(evt);
            }
        });

        breset.setText("Resetar");
        breset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bresetActionPerformed(evt);
            }
        });

        tmod1.setText("Mod. Iniciativa");

        tmod2.setText("Mod. Iniciativa");

        tmod3.setText("Mod. Iniciativa");

        tmod4.setText("Mod. Iniciativa");

        tmod5.setText("Mod. Iniciativa");

        tmod6.setText("Mod. Iniciativa");

        tmod7.setText("Mod. Iniciativa");

        broll1.setText("Rolar");
        broll1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                broll1ActionPerformed(evt);
            }
        });

        broll2.setText("Rolar");
        broll2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                broll2ActionPerformed(evt);
            }
        });

        broll3.setText("Rolar");
        broll3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                broll3ActionPerformed(evt);
            }
        });

        broll4.setText("Rolar");
        broll4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                broll4ActionPerformed(evt);
            }
        });

        broll5.setText("Rolar");
        broll5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                broll5ActionPerformed(evt);
            }
        });

        broll6.setText("Rolar");
        broll6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                broll6ActionPerformed(evt);
            }
        });

        broll7.setText("Rolar");
        broll7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                broll7ActionPerformed(evt);
            }
        });

        lresult.setText("Resultados:");

        tRes1.setText("0");

        tRes2.setText("0");

        tRes3.setText("0");

        tRes4.setText("0");

        tRes5.setText("0");

        tRes6.setText("0");

        tRes7.setText("0");

        javax.swing.GroupLayout Painel1Layout = new javax.swing.GroupLayout(Painel1);
        Painel1.setLayout(Painel1Layout);
        Painel1Layout.setHorizontalGroup(
            Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(seq4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(seq3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(seq2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(seq1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lseq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(seq5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(seq6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(seq7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lnomes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Painel1Layout.createSequentialGroup()
                        .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tnome1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(tnome2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tnome3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tnome4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tnome5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tnome6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tnome7, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ldados)
                    .addComponent(tmod1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tmod2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tmod3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tmod4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tmod5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tmod6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tmod7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tRes1)
                            .addComponent(lresult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tRes2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tRes3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tRes4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tRes5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tRes6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tRes7, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(114, 114, 114)
                        .addComponent(lplayers, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Painel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(broll7)
                            .addComponent(broll6)
                            .addComponent(broll5)
                            .addComponent(broll4)
                            .addComponent(broll3)
                            .addGroup(Painel1Layout.createSequentialGroup()
                                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(broll1)
                                    .addComponent(broll2))
                                .addGap(287, 287, 287)
                                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(breset, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(37, 37, 37))
        );
        Painel1Layout.setVerticalGroup(
            Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lseq)
                    .addComponent(lnomes)
                    .addComponent(ldados)
                    .addComponent(lplayers)
                    .addComponent(lresult))
                .addGap(18, 18, 18)
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seq1)
                    .addComponent(tnome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tmod1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(broll1)
                    .addComponent(tRes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seq2)
                    .addComponent(tnome2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(breset)
                    .addComponent(tmod2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(broll2)
                    .addComponent(tRes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seq3)
                    .addComponent(tnome3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tmod3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(broll3)
                    .addComponent(tRes3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seq4)
                    .addComponent(tnome4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tmod4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(broll4)
                    .addComponent(tRes4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seq5)
                    .addComponent(tnome5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tmod5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(broll5)
                    .addComponent(tRes5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seq6)
                    .addComponent(tnome6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tmod6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(broll6)
                    .addComponent(tRes6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seq7)
                    .addComponent(tnome7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tmod7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(broll7)
                    .addComponent(tRes7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Random rand = new Random ();
    int j1 = 0, j2 = 0, j3 = 0, j4 = 0, j5 = 0, j6 = 0, j7 = 0;
    int mod1 = 0, mod2 = 0, mod3 = 0, mod4 = 0, mod5 = 0, mod6 = 0, mod7 = 0;
    
    public void WhosFirst () {
        
        int troca;
        int[] maior = new int[7], omod = new int[7];

        maior[0] = j1;
        maior[1] = j2;
        maior[2] = j3;
        maior[3] = j4;
        maior[4] = j5;
        maior[5] = j6;
        maior[6] = j7;
        omod[0] = j1 - mod1;
        omod[1] = j2 - mod2;
        omod[2] = j3 - mod3;
        omod[3] = j4 - mod4;
        omod[4] = j5 - mod5;
        omod[5] = j6 - mod6;
        omod[6] = j7 - mod7;
        
        for (int i = 0; i < 6; i++) {
            
            if (maior[i] < maior[(i + 1)]) {
            
                troca = maior[(i + 1)];
                maior[(i+1)] = maior[i];
                maior[i] = troca;
            
            }
            
            else if (maior[i] == maior[(i + 1)]) {
                
                if (omod[i] < omod[(i + 1)]) {
                
                    troca = maior[(i + 1)];
                    maior[(i+1)] = maior[i];
                    maior[i] = troca;
                
                }
                
            }
            
            else if (omod[i] == 20) {
                
                if (maior[i] == j1) seq1.setText("1");
                else if (maior[i] == j2) seq2.setText("1");
                else if (maior[i] == j3) seq3.setText("1");
                else if (maior[i] == j4) seq4.setText("1");
                else if (maior[i] == j5) seq5.setText("1");
                else if (maior[i] == j6) seq6.setText("1");
                else seq7.setText("1");
                
            }
            
        }
        
        for (int j = 0; j < 7; j++) {
            
            if (maior[j] == j1) seq1.setText(Integer.toString((j+1)));
            else if (maior[j] == j2) seq2.setText(Integer.toString((j+1)));
            else if (maior[j] == j3) seq3.setText(Integer.toString((j+1)));
            else if (maior[j] == j4) seq4.setText(Integer.toString((j+1)));
            else if (maior[j] == j5) seq5.setText(Integer.toString((j+1)));
            else if (maior[j] == j6) seq6.setText(Integer.toString((j+1)));
            else seq7.setText(Integer.toString((j+1)));
            
        }
        
    }
    
    private void bresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bresetActionPerformed
        
        // Resetar a ficha
        seq1.setText ("1");
        seq2.setText ("2");
        seq3.setText ("3");
        seq4.setText ("4");
        seq5.setText ("5");
        seq6.setText ("6");
        seq7.setText ("7");
        tnome1.setText ("Nome 1");
        tnome2.setText ("Nome 2");
        tnome3.setText ("Nome 3");
        tnome4.setText ("Nome 4");
        tnome5.setText ("Nome 5");
        tnome6.setText ("Nome 6");
        tnome7.setText ("Nome 7");
        tmod1.setText ("0");
        tmod2.setText ("0");
        tmod3.setText ("0");
        tmod4.setText ("0");
        tmod5.setText ("0");
        tmod6.setText ("0");
        tmod7.setText ("0");
        tRes1.setText ("0");
        tRes2.setText ("0");
        tRes3.setText ("0");
        tRes4.setText ("0");
        tRes5.setText ("0");
        tRes6.setText ("0");
        tRes7.setText ("0");
        
    }//GEN-LAST:event_bresetActionPerformed

    private void combox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combox1ActionPerformed
        
        // Mostrar apenas o número de players
        int num = combox1.getSelectedIndex ();
        
        switch (num) {
            
            case 0:
                
                seq1.setVisible (false);
                seq2.setVisible (false);
                seq3.setVisible (false);
                seq4.setVisible (false);
                seq5.setVisible (false);
                seq6.setVisible (false);
                seq7.setVisible (false);
                tnome1.setVisible (false);
                tnome2.setVisible (false);
                tnome3.setVisible (false);
                tnome4.setVisible (false);
                tnome5.setVisible (false);
                tnome6.setVisible (false);
                tnome7.setVisible (false);
                tmod1.setVisible (false);
                tmod2.setVisible (false);
                tmod3.setVisible (false);
                tmod4.setVisible (false);
                tmod5.setVisible (false);
                tmod6.setVisible (false);
                tmod7.setVisible (false);
                broll1.setVisible (false);
                broll2.setVisible (false);
                broll3.setVisible (false);
                broll4.setVisible (false);
                broll5.setVisible (false);
                broll6.setVisible (false);
                broll7.setVisible (false);
                tRes1.setVisible (false);
                tRes2.setVisible (false);
                tRes3.setVisible (false);
                tRes4.setVisible (false);
                tRes5.setVisible (false);
                tRes6.setVisible (false);
                tRes7.setVisible (false);
                
                break;
            
            case 1:
                
                seq1.setVisible (false);
                seq2.setVisible (false);
                seq3.setVisible (false);
                seq4.setVisible (false);
                seq5.setVisible (false);
                seq6.setVisible (false);
                seq7.setVisible (false);
                tnome1.setVisible (false);
                tnome2.setVisible (false);
                tnome3.setVisible (false);
                tnome4.setVisible (false);
                tnome5.setVisible (false);
                tnome6.setVisible (false);
                tnome7.setVisible (false);
                tmod1.setVisible (false);
                tmod2.setVisible (false);
                tmod3.setVisible (false);
                tmod4.setVisible (false);
                tmod5.setVisible (false);
                tmod6.setVisible (false);
                tmod7.setVisible (false);
                broll1.setVisible (false);
                broll2.setVisible (false);
                broll3.setVisible (false);
                broll4.setVisible (false);
                broll5.setVisible (false);
                broll6.setVisible (false);
                broll7.setVisible (false);
                tRes1.setVisible (false);
                tRes2.setVisible (false);
                tRes3.setVisible (false);
                tRes4.setVisible (false);
                tRes5.setVisible (false);
                tRes6.setVisible (false);
                tRes7.setVisible (false);
                seq1.setVisible (true);
                seq2.setVisible (true);
                tnome1.setVisible (true);
                tnome2.setVisible (true);
                tmod1.setVisible (true);
                tmod2.setVisible (true);
                broll1.setVisible (true);
                broll2.setVisible (true);
                tRes1.setVisible (true);
                tRes2.setVisible (true);
                
                break;
            
            case 2:
                
                seq1.setVisible (false);
                seq2.setVisible (false);
                seq3.setVisible (false);
                seq4.setVisible (false);
                seq5.setVisible (false);
                seq6.setVisible (false);
                seq7.setVisible (false);
                tnome1.setVisible (false);
                tnome2.setVisible (false);
                tnome3.setVisible (false);
                tnome4.setVisible (false);
                tnome5.setVisible (false);
                tnome6.setVisible (false);
                tnome7.setVisible (false);
                tmod1.setVisible (false);
                tmod2.setVisible (false);
                tmod3.setVisible (false);
                tmod4.setVisible (false);
                tmod5.setVisible (false);
                tmod6.setVisible (false);
                tmod7.setVisible (false);
                broll1.setVisible (false);
                broll2.setVisible (false);
                broll3.setVisible (false);
                broll4.setVisible (false);
                broll5.setVisible (false);
                broll6.setVisible (false);
                broll7.setVisible (false);
                tRes1.setVisible (false);
                tRes2.setVisible (false);
                tRes3.setVisible (false);
                tRes4.setVisible (false);
                tRes5.setVisible (false);
                tRes6.setVisible (false);
                tRes7.setVisible (false);
                seq1.setVisible (true);
                seq2.setVisible (true);
                seq3.setVisible (true);
                tnome1.setVisible (true);
                tnome2.setVisible (true);
                tnome3.setVisible (true);
                tmod1.setVisible (true);
                tmod2.setVisible (true);
                tmod3.setVisible (true);
                broll1.setVisible (true);
                broll2.setVisible (true);
                broll3.setVisible (true);
                tRes1.setVisible (true);
                tRes2.setVisible (true);
                tRes3.setVisible (true);
                
                break;
            
            case 3:
                
                seq1.setVisible (false);
                seq2.setVisible (false);
                seq3.setVisible (false);
                seq4.setVisible (false);
                seq5.setVisible (false);
                seq6.setVisible (false);
                seq7.setVisible (false);
                tnome1.setVisible (false);
                tnome2.setVisible (false);
                tnome3.setVisible (false);
                tnome4.setVisible (false);
                tnome5.setVisible (false);
                tnome6.setVisible (false);
                tnome7.setVisible (false);
                tmod1.setVisible (false);
                tmod2.setVisible (false);
                tmod3.setVisible (false);
                tmod4.setVisible (false);
                tmod5.setVisible (false);
                tmod6.setVisible (false);
                tmod7.setVisible (false);
                broll1.setVisible (false);
                broll2.setVisible (false);
                broll3.setVisible (false);
                broll4.setVisible (false);
                broll5.setVisible (false);
                broll6.setVisible (false);
                broll7.setVisible (false);
                tRes1.setVisible (false);
                tRes2.setVisible (false);
                tRes3.setVisible (false);
                tRes4.setVisible (false);
                tRes5.setVisible (false);
                tRes6.setVisible (false);
                tRes7.setVisible (false);
                seq1.setVisible (true);
                seq2.setVisible (true);
                seq3.setVisible (true);
                seq4.setVisible (true);
                tnome1.setVisible (true);
                tnome2.setVisible (true);
                tnome3.setVisible (true);
                tnome4.setVisible (true);
                tmod1.setVisible (true);
                tmod2.setVisible (true);
                tmod3.setVisible (true);
                tmod4.setVisible (true);
                broll1.setVisible (true);
                broll2.setVisible (true);
                broll3.setVisible (true);
                broll4.setVisible (true);
                tRes1.setVisible (true);
                tRes2.setVisible (true);
                tRes3.setVisible (true);
                tRes4.setVisible (true);
                
                break;
                
            case 4:
                
                seq1.setVisible (false);
                seq2.setVisible (false);
                seq3.setVisible (false);
                seq4.setVisible (false);
                seq5.setVisible (false);
                seq6.setVisible (false);
                seq7.setVisible (false);
                tnome1.setVisible (false);
                tnome2.setVisible (false);
                tnome3.setVisible (false);
                tnome4.setVisible (false);
                tnome5.setVisible (false);
                tnome6.setVisible (false);
                tnome7.setVisible (false);
                tmod1.setVisible (false);
                tmod2.setVisible (false);
                tmod3.setVisible (false);
                tmod4.setVisible (false);
                tmod5.setVisible (false);
                tmod6.setVisible (false);
                tmod7.setVisible (false);
                broll1.setVisible (false);
                broll2.setVisible (false);
                broll3.setVisible (false);
                broll4.setVisible (false);
                broll5.setVisible (false);
                broll6.setVisible (false);
                broll7.setVisible (false);
                tRes1.setVisible (false);
                tRes2.setVisible (false);
                tRes3.setVisible (false);
                tRes4.setVisible (false);
                tRes5.setVisible (false);
                tRes6.setVisible (false);
                tRes7.setVisible (false);
                seq1.setVisible (true);
                seq2.setVisible (true);
                seq3.setVisible (true);
                seq4.setVisible (true);
                seq5.setVisible (true);
                tnome1.setVisible (true);
                tnome2.setVisible (true);
                tnome3.setVisible (true);
                tnome4.setVisible (true);
                tnome5.setVisible (true);
                tmod1.setVisible (true);
                tmod2.setVisible (true);
                tmod3.setVisible (true);
                tmod4.setVisible (true);
                tmod5.setVisible (true);
                broll1.setVisible (true);
                broll2.setVisible (true);
                broll3.setVisible (true);
                broll4.setVisible (true);
                broll5.setVisible (true);
                tRes1.setVisible (true);
                tRes2.setVisible (true);
                tRes3.setVisible (true);
                tRes4.setVisible (true);
                tRes5.setVisible (true);
                
                break;
                
            case 5:
                
                seq1.setVisible (false);
                seq2.setVisible (false);
                seq3.setVisible (false);
                seq4.setVisible (false);
                seq5.setVisible (false);
                seq6.setVisible (false);
                seq7.setVisible (false);
                tnome1.setVisible (false);
                tnome2.setVisible (false);
                tnome3.setVisible (false);
                tnome4.setVisible (false);
                tnome5.setVisible (false);
                tnome6.setVisible (false);
                tnome7.setVisible (false);
                tmod1.setVisible (false);
                tmod2.setVisible (false);
                tmod3.setVisible (false);
                tmod4.setVisible (false);
                tmod5.setVisible (false);
                tmod6.setVisible (false);
                tmod7.setVisible (false);
                broll1.setVisible (false);
                broll2.setVisible (false);
                broll3.setVisible (false);
                broll4.setVisible (false);
                broll5.setVisible (false);
                broll6.setVisible (false);
                broll7.setVisible (false);
                tRes1.setVisible (false);
                tRes2.setVisible (false);
                tRes3.setVisible (false);
                tRes4.setVisible (false);
                tRes5.setVisible (false);
                tRes6.setVisible (false);
                tRes7.setVisible (false);
                seq1.setVisible (true);
                seq2.setVisible (true);
                seq3.setVisible (true);
                seq4.setVisible (true);
                seq5.setVisible (true);
                seq6.setVisible (true);
                tnome1.setVisible (true);
                tnome2.setVisible (true);
                tnome3.setVisible (true);
                tnome4.setVisible (true);
                tnome5.setVisible (true);
                tnome6.setVisible (true);
                tmod1.setVisible (true);
                tmod2.setVisible (true);
                tmod3.setVisible (true);
                tmod4.setVisible (true);
                tmod5.setVisible (true);
                tmod6.setVisible (true);
                broll1.setVisible (true);
                broll2.setVisible (true);
                broll3.setVisible (true);
                broll4.setVisible (true);
                broll5.setVisible (true);
                broll6.setVisible (true);
                tRes1.setVisible (true);
                tRes2.setVisible (true);
                tRes3.setVisible (true);
                tRes4.setVisible (true);
                tRes5.setVisible (true);
                tRes6.setVisible (true);
                
                break;
                
            case 6:
                
                seq1.setVisible (false);
                seq2.setVisible (false);
                seq3.setVisible (false);
                seq4.setVisible (false);
                seq5.setVisible (false);
                seq6.setVisible (false);
                seq7.setVisible (false);
                tnome1.setVisible (false);
                tnome2.setVisible (false);
                tnome3.setVisible (false);
                tnome4.setVisible (false);
                tnome5.setVisible (false);
                tnome6.setVisible (false);
                tnome7.setVisible (false);
                tmod1.setVisible (false);
                tmod2.setVisible (false);
                tmod3.setVisible (false);
                tmod4.setVisible (false);
                tmod5.setVisible (false);
                tmod6.setVisible (false);
                tmod7.setVisible (false);
                broll1.setVisible (false);
                broll2.setVisible (false);
                broll3.setVisible (false);
                broll4.setVisible (false);
                broll5.setVisible (false);
                broll6.setVisible (false);
                broll7.setVisible (false);
                tRes1.setVisible (false);
                tRes2.setVisible (false);
                tRes3.setVisible (false);
                tRes4.setVisible (false);
                tRes5.setVisible (false);
                tRes6.setVisible (false);
                tRes7.setVisible (false);
                seq1.setVisible (true);
                seq2.setVisible (true);
                seq3.setVisible (true);
                seq4.setVisible (true);
                seq5.setVisible (true);
                seq6.setVisible (true);
                seq7.setVisible (true);
                tnome1.setVisible (true);
                tnome2.setVisible (true);
                tnome3.setVisible (true);
                tnome4.setVisible (true);
                tnome5.setVisible (true);
                tnome6.setVisible (true);
                tnome7.setVisible (true);
                tmod1.setVisible (true);
                tmod2.setVisible (true);
                tmod3.setVisible (true);
                tmod4.setVisible (true);
                tmod5.setVisible (true);
                tmod6.setVisible (true);
                tmod7.setVisible (true);
                broll1.setVisible (true);
                broll2.setVisible (true);
                broll3.setVisible (true);
                broll4.setVisible (true);
                broll5.setVisible (true);
                broll6.setVisible (true);
                broll7.setVisible (true);
                tRes1.setVisible (true);
                tRes2.setVisible (true);
                tRes3.setVisible (true);
                tRes4.setVisible (true);
                tRes5.setVisible (true);
                tRes6.setVisible (true);
                tRes7.setVisible (true);
                
                break;
            
            default:
                
                JOptionPane.showMessageDialog (null, "Ocorreu um erro!!!");
            
        }
        
        
    }//GEN-LAST:event_combox1ActionPerformed

    private void broll1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_broll1ActionPerformed
        
        //Botão Rolar nro. 1
        j1 = 0;
        mod1 = Integer.parseInt (tmod1.getText());
        j1 = rand.nextInt (20) + 1 + mod1;
        
        tRes1.setText (Integer.toString (j1));
        WhosFirst ();
        
    }//GEN-LAST:event_broll1ActionPerformed

    private void broll2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_broll2ActionPerformed
        
        //Botão Rolar nro. 2
        j2 = 0;
        mod2 = Integer.parseInt (tmod2.getText());
        j2 = rand.nextInt (20) + 1 + mod2;
        
        tRes2.setText (Integer.toString (j2));
        WhosFirst ();
        
    }//GEN-LAST:event_broll2ActionPerformed

    private void broll3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_broll3ActionPerformed
        
        //Botão Rolar nro. 3
        j3 = 0;
        mod3 = Integer.parseInt (tmod3.getText());
        j3 = rand.nextInt (20) + 1 + mod3;
        
        tRes3.setText (Integer.toString (j3));
        WhosFirst ();
        
    }//GEN-LAST:event_broll3ActionPerformed

    private void broll4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_broll4ActionPerformed
        
        //Botão Rolar nro. 4
        j4 = 0;
        mod4 = Integer.parseInt (tmod4.getText());
        j4 = rand.nextInt (20) + 1 + mod4;
        
        tRes4.setText (Integer.toString (j4));
        WhosFirst ();
        
    }//GEN-LAST:event_broll4ActionPerformed

    private void broll5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_broll5ActionPerformed
        
        //Botão Rolar nro. 5
        j5 = 0;
        mod5 =  Integer.parseInt (tmod5.getText());
        j5 = rand.nextInt (20) + 1 + mod5;
        
        tRes5.setText (Integer.toString (j5));
        WhosFirst ();
        
    }//GEN-LAST:event_broll5ActionPerformed

    private void broll6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_broll6ActionPerformed
        
        //Botão Rolar nro. 6
        j6 = 0;
        mod6 = Integer.parseInt (tmod6.getText());
        j6 = rand.nextInt (20) + 1 + mod6;
        
        tRes6.setText (Integer.toString (j6));
        WhosFirst ();
        
    }//GEN-LAST:event_broll6ActionPerformed

    private void broll7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_broll7ActionPerformed
        
        //Botão Rolar nro. 7
        j7 = 0;
        mod7 = Integer.parseInt (tmod7.getText());
        j7 = rand.nextInt (20) + 1 + mod7;
        
        tRes7.setText (Integer.toString (j7));
        WhosFirst ();
        
    }//GEN-LAST:event_broll7ActionPerformed

    public static void main (String args []) {
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
            java.util.logging.Logger.getLogger(Seq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater (new Runnable () {
            public void run () {
                
                new Seq ().setVisible (true);
            
            }
            
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Painel1;
    private javax.swing.JButton breset;
    private javax.swing.JButton broll1;
    private javax.swing.JButton broll2;
    private javax.swing.JButton broll3;
    private javax.swing.JButton broll4;
    private javax.swing.JButton broll5;
    private javax.swing.JButton broll6;
    private javax.swing.JButton broll7;
    private javax.swing.JComboBox<String> combox1;
    private javax.swing.JLabel ldados;
    private javax.swing.JLabel lnomes;
    private javax.swing.JLabel lplayers;
    private javax.swing.JLabel lresult;
    private javax.swing.JLabel lseq;
    private javax.swing.JLabel seq1;
    private javax.swing.JLabel seq2;
    private javax.swing.JLabel seq3;
    private javax.swing.JLabel seq4;
    private javax.swing.JLabel seq5;
    private javax.swing.JLabel seq6;
    private javax.swing.JLabel seq7;
    private javax.swing.JTextField tRes1;
    private javax.swing.JTextField tRes2;
    private javax.swing.JTextField tRes3;
    private javax.swing.JTextField tRes4;
    private javax.swing.JTextField tRes5;
    private javax.swing.JTextField tRes6;
    private javax.swing.JTextField tRes7;
    private javax.swing.JTextField tmod1;
    private javax.swing.JTextField tmod2;
    private javax.swing.JTextField tmod3;
    private javax.swing.JTextField tmod4;
    private javax.swing.JTextField tmod5;
    private javax.swing.JTextField tmod6;
    private javax.swing.JTextField tmod7;
    private javax.swing.JTextField tnome1;
    private javax.swing.JTextField tnome2;
    private javax.swing.JTextField tnome3;
    private javax.swing.JTextField tnome4;
    private javax.swing.JTextField tnome5;
    private javax.swing.JTextField tnome6;
    private javax.swing.JTextField tnome7;
    // End of variables declaration//GEN-END:variables
}