package Taestar;

import Taestar.Frame1;
import java.io.*;
import javax.swing.*;

public class Abre1 extends javax.swing.JFrame {

    public Abre1 () {
        
        initComponents ();
        
        bSave.setEnabled (false);
        bReset.setEnabled (false);
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Painel1 = new javax.swing.JPanel();
        lNome = new javax.swing.JLabel();
        tNome = new javax.swing.JTextField();
        lidade = new javax.swing.JLabel();
        sIdade = new javax.swing.JSpinner();
        lClasse = new javax.swing.JLabel();
        lSubC = new javax.swing.JLabel();
        combox1 = new javax.swing.JComboBox<>();
        combox2 = new javax.swing.JComboBox<>();
        bSave = new javax.swing.JButton();
        bReset = new javax.swing.JButton();
        bMap = new javax.swing.JButton();
        rbAccpt = new javax.swing.JRadioButton();
        lRaca = new javax.swing.JLabel();
        combox3 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lNome.setLabelFor(tNome);
        lNome.setText("Nome:");

        tNome.setText("Nome");

        lidade.setLabelFor(sIdade);
        lidade.setText("Idade:");

        lClasse.setLabelFor(combox1);
        lClasse.setText("Classe:");

        lSubC.setLabelFor(combox2);
        lSubC.setText("Subclasse:");

        combox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Classe", "Assassino", "Bárbaro", "Bruxo", "Domador", "Feiticeiro", "Guerreiro", "Healer", "Mago", "Swashbucler" }));

        combox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não há", "Alquimista", "Arqueiro", "Atirador", "Battle Mage", "Binder", "Invocador", "Ladrão", "Majin", "Monge", "Necromante", "Paladino", "Pierot", "Samurai", "Spell Sword" }));

        bSave.setText("Salvar ficha");
        bSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveActionPerformed(evt);
            }
        });

        bReset.setText("Resetar ficha");
        bReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetActionPerformed(evt);
            }
        });

        bMap.setText("Abrir mapa");
        bMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMapActionPerformed(evt);
            }
        });

        rbAccpt.setText("Não esqueci nada");
        rbAccpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAccptActionPerformed(evt);
            }
        });

        lRaca.setText("Raça:");

        combox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Raça", "Celtoh", "Dark Elf", "Dwarf", "Forest Elf", "Halfling", "High Elf", "High Orc", "Higher Vampire", "Hinomoto", "Lich", "Lizardman", "Nort", "Rhome", "Saharah", "Snow Elf", "Spriggan" }));

        javax.swing.GroupLayout Painel1Layout = new javax.swing.GroupLayout(Painel1);
        Painel1.setLayout(Painel1Layout);
        Painel1Layout.setHorizontalGroup(
            Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(combox1, 0, 160, Short.MAX_VALUE)
                    .addComponent(tNome, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lClasse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bMap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(combox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sIdade)
                        .addComponent(lSubC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lRaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(combox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(rbAccpt))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        Painel1Layout.setVerticalGroup(
            Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNome)
                    .addComponent(lidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lClasse)
                    .addComponent(lSubC))
                .addGap(18, 18, 18)
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bMap)
                    .addComponent(lRaca))
                .addGap(18, 18, 18)
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bReset)
                    .addComponent(combox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSave)
                    .addComponent(rbAccpt))
                .addContainerGap(16, Short.MAX_VALUE))
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
    
    public static String Ler (String camin) {
        
        String ctd = "";
        
        try {
            
            FileReader arq = new FileReader (camin);
            BufferedReader larq = new BufferedReader (arq);
            String linha = "";
            
            try {
                
                linha = larq.readLine();
                
                while (linha != null) {
                    
                    ctd += linha;
                    linha = larq.readLine();
                    
                }
                
                larq.close();
                return ctd;
                
            }
            
            catch (IOException ex) {
                
                
                JOptionPane.showMessageDialog (null, "ERRO: Não foi possível ler");
                //System.out.println ("ERRO: Não foi possível ler");
                return "";
                
            }
            
        }
        
        
        catch (FileNotFoundException e) {
            
            JOptionPane.showMessageDialog (null, "ERRO: Não encontrado");
            //System.out.println ("ERRO: Não encontrado");
            return "";
            
        }
        
    }
    
     public static boolean Escreve (String camin, String txt, String classe, String subclass, String raca, int idade) {
        
        try {
            
            FileWriter arq = new FileWriter (camin);
            PrintWriter parq = new PrintWriter (arq);
            
            parq.println ("Nome: " + txt);
            parq.println ("Classe: " + classe);
            parq.println ("Subclasse: " + subclass);
            parq.println ("Raça: " + raca);
            parq.println ("Idade: " + Integer.toString (idade) + " anos");
            parq.close ();
            return true;
            
        }
        
        catch (IOException ex) {
            
            JOptionPane.showMessageDialog (null, ex.getMessage());
            //System.out.println (ex.getMessage());
            return false;
            
        }
        
    }
    
    private void rbAccptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAccptActionPerformed
        
        // Impede o usuário de "esquecer" as coisas
        if (rbAccpt.isSelected () && (int) sIdade.getValue() > 21) {
            
            bSave.setEnabled (true);
            bReset.setEnabled (true);
            
        }
        
        else {
            
            bSave.setEnabled (false);
            
        }
        
    }//GEN-LAST:event_rbAccptActionPerformed

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        
        // Reseta a ficha
        tNome.setText ("Nome");
        sIdade.setValue (0);
        bSave.setEnabled (false);
        combox1.setSelectedIndex (0);
        combox2.setSelectedIndex (0);
        combox3.setSelectedIndex (0);
        bReset.setEnabled (false);
        
        if (rbAccpt.isSelected ()) {
            
            rbAccpt.setSelected (false);
            
        }
        
    }//GEN-LAST:event_bResetActionPerformed

    private void bMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMapActionPerformed
        
        // Abre o mapa
        Frame1 frm = new Frame1 ();
        
        frm.setVisible (true);
        frm.setLocationRelativeTo (null);
        
    }//GEN-LAST:event_bMapActionPerformed

    private void bSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveActionPerformed
        
        // Salva em um arquivo .txt
        String arq = "Ficha.txt",
               txt = tNome.getText(),
                classe = (String) combox1.getSelectedItem (),
                subclass = (String) combox2.getSelectedItem (),
                raca = (String) combox3.getSelectedItem ();
                 
        int idade = (int) sIdade.getValue();
        
        if (Abre1.Escreve (arq, txt, classe, subclass, raca, idade)) {
            
            JOptionPane.showMessageDialog (null, "Arquivo salvo com sucesso");
            //System.out.println("\nArquivo salvo com sucesso\n");    
            
        }
        
        else {
            
            JOptionPane.showMessageDialog (null, "Erro ao salvar");
            //System.out.println ("\nErro ao salvar\n");
        
        }
        
        
    }//GEN-LAST:event_bSaveActionPerformed

    public static void main (String args[]) {
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
            java.util.logging.Logger.getLogger(Abre1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Abre1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Abre1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Abre1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater (new Runnable () {
            
            public void run () {
                
                new Abre1 ().setVisible (true);
                
            }
            
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Painel1;
    private javax.swing.JButton bMap;
    private javax.swing.JButton bReset;
    private javax.swing.JButton bSave;
    private javax.swing.JComboBox<String> combox1;
    private javax.swing.JComboBox<String> combox2;
    private javax.swing.JComboBox<String> combox3;
    private javax.swing.JLabel lClasse;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lRaca;
    private javax.swing.JLabel lSubC;
    private javax.swing.JLabel lidade;
    private javax.swing.JRadioButton rbAccpt;
    private javax.swing.JSpinner sIdade;
    private javax.swing.JTextField tNome;
    // End of variables declaration//GEN-END:variables
}