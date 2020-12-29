 package com.cg.entity;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="Job")
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class Job {
		@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id",nullable=false)
	private Integer id;
	@Column(name="title", nullable = false)
	private String title;
	@Column(name="location", nullable = false)
	private String location;
	@Column(name="description", nullable = false)
	private String description;
	@Column(name="experience", nullable = false)
	private String experience;
	@Column(name="salary", nullable = false)
	private double salary;
	@Column(name="noticePeriod", nullable = false)
	private String noticePeriod;
	@Column(name="status", nullable = false)
	private String status;
	@Column(name="email", nullable = false)
	private String email;
	@Column(name="contactNo", nullable = false)
	private long contactNo;
	@Column(name="skillSet", nullable = false)
	private String skillSet;
	//@JsonIgnore
	//@ToString.Exclude
	@ManyToOne
	@JoinColumn(name="emp_id")
	private Employer employer;
	//@JsonIgnore
	//@ToString.Exclude
	@Column(name="jobseeker_id", nullable = false)
	private int jobseeker_id;
	@JsonIgnore
	//@ToString.Exclude
	@OneToMany(mappedBy = "job", cascade = CascadeType.ALL)
	private Collection<AppliedJobs> appliedjobs = new ArrayList<AppliedJobs>();
	@JsonIgnore
	@OneToMany(mappedBy = "job", cascade = CascadeType.ALL)
	private Collection<Message> message = new ArrayList<Message>();
	@JsonIgnore
	@OneToMany(mappedBy = "job", cascade = CascadeType.ALL)
	private Collection<FavoriteJobs> favJobs = new ArrayList<FavoriteJobs>();
	public Job(String title) {
		super();
		this.title = title;
	}
	public Job(Integer id) {
		super();
		this.id = id;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getNoticePeriod() {
		return noticePeriod;
	}
	public void setNoticePeriod(String noticePeriod) {
		this.noticePeriod = noticePeriod;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}
	public Employer getEmployer() {
		return employer;
	}
	public void setEmployer(Employer employer) {
		this.employer = employer;
	}
	public int getJobseeker_id() {
		return jobseeker_id;
	}
	public void setJobseeker_id(int jobseeker_id) {
		this.jobseeker_id = jobseeker_id;
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
	public Collection<FavoriteJobs> getFavJobs() {
		return favJobs;
	}
	public void setFavJobs(Collection<FavoriteJobs> favJobs) {
		this.favJobs = favJobs;
	}
	
	public Job() {
		super();
	}
	public Job(Integer id, String title, String location, String description, String experience, double salary,
			String noticePeriod, String status, String email, long contactNo, String skillSet, Employer employer,
			int jobseeker_id, Collection<AppliedJobs> appliedjobs, Collection<Message> message,
			Collection<FavoriteJobs> favJobs) {
		super();
		this.id = id;
		this.title = title;
		this.location = location;
		this.description = description;
		this.experience = experience;
		this.salary = salary;
		this.noticePeriod = noticePeriod;
		this.status = status;
		this.email = email;
		this.contactNo = contactNo;
		this.skillSet = skillSet;
		this.employer = employer;
		this.jobseeker_id = jobseeker_id;
		this.appliedjobs = appliedjobs;
		this.message = message;
		this.favJobs = favJobs;
	}
	

	
	
//	@Override
//	public String toString() {
//		return "Job [id=" + id + ", title=" + title + ", location=" + location + ", description=" + description
//				+ ", experience=" + experience + ", salary=" + salary + ", noticePeriod=" + noticePeriod + ", status="
//				+ status + ", email=" + email + ", contactNo=" + contactNo + ", skillSet=" + skillSet + ", employer="
//				+ employer.getId() + ", jobseeker_id=" + jobseeker_id + ", appliedjobs=" + appliedjobs + "]";
//	}

}