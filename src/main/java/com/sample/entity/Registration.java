package com.sample.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Registration {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "registration_id")
	private Long id;
	private String firstname;
	private String lastname;
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Bankdetail bankdetail;

	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Registration(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Bankdetail getBankdetail() {
		return bankdetail;
	}

	public void setBankdetail(Bankdetail bankdetail) {
		this.bankdetail = bankdetail;
	}

	@Override
	public String toString() {
		return "Registration [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}

}
