package com.notify.it.managedbean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

import com.notify.it.model.CustomerDestination;
import com.notify.it.util.JpaUtil;

@ManagedBean
public class CustomerDestinationMB {
	
	private CustomerDestination customerDestination;
	private ArrayList<CustomerDestination> customerDestinations;
	public CustomerDestinationMB() {
		super();
		customerDestination = new CustomerDestination();
		customerDestinations = new ArrayList<CustomerDestination> ();
	}
	public CustomerDestination getCustomerDestination() {
		return customerDestination;
	}
	public void setCustomer(CustomerDestination customerDestination) {
		this.customerDestinations.add(customerDestination);
	}
	
	public boolean adicionarCustomerDestination() {
		try {
			for (CustomerDestination customerDestination : customerDestinations) {
				JpaUtil.salvar(customerDestination);
			} 
		}catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
	public ArrayList<CustomerDestination> getCustomerDestinations() {
		return customerDestinations;
	}
	public void setCustomerDestinations(ArrayList<CustomerDestination> customerDestinations) {
		this.customerDestinations = customerDestinations;
	}
}
