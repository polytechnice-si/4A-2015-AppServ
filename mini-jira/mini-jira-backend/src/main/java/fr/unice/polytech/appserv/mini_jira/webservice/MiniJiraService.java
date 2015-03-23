package fr.unice.polytech.appserv.mini_jira.webservice;

import fr.unice.polytech.appserv.mini_jira.storage.Task;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface MiniJiraService {

	@WebMethod
	@WebResult(name = "created")
	public boolean createNewProject(@WebParam(name = "project_id") String projectId,
									@WebParam(name = "developers") String[] developers);

	@WebMethod
	@WebResult(name = "pushed")
	public boolean pushTasks(@WebParam(name = "project_id")   String projectId,
							 @WebParam(name = "contents")     String contents,
							 @WebParam(name = "developer_id") String developerId);

	@WebMethod
	@WebResult(name = "task_list")
	public Task[] listTasks(@WebParam(name = "project_id") String projectId);
}
