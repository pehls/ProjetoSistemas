package com.notify.it.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="LOGINTYPES")
public class LoginType implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column (name="LGT_ID",columnDefinition= "serial")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long LGT_ID;
	
	@Column (length= 20)
	private String LGT_DESC;
	public LoginType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginType(String lGT_DESC) {
		super();
		LGT_DESC = lGT_DESC;
	}
	public long getLGT_ID() {
		return LGT_ID;
	}
	public void setLGT_ID(long lGT_ID) {
		LGT_ID = lGT_ID;
	}
	public String getLGT_DESC() {
		return LGT_DESC;
	}
	public void setLGT_DESC(String lGT_DESC) {
		LGT_DESC = lGT_DESC;
	}

}
