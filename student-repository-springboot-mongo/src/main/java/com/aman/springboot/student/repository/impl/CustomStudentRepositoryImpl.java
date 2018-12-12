package com.aman.springboot.student.repository.impl;

import com.aman.springboot.student.bean.StudentBean;
import com.aman.springboot.student.repository.CustomStudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

/**
 * @author aman.verma
 *
 */

@Service
public class CustomStudentRepositoryImpl implements CustomStudentRepository {

	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public void addStudent(StudentBean studentBean) {
		mongoTemplate.save(studentBean);
	}

	@Override
	public void removeStudent(StudentBean studentBean) {
		mongoTemplate.remove(studentBean);
	}

	@Override
	public void updateStudent(StudentBean studentBean) {
		StudentBean student = new StudentBean();
		student = searchStudent(studentBean);
		mongoTemplate.save(student);
	}

	@Override
	public StudentBean searchStudent(StudentBean studentBean) {
		Query searchQuery = new Query();
		searchQuery.addCriteria(Criteria.where("name").is(studentBean.getName()));
		return mongoTemplate.findOne(searchQuery, StudentBean.class);
	}
}
