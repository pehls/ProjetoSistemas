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
@Table (name="TRACKINGS")
public class Tracking implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column (columnDefinition= "serial")
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private long TRK_ID;
	
	@Column (columnDefinition= "numeric", nullable=false)
	private float TRK_LONGITUDE;
	
	@Column (columnDefinition= "numeric", nullable= false)
	private float TRK_LATITUDE;
	
	@ManyToOne (cascade=CascadeType.ALL)
	@JoinColumn(name="OST_ID")
	private OrderState orderState;
	
	public Tracking(float tRK_LONGITUDE, float tRK_LATITUDE) {
		super();
		TRK_LONGITUDE = tRK_LONGITUDE;
		TRK_LATITUDE = tRK_LATITUDE;
	}
	public Tracking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getTRK_ID() {
		return TRK_ID;
	}
	public void setTRK_ID(long tRK_ID) {
		TRK_ID = tRK_ID;
	}
	public float getTRK_LONGITUDE() {
		return TRK_LONGITUDE;
	}
	public void setTRK_LONGITUDE(float tRK_LONGITUDE) {
		TRK_LONGITUDE = tRK_LONGITUDE;
	}
	public float getTRK_LATITUDE() {
		return TRK_LATITUDE;
	}
	public void setTRK_LATITUDE(float tRK_LATITUDE) {
		TRK_LATITUDE = tRK_LATITUDE;
	}
	public OrderState getOrderState() {
		return orderState;
	}
	public void setOrderState(OrderState orderState) {
		this.orderState = orderState;
	}

}
