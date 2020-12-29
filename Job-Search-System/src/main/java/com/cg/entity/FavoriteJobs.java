package com.cg.entity;

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
@Table(name="FavJobs")
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
public class FavoriteJobs {
	@Id   
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id",nullable=false)
	private Integer favJob_id;
	@ManyToOne
	@JoinColumn(name="jobseeker_id",nullable=false)
	private JobSeeker jobseeker;
	@ManyToOne
	@JoinColumn(name="job_id",nullable=false)
	private Job job;
	public FavoriteJobs() {
		super();
	}
	public FavoriteJobs(Integer favJob_id, JobSeeker jobseeker, Job job) {
		super();
		this.favJob_id = favJob_id;
		this.jobseeker = jobseeker;
		this.job = job;
	}
	public Integer getFavJob_id() {
		return favJob_id;
	}
	public void setFavJob_id(Integer favJob_id) {
		this.favJob_id = favJob_id;
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
	
	//	@Override
//	public String toString() {
//		return "FavoriteJobs [favJob_id=" + favJob_id + ", jobseeker=" + jobseeker + ", job=" + job + "]";
//	}
	
	
	
	
	
}