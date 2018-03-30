package com.abc.smi.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="hucha2")
public class registerdto implements Serializable
{
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="dept")
	private String dept;
	@Column(name="loc")
	private String loc;
	
	public registerdto() {
		// TODO Auto-generated constructor stub
		System.out.println("registerdto created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "registerdto [id=" + id + ", name=" + name + ", dept=" + dept
				+ ", loc=" + loc + "]";
	}
	

}
