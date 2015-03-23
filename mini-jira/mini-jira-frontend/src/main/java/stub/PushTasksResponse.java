
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pushTasksResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pushTasksResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pushed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pushTasksResponse", propOrder = {
    "pushed"
})
public class PushTasksResponse {

    protected boolean pushed;

    /**
     * Gets the value of the pushed property.
     * 
     */
    public boolean isPushed() {
        return pushed;
    }

    /**
     * Sets the value of the pushed property.
     * 
     */
    public void setPushed(boolean value) {
        this.pushed = value;
    }

}
