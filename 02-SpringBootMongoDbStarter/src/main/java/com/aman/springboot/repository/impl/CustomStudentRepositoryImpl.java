package com.aman.springboot.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.aman.springboot.bean.StudentRepo;
import com.aman.springboot.repository.CustomStudentRepository;

/**
 * @author aman.verma
 *
 */

@Service
public class CustomStudentRepositoryImpl implements CustomStudentRepository {

	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public void addStudent(StudentRepo studentRepo) {
		mongoTemplate.save(studentRepo);
	}

	@Override
	public void removeStudent(StudentRepo studentRepo) {
		mongoTemplate.remove(studentRepo);
	}

	@Override
	public void updateStudent(StudentRepo studentRepo) {
		StudentRepo student = new StudentRepo();
		student = searchStudent(studentRepo);
		mongoTemplate.save(student);
	}

	@Override
	public StudentRepo searchStudent(StudentRepo studentRepo) {
		Query searchQuery = new Query();
		searchQuery.addCriteria(Criteria.where("name").is(studentRepo.getName()));
		return mongoTemplate.findOne(searchQuery, StudentRepo.class);
	}
}
