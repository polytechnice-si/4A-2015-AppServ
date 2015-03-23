
package stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pushTasks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pushTasks">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="project_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="developer_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pushTasks", propOrder = {
    "projectId",
    "contents",
    "developerId"
})
public class PushTasks {

    @XmlElement(name = "project_id")
    protected String projectId;
    protected String contents;
    @XmlElement(name = "developer_id")
    protected String developerId;

    /**
     * Gets the value of the projectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectId(String value) {
        this.projectId = value;
    }

    /**
     * Gets the value of the contents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContents() {
        return contents;
    }

    /**
     * Sets the value of the contents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContents(String value) {
        this.contents = value;
    }

    /**
     * Gets the value of the developerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeveloperId() {
        return developerId;
    }

    /**
     * Sets the value of the developerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeveloperId(String value) {
        this.developerId = value;
    }

}
