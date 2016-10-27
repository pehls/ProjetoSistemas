package managedbean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

import controller.FullDAO;
import model.CustomerDestination;

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
				FullDAO.salvar(customerDestination);
			} 
		}catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
}
