
package components;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author user
 */
public class Tableheader extends JLabel{

    public Tableheader(String text) {
        super(text);
        setOpaque(false);
        setForeground(Color.red);
        setBackground(Color.WHITE);
        setBorder(new EmptyBorder(10,5,10,5));
        
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(230,230,230));
    }
    
    
}
