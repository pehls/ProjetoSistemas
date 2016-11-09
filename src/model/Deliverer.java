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
@Table (name="DELIVERERS")
public class Deliverer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column (name= "DLV_ID",columnDefinition= "serial")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long DLV_ID;
	
	@Column (length=100)
	private String DLV_NAME;
	
	@Column (length=15)
	private String DLV_CPF;
	
	@Column (length=20)
	private String DLV_PHONE;
	
	@Column (length=60)
	private String DLV_EMAIL;
	
	private boolean DLV_LICENSE_A;
	
	private boolean DLV_LICENSE_B;
	
	private boolean DLV_LICENSE_C;
	
	private boolean DLV_LICENSE_D;
	
	private boolean DLV_LICENSE_E;
	
	@ManyToOne (cascade=CascadeType.ALL)
	@JoinColumn(name="LGN_ID")
	private Login login;
	
	@OneToOne (cascade=CascadeType.ALL)
	@JoinColumn (name="TRK_ID", nullable=false)
	private Tracking tracking;
	
	public Deliverer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Deliverer(String dLV_NAME, String dLV_CPF, String dLV_PHONE, String dLV_EMAIL,
			boolean dLV_LICENSE_A, boolean dLV_LICENSE_B, boolean dLV_LICENSE_C, boolean dLV_LICENSE_D,
			boolean dLV_LICENSE_E) {
		super();
		DLV_NAME = dLV_NAME;
		DLV_CPF = dLV_CPF;
		DLV_PHONE = dLV_PHONE;
		DLV_EMAIL = dLV_EMAIL;
		DLV_LICENSE_A = dLV_LICENSE_A;
		DLV_LICENSE_B = dLV_LICENSE_B;
		DLV_LICENSE_C = dLV_LICENSE_C;
		DLV_LICENSE_D = dLV_LICENSE_D;
		DLV_LICENSE_E = dLV_LICENSE_E;
	}
	public long getDLV_ID() {
		return DLV_ID;
	}
	public void setDLV_ID(long dLV_ID) {
		DLV_ID = dLV_ID;
	}
	public String getDLV_NAME() {
		return DLV_NAME;
	}
	public void setDLV_NAME(String dLV_NAME) {
		DLV_NAME = dLV_NAME;
	}
	public String getDLV_CPF() {
		return DLV_CPF;
	}
	public void setDLV_CPF(String dLV_CPF) {
		DLV_CPF = dLV_CPF;
	}
	public String getDLV_PHONE() {
		return DLV_PHONE;
	}
	public void setDLV_PHONE(String dLV_PHONE) {
		DLV_PHONE = dLV_PHONE;
	}
	public String getDLV_EMAIL() {
		return DLV_EMAIL;
	}
	public void setDLV_EMAIL(String dLV_EMAIL) {
		DLV_EMAIL = dLV_EMAIL;
	}
	public boolean isDLV_LICENSE_A() {
		return DLV_LICENSE_A;
	}
	public void setDLV_LICENSE_A(boolean dLV_LICENSE_A) {
		DLV_LICENSE_A = dLV_LICENSE_A;
	}
	public boolean isDLV_LICENSE_B() {
		return DLV_LICENSE_B;
	}
	public void setDLV_LICENSE_B(boolean dLV_LICENSE_B) {
		DLV_LICENSE_B = dLV_LICENSE_B;
	}
	public boolean isDLV_LICENSE_C() {
		return DLV_LICENSE_C;
	}
	public void setDLV_LICENSE_C(boolean dLV_LICENSE_C) {
		DLV_LICENSE_C = dLV_LICENSE_C;
	}
	public boolean isDLV_LICENSE_D() {
		return DLV_LICENSE_D;
	}
	public void setDLV_LICENSE_D(boolean dLV_LICENSE_D) {
		DLV_LICENSE_D = dLV_LICENSE_D;
	}
	public boolean isDLV_LICENSE_E() {
		return DLV_LICENSE_E;
	}
	public void setDLV_LICENSE_E(boolean dLV_LICENSE_E) {
		DLV_LICENSE_E = dLV_LICENSE_E;
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
