/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tagabukid.pictdservice.views;

/**
 *
 * @author pictdpc
 */
public class customerTicketEntry extends javax.swing.JPanel {

    /**
     * Creates new form customerTicketEntry1
     */
    public customerTicketEntry() {
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

        xFormPanel1 = new com.rameses.rcp.control.XFormPanel();
        xLookupField3 = new com.rameses.rcp.control.XLookupField();
        xLookupField5 = new com.rameses.rcp.control.XLookupField();
        xFormPanel2 = new com.rameses.rcp.control.XFormPanel();
        xLookupField1 = new com.rameses.rcp.control.XLookupField();
        jScrollPane1 = new javax.swing.JScrollPane();
        xTextArea1 = new com.rameses.rcp.control.XTextArea();
        xRadio1 = new com.rameses.rcp.control.XRadio();
        xRadio2 = new com.rameses.rcp.control.XRadio();
        xRadio3 = new com.rameses.rcp.control.XRadio();

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Employee's Information");
        xFormPanel1.setBorder(xTitledBorder1);

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

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder2 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder2.setTitle("Service Request Details");
        xFormPanel2.setBorder(xTitledBorder2);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(xFormPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                    .addComponent(xFormPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(xFormPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    private com.rameses.rcp.control.XFormPanel xFormPanel2;
    private com.rameses.rcp.control.XLookupField xLookupField1;
    private com.rameses.rcp.control.XLookupField xLookupField3;
    private com.rameses.rcp.control.XLookupField xLookupField5;
    private com.rameses.rcp.control.XRadio xRadio1;
    private com.rameses.rcp.control.XRadio xRadio2;
    private com.rameses.rcp.control.XRadio xRadio3;
    private com.rameses.rcp.control.XTextArea xTextArea1;
    // End of variables declaration//GEN-END:variables
}
