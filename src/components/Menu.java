
package components;

import Model.Model_menu;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;


public class Menu extends javax.swing.JPanel {
    
public EventMenuSelected event;

   public void addEventMenuSelected(EventMenuSelected event){
      this.event=event;
   } 
    public Menu() {
        initComponents();
        setOpaque(false);
        init();
    }

    private void init(){
        listMenuItem1.setOpaque(false);
      listMenuItem1.addItem(new Model_menu("", "List Items", Model_menu.MenuType.TITLE));
      listMenuItem1.addItem(new Model_menu("01", "Meet Us", Model_menu.MenuType.MENU));
      listMenuItem1.addItem(new Model_menu("02", "Reach Us", Model_menu.MenuType.MENU));
      listMenuItem1.addItem(new Model_menu("03", "Asemmbled", Model_menu.MenuType.MENU));
      listMenuItem1.addItem(new Model_menu("04", "Keeping it ", Model_menu.MenuType.MENU));
      listMenuItem1.addItem(new Model_menu("", "", Model_menu.MenuType.EMPTY));
       listMenuItem1.addItem(new Model_menu("", "More Items", Model_menu.MenuType.TITLE));
      listMenuItem1.addItem(new Model_menu("001", "Extra Special", Model_menu.MenuType.MENU));
      listMenuItem1.addItem(new Model_menu("002", "Facebook at", Model_menu.MenuType.MENU));
      listMenuItem1.addItem(new Model_menu("003", "Dwingling", Model_menu.MenuType.MENU));
      listMenuItem1.addItem(new Model_menu("004", "Buzzling buzz", Model_menu.MenuType.MENU));
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listMenuItem1 = new components.ListMenuItem<>();
        jLabel1 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sammy/picture/icon/icons8-close-64.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(listMenuItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listMenuItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
  @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(getBackground());
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g7 = new GradientPaint(0, 0, Color.decode("#00B4DB"), 0, getHeight(), Color.decode("#0083B0"), true);
        g2.setPaint(g7);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 23, 23);
        g2.fillRect(getWidth()-23, 0, getWidth(), getHeight());
      
        super.paintComponent(g); 
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private components.ListMenuItem<String> listMenuItem1;
    // End of variables declaration//GEN-END:variables
}
