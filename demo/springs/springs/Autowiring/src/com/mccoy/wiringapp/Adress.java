package com.mccoy.wiringapp;

public class Adress 
{
	int house_no;
	String street;

	
	public Adress(int house_no, String street) {
		super();
		this.house_no = house_no;
		this.street = street;
	}
	public int getHouse_no() {
		return house_no;
	}
	public void setHouse_no(int house_no) {
		this.house_no = house_no;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return "Adress [house_no=" + house_no + ", street=" + street + "]";
	}
	
}
