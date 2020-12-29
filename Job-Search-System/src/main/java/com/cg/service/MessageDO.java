package com.cg.service;


import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

//@Setter
//@Getter
public class MessageDO {
	//private Integer id;
		private String description;
		private Integer jobseekerId;
		private Integer jobId ;
		private Integer employerId;
		private Date date;
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public Integer getJobseekerId() {
			return jobseekerId;
		}
		public void setJobseekerId(Integer jobseekerId) {
			this.jobseekerId = jobseekerId;
		}
		public Integer getJobId() {
			return jobId;
		}
		public void setJobId(Integer jobId) {
			this.jobId = jobId;
		}
		public Integer getEmployerId() {
			return employerId;
		}
		public void setEmployerId(Integer employerId) {
			this.employerId = employerId;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}


}
