package com.cg.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter

public class AppliedJobsDO {
	
	private Integer jobId;
	private Integer jobSeekerId;
	public AppliedJobsDO(Integer jobSeekerId) {
	
		this.jobSeekerId = jobSeekerId;
	}
	public AppliedJobsDO() {
		// TODO Auto-generated constructor stub
	}
	public Integer getJobId() {
		return jobId;
	}
	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}
	public Integer getJobSeekerId() {
		return jobSeekerId;
	}
	public void setJobSeekerId(Integer jobSeekerId) {
		this.jobSeekerId = jobSeekerId;
	}
	
	
}
