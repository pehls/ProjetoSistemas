package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="NOTIFICATIONS")
public class Notification implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column (columnDefinition= "serial")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long NTC_ID;
	
	@Column (columnDefinition= "text", nullable= false)
	private String NTC_INFO;
	
	@Column (columnDefinition= "integer", nullable= false)
	private int NTC_DELAYMESSAGE;
	
	public Notification() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Notification(String nTC_INFO, int nTC_DELAYMESSAGE) {
		super();
		NTC_INFO = nTC_INFO;
		NTC_DELAYMESSAGE = nTC_DELAYMESSAGE;
	}
	public long getNTC_ID() {
		return NTC_ID;
	}
	public void setNTC_ID(long nTC_ID) {
		NTC_ID = nTC_ID;
	}
	public String getNTC_INFO() {
		return NTC_INFO;
	}
	public void setNTC_INFO(String nTC_INFO) {
		NTC_INFO = nTC_INFO;
	}
	public int getNTC_DELAYMESSAGE() {
		return NTC_DELAYMESSAGE;
	}
	public void setNTC_DELAYMESSAGE(int nTC_DELAYMESSAGE) {
		NTC_DELAYMESSAGE = nTC_DELAYMESSAGE;
	}

}
