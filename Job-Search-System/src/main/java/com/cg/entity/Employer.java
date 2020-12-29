package com.cg.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity


@Table(name="Employer")
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor

public class Employer {

	@Id   
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id",nullable=false)
	private Integer id;
	@Column(name= "organization_Name", nullable = false)

	private String organizationName;
	@Column(name="address",nullable=false)
	private String address;
	@Column(name="contact_no",nullable=false)
	private long contactNo;
	@Column(name="email",nullable=false)
	private String email;
	@Column(name="username",nullable=false)
	private String username;
	@Column(name="password",nullable=false)
	private String password;
	@JsonIgnore
	@OneToMany(mappedBy = "employer", cascade = CascadeType.ALL)
	private Collection<Job> job = new ArrayList<Job>();
	@JsonIgnore
	@OneToMany(mappedBy = "employer", cascade = CascadeType.ALL)
	private Collection<Message> message = new ArrayList<Message>();
	
	public Employer(String organizationName) {
		this.organizationName = organizationName;
	}

	public Employer() {
		super();
	}

	public Employer(String organizationName, String address, long contactNo, String email, String username,
			String password) {
		super();
		this.organizationName = organizationName;
		this.address = address;
		this.contactNo = contactNo;
		this.email = email;
		this.username = username;
		this.password = password;
	}

	public Employer(Integer id, String organizationName, String address, long contactNo, String email, String username,
			String password, Collection<Job> job, Collection<Message> message) {
		super();
		this.id = id;
		this.organizationName = organizationName;
		this.address = address;
		this.contactNo = contactNo;
		this.email = email;
		this.username = username;
		this.password = password;
		this.job = job;
		this.message = message;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Collection<Job> getJob() {
		return job;
	}

	public void setJob(Collection<Job> job) {
		this.job = job;
	}

	public Collection<Message> getMessage() {
		return message;
	}

	public void setMessage(Collection<Message> message) {
		this.message = message;
	}
	
	

}
