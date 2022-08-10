
package Model;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author user
 */
public class Model_menu {

    /**
     * @return the icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * @param icon the icon to set
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the Type
     */
    public MenuType getType() {
        return Type;
    }

    /**
     * @param Type the Type to set
     */
    public void setType(MenuType Type) {
        this.Type = Type;
    }
    private String icon;
    private String title;
    private MenuType Type;
    
    public static enum MenuType{
        MENU, EMPTY, TITLE
    }

    public Model_menu(String icon, String title, MenuType Type) {
        this.icon = icon;
        this.title = title;
        this.Type = Type;
    }

    public Model_menu() {
    }
    
    public Icon toIcon(){
        return new ImageIcon("/paint/images/" +getIcon()+ ".png");
    }
    
}
