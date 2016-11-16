package model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="LOGINS")
public class Login implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column (name="LGN_ID", columnDefinition= "serial")
	private long LGN_ID;
	
	@Column (length= 30, nullable= false)
	private String LGN_USERNAME;
	
	@Column (length= 30, nullable= false)
	private String LGN_PASSWORD;
	
	@ManyToOne (cascade=CascadeType.ALL)
	@JoinColumn(name="LGT_ID")
	private LoginType loginType;
	
	
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login(String lGN_USERNAME, String lGN_PASSWORD) {
		super();
		LGN_USERNAME = lGN_USERNAME;
		LGN_PASSWORD = lGN_PASSWORD;
	}
	public long getLGN_ID() {
		return LGN_ID;
	}
	public void setLGN_ID(long lGN_ID) {
		LGN_ID = lGN_ID;
	}
	public String getLGN_USERNAME() {
		return LGN_USERNAME;
	}
	public void setLGN_USERNAME(String lGN_USERNAME) {
		LGN_USERNAME = lGN_USERNAME;
	}
	public String getLGN_PASSWORD() {
		return LGN_PASSWORD;
	}
	public void setLGN_PASSWORD(String lGN_PASSWORD) {
		LGN_PASSWORD = lGN_PASSWORD;
	}
	public LoginType getLoginType() {
		return loginType;
	}
	public void setLoginType(LoginType loginType) {
		this.loginType = loginType;
	}
	@Override
	public String toString() {
		return "Login [LGN_USERNAME=" + LGN_USERNAME + ", LGN_PASSWORD=" + LGN_PASSWORD + ", loginType=" + loginType
				+ "]";
	}

}
