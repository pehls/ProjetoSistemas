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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="PROVIDER")
public class Provider implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column (name="PRV_ID",columnDefinition= "serial")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long PRV_ID;
	
	@Column (length=100)
	private String PRV_ADDRESS;
	
	@Column (length=100)
	private String PRV_COMPANYNAME;
	
	@Column (length=20)
	private String PRV_CNPJ;
	
	@Column (length=20)
	private String PRV_PHONE;
	
	@Column (length=60)
	private String PRV_EMAIL;
	
	@ManyToOne (cascade=CascadeType.ALL)
	@JoinColumn(name="LGN_ID")
	private Login login;
	
	@OneToOne (cascade=CascadeType.ALL)
	@JoinColumn (name="TRK_ID", nullable=false)
	private Tracking tracking;
	
	public Provider() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Provider( String pRV_ADDRESS, String pRV_COMPANYNAME, String pRV_CNPJ, String pRV_PHONE,
			String pRV_EMAIL) {
		super();
		PRV_ADDRESS = pRV_ADDRESS;
		PRV_COMPANYNAME = pRV_COMPANYNAME;
		PRV_CNPJ = pRV_CNPJ;
		PRV_PHONE = pRV_PHONE;
		PRV_EMAIL = pRV_EMAIL;
	}
	public String getPRV_ADDRESS() {
		return PRV_ADDRESS;
	}
	public void setPRV_ADDRESS(String pRV_ADDRESS) {
		PRV_ADDRESS = pRV_ADDRESS;
	}
	public String getPRV_COMPANYNAME() {
		return PRV_COMPANYNAME;
	}
	public void setPRV_COMPANYNAME(String pRV_COMPANYNAME) {
		PRV_COMPANYNAME = pRV_COMPANYNAME;
	}
	public String getPRV_CNPJ() {
		return PRV_CNPJ;
	}
	public void setPRV_CNPJ(String pRV_CNPJ) {
		PRV_CNPJ = pRV_CNPJ;
	}
	public String getPRV_PHONE() {
		return PRV_PHONE;
	}
	public void setPRV_PHONE(String pRV_PHONE) {
		PRV_PHONE = pRV_PHONE;
	}
	public String getPRV_EMAIL() {
		return PRV_EMAIL;
	}
	public void setPRV_EMAIL(String pRV_EMAIL) {
		PRV_EMAIL = pRV_EMAIL;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public Tracking getTracking() {
		return tracking;
	}
	public void setTracking(Tracking tracking) {
		this.tracking = tracking;
	}
	

}
