package fr.unice.polytech.appserv.mini_jira;

import fr.unice.polytech.appserv.mini_jira.storage.Task;

import javax.ejb.Remote;
import java.util.List;


@Remote
public interface TeamWork {

	public int createTask(String contents, String project_id);

	public boolean assign(int task_id, String developer_id);

	public List<Task> getTasks(String project_id);

}
