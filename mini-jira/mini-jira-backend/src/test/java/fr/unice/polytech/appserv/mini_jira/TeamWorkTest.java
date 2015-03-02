package fr.unice.polytech.appserv.mini_jira;

import fr.unice.polytech.appserv.mini_jira.impl.EmailServerBean;
import fr.unice.polytech.appserv.mini_jira.storage.Database;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ejb.EJB;

import static org.junit.Assert.*;


@RunWith(Arquillian.class)
public class TeamWorkTest {

	@Deployment
	public static WebArchive createDeployment() {
		return ShrinkWrap.create(WebArchive.class)
				.addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
				.addPackage(EmailServer.class.getPackage())
				.addPackage(EmailServerBean.class.getPackage())
				.addPackage(Database.class.getPackage());
	}

	@EJB
	private TeamWork teamService;


	@Test
	public void should_support_task_declaration() {
		int c1 = teamService.createTask("a new task contents", "my_pretty_project");
		int c2 = teamService.createTask("another task contents", "my_pretty_project_prime");
		assertTrue(c1 != c2);
		assertTrue(teamService.getTasks("my_pretty_project").size() == 1);
		assertTrue(teamService.getTasks("my_pretty_project_prime").size() == 1);
	}





}
