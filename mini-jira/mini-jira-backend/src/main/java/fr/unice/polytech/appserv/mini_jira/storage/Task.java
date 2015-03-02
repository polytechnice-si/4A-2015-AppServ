package fr.unice.polytech.appserv.mini_jira.storage;


public class Task {

	private int id;
	private String project_id;
	private String developer_id;
	private String contents;


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
