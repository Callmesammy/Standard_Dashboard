
package components;

import Model.Model_menu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */


public class ListMenuItem <E extends Object> extends JList<E>{

    public EventMenuSelected event;

   public void addEventMenuSelected(EventMenuSelected event){
      this.event=event;
   } 
    
    private final DefaultListModel model;
    private int selectedindex = -1;
    private int overselected = -1; 
    
    public ListMenuItem() {
    model = new DefaultListModel();
        setModel(model);
        addMouseListener(new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {
            if (SwingUtilities.isLeftMouseButton(e)) {
                int index = locationToIndex(e.getPoint());
                Object value = model.getElementAt(index);
                if (value instanceof Model_menu) {
                 Model_menu menu = (Model_menu)value;
                    if (menu.getType()==Model_menu.MenuType.MENU) {
                        selectedindex = index;
                        if(event != null) {
                          event.Selected(index);
                        }
                    }else{
                        
                    }
                    
                } repaint();
               
            }
        }
        });
        addMouseMotionListener(new MouseMotionAdapter() {
        @Override
        public void mouseMoved(MouseEvent e) {
          int index = locationToIndex(e.getPoint());
            if (index != 0) {
                Object o = model.getElementAt(index);
                if (o instanceof Model_menu) {
                    Model_menu data = (Model_menu)o;
                    if (data.getType()==Model_menu.MenuType.MENU) {
                        overselected = index;
                    }else{
                        
                    }
                    repaint();
                }
            }
        }
        });
    }

    @Override
    public ListCellRenderer<? super E> getCellRenderer() {
    return new DefaultListCellRenderer(){
        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            Model_menu data;
            if (value instanceof Model_menu) {
                data = (Model_menu)value;
            }else{
                data = new Model_menu("", value+ "",Model_menu.MenuType.EMPTY);
            }
            Menu_item item = new Menu_item(data);
            item.setSelected(selectedindex == index);
            item.setOver(overselected ==index);
            return item;
        }
        
    };
    }
    
    public void addItem(Model_menu data){
        model.addElement(data);
    }
    
    
    
}
