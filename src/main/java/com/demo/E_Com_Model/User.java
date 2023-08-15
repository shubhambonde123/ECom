package com.demo.E_Com_Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Uid;
	private String Uname;
	private String UEmail;
	
	private String Uaddress;
	private String Umobile;
	private String Ugender;
	public int getUid() {
		return Uid;
	}
	public void setUid(int uid) {
		Uid = uid;
	}
	public String getUname() {
		return Uname;
	}
	public void setUname(String uname) {
		Uname = uname;
	}
	public String getUaddress() {
		return Uaddress;
	}
	public void setUaddress(String uaddress) {
		Uaddress = uaddress;
	}
	public String getUmobile() {
		return Umobile;
	}
	public void setUmobile(String umobile) {
		Umobile = umobile;
	}
	public String getUgender() {
		return Ugender;
	}
	public void setUgender(String ugender) {
		Ugender = ugender;
	}
	public String getUEmail() {
		return UEmail;
	}
	public void setUEmail(String uEmail) {
		UEmail = uEmail;
	}
	@Override
	public String toString() {
		return "User [Uid=" + Uid + ", Uname=" + Uname + ", UEmail=" + UEmail + ", Uaddress=" + Uaddress + ", Umobile="
				+ Umobile + ", Ugender=" + Ugender + "]";
	}
	
	
	
	
	
	
	

	
	
}
