package com.notify.it.managedbean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

import com.notify.it.model.Customer;
import com.notify.it.util.JpaUtil;

@ManagedBean
public class CustomerMB {
	
	private Customer customer;
	private ArrayList<Customer> customers;
	public CustomerMB() {
		super();
		customer = new Customer();
		customers = new ArrayList<Customer> ();
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customers.add(customer);
	}
	
	public boolean adicionarCustomer() {
		try {
			for (Customer customer : customers) {
				JpaUtil.salvar(customer);
			} 
		}catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
	public ArrayList<Customer> getCustomers() {
		return customers;
	}
}
