
package components;

import Model.Picture_model;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Picture extends javax.swing.JPanel {

  
    public Picture() {
        initComponents();
        setOpaque(false);
        init();
    }
    
    private void init(){
        setPreferredSize(new Dimension(300,200));
        setMinimumSize(new Dimension(300,200));
        setMaximumSize(new Dimension(300,200));
    }
    
      private Picture_model data;
   
 public Picture_model getData() {
        return data;
    }

    public void setData(Picture_model data) {
        this.data = data;
        ibiname.setText(data.getName());
        ibidescription.setText(data.getDescription());
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        Rectangle size = getAutoSize(data.getImage());
        g2.drawImage(getimage(data.getImage()),size.x,size.y,size.width,size.height, null);
        
        super.paintComponent(g);
    }
    
    private Image getimage(Icon image){
        return  ((ImageIcon)image).getImage();
    }
    
 
    private Rectangle getAutoSize(Icon image) {
        int w = getWidth();
        int h = getHeight();
        int iw = image.getIconWidth();
        int ih = image.getIconHeight();
        double xScale = (double) w / iw;
        double yScale = (double) h / ih;
        double scale = Math.max(xScale, yScale);
        int width = (int) (scale * iw);
        int height = (int) (scale * ih);
        int x = (w - width) / 2;
        int y = (h - height) / 2;
        return new Rectangle(new Point(x, y), new Dimension(width, height));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ibiname = new javax.swing.JLabel();
        ibidescription = new javax.swing.JLabel();

        ibiname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ibiname.setForeground(new java.awt.Color(255, 255, 255));
        ibiname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ibiname.setText("CHECKLIST");

        ibidescription.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ibidescription.setForeground(new java.awt.Color(255, 255, 255));
        ibidescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ibidescription.setText("CHECKLIST");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ibiname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ibidescription, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addComponent(ibiname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ibidescription)
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ibidescription;
    private javax.swing.JLabel ibiname;
    // End of variables declaration//GEN-END:variables
}
