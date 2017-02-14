package org.omidbiz.seamcat;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.annotations.Transactional;
import org.jboss.seam.annotations.bpm.CreateProcess;
import org.jboss.seam.bpm.ManagedJbpmContext;
import org.jboss.seam.framework.EntityHome;
import org.jbpm.graph.exe.ProcessInstance;

@Name("customerHome")
@Scope(ScopeType.CONVERSATION)
public class CustomerHome extends EntityHome<Customer>
{

	
	@Transactional	
	public void register()
	{
		//Since there is no EJB interception on tomcat you can't use @CreateProcess annotation on method
		ProcessInstance process = ManagedJbpmContext.instance().newProcessInstanceForUpdate("managerProcess");
		process.getContextInstance().setVariable("responsible", "admin");
	}
	
}
