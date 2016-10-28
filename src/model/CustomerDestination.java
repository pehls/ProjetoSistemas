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
@Table (name="CUSTOMERDESTINATIONS")
public class CustomerDestination implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column (name="CTD_ID",columnDefinition= "serial")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long CTD_ID;
	
	@Column (length= 10)
	private String CTD_ZIPCODE;
	
	@Column (length= 20)
	private String CTD_ADDRESS;
	
	@Column (length= 50)
	private String CTD_DISTRICT;
	
	@Column (length= 50)
	private String CTD_CITY;
	
	@Column (length= 2)
	private String CTD_UF;
	
	@Column (length= 50)
	private String CTD_COUNTRY;
	
	@ManyToOne (cascade=CascadeType.ALL)
	@JoinColumn(name="CTM_ID")
	private Customer customer;
	
	public CustomerDestination(String cTD_ZIPCODE, String cTD_ADDRESS, String cTD_DISTRICT, String cTD_CITY,
			String cTD_UF, String cTD_COUNTRY) {
		super();
		CTD_ZIPCODE = cTD_ZIPCODE;
		CTD_ADDRESS = cTD_ADDRESS;
		CTD_DISTRICT = cTD_DISTRICT;
		CTD_CITY = cTD_CITY;
		CTD_UF = cTD_UF;
		CTD_COUNTRY = cTD_COUNTRY;
	}
	public CustomerDestination() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getCTD_ID() {
		return CTD_ID;
	}
	public void setCTD_ID(long cTD_ID) {
		CTD_ID = cTD_ID;
	}
	public String getCTD_ZIPCODE() {
		return CTD_ZIPCODE;
	}
	public void setCTD_ZIPCODE(String cTD_ZIPCODE) {
		CTD_ZIPCODE = cTD_ZIPCODE;
	}
	public String getCTD_ADDRESS() {
		return CTD_ADDRESS;
	}
	public void setCTD_ADDRESS(String cTD_ADDRESS) {
		CTD_ADDRESS = cTD_ADDRESS;
	}
	public String getCTD_DISTRICT() {
		return CTD_DISTRICT;
	}
	public void setCTD_DISTRICT(String cTD_DISTRICT) {
		CTD_DISTRICT = cTD_DISTRICT;
	}
	public String getCTD_CITY() {
		return CTD_CITY;
	}
	public void setCTD_CITY(String cTD_CITY) {
		CTD_CITY = cTD_CITY;
	}
	public String getCTD_UF() {
		return CTD_UF;
	}
	public void setCTD_UF(String cTD_UF) {
		CTD_UF = cTD_UF;
	}
	public String getCTD_COUNTRY() {
		return CTD_COUNTRY;
	}
	public void setCTD_COUNTRY(String cTD_COUNTRY) {
		CTD_COUNTRY = cTD_COUNTRY;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
