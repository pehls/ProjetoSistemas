package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="ORDERSTATES")
public class OrderState implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column (columnDefinition= "serial")
	private long OST_ID;

	public OrderState() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderState(long oST_ID) {
		super();
		OST_ID = oST_ID;
	}

	public long getOST_ID() {
		return OST_ID;
	}

	public void setOST_ID(long oST_ID) {
		OST_ID = oST_ID;
	}
	

}
