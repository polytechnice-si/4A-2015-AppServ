package fr.unice.polytech.appserv.mini_jira.impl;

import fr.unice.polytech.appserv.mini_jira.EmailServer;

import javax.ejb.Stateless;


@Stateless(name = "EmailServer")
public class EmailServerBean  implements EmailServer {

	@Override
	public boolean sendMessage(String to, String object, String message) {
		System.out.println("Sending message ["+message+"] with object ["+object+"] to ["+to+"]");
		return true;
	}

}
