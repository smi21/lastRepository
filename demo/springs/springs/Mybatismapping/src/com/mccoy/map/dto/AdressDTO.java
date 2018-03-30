package com.mccoy.map.dto;

public class AdressDTO 
{
	int aid;
	String street_name;
	
	
	private EmployeeDTO edto;
	
public EmployeeDTO getEdto() {
		return edto;
	}
	public void setEdto(EmployeeDTO edto) {
		this.edto = edto;
	}
public AdressDTO() {
	System.out.println("adress constructor");
	// TODO Auto-generated constructor stub
}
	public AdressDTO(int aid, String street_name) {
	super();
	this.aid = aid;
	this.street_name = street_name;
}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getStreet_name() {
		return street_name;
	}
	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}

	

}
