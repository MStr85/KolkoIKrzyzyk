/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie7.kolkoikrzyzyk;


import javax.swing.JOptionPane;

/**
 *
 * @author Marek
 */
public class Gra extends javax.swing.JFrame {
    
    String wynik;
    PlanszaXO plansza = new PlanszaXO();
    PlanszaXOZhistoria lista[] = new PlanszaXOZhistoria[9];
    private void przycisk(int x, int y){    
         if (plansza.dodajElement(x, y, plansza.czyjRuch())){
             switch (x) {
                 case 0: switch (y){
                     case 0:
                        Plansza00.setText("" + plansza.czyjRuch());
                        break;
                     case 1:
                        Plansza01.setText("" + plansza.czyjRuch());
                        break;
                     case 2:
                        Plansza02.setText("" + plansza.czyjRuch());
                        break;
                 } break;
                 case 1: switch (y){
                     case 0:
                        Plansza10.setText("" + plansza.czyjRuch());
                        break;
                     case 1:
                        Plansza11.setText("" + plansza.czyjRuch());
                        break;
                     case 2:
                        Plansza12.setText("" + plansza.czyjRuch());
                        break;
                 } break;
                 case 2: switch (y){
                     case 0:
                        Plansza20.setText("" + plansza.czyjRuch());
                        break;
                     case 1:
                        Plansza21.setText("" + plansza.czyjRuch());
                        break;
                     case 2:
                        Plansza22.setText("" + plansza.czyjRuch());
                        break;
                 } break;
             }
        lista[plansza.getKrok() - 1] = new PlanszaXOZhistoria(plansza);
        plansza.wykonajRuch(x, y);
        if (plansza.wygranaX() || plansza.wygranaO() || plansza.remis()) {
        jLabelRuch.setText("Koniec!");
        }
        else {
        jLabelRuch.setText("" + plansza.czyjRuch());}
        } else {
            JOptionPane.showMessageDialog(null, "Nie można wykonać tego ruchu!");
        }   
    }


    /**
     * Creates new form Gra
     */
    public Gra() {
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Plansza00 = new javax.swing.JButton();
        Plansza01 = new javax.swing.JButton();
        Plansza02 = new javax.swing.JButton();
        Plansza10 = new javax.swing.JButton();
        Plansza11 = new javax.swing.JButton();
        Plansza12 = new javax.swing.JButton();
        Plansza20 = new javax.swing.JButton();
        Plansza21 = new javax.swing.JButton();
        Plansza22 = new javax.swing.JButton();
        jLabelCzyjRuch = new javax.swing.JLabel();
        jLabelRuch = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonCofnij = new javax.swing.JButton();
        jButtonOdNowa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Plansza00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Plansza00ActionPerformed(evt);
            }
        });

        Plansza01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Plansza01ActionPerformed(evt);
            }
        });

        Plansza02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Plansza02ActionPerformed(evt);
            }
        });

        Plansza10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Plansza10ActionPerformed(evt);
            }
        });

        Plansza11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Plansza11ActionPerformed(evt);
            }
        });

        Plansza12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Plansza12ActionPerformed(evt);
            }
        });

        Plansza20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Plansza20ActionPerformed(evt);
            }
        });

        Plansza21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Plansza21ActionPerformed(evt);
            }
        });

        Plansza22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Plansza22ActionPerformed(evt);
            }
        });

        jLabelCzyjRuch.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelCzyjRuch.setText("Ruch:");

        jLabelRuch.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelRuch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRuch.setText("X");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Kółko i krzyżyk");

        jButtonCofnij.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonCofnij.setText("COFNIJ");
        jButtonCofnij.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCofnijActionPerformed(evt);
            }
        });

        jButtonOdNowa.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonOdNowa.setText("ZACZNIJ OD NOWA");
        jButtonOdNowa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOdNowaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Plansza00, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Plansza01, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Plansza02, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelCzyjRuch, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelRuch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Plansza20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Plansza21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Plansza22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCofnij, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Plansza10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Plansza11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Plansza12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonOdNowa, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelRuch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCzyjRuch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Plansza00, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Plansza01, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(Plansza02, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Plansza10, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(Plansza11, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(Plansza12, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jButtonOdNowa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Plansza20, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(Plansza21, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(Plansza22, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jButtonCofnij, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void Plansza01ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        przycisk(0, 1);
    }                                         

    private void Plansza00ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        przycisk(0, 0);
    }                                         

    private void Plansza02ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        przycisk(0, 2);
    }                                         

    private void Plansza10ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        przycisk(1, 0);
    }                                         

    private void Plansza11ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        przycisk(1, 1);
    }                                         

    private void Plansza12ActionPerformed(java.awt.event.ActionEvent evt) {                                          
       przycisk(1, 2);
    }                                         

    private void Plansza20ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        przycisk(2, 0);
    }                                         

    private void Plansza21ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        przycisk(2, 1);
    }                                         

    private void Plansza22ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        przycisk(2, 2);
    }                                         

    private void jButtonCofnijActionPerformed(java.awt.event.ActionEvent evt) {                                              
        if (plansza.getKrok() > 1){
        int i = plansza.getKrok();
        plansza = PlanszaXOZhistoria.cofnij(lista[i - 2]);       
        jLabelRuch.setText("" + plansza.czyjRuch());        
        if (plansza.getElement(0, 0) != null){
           Plansza00.setText("" + plansza.getElement(0, 0)); 
        } else {
           Plansza00.setText("");
        }
        if (plansza.getElement(0, 1) != null){
           Plansza01.setText("" + plansza.getElement(0, 1)); 
        } else {
           Plansza01.setText("");
        }
        if (plansza.getElement(0, 2) != null){
           Plansza02.setText("" + plansza.getElement(0, 2)); 
        } else {
           Plansza02.setText("");
        }
        if (plansza.getElement(1, 0) != null){
           Plansza10.setText("" + plansza.getElement(1, 0)); 
        } else {
           Plansza10.setText("");
        }
        if (plansza.getElement(1, 1) != null){
           Plansza11.setText("" + plansza.getElement(1, 1)); 
        } else {
           Plansza11.setText("");
        }
        if (plansza.getElement(1, 2) != null){
           Plansza12.setText("" + plansza.getElement(1, 2)); 
        } else {
           Plansza12.setText("");
        }
        if (plansza.getElement(2, 0) != null){
           Plansza20.setText("" + plansza.getElement(2, 0)); 
        } else {
           Plansza20.setText("");
        }
        if (plansza.getElement(2, 1) != null){
           Plansza21.setText("" + plansza.getElement(2, 1)); 
        } else {
           Plansza21.setText("");
        }
        if (plansza.getElement(2, 2) != null){
           Plansza22.setText("" + plansza.getElement(2, 2)); 
        } else {
           Plansza22.setText("");
        }
        } else {
            JOptionPane.showMessageDialog(null, "Nie można cofnąć!");
        }  
    }                                             

    private void jButtonOdNowaActionPerformed(java.awt.event.ActionEvent evt) {                                              
        plansza = PlanszaXOZhistoria.cofnij(lista[0]);       
        jLabelRuch.setText("" + plansza.czyjRuch());
        Plansza00.setText("");
        Plansza01.setText("");
        Plansza02.setText("");
        Plansza10.setText("");
        Plansza11.setText("");
        Plansza12.setText("");
        Plansza20.setText("");
        Plansza21.setText("");
        Plansza22.setText("");
    }                                             

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
            java.util.logging.Logger.getLogger(Gra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Plansza00;
    private javax.swing.JButton Plansza01;
    private javax.swing.JButton Plansza02;
    private javax.swing.JButton Plansza10;
    private javax.swing.JButton Plansza11;
    private javax.swing.JButton Plansza12;
    private javax.swing.JButton Plansza20;
    private javax.swing.JButton Plansza21;
    private javax.swing.JButton Plansza22;
    private javax.swing.JButton jButtonCofnij;
    private javax.swing.JButton jButtonOdNowa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCzyjRuch;
    private javax.swing.JLabel jLabelRuch;
    // End of variables declaration                   
}
