/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg3;

import javax.swing.ButtonModel;

/**
 *
 * @author kjuan
 */
public class ParkingParameters extends javax.swing.JFrame {
    int c=0, p=0;
    /**
     * Creates new form ParkingParameters
     */
    public ParkingParameters() {
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

        capacity = new javax.swing.ButtonGroup();
        prices = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        defaultCapacity = new javax.swing.JRadioButton();
        costomCapacity = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        defaultPrices = new javax.swing.JRadioButton();
        customPrices = new javax.swing.JRadioButton();
        Buttonacept = new javax.swing.JButton();
        CarCapacity = new javax.swing.JTextField();
        MotorcycleCapacity = new javax.swing.JTextField();
        BikeCapacity = new javax.swing.JTextField();
        CarPrice = new javax.swing.JTextField();
        MotorcyclePrice = new javax.swing.JTextField();
        BikePrice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Capacidad de parqueadero : ");

        capacity.add(defaultCapacity);
        defaultCapacity.setText("Por defecto");
        defaultCapacity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                defaultCapacityMouseClicked(evt);
            }
        });

        capacity.add(costomCapacity);
        costomCapacity.setText("Personalizado");
        costomCapacity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                costomCapacityMouseClicked(evt);
            }
        });

        jLabel3.setText("Precios : ");

        prices.add(defaultPrices);
        defaultPrices.setText("Por defecto");
        defaultPrices.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                defaultPricesMouseClicked(evt);
            }
        });
        defaultPrices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defaultPricesActionPerformed(evt);
            }
        });

        prices.add(customPrices);
        customPrices.setText("Personalizado");
        customPrices.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customPricesMouseClicked(evt);
            }
        });

        Buttonacept.setText("Aceptar");
        Buttonacept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonaceptActionPerformed(evt);
            }
        });

        CarCapacity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarCapacityActionPerformed(evt);
            }
        });

        jLabel2.setText("Carro");

        jLabel4.setText("Moto");

        jLabel5.setText("Bicicleta");

        jLabel6.setText("Carro");

        jLabel7.setText("Moto");

        jLabel8.setText("Bicicleta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(defaultCapacity)
                            .addComponent(costomCapacity))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel4))
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CarCapacity, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addComponent(MotorcycleCapacity)
                            .addComponent(BikeCapacity))
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Buttonacept))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(customPrices)
                                            .addComponent(defaultPrices))
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addComponent(jLabel6)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(CarPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                            .addComponent(MotorcyclePrice)
                                            .addComponent(BikePrice))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(defaultCapacity)
                        .addGap(18, 18, 18)
                        .addComponent(costomCapacity))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CarCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MotorcycleCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BikeCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(defaultPrices)
                        .addGap(18, 18, 18)
                        .addComponent(customPrices))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CarPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MotorcyclePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BikePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGap(19, 19, 19)
                .addComponent(Buttonacept)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonaceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonaceptActionPerformed
    ParkingInterface openParking = new ParkingInterface();
    openParking.setVisible(true);
    this.setVisible(false);
    int CVector[]=new int[3];
    int PVector[]=new int[3];
    Parking Parking1= new Parking();
    switch(c){
        case 1:
            CVector[0]=12;
            CVector[1]=8;
            CVector[2]=6;
            break;
        case 2:
            CVector[0]=Integer.parseInt(CarCapacity.getText());
            CVector[1]=Integer.parseInt(MotorcycleCapacity.getText());
            CVector[2]=Integer.parseInt(BikeCapacity.getText());
            break;
        default:
            break;
    }
    switch(p){
        case 1:
            PVector[0]=75;
            PVector[1]=20;
            PVector[2]=10;
            break;
        case 2:
            PVector[0]=Integer.parseInt(CarPrice.getText());
            PVector[1]=Integer.parseInt(MotorcyclePrice.getText());
            PVector[2]=Integer.parseInt(BikePrice.getText());
            break;
        default:
            break;
    }
    }//GEN-LAST:event_ButtonaceptActionPerformed

    private void defaultPricesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defaultPricesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_defaultPricesActionPerformed

    private void defaultCapacityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_defaultCapacityMouseClicked
        c=1;
    }//GEN-LAST:event_defaultCapacityMouseClicked

    private void costomCapacityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_costomCapacityMouseClicked
       c=2;
    }//GEN-LAST:event_costomCapacityMouseClicked

    private void defaultPricesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_defaultPricesMouseClicked
        p=1;
    }//GEN-LAST:event_defaultPricesMouseClicked

    private void customPricesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customPricesMouseClicked
        p=2;
    }//GEN-LAST:event_customPricesMouseClicked

    private void CarCapacityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarCapacityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CarCapacityActionPerformed

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
            java.util.logging.Logger.getLogger(ParkingParameters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParkingParameters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParkingParameters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParkingParameters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParkingParameters().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BikeCapacity;
    private javax.swing.JTextField BikePrice;
    private javax.swing.JButton Buttonacept;
    private javax.swing.JTextField CarCapacity;
    private javax.swing.JTextField CarPrice;
    private javax.swing.JTextField MotorcycleCapacity;
    private javax.swing.JTextField MotorcyclePrice;
    private javax.swing.ButtonGroup capacity;
    private javax.swing.JRadioButton costomCapacity;
    private javax.swing.JRadioButton customPrices;
    private javax.swing.JRadioButton defaultCapacity;
    private javax.swing.JRadioButton defaultPrices;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.ButtonGroup prices;
    // End of variables declaration//GEN-END:variables

    private void swicth(int c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void swicht(int c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
