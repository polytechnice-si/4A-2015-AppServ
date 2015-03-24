package fr.unice.polytech.appserv.mini_jira.client;

import stub.MiniJiraServiceImplService;
import stub.MiniJiraService;

import javax.xml.ws.BindingProvider;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * To create the stub classes, using IntelliJ:
 *   - right click on the module, select WebServices, Generate Java Code from WSDL
 *   - Fill in the form
 *   - click on Generate
 */
public class Demo {

	// Usage: mvn exec:java -Dexec.args="52.16.30.145", where 52.16.30.145 is the host IP (default is localhost)

	public static void main(String[] args) {

		// Dynamically building the targeted web service location (default to localhost if not provided)
		String host = ( args.length == 0 ? "localhost" : args[0]);
		String address = "http://"+host+":8080/minijira-back/webservices/MiniJiraService";
		URL wsdlLocation = null;
		try { wsdlLocation = new URL(address + "?wsdl"); } catch (Exception e) { System.exit(0); } // UGLY ><

		// Instantiating the client stub code
		MiniJiraServiceImplService srv = new MiniJiraServiceImplService(wsdlLocation); // dynamic WSDL location
		MiniJiraService port = srv.getMiniJiraServiceImplPort();

		// Dynamically setting the address where the web service is really deployed
		((BindingProvider) port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);

		System.out.println("\n#####################################\n");

		// Running the demonstration scenario from the client point of view
		List<String> developers = new ArrayList<>();
		developers.add("mosser"); developers.add("brel");
		System.out.println("## 1. Creating a project");
		port.createNewProject("proj#1", developers);

		// adding some tasks
		System.out.println("## 2. Adding some tasks");
		port.pushTasks("proj#1", "a task #1.1", "mosser");
		port.pushTasks("proj#1","a task #1.2", "brel");
		port.pushTasks("proj#1","a task #1.3", "mosser");

		// retrieving the tasks
		System.out.println("## 3. Retrieving the added tasks");
		List<stub.Task> tasks = port.listTasks("proj#1");
		for(stub.Task t: tasks)
			System.out.println("  - " + t.getProjectId() + " / " + t.getDeveloperId());

		System.out.println("\n#####################################\n");
	}

}
