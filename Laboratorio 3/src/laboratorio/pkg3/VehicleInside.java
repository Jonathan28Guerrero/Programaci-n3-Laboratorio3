/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg3;

/**
 *
 * @author User
 */
public class VehicleInside extends javax.swing.JFrame {

    /**
     * Creates new form ParkingParameters
     */
    public VehicleInside() {
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

        selectTime = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        vetype = new javax.swing.JComboBox<>();
        Buttonin = new javax.swing.JButton();
        txt1 = new javax.swing.JLabel();
        plate = new javax.swing.JTextField();
        txt2 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        Buttonreturn = new javax.swing.JButton();
        ButtonTimeAutomatic = new javax.swing.JRadioButton();
        ButtonManualTime = new javax.swing.JRadioButton();
        labelHora = new javax.swing.JLabel();
        manualTime = new javax.swing.JTextField();
        automaticTime = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Tipo de vehiculo");

        vetype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Carro", "Moto", "Cicla" }));
        vetype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vetypeActionPerformed(evt);
            }
        });

        Buttonin.setText("ENTRAR");
        Buttonin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtoninActionPerformed(evt);
            }
        });

        txt1.setText("Placa :");

        plate.setText(" ");
        plate.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                plateComponentShown(evt);
            }
        });
        plate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plateActionPerformed(evt);
            }
        });

        txt2.setText("cicla n° :");

        txt3.setText("Cual es el tipo de vehiculo");

        Buttonreturn.setText("Volver");
        Buttonreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonreturnActionPerformed(evt);
            }
        });

        selectTime.add(ButtonTimeAutomatic);
        ButtonTimeAutomatic.setText("Automatico");
        ButtonTimeAutomatic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonTimeAutomaticMouseClicked(evt);
            }
        });
        ButtonTimeAutomatic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTimeAutomaticActionPerformed(evt);
            }
        });

        selectTime.add(ButtonManualTime);
        ButtonManualTime.setText("Manual");

        labelHora.setText("Hora :");

        manualTime.setText(" ");
        manualTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manualTimeActionPerformed(evt);
            }
        });

        automaticTime.setText(" ");
        automaticTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                automaticTimeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Buttonreturn)
                            .addComponent(jLabel3))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txt1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(plate, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txt2)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Buttonin)
                            .addComponent(vetype, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(labelHora))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ButtonTimeAutomatic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(automaticTime))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonManualTime)
                            .addComponent(manualTime, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buttonin)
                    .addComponent(Buttonreturn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vetype, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1)
                    .addComponent(plate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelHora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonTimeAutomatic)
                    .addComponent(ButtonManualTime))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manualTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(automaticTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vetypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vetypeActionPerformed
        String valor = (String)vetype.getSelectedItem(); //coloca el numero a unavariable
            if (valor.equals(" "))
        {
            txt1.setVisible(false);
            txt2.setVisible(false);
            plate.setVisible(false);
            txt3.setVisible(true);
            Buttonin.setEnabled(false);
        }
            else 
            {
                if(valor.equals("Carro")||valor.equals("Moto"))
                {
                    plate.setVisible(true);
                    txt1.setVisible(true);
                    txt2.setVisible(false);
                    txt3.setVisible(false);
                    Buttonin.setEnabled(true);
                }
                else
                    if(valor.equals("Cicla"))
                    {
                        txt1.setVisible(false);
                        txt2.setVisible(true);
                        txt3.setVisible(false);
                        plate.setVisible(false);
                        Buttonin.setEnabled(true);
                    }
                
            }
    }//GEN-LAST:event_vetypeActionPerformed

    private void plateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plateActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_plateActionPerformed

    private void plateComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_plateComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_plateComponentShown

    private void ButtoninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtoninActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtoninActionPerformed

    private void ButtonreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonreturnActionPerformed
        ParkingInterface Return = new ParkingInterface();
        Return.setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_ButtonreturnActionPerformed

    private void ButtonTimeAutomaticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTimeAutomaticActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonTimeAutomaticActionPerformed

    private void automaticTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_automaticTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_automaticTimeActionPerformed

    private void manualTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manualTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manualTimeActionPerformed

    private void ButtonTimeAutomaticMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonTimeAutomaticMouseClicked
        VehicleInside obj1 = new VehicleInside();
        obj1.ButtonManualTime.setEnabled(false); 
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonTimeAutomaticMouseClicked

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
            java.util.logging.Logger.getLogger(VehicleInside.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VehicleInside.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VehicleInside.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VehicleInside.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VehicleInside().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ButtonManualTime;
    private javax.swing.JRadioButton ButtonTimeAutomatic;
    public javax.swing.JButton Buttonin;
    private javax.swing.JButton Buttonreturn;
    private javax.swing.JTextField automaticTime;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelHora;
    private javax.swing.JTextField manualTime;
    public javax.swing.JTextField plate;
    private javax.swing.ButtonGroup selectTime;
    public javax.swing.JLabel txt1;
    public javax.swing.JLabel txt2;
    public javax.swing.JLabel txt3;
    private javax.swing.JComboBox<String> vetype;
    // End of variables declaration//GEN-END:variables
}
