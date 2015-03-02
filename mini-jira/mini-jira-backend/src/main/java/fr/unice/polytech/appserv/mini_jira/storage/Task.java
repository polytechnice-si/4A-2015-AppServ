package fr.unice.polytech.appserv.mini_jira.storage;


import java.io.Serializable;

public class Task implements Serializable {

	private int id;
	private String project_id;
	private String developer_id;
	private String contents;


	public Task(int id, String pid, String contents) {
		this.id = id;
		this.project_id = pid;
		this.contents = contents;
	}

	public int getId() {
		return id;
	}

	public String getProject_id() {
		return project_id;
	}

	public String getDeveloper_id() {
		return developer_id;
	}

	public void setDeveloper_id(String developer_id) {
		this.developer_id = developer_id;
	}

	public String getContents() {
		return contents;
	}

}
