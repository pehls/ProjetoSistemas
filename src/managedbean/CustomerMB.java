package managedbean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

import controller.FullDAO;
import model.Customer;

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
				FullDAO.salvar(customer);
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
