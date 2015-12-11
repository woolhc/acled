package cn.hc.spring05;

import java.util.Date;

public class Emp {
	private String username;
	private String gender;
	private Date hiredate;
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public Emp(String username, String gender, Date hiredate) {
		super();
		this.username = username;
		this.gender = gender;
		this.hiredate = hiredate;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
