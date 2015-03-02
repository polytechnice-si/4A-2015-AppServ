package fr.unice.polytech.appserv.mini_jira;

import fr.unice.polytech.appserv.mini_jira.impl.EmailServerBean;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;

import javax.ejb.EJB;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class EmailServerTest {

	@Deployment
	public static WebArchive createDeployment() {
		return ShrinkWrap.create(WebArchive.class)
				.addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
				.addPackage(EmailServer.class.getPackage())
				.addPackage(EmailServerBean.class.getPackage());
	}

	@EJB(name = "EmailServer")
	private EmailServer emailServer;

	@Test
	public void should_create_greeting() {
		assertTrue(emailServer.sendMessage("to_address", "my object", "this is a message"));
	}

}

