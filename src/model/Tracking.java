package model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;

@Entity
@Table (name="TRACKINGS")
public class Tracking implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column (name="TRK_ID",columnDefinition= "serial")
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private long TRK_ID;
	
	@Column (columnDefinition= "numeric", nullable=false)
	private float TRK_LONGITUDE;
	
	@Column (columnDefinition= "numeric", nullable= false)
	private float TRK_LATITUDE;
	
	
	public Tracking(float tRK_LONGITUDE, float tRK_LATITUDE) {
		super();
		TRK_LONGITUDE = tRK_LONGITUDE;
		TRK_LATITUDE = tRK_LATITUDE;
	}
	public Tracking() {
		super();
		// TODO Auto-generated constructor stub
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
	
}
