package com.mccoy.providers;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "webservice")
public class Mydto {
	@Id
	@Column(name = "bname")
	String bankname;

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	@Column(name = "rate")
	int rate;

	@Override
	public String toString() {
		return "Mydto [bankname=" + bankname + ", rate=" + rate + "]";
	}
}
