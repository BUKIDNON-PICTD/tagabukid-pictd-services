/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tagabukid.pictdservice.views;

/**
 *
 * @author a
 */
public class pictdPersonnelTicketEntry extends javax.swing.JFrame {

    /**
     * Creates new form pictdPersonnelTicketEntry
     */
    public pictdPersonnelTicketEntry() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        xFormPanel2 = new com.rameses.rcp.control.XFormPanel();
        xLookupField1 = new com.rameses.rcp.control.XLookupField();
        jScrollPane1 = new javax.swing.JScrollPane();
        xTextArea1 = new com.rameses.rcp.control.XTextArea();
        xRadio1 = new com.rameses.rcp.control.XRadio();
        xRadio2 = new com.rameses.rcp.control.XRadio();
        xRadio3 = new com.rameses.rcp.control.XRadio();
        xFormPanel1 = new com.rameses.rcp.control.XFormPanel();
        xLookupField3 = new com.rameses.rcp.control.XLookupField();
        xLookupField5 = new com.rameses.rcp.control.XLookupField();
        xFormPanel3 = new com.rameses.rcp.control.XFormPanel();
        xLabel1 = new com.rameses.rcp.control.XLabel();
        xFormPanel4 = new com.rameses.rcp.control.XFormPanel();
        xLookupField2 = new com.rameses.rcp.control.XLookupField();
        jScrollPane3 = new javax.swing.JScrollPane();
        xTextArea3 = new com.rameses.rcp.control.XTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        xTextArea4 = new com.rameses.rcp.control.XTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Service Request Details");
        xFormPanel2.setBorder(xTitledBorder1);
        xFormPanel2.setCaptionWidth(100);
        xFormPanel2.setOrientation(com.rameses.rcp.constant.UIConstants.FLOW);

        xLookupField1.setText("xLookupField1");
        xLookupField1.setCaption("Service Type");
        xLookupField1.setCaptionWidth(100);
        xLookupField1.setPreferredSize(new java.awt.Dimension(300, 20));
        xFormPanel2.add(xLookupField1);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(300, 63));

        xTextArea1.setCaption("Particulars");
        xTextArea1.setPreferredSize(new java.awt.Dimension(300, 61));
        jScrollPane1.setViewportView(xTextArea1);

        xFormPanel2.add(jScrollPane1);

        xRadio1.setCaption("Priority");
        xRadio1.setName("entity.priority"); // NOI18N
        xRadio1.setText("Low");
        xFormPanel2.add(xRadio1);

        xRadio2.setCaption("");
        xRadio2.setName("entity.priority"); // NOI18N
        xRadio2.setText("Medium");
        xFormPanel2.add(xRadio2);

        xRadio3.setCaption("");
        xRadio3.setName("entity.priority"); // NOI18N
        xRadio3.setText("High");
        xFormPanel2.add(xRadio3);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder2 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder2.setTitle("Employee's Information");
        xFormPanel1.setBorder(xTitledBorder2);

        xLookupField3.setText("xLookupField3");
        xLookupField3.setCaption("Employee Name");
        xLookupField3.setCaptionWidth(100);
        xLookupField3.setPreferredSize(new java.awt.Dimension(300, 20));
        xFormPanel1.add(xLookupField3);

        xLookupField5.setText("xLookupField5");
        xLookupField5.setCaption("Employee Office");
        xLookupField5.setCaptionWidth(100);
        xLookupField5.setPreferredSize(new java.awt.Dimension(300, 20));
        xFormPanel1.add(xLookupField5);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder3 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder3.setTitle("Request Service Status");
        xFormPanel3.setBorder(xTitledBorder3);

        xLabel1.setCaption("");
        xLabel1.setCaptionWidth(130);
        xLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        xLabel1.setForeground(new java.awt.Color(255, 0, 51));
        xLabel1.setText("PENDING");
        xFormPanel3.add(xLabel1);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder4 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder4.setTitle("PICTD Personnel Diagnosis/Findings");
        xFormPanel4.setBorder(xTitledBorder4);
        xFormPanel4.setCaptionWidth(110);

        xLookupField2.setText("xLookupField2");
        xLookupField2.setCaption("Personnel Name");
        xLookupField2.setPreferredSize(new java.awt.Dimension(250, 20));
        xFormPanel4.add(xLookupField2);

        xTextArea3.setCaption("Diagnosis");
        xTextArea3.setPreferredSize(new java.awt.Dimension(0, 61));
        xTextArea3.setReadonly(true);
        xTextArea3.setStretchWidth(96);
        jScrollPane3.setViewportView(xTextArea3);

        xFormPanel4.add(jScrollPane3);

        xTextArea4.setCaption("Resolution");
        xTextArea4.setCaptionFontStyle("");
        xTextArea4.setPreferredSize(new java.awt.Dimension(0, 61));
        xTextArea4.setReadonly(true);
        xTextArea4.setStretchWidth(96);
        jScrollPane4.setViewportView(xTextArea4);

        xFormPanel4.add(jScrollPane4);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(xFormPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                    .add(xFormPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(xFormPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(xFormPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(xFormPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 82, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(xFormPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(xFormPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .add(xFormPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(pictdPersonnelTicketEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pictdPersonnelTicketEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pictdPersonnelTicketEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pictdPersonnelTicketEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pictdPersonnelTicketEntry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    private com.rameses.rcp.control.XFormPanel xFormPanel2;
    private com.rameses.rcp.control.XFormPanel xFormPanel3;
    private com.rameses.rcp.control.XFormPanel xFormPanel4;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLookupField xLookupField1;
    private com.rameses.rcp.control.XLookupField xLookupField2;
    private com.rameses.rcp.control.XLookupField xLookupField3;
    private com.rameses.rcp.control.XLookupField xLookupField5;
    private com.rameses.rcp.control.XRadio xRadio1;
    private com.rameses.rcp.control.XRadio xRadio2;
    private com.rameses.rcp.control.XRadio xRadio3;
    private com.rameses.rcp.control.XTextArea xTextArea1;
    private com.rameses.rcp.control.XTextArea xTextArea3;
    private com.rameses.rcp.control.XTextArea xTextArea4;
    // End of variables declaration//GEN-END:variables
}
