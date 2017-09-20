package com.sample.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class Bankdetail {

	@Id
	@Column(name = "bankdetail_id")
	private Long id;
	private Long accountId;
	private String bankname;
	@MapsId
	@OneToOne(mappedBy = "bankdetail")
	@JoinColumn(name = "bankdetail_id")
	private Registration registration;

	public Bankdetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bankdetail(Long accountId, String bankname) {
		super();
		this.accountId = accountId;
		this.bankname = bankname;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public void setRegistration(Registration registration) {
		this.registration = registration;
	}

}
