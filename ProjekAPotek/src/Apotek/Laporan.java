/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apotek;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author user
 */
public class Laporan extends javax.swing.JFrame {

    /**
     * Creates new form Resep
     */
    public Laporan() {
        this.setWaktu();
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        txtWelcome.setText(MainMenu.txtWelcome.getText());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new Apotek.SetImage("/image/wall.png");
        clPanelTransparan1 = new PanelTransparan.ClPanelTransparan();
        txtWelcome = new javax.swing.JLabel();
        txtTanggal = new javax.swing.JLabel();
        btnKeluar = new javax.swing.JLabel();
        clPanelTransparan2 = new PanelTransparan.ClPanelTransparan();
        btnHapus1 = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Resep");

        clPanelTransparan1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        clPanelTransparan1.setMinimumSize(new java.awt.Dimension(1370, 40));
        clPanelTransparan1.setPreferredSize(new java.awt.Dimension(1370, 680));

        txtWelcome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtWelcome.setText("jLabel1");

        txtTanggal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTanggal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnKeluar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Home.png"))); // NOI18N
        btnKeluar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKeluarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout clPanelTransparan1Layout = new javax.swing.GroupLayout(clPanelTransparan1);
        clPanelTransparan1.setLayout(clPanelTransparan1Layout);
        clPanelTransparan1Layout.setHorizontalGroup(
            clPanelTransparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clPanelTransparan1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(txtWelcome)
                .addGap(445, 445, 445)
                .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 597, Short.MAX_VALUE)
                .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        clPanelTransparan1Layout.setVerticalGroup(
            clPanelTransparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clPanelTransparan1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(clPanelTransparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTanggal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtWelcome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(btnKeluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnHapus1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cari.png"))); // NOI18N
        btnHapus1.setText("Cari");
        btnHapus1.setFocusable(false);
        btnHapus1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/print.png"))); // NOI18N
        btnHapus.setText("Cetak");
        btnHapus.setFocusable(false);
        btnHapus.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        btnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/zoomIn.png"))); // NOI18N
        btnSimpan.setText("Perbesar");
        btnSimpan.setFocusable(false);
        btnSimpan.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/zoomOut.png"))); // NOI18N
        btnHome.setText("Perkecil");
        btnHome.setFocusable(false);
        btnHome.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout clPanelTransparan2Layout = new javax.swing.GroupLayout(clPanelTransparan2);
        clPanelTransparan2.setLayout(clPanelTransparan2Layout);
        clPanelTransparan2Layout.setHorizontalGroup(
            clPanelTransparan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clPanelTransparan2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHapus1)
                .addGap(18, 18, 18)
                .addComponent(btnHapus)
                .addGap(18, 18, 18)
                .addComponent(btnSimpan)
                .addGap(18, 18, 18)
                .addComponent(btnHome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        clPanelTransparan2Layout.setVerticalGroup(
            clPanelTransparan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clPanelTransparan2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(clPanelTransparan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHapus1)
                    .addComponent(btnHapus)
                    .addComponent(btnSimpan)
                    .addComponent(btnHome))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clPanelTransparan1, javax.swing.GroupLayout.DEFAULT_SIZE, 1396, Short.MAX_VALUE)
            .addComponent(clPanelTransparan2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(clPanelTransparan1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clPanelTransparan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 669, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(414, 414, 414))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKeluarMouseClicked
        // TODO add your handling code here:
        new MainMenu(setApoteker.tmpID, setApoteker.tmpPass).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnKeluarMouseClicked

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
            java.util.logging.Logger.getLogger(Laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }
    
    public final void setWaktu() {
        ActionListener taskPerformer = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nol_jam = "", nol_menit = "", nol_detik = "";

            java.util.Date dateTime = new java.util.Date();
            int nilai_jam = dateTime.getHours();
            int nilai_menit = dateTime.getMinutes();
            int nilai_detik = dateTime.getSeconds();

            if(nilai_jam <= 9) nol_jam="0";
            if(nilai_menit <= 9) nol_menit="0";
            if(nilai_detik <= 9) nol_detik="0";

            String waktu = nol_jam + Integer.toString(nilai_jam);
            String menit = nol_menit + Integer.toString(nilai_menit);
            String detik = nol_detik + Integer.toString(nilai_detik);

            txtTanggal.setText(String.valueOf(LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))) + " " + 
                    waktu + ":" + menit + ":" + detik);
        }
        };
        new Timer(1000, taskPerformer).start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHapus1;
    private javax.swing.JButton btnHome;
    private javax.swing.JLabel btnKeluar;
    private javax.swing.JButton btnSimpan;
    private PanelTransparan.ClPanelTransparan clPanelTransparan1;
    private PanelTransparan.ClPanelTransparan clPanelTransparan2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtTanggal;
    private javax.swing.JLabel txtWelcome;
    // End of variables declaration//GEN-END:variables
}
