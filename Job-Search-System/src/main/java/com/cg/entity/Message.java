package com.cg.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity
@Table(name="Message")
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor

public class Message {

	@Id   
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id",nullable=false)
	private Integer id;
	@Column(name= "description", nullable=false)
	private String description;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="jobseeker_id", nullable = false)
	private JobSeeker jobseeker;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="job_id", nullable= false)
	private Job job ;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="employer_id", nullable=false)
	private Employer employer;
	@Column(name="date",nullable=false)
	private Date date;
	public Message() {
		super();
	}
	
	public Message(String description) {
		super();
		this.description = description;
	}

	public Message(Integer id, String description, JobSeeker jobseeker, Job job, Employer employer, Date date) {
		super();
		this.id = id;
		this.description = description;
		this.jobseeker = jobseeker;
		this.job = job;
		this.employer = employer;
		this.date = date;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public JobSeeker getJobseeker() {
		return jobseeker;
	}
	public void setJobseeker(JobSeeker jobseeker) {
		this.jobseeker = jobseeker;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public Employer getEmployer() {
		return employer;
	}
	public void setEmployer(Employer employer) {
		this.employer = employer;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}






}
