package com.mccoy.spring1.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="final_sub")
public class Accbean implements Serializable
{
	
	@Column(name="id")
	private int id;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="my_seq_gen")
	@SequenceGenerator(name="my_seq_gen", sequenceName="my_seq2")
	@Column(name="accno")
	private int accno;
	@Column(name="amount")
	private double amount;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		return "Accbean [id=" + id + ", accno=" + accno + ", amount=" + amount + "]";
	}
	
	
}
