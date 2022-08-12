
package components;

import Model.Statustype;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;

/**
 *
 * @author user
 */
public class CellStatus extends JLabel{

   
    private Statustype type;
    
    public CellStatus() {
        setForeground(Color.white);
    }
  
    public Statustype getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
  
      public void setType(Statustype type) {
        this.type = type;
          setText(type.toString());
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(getBackground());
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g7 = null;
             if (type == Statustype.SUCCESS) {
               g7 = new GradientPaint(0, 0, new Color(24, 255, 48 ), 0, getHeight(), new Color(6, 46, 10 ), true);
        } else if (type == Statustype.PENDING) {
            g7 = new GradientPaint(0, 0, new Color(231, 57, 255), 0, getHeight(), new Color(48, 12, 53 ), true);
        }else if (type ==Statustype.FAILED) {
            g7 = new GradientPaint(0, 0, new Color(242, 27, 27 ), 0, getHeight(), new Color(74, 10, 10 ), true);
        }
        g2.setPaint(g7);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 23, 23);
        g2.fillRect(getWidth()-23, 0, getWidth(), getHeight());
        super.paintComponent(g); 
    }

    
}
