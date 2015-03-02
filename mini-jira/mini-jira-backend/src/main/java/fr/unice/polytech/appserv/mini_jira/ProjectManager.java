package fr.unice.polytech.appserv.mini_jira;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface ProjectManager {

	public boolean startProject(String name);

	public boolean staffProject(String name, String developerName);

	public List<String> getStaff(String name);

}
