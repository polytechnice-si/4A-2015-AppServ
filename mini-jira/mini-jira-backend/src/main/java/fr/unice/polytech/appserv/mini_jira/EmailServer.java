package fr.unice.polytech.appserv.mini_jira;


import javax.ejb.Remote;


@Remote
public interface EmailServer extends java.rmi.Remote {

	public boolean sendMessage(String to, String object, String message);

}
