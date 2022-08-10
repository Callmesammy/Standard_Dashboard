
package components;

import Model.Model_menu;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;


public class Menu_item extends javax.swing.JPanel {


   private Model_menu data;
   
   private boolean selected;
   private boolean Over;
   
    public Menu_item(Model_menu data) {
        initComponents();
        setOpaque(false);
        if (data.getType()==Model_menu.MenuType.MENU) {
            ibicon.setIcon(data.toIcon());
            ibiname.setText(data.getTitle());
            
        }else if (data.getType()==Model_menu.MenuType.TITLE) {
            ibicon.setText(data.getTitle());
            ibicon.setFont(new Font("sansserif", 1, 13));
            ibiname.setVisible(false);
            
        }else if (data.getType()==Model_menu.MenuType.EMPTY) {
            ibiname.setText(" ");
            
        }
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }
 public void setOver(boolean Over) {
        this.Over = Over;
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ibiname = new javax.swing.JLabel();
        ibicon = new javax.swing.JLabel();

        ibiname.setForeground(new java.awt.Color(255, 255, 255));
        ibiname.setText("Data Name ");

        ibicon.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(ibicon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ibiname, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ibiname, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
            .addComponent(ibicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        if (selected || Over) {
            Graphics2D g2 = (Graphics2D)g;
            if (selected) {
                g2.setColor(new Color(255,255,255,80));
            }else{
                g2.setColor(new Color(255,255,255,20));
            }
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.fillRoundRect(10, 0, getWidth(), getHeight(), 5, 5);
        g2.fillRect(15, 0, getWidth(), getHeight());
             
        }
        super.paintComponent(g); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ibicon;
    private javax.swing.JLabel ibiname;
    // End of variables declaration//GEN-END:variables
}
