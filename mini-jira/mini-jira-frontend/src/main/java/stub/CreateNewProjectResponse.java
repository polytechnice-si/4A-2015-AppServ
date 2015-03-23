
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createNewProjectResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createNewProjectResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createNewProjectResponse", propOrder = {
    "created"
})
public class CreateNewProjectResponse {

    protected boolean created;

    /**
     * Gets the value of the created property.
     * 
     */
    public boolean isCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     */
    public void setCreated(boolean value) {
        this.created = value;
    }

}
