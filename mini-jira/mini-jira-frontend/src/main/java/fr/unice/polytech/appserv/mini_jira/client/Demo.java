package fr.unice.polytech.appserv.mini_jira.client;

import stub.MiniJiraServiceImplService;
import stub.MiniJiraService;

import javax.xml.ws.BindingProvider;
import java.util.ArrayList;
import java.util.List;

/**
 * To create the stub classes, using IntelliJ:
 *   - right click on the module, select WebServices, Generate Java Code from WSDL
 *   - Fill in the form
 *   - click on Generate
 */
public class Demo {

	public static void main(String[] args) {
		// Instantiating the client stub code
		MiniJiraServiceImplService srv = new MiniJiraServiceImplService();
		MiniJiraService port = srv.getMiniJiraServiceImplPort();

		// Setting the address where the web service is deployed
		((BindingProvider) port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
				"http://localhost:8080/minijira-back/webservices/MiniJiraService");

		// Running the demonstration scenario from the client point of view
		List<String> developers = new ArrayList<>();
		developers.add("mosser"); developers.add("brel");
		port.createNewProject("proj#1", developers);

		 // adding some tasks
		port.pushTasks("proj#1","a task #1.1", "mosser");
		port.pushTasks("proj#1","a task #1.2", "brel");
		port.pushTasks("proj#1","a task #1.3", "mosser");

		// retrieving the tasks
		List<stub.Task> tasks = port.listTasks("proj#1");
		for(stub.Task t: tasks)
			System.out.println("  - " + t.getProjectId() + " / " + t.getDeveloperId());
	}

}
