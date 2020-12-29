package com.cg.dao;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
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


@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { JobSearchSystemApplication.class })
@AutoConfigureTestDatabase(replace=Replace.NONE)
@DataJpaTest
public class EmployerSpringDataDAOTest {

	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private EmployerSpringDataDAO employerSpringDataDAO;

//	@Test
//	public void whenInvalidName_thenReturnNull() {
//		Employer fromDb =employerSpringDataDAO.findByOrganizationName("doesNotExist");
//		assertThat(fromDb).isNull();
//	}
//
//	@Test
//    public void whenFindByOrganizationName_thenReturnEmployer() {
//        Employer fromDb = new Employer("capgemini","mumbai",956321235,"xyz.gmail.com","xyz1234","pass1234");
//        entityManager.persistAndFlush(fromDb);
//
//        Employer found = employerSpringDataDAO.findByOrganizationName(fromDb.getOrganizationName());
//        assertThat(found.getOrganizationName()).isEqualTo(fromDb.getOrganizationName());
//    }
//	
//	@Test
//    public void whenFindById_thenReturnEmployer() {
//        Employer emp = new Employer("capgemini","mumbai",956321235,"xyz.gmail.com","xyz1234","pass1234");
//        entityManager.persistAndFlush(emp);
//
//        Employer fromDb = employerSpringDataDAO.findById(emp.getId()).orElse(null);
//        assertThat(fromDb.getOrganizationName()).isEqualTo(emp.getOrganizationName());
//    }
//
//	@Test
//	public void whenInvalidId_thenReturnNull() {
//		Employer fromDb = employerSpringDataDAO.findById(10).orElse(null);
//		assertThat(fromDb).isNull();
//	}
//	
//	@Test
//    public void givenSetOfEmployers_whenFindAll_thenReturnAllEmployers() {
//        Employer tcs = new Employer("tcs","mumbai",956321235,"xyz.gmail.com","xyz1234","pass1234");
//        Employer capgemini = new Employer("capgemini","mumbai",956321235,"xyz.gmail.com","xyz1234","pass1234");
//        Employer infosys = new Employer("infosys","mumbai",956321235,"xyz.gmail.com","xyz1234","pass1234");
//
//        entityManager.persist(tcs);
//        entityManager.persist(capgemini);
//        entityManager.persist(infosys);
//        entityManager.flush();
//
//        List<Employer> allEmployers = employerSpringDataDAO.findAll();
//
//        assertThat(allEmployers).hasSize(3).extracting(Employer::getOrganizationName).containsOnly(tcs.getOrganizationName(), capgemini.getOrganizationName(), infosys.getOrganizationName());
//    }

}