/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI2;

import javax.swing.JOptionPane;

/**
 *
 * @author grand
 */
public class Volume extends javax.swing.JFrame {

    /**
     * Creates new form Volume
     */
    public Volume() {
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

        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Balok = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Panjang = new javax.swing.JTextField();
        Lebar = new javax.swing.JTextField();
        Tinggi = new javax.swing.JTextField();
        Hitung = new javax.swing.JButton();
        Kubus = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Sisi = new javax.swing.JTextField();
        Hitung1 = new javax.swing.JButton();
        Bola = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Jari = new javax.swing.JTextField();
        Hitung2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTabbedPane1.setBackground(new java.awt.Color(52, 54, 56));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Masukkan Panjang : ");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Masukkan Lebar     : ");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Masukkan Tinggi    :");

        Panjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PanjangActionPerformed(evt);
            }
        });

        Tinggi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TinggiActionPerformed(evt);
            }
        });

        Hitung.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Hitung.setText("Hitung");
        Hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitungActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BalokLayout = new javax.swing.GroupLayout(Balok);
        Balok.setLayout(BalokLayout);
        BalokLayout.setHorizontalGroup(
            BalokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BalokLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(BalokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BalokLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Panjang, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BalokLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lebar, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BalokLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Tinggi, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
            .addGroup(BalokLayout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(Hitung, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BalokLayout.setVerticalGroup(
            BalokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BalokLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(BalokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(BalokLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(Panjang, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(BalokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Lebar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(BalokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Tinggi, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(Hitung, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jTabbedPane1.addTab("Balok", Balok);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Masukkan Sisi      : ");

        Hitung1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Hitung1.setText("Hitung");
        Hitung1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hitung1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout KubusLayout = new javax.swing.GroupLayout(Kubus);
        Kubus.setLayout(KubusLayout);
        KubusLayout.setHorizontalGroup(
            KubusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
            .addGroup(KubusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(KubusLayout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addGroup(KubusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KubusLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Sisi, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(KubusLayout.createSequentialGroup()
                            .addGap(137, 137, 137)
                            .addComponent(Hitung1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(44, Short.MAX_VALUE)))
        );
        KubusLayout.setVerticalGroup(
            KubusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 264, Short.MAX_VALUE)
            .addGroup(KubusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(KubusLayout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addGroup(KubusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(Sisi, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(87, 87, 87)
                    .addComponent(Hitung1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(52, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Kubus", Kubus);

        Bola.setForeground(new java.awt.Color(178, 178, 178));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Masukkan Jari-Jari      : ");

        Hitung2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Hitung2.setText("Hitung");
        Hitung2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hitung2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BolaLayout = new javax.swing.GroupLayout(Bola);
        Bola.setLayout(BolaLayout);
        BolaLayout.setHorizontalGroup(
            BolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
            .addGroup(BolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BolaLayout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addGroup(BolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BolaLayout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Jari, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(BolaLayout.createSequentialGroup()
                            .addGap(137, 137, 137)
                            .addComponent(Hitung2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(19, Short.MAX_VALUE)))
        );
        BolaLayout.setVerticalGroup(
            BolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 264, Short.MAX_VALUE)
            .addGroup(BolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BolaLayout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addGroup(BolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(Jari, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(87, 87, 87)
                    .addComponent(Hitung2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(52, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Bola", Bola);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 60, 480, 290);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Program Pencari Volume Bangun Ruang");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 10, 400, 30);

        jPanel5.setBackground(new java.awt.Color(101, 6, 20));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 0, 500, 360);

        setBounds(0, 0, 517, 398);
    }// </editor-fold>//GEN-END:initComponents

    private void TinggiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TinggiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TinggiActionPerformed

    private void PanjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PanjangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PanjangActionPerformed

    private void HitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitungActionPerformed
        int panjang,lebar,tinggi,hasil;
        panjang=Integer.parseInt(Panjang.getText());
        lebar=Integer.parseInt(Lebar.getText());
        tinggi=Integer.parseInt(Tinggi.getText());
        hasil=panjang*lebar*tinggi;
        try
        {
            JOptionPane.showMessageDialog(null,"Volume Balok Adalah: "+hasil,"LUAS",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"ERROR"+e,"Gagal",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_HitungActionPerformed

    private void Hitung1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hitung1ActionPerformed
        int sisi,hasil;
        sisi=Integer.parseInt(Sisi.getText());
        hasil=sisi*sisi*sisi;
        try
        {
            JOptionPane.showMessageDialog(null,"Volume Kubus Adalah: "+hasil,"LUAS",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"ERROR"+e,"Gagal",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_Hitung1ActionPerformed

    private void Hitung2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hitung2ActionPerformed
        double jarijari;
        jarijari=Integer.parseInt(Jari.getText());
        double hasil=(4/3*3.14*jarijari*jarijari*jarijari);
        try
        {
            JOptionPane.showMessageDialog(null,"Volume Bola Adalah: "+hasil,"LUAS",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"ERROR"+e,"Gagal",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_Hitung2ActionPerformed

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
            java.util.logging.Logger.getLogger(Volume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Volume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Volume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Volume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Volume().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Balok;
    private javax.swing.JPanel Bola;
    private javax.swing.JButton Hitung;
    private javax.swing.JButton Hitung1;
    private javax.swing.JButton Hitung2;
    private javax.swing.JTextField Jari;
    private javax.swing.JPanel Kubus;
    private javax.swing.JTextField Lebar;
    private javax.swing.JTextField Panjang;
    private javax.swing.JTextField Sisi;
    private javax.swing.JTextField Tinggi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
