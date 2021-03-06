/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DEll
 */
public class DelMember extends javax.swing.JFrame {
    
    int indexOfHead;

    /**
     * Creates new form DelMember
     */
    public DelMember() {
        initComponents();
    }
    
    public DelMember(int i)
    {
        initComponents();
        this.indexOfHead=i;
        this.invalidSr.setText("");
        addRowToTable();
    }
    
    public void addRowToTable()
    {
        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        Object rowData[]=new Object[5];
        model.setRowCount(0);
        if(Driver.getInstance().getMem().get(this.indexOfHead).getStu().size()>0)
        {
            for(int i=0;i<Driver.getInstance().getMem().get(this.indexOfHead).getStu().size();i++)
            {
                rowData[0]=i+1;
                rowData[1]=Driver.getInstance().getMem().get(this.indexOfHead).getStu().get(i).getName();
                rowData[2]=Driver.getInstance().getMem().get(this.indexOfHead).getStu().get(i).getGender();
                rowData[3]=Driver.getInstance().getMem().get(this.indexOfHead).getStu().get(i).getQualification();
                rowData[4]=Driver.getInstance().getMem().get(this.indexOfHead).getID();
                model.addRow(rowData);
            }
        }
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        srText = new javax.swing.JTextField();
        invalidSr = new javax.swing.JLabel();
        delButton = new javax.swing.JButton();
        cancelbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr.", "Name", "Gender", "Qualification", "ID"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel1.setText("PROJECT MANAGEMENT SYSTEM");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Enter The Sr. No. of the Member :");

        invalidSr.setText("not found");

        delButton.setBackground(new java.awt.Color(255, 0, 0));
        delButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        delButton.setForeground(new java.awt.Color(255, 255, 255));
        delButton.setText("DELETE");
        delButton.setBorder(null);
        delButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delButtonActionPerformed(evt);
            }
        });

        cancelbutton.setBackground(new java.awt.Color(0, 0, 204));
        cancelbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cancelbutton.setForeground(new java.awt.Color(255, 255, 255));
        cancelbutton.setText("CANCEL");
        cancelbutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancelbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(srText, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(invalidSr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cancelbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(100, 100, 100)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(srText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(invalidSr, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(delButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void delButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delButtonActionPerformed
        // TODO add your handling code here:
        int sr=Integer.parseInt(srText.getText());
        sr=sr-1;
        Driver.getInstance().getMem().get(indexOfHead).getStu().remove(sr);
        addRowToTable();
        this.srText.setText(null);
    }//GEN-LAST:event_delButtonActionPerformed

    private void cancelbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbuttonActionPerformed
        // TODO add your handling code here:
        StudentMenu menu=new StudentMenu(this.indexOfHead);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(DelMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DelMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DelMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DelMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DelMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelbutton;
    private javax.swing.JButton delButton;
    private javax.swing.JLabel invalidSr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField srText;
    // End of variables declaration//GEN-END:variables
}
