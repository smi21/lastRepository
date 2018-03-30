package com.mccoy.smi.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hibspring")
public class regdto implements Serializable {
	@Id
	@Column(name="empid")
	private int empid;
	@Column(name="empname")
	private String empname;
	@Column(name="empdept")
	private String empdept;
	@Column(name="emploc")
	private String emploc;
	
	public regdto() {
		super();
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpdept() {
		return empdept;
	}
	public void setEmpdept(String empdept) {
		this.empdept = empdept;
	}
	public String getEmploc() {
		return emploc;
	}
	public void setEmploc(String emploc) {
		this.emploc = emploc;
	}
	@Override
	public String toString() {
		return "regdto [empid=" + empid + ", empname=" + empname + ", empdept=" + empdept + ", emploc=" + emploc + "]";
	}
	
	

}
