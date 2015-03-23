
package stub;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the stub package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateNewProjectResponse_QNAME = new QName("http://webservice.mini_jira.appserv.polytech.unice.fr/", "createNewProjectResponse");
    private final static QName _ListTasksResponse_QNAME = new QName("http://webservice.mini_jira.appserv.polytech.unice.fr/", "listTasksResponse");
    private final static QName _PushTasks_QNAME = new QName("http://webservice.mini_jira.appserv.polytech.unice.fr/", "pushTasks");
    private final static QName _PushTasksResponse_QNAME = new QName("http://webservice.mini_jira.appserv.polytech.unice.fr/", "pushTasksResponse");
    private final static QName _CreateNewProject_QNAME = new QName("http://webservice.mini_jira.appserv.polytech.unice.fr/", "createNewProject");
    private final static QName _ListTasks_QNAME = new QName("http://webservice.mini_jira.appserv.polytech.unice.fr/", "listTasks");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: stub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateNewProject }
     * 
     */
    public CreateNewProject createCreateNewProject() {
        return new CreateNewProject();
    }

    /**
     * Create an instance of {@link ListTasks }
     * 
     */
    public ListTasks createListTasks() {
        return new ListTasks();
    }

    /**
     * Create an instance of {@link ListTasksResponse }
     * 
     */
    public ListTasksResponse createListTasksResponse() {
        return new ListTasksResponse();
    }

    /**
     * Create an instance of {@link CreateNewProjectResponse }
     * 
     */
    public CreateNewProjectResponse createCreateNewProjectResponse() {
        return new CreateNewProjectResponse();
    }

    /**
     * Create an instance of {@link PushTasksResponse }
     * 
     */
    public PushTasksResponse createPushTasksResponse() {
        return new PushTasksResponse();
    }

    /**
     * Create an instance of {@link PushTasks }
     * 
     */
    public PushTasks createPushTasks() {
        return new PushTasks();
    }

    /**
     * Create an instance of {@link Task }
     * 
     */
    public Task createTask() {
        return new Task();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateNewProjectResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.mini_jira.appserv.polytech.unice.fr/", name = "createNewProjectResponse")
    public JAXBElement<CreateNewProjectResponse> createCreateNewProjectResponse(CreateNewProjectResponse value) {
        return new JAXBElement<CreateNewProjectResponse>(_CreateNewProjectResponse_QNAME, CreateNewProjectResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListTasksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.mini_jira.appserv.polytech.unice.fr/", name = "listTasksResponse")
    public JAXBElement<ListTasksResponse> createListTasksResponse(ListTasksResponse value) {
        return new JAXBElement<ListTasksResponse>(_ListTasksResponse_QNAME, ListTasksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PushTasks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.mini_jira.appserv.polytech.unice.fr/", name = "pushTasks")
    public JAXBElement<PushTasks> createPushTasks(PushTasks value) {
        return new JAXBElement<PushTasks>(_PushTasks_QNAME, PushTasks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PushTasksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.mini_jira.appserv.polytech.unice.fr/", name = "pushTasksResponse")
    public JAXBElement<PushTasksResponse> createPushTasksResponse(PushTasksResponse value) {
        return new JAXBElement<PushTasksResponse>(_PushTasksResponse_QNAME, PushTasksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateNewProject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.mini_jira.appserv.polytech.unice.fr/", name = "createNewProject")
    public JAXBElement<CreateNewProject> createCreateNewProject(CreateNewProject value) {
        return new JAXBElement<CreateNewProject>(_CreateNewProject_QNAME, CreateNewProject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListTasks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.mini_jira.appserv.polytech.unice.fr/", name = "listTasks")
    public JAXBElement<ListTasks> createListTasks(ListTasks value) {
        return new JAXBElement<ListTasks>(_ListTasks_QNAME, ListTasks.class, null, value);
    }

}
