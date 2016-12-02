package model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="ORDERSTATES")
public class OrderState implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column (name="OST_ID",columnDefinition= "serial")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long OST_ID;

	@ManyToOne (cascade=CascadeType.ALL)
	@JoinColumn(name="ORD_ID")
	private Order order;
	
	@ManyToOne (cascade=CascadeType.ALL)
	@JoinColumn(name="STT_ID")
	private State state;
	
	@ManyToMany
	@JoinTable (name="ORDERSTATETRACKINGS", 
				joinColumns={
							@JoinColumn (name="OST_ID")
							},
				inverseJoinColumns={
							@JoinColumn (name="TRK_ID")
							})
	private Set <Tracking> trackings;
	public OrderState() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getOST_ID() {
		return OST_ID;
	}

	public void setOST_ID(long oST_ID) {
		OST_ID = oST_ID;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	

}
