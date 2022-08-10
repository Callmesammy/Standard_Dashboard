
package Model;

import javax.swing.Icon;

/**
 *
 * @author user
 */
public class Picture_model {

    /**
     * @return the image
     */
    public Icon getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(Icon image) {
        this.image = image;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public Picture_model(Icon image, String name, String description) {
        this.image = image;
        this.name = name;
        this.description = description;
    }

    public Picture_model() {
    }
    
    private Icon image;
    private String name;
    private String description;
}
