package fr.unice.polytech.appserv.mini_jira;

import fr.unice.polytech.appserv.mini_jira.business.EmailServerBean;
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
public class ProjectManagerTest {

	@Deployment
	public static WebArchive createDeployment() {
		return ShrinkWrap.create(WebArchive.class)
				.addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
				.addPackage(EmailServer.class.getPackage())
				.addPackage(EmailServerBean.class.getPackage())
				.addPackage(Database.class.getPackage());
	}

	@EJB
	private ProjectManager projMgr;

	@Test
	public void should_reject_duplicate_projects() {
		assertTrue(projMgr.startProject("new_proj"));
		assertFalse(projMgr.startProject("new_proj"));
	}

	@Test
	public void should_support_staffing() {
		assertTrue(projMgr.startProject("my_new_proj"));
		assertTrue(projMgr.staffProject("my_new_proj", "dev #1"));
		assertFalse(projMgr.staffProject("my_new_proj", "dev #1"));
		assertTrue(projMgr.staffProject("my_new_proj", "dev #2"));
		assertTrue(projMgr.getStaff("my_new_proj").size() == 2);
		assertFalse(projMgr.staffProject("unknown_proj", "dev #1"));
	}

	@Test
	public void should_return_null_for_unknown_projects() {
		assertNull(projMgr.getStaff("unknown_proj"));
	}


}
