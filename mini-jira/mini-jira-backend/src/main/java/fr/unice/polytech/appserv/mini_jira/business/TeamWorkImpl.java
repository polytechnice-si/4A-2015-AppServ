package fr.unice.polytech.appserv.mini_jira.business;

import fr.unice.polytech.appserv.mini_jira.EmailServer;
import fr.unice.polytech.appserv.mini_jira.TeamWork;
import fr.unice.polytech.appserv.mini_jira.storage.Database;
import fr.unice.polytech.appserv.mini_jira.storage.Task;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.LinkedList;
import java.util.List;

@Stateless
public class TeamWorkImpl implements TeamWork {

	@EJB private Database db;
	@EJB private EmailServer email;

	@Override
	public int createTask(String contents, String project_id) {
		int counter = db.count();
		Task t = new Task(counter, project_id, contents);
		db.getTasks().add(t);
		email.sendMessage("admin", "New task created", "A new task was created ...");
		return counter;
	}

	@Override
	public boolean assign(int task_id, String developer_id) {
		List<Task> tasks = db.getTasks();
		for(Task t: tasks) {
			if(t.getId() == task_id){
				t.setDeveloperId(developer_id);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Task> getTasks(String project_id) {
		List<Task> result = new LinkedList<>();
		List<Task> tasks = db.getTasks();
		for(Task t: tasks) {
			if(t.getProjectId().equals(project_id)){
				result.add(t);
			}
		}
		return result;
	}
}
