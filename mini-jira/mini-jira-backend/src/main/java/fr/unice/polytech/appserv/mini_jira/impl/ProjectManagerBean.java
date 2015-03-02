package fr.unice.polytech.appserv.mini_jira.impl;

import fr.unice.polytech.appserv.mini_jira.ProjectManager;
import fr.unice.polytech.appserv.mini_jira.storage.ProjectDB;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.LinkedList;
import java.util.List;

@Stateless
public class ProjectManagerBean implements ProjectManager {

	@EJB
	private ProjectDB database;

	@Override
	public boolean startProject(String name) {
		if (database.getProjects().containsKey(name))
			return false;
		database.getProjects().put(name, new LinkedList<String>());
		return true;
	}

	@Override
	public boolean staffProject(String name, String developerName) {
		if (!database.getProjects().containsKey(name))
			return false;
		if(database.getProjects().get(name).contains(developerName))
			return false;
		database.getProjects().get(name).add(developerName);
		return true;
	}

	@Override
	public List<String> getStaff(String name) {
		if (!database.getProjects().containsKey(name))
			return null;
		return database.getProjects().get(name);
	}
}
