package com.cg.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
@Entity
@Table(name="jobseeker")
public class JobSeeker {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name= "id",nullable=false)
	private Integer jobSeeker_Id;
	@Column(name= "name",nullable=false)
	private String jobSeeker_Name;
	@Column(name= "address",nullable=false)
	private String address;
	@Column(name= "contact_no",nullable=false)
	private Long contact_No;
	@Column(name= "email",nullable=false)
	private String mail_ID;
	
	@Column(name= "skill_set",nullable=false)
	private String skillSet;
	@Column(name= "location_preference",nullable=false)
	private String location_preference;
	@Column(name= "username",nullable=false)
	private String username;
	@Column(name= "password",nullable=false)
	private String password;
	@JsonIgnore
	@OneToMany(mappedBy = "jobseeker", cascade=CascadeType.ALL)
	private Collection<AppliedJobs> appliedjobs = new ArrayList<AppliedJobs>();
	@JsonIgnore
	@OneToMany(mappedBy = "jobseeker", cascade=CascadeType.ALL)
	private Collection<Message> message = new ArrayList<Message>();
	@JsonIgnore
	@OneToMany(mappedBy = "jobseeker", cascade=CascadeType.ALL)
	private Collection<FavoriteJobs> favoriteJobs = new ArrayList<FavoriteJobs>();
	
	public JobSeeker(String jobSeeker_Name) {
		this.jobSeeker_Name = jobSeeker_Name;
	}

	public JobSeeker(Integer jobSeeker_Id) {
		this.jobSeeker_Id = jobSeeker_Id;
	}

	public Integer getJobSeeker_Id() {
		return jobSeeker_Id;
	}

	public void setJobSeeker_Id(Integer jobSeeker_Id) {
		this.jobSeeker_Id = jobSeeker_Id;
	}

	public String getJobSeeker_Name() {
		return jobSeeker_Name;
	}

	public void setJobSeeker_Name(String jobSeeker_Name) {
		this.jobSeeker_Name = jobSeeker_Name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getContact_No() {
		return contact_No;
	}

	public void setContact_No(Long contact_No) {
		this.contact_No = contact_No;
	}

	public String getMail_ID() {
		return mail_ID;
	}

	public void setMail_ID(String mail_ID) {
		this.mail_ID = mail_ID;
	}

	public String getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}

	public String getLocation_preference() {
		return location_preference;
	}

	public void setLocation_preference(String location_preference) {
		this.location_preference = location_preference;
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

	public Collection<AppliedJobs> getAppliedjobs() {
		return appliedjobs;
	}

	public void setAppliedjobs(Collection<AppliedJobs> appliedjobs) {
		this.appliedjobs = appliedjobs;
	}

	public Collection<Message> getMessage() {
		return message;
	}

	public void setMessage(Collection<Message> message) {
		this.message = message;
	}

	public Collection<FavoriteJobs> getFavoriteJobs() {
		return favoriteJobs;
	}

	public void setFavoriteJobs(Collection<FavoriteJobs> favoriteJobs) {
		this.favoriteJobs = favoriteJobs;
	}

	public JobSeeker() {
		super();
	}

	public JobSeeker(Integer jobSeeker_Id, String jobSeeker_Name, String address, Long contact_No, String mail_ID,
			String skillSet, String location_preference, String username, String password,
			Collection<AppliedJobs> appliedjobs, Collection<Message> message, Collection<FavoriteJobs> favoriteJobs) {
		super();
		this.jobSeeker_Id = jobSeeker_Id;
		this.jobSeeker_Name = jobSeeker_Name;
		this.address = address;
		this.contact_No = contact_No;
		this.mail_ID = mail_ID;
		this.skillSet = skillSet;
		this.location_preference = location_preference;
		this.username = username;
		this.password = password;
		this.appliedjobs = appliedjobs;
		this.message = message;
		this.favoriteJobs = favoriteJobs;
	}

	public JobSeeker(String jobSeeker_Name, String address, Long contact_No, String mail_ID, String skillSet,
			String location_preference, String username, String password) {
		super();
		this.jobSeeker_Name = jobSeeker_Name;
		this.address = address;
		this.contact_No = contact_No;
		this.mail_ID = mail_ID;
		this.skillSet = skillSet;
		this.location_preference = location_preference;
		this.username = username;
		this.password = password;
	}

			
}