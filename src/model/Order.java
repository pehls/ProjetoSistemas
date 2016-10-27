package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="ORDERS")
public class Order implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column (columnDefinition= "serial")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long ORD_ID;

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

}
