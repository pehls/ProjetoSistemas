package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "STATES")
public class State implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column (name="STT_ID", columnDefinition= "serial")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long STT_ID;
	
	@Column (length= 100)
	private String STT_DESC;
	public State() {
		super();
		// TODO Auto-generated constructor stub
	}
	public State(String sTT_DESC) {
		super();
		STT_DESC = sTT_DESC;
	}
	public String getSTT_DESC() {
		return STT_DESC;
	}
	public void setSTT_DESC(String sTT_DESC) {
		STT_DESC = sTT_DESC;
	}
	

}
