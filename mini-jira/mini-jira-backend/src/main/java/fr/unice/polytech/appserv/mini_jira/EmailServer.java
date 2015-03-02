package fr.unice.polytech.appserv.mini_jira;


public interface EmailServer {

	public boolean sendMessage(String to, String object, String message);

}
