
package Swing;

import Model.Picture_model;
import javax.swing.ImageIcon;


public class Body extends javax.swing.JPanel {

   
    public Body() {
        initComponents();
        init();
    }
    private void init(){
        picture_carrier1.addImagee(new Picture_model(new ImageIcon(getClass().getResource("/Picture/box/002.png")), "Buziness Ethics", "Building the two bridges"));
        picture_carrier1.addImagee(new Picture_model(new ImageIcon(getClass().getResource("/Picture/box/001.jpg")), "Buziness Ethics", "Building the two bridges"));
        picture_carrier1.addImagee(new Picture_model(new ImageIcon(getClass().getResource("/Picture/box/003.jpg")), "Buziness Ethics", "Building the two bridges"));
        picture_carrier1.addImagee(new Picture_model(new ImageIcon(getClass().getResource("/Picture/box/004.jpg")), "Buziness Ethics", "Building the two bridges"));
        picture_carrier1.addImagee(new Picture_model(new ImageIcon(getClass().getResource("/Picture/box/007.jpg")), "Buziness Ethics", "Building the two bridges"));
        picture_carrier1.addImagee(new Picture_model(new ImageIcon(getClass().getResource("/Picture/box/008.jpg")), "Buziness Ethics", "Building the two bridges"));
        picture_carrier1.addImagee(new Picture_model(new ImageIcon(getClass().getResource("/Picture/box/009.jpg")), "Buziness Ethics", "Building the two bridges"));
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        picture_carrier1 = new components.Picture_carrier();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new components.Table();

        setBackground(new java.awt.Color(235, 234, 242));

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(74, 8, 67));
        jLabel1.setText("This Remain Constant");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(78, 5, 63));
        jLabel2.setText("Yea it does");

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"sddsdsds", "sddsds", null, null, null},
                {"dssdd", null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Surname", "Description", "Comments", "Statistics"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(picture_carrier1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(picture_carrier1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private components.Picture_carrier picture_carrier1;
    private components.Table table1;
    // End of variables declaration//GEN-END:variables
}
