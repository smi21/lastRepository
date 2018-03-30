package com.mccoy.wiringapp;

public class Employee 
{
	int id;
	String name;
	Adress adress;
	
	
	public Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
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
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", adress=" + adress + "]";
	
	}
}
