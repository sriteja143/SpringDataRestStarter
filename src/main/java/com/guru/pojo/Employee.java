package com.guru.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private long empid;
	private String empname;
	private Date createdDate = new Date();
	private Date updatedDate ;
	private String dept;
	
	
	public long getEmpid() {
		return empid;
	}


	public void setEmpid(long empid) {
		this.empid = empid;
	}


	public String getEmpname() {
		return empname;
	}


	public void setEmpname(String empname) {
		this.empname = empname;
	}


	public Date getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	public Date getUpdatedDate() {
		return updatedDate;
	}


	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}

	
	public Employee(long empid, String empname, Date createdDate, Date updatedDate, String dept) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.dept = dept;
	}
	
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", createdDate=" + createdDate + ", updatedDate="
				+ updatedDate + ", dept=" + dept + "]";
	}


	public Employee() {
		// TODO Auto-generated constructor stub
	}

   @Override
   public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	return super.equals(obj);
   }
}
