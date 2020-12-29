package com.cg.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="applied_jobs")
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class AppliedJobs {
	@Id   
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id",nullable=false)
	private Integer appliedJob_id;
	@ManyToOne
	@JoinColumn(name="jobseeker_id", nullable= false)
	private JobSeeker jobseeker;
	@ManyToOne
	@JoinColumn(name="job_id", nullable=false)
	private Job job;
	public AppliedJobs(JobSeeker jobseeker, Job job) {
		super();
		this.jobseeker = jobseeker;
		this.job = job;
	}
	public AppliedJobs() {
		super();
	}
	public AppliedJobs(Integer appliedJob_id, JobSeeker jobseeker, Job job) {
		super();
		this.appliedJob_id = appliedJob_id;
		this.jobseeker = jobseeker;
		this.job = job;
	}
	public Integer getAppliedJob_id() {
		return appliedJob_id;
	}
	public void setAppliedJob_id(Integer appliedJob_id) {
		this.appliedJob_id = appliedJob_id;
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
	
	
}