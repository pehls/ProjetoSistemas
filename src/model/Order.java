package model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="ORDERS")
public class Order implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column (name="ORD_ID",columnDefinition= "serial")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long ORD_ID;
	
	@ManyToOne (cascade=CascadeType.ALL)
	@JoinColumn(name="DLV_ID")
	private Deliverer deliverer;
	
	@ManyToOne (cascade=CascadeType.ALL)
	@JoinColumn(name="CTM_ID")
	private Customer customer;
	
	@ManyToOne (cascade=CascadeType.ALL)
	@JoinColumn(name="PRV_ID")
	private Provider provider;
	
	@ManyToOne (cascade=CascadeType.ALL)
	@JoinColumn(name="CTD_ID")
	private CustomerDestination customerDestination;
	
	
	

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(long oRD_ID) {
		super();
		ORD_ID = oRD_ID;
	}

	public long getORD_ID() {
		return ORD_ID;
	}

	public void setORD_ID(long oRD_ID) {
		ORD_ID = oRD_ID;
	}

	public Deliverer getDeliverer() {
		return deliverer;
	}

	public void setDeliverer(Deliverer deliverer) {
		this.deliverer = deliverer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public CustomerDestination getCustomerDestination() {
		return customerDestination;
	}

	public void setCustomerDestination(CustomerDestination customerDestination) {
		this.customerDestination = customerDestination;
	}

}
