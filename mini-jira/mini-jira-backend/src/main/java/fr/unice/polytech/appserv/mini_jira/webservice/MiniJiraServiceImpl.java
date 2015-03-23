package fr.unice.polytech.appserv.mini_jira.webservice;


import fr.unice.polytech.appserv.mini_jira.ProjectManager;
import fr.unice.polytech.appserv.mini_jira.TeamWork;
import fr.unice.polytech.appserv.mini_jira.storage.Task;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.*;
import java.util.List;

@WebService(targetNamespace = "http://www.polytech.unice.fr/si/4a/appserv/demos")
@Stateless(name = "MiniJiraService")
public class MiniJiraServiceImpl implements MiniJiraService {

	@EJB private ProjectManager projectManagerBean;
	@EJB private TeamWork teamWorkBean;

	// Exposed at "http://localhost:8080/minijira-back/webservices/MiniJiraService"
	// see tomee:run trace, looking for WebService log

	@WebMethod
	@Override
	public boolean createNewProject(String projectId, String[] developers) {
		projectManagerBean.startProject(projectId);
		for(String dev: developers)
			projectManagerBean.staffProject(projectId, dev);
		return true;
	}

	@WebMethod
	@Override
	public boolean pushTasks(String projectId, String contents, String developerId) {
		int taskId = teamWorkBean.createTask(contents, projectId);
		teamWorkBean.assign(taskId, developerId);
		return true;
	}

	@WebMethod
	@Override
	public Task[] listTasks(String projectId) {
		List<Task> tasks = teamWorkBean.getTasks(projectId);
		Task[] result = new Task[tasks.size()];
		for(int i = 0; i < result.length; i++)
			result[i] = tasks.get(i);
		return result;
	}


}
