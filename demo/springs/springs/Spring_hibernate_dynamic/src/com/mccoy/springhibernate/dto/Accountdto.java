package com.mccoy.springhibernate.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="just_child")
public class Accountdto implements Serializable 
{
	
	//@Id
	//@GenericGenerator(name="myid2",strategy="increment")
	//@GeneratedValue(generator="myid2")
	@Column(name="aid")
	private int aid;
	
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="my_seq_gen")
	@SequenceGenerator(name="my_seq_gen", sequenceName="spring_acc")
	@Column(name="accno")
	int accno;
	
	@Column(name="amount")
	double amount;
   
	public Accountdto() {
		System.out.println(this.getClass().getSimpleName());
	}
	
	public int getAid() {
		return aid;
	}
	

	public void setAid(int aid) {
		this.aid = aid;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Accountdto [aid=" + aid + ", accno=" + accno + ", amount=" + amount + "]";
	}
}
