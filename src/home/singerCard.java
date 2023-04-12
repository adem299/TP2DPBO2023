/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package home;

import controller.dbConnection;
import java.awt.Container;
import javax.swing.JOptionPane;

/**
 *
 * @author Ade Mulyana
 */
public class singerCard extends javax.swing.JPanel {

    /**
     * Creates new form singerCard
     */
    
    private dbConnection db;
    public singerCard(int id, String name, String country, String gender, String birth) {
        initComponents();
        idLabelHide.setText(Integer.toString(id));
        nameLabel.setText(name);
        countryLabel.setText(country);
        genderLabel.setText(gender);
        birthLabel.setText(birth);
    }
    
    public void deleteData() {
        // Remove Data from List
        String name = nameLabel.getText();
        int id = 0;
        String idTemp = idLabelHide.getText();
        try {
            id = Integer.parseInt(idTemp); // mengonversi nilai string menjadi integer dan menyimpannya ke dalam variabel id
        } catch (NumberFormatException ex) {
            System.out.println("Nilai tidak valid");
        }
        db = new dbConnection();

        String sql = "DELETE FROM singer WHERE singer_id='"+id+"'";
        db.updateQuery(sql);
        
        // Update Table

        // Reset Form
//        resetForm();
        
        // Show Information
        System.out.println("Delete success!");
        JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLabel = new javax.swing.JLabel();
        countryLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        idLabelHide = new javax.swing.JLabel();
        birthLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 51, 102));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        setForeground(new java.awt.Color(255, 255, 255));

        nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("name");

        countryLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        countryLabel.setForeground(new java.awt.Color(255, 255, 255));
        countryLabel.setText("country");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton1.setText("update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton2.setText("delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        idLabelHide.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        idLabelHide.setForeground(new java.awt.Color(255, 255, 255));
        idLabelHide.setText("jLabel2");

        birthLabel.setForeground(new java.awt.Color(255, 255, 255));
        birthLabel.setText("Birhday");

        genderLabel.setForeground(new java.awt.Color(255, 255, 255));
        genderLabel.setText("Gender");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Born");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(idLabelHide)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(countryLabel)
                    .addComponent(genderLabel))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(birthLabel)
                    .addComponent(jLabel1))
                .addGap(57, 57, 57)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(countryLabel)
                            .addComponent(jLabel1)
                            .addComponent(idLabelHide))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(genderLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel)
                            .addComponent(birthLabel)
                            .addComponent(jButton1)
                            .addComponent(jButton2))))
                .addGap(0, 22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String idTemp = idLabelHide.getText();
        int idInt = 0;
        idInt = Integer.parseInt(idTemp);
        updateFrame panel = new updateFrame(idInt);
        panel.setVisible(true);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        deleteData();

    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel birthLabel;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel idLabelHide;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nameLabel;
    // End of variables declaration//GEN-END:variables
}
