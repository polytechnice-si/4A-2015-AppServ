package fr.unice.polytech.appserv.mini_jira;


import javax.ejb.Local;


@Local
public interface EmailServer {

	public boolean sendMessage(String to, String object, String message);

}
