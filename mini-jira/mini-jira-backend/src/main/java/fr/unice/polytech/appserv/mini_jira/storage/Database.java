package fr.unice.polytech.appserv.mini_jira.storage;


import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Startup
@Singleton
public class Database {

	private Map<String,List<String>> projects;
	private List<Task> tasks;
	private int counter;

	@PostConstruct
	void init() {
		projects = new HashMap<>();
		tasks = new LinkedList<>();
		counter = 0;
	}

	public Map<String,List<String>> getProjects() { return projects; }

	public List<Task> getTasks() { return tasks; }

	public int count() {
		counter++;
		return counter;
	}


}
