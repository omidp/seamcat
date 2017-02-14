package org.omidbiz.seamcat;

import java.util.List;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.framework.EntityQuery;

@Name("customerQuery")
@Scope(ScopeType.CONVERSATION)
public class CustomerQuery extends EntityQuery<Customer> {

	
	public static final String EJBQL = "select c from Customer c";

	public CustomerQuery() {
		setMaxResults(15);
		setEjbql(EJBQL);
	}
	
	
	@Override
	public List<Customer> getResultList() {
		 List<Customer> customers = super.getResultList();
		 customers.forEach((item)->item.setAge(20));
		 return customers;
	}
	
	
	
	
}
