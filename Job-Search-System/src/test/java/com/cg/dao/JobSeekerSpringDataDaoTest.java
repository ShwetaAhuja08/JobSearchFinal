package com.cg.dao;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.cg.JobSearchSystem.JobSearchSystemApplication;
import com.cg.entity.Employer;
import com.cg.entity.Job;
import com.cg.entity.JobSeeker;


@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { JobSearchSystemApplication.class })
@AutoConfigureTestDatabase(replace=Replace.NONE)
@DataJpaTest
public class JobSeekerSpringDataDaoTest {
	@Autowired
	private TestEntityManager entityManager;
	
	@Autowired
	private JobSeekerSpringDataDao jobSeekerSpringDataDAO;
	
//	@Test
//    public void whenFindById_thenReturnJobSeeker() {
//        JobSeeker jobseeker = new JobSeeker("neha","mumbai",(long) 99999999,"xyz.gmail.com","java","mumbai","xyz1234","pass1234");
//        entityManager.persistAndFlush(jobseeker);
//
//        JobSeeker fromDb = jobSeekerSpringDataDAO.findById(jobseeker.getJobSeeker_Id()).orElse(null);
//        assertThat(fromDb.getJobSeeker_Name()).isEqualTo(jobseeker.getJobSeeker_Name());
//    }
//	
//	@Test
//	@DirtiesContext
//	public void whenInvalidId_thenReturnNull() {
//		JobSeeker fromDb = jobSeekerSpringDataDAO.findById(3).orElse(null);
//		assertThat(fromDb).isNull();
//	}
//	
//	@Test
//    public void givenSetOfEmployers_whenFindAll_thenReturnAllEmployers() {
//		JobSeeker java = new JobSeeker("neha","mumbai",(long) 99999999,"xyz.gmail.com","java","mumbai","xyz1234","pass1234");
//		JobSeeker sql = new JobSeeker("xyz","mumbai",(long) 99999999,"xyz.gmail.com","sql","mumbai","xyz1234","pass1234");
//		JobSeeker python = new JobSeeker("abc","mumbai",(long) 99999999,"xyz.gmail.com","python","mumbai","xyz1234","pass1234");
//
//        entityManager.persist(java);
//        entityManager.persist(sql);
//        entityManager.persist(python);
//        entityManager.flush();
//
//        List<JobSeeker> allJobSeekers = jobSeekerSpringDataDAO.findAll();
//
//        assertThat(allJobSeekers).hasSize(3).extracting(JobSeeker::getSkillSet).containsOnly(java.getSkillSet(),sql.getSkillSet(),python.getSkillSet());
//    }
}
