package fr.unice.polytech.appserv.mini_jira.storage;


import java.io.Serializable;

public class Task implements Serializable {

	private int id;
	private String projectId;
	private String developerId;
	private String contents;


	public Task() {}

	public Task(int id, String pid, String contents) {
		this.id = id;
		this.projectId = pid;
		this.contents = contents;
	}

	public void setId(int id) { this.id = id; }
	public int getId() {
		return id;
	}

	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) { this.projectId = projectId; }

	public String getDeveloperId() {
		return developerId;
	}
	public void setDeveloperId(String developerId) {
		this.developerId = developerId;
	}

	public String getContents() {
		return contents;
	}
	public void setContents(String contents) { this.contents = contents; }

}
