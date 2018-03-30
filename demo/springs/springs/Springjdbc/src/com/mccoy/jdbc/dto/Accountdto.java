package com.mccoy.jdbc.dto;

public class Accountdto 
{

	int aid;
	double amount;
	int accno;
	
	public Accountdto() {
		System.out.println("Account dto def constr");
		// TODO Auto-generated constructor stub
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	
}
