package com.cg.service;

import lombok.Getter;
import lombok.Setter;

//@Setter
//@Getter
public class FavoriteJobsDO {
	
	
	private Integer jobId;
	private Integer jobSeekerId;
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
	
	public FavoriteJobsDO(Integer jobSeekerId) {
		this.jobSeekerId = jobSeekerId;
	}

}
