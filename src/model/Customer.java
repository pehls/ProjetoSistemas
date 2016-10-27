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
@Table (name="CUSTOMERS")
public class Customer implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column (name="CTM_ID",columnDefinition= "serial")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long CTM_ID;
	
	@Column (length=100)
	private String CTM_NAME;
	
	@Column (length=15)
	private String CTM_CPF;
	
	@Column (length=20)
	private String CTM_PHONE;
	
	@Column (length=60)
	private String CTM_EMAIL;
	
	@ManyToOne (cascade=CascadeType.ALL)
	@JoinColumn(name="LGN_ID")
	private Login login;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer( String cTM_NAME, String cTM_CPF, String cTM_PHONE, String cTM_EMAIL) {
		super();
		CTM_NAME = cTM_NAME;
		CTM_CPF = cTM_CPF;
		CTM_PHONE = cTM_PHONE;
		CTM_EMAIL = cTM_EMAIL;
	}
	public long getCTM_ID() {
		return CTM_ID;
	}
	public void setCTM_ID(long cTM_ID) {
		CTM_ID = cTM_ID;
	}
	public String getCTM_NAME() {
		return CTM_NAME;
	}
	public void setCTM_NAME(String cTM_NAME) {
		CTM_NAME = cTM_NAME;
	}
	public String getCTM_CPF() {
		return CTM_CPF;
	}
	public void setCTM_CPF(String cTM_CPF) {
		CTM_CPF = cTM_CPF;
	}
	public String getCTM_PHONE() {
		return CTM_PHONE;
	}
	public void setCTM_PHONE(String cTM_PHONE) {
		CTM_PHONE = cTM_PHONE;
	}
	public String getCTM_EMAIL() {
		return CTM_EMAIL;
	}
	public void setCTM_EMAIL(String cTM_EMAIL) {
		CTM_EMAIL = cTM_EMAIL;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	

}
