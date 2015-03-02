package fr.unice.polytech.appserv.mini_jira.storage;


import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Startup
@Singleton
public class ProjectDB {

	private Map<String,List<String>> projects;

	@PostConstruct
	void init() {
		projects = new HashMap<>();
	}


	public Map<String,List<String>> getProjects() { return projects; }


}
