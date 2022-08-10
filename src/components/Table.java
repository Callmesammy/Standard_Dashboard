
package components;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


public class Table extends JTable{

    public Table() {
        setShowHorizontalLines(true);
        setRowHeight(30);
        setGridColor(new Color(102,102,102));
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
               Tableheader header = new Tableheader(value+ "");
                if (column ==4) {
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
               return header;
            }
        });
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                if (column != 4) {
                     Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 
                     setBorder(noFocusBorder);
                     com.setBackground(Color.WHITE);
                     if (isSelected) {
                        com.setForeground(new Color(121,252,121));
                    }else{
                         com.setForeground(new Color(100,150,121));
                     }
                     return com;
                }
                return new JLabel("Testing");
            }
        });
        
    }
    
    
}
