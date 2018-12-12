package com.aman.springboot.student.repository;

import com.aman.springboot.student.bean.StudentBean;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author aman.verma
 *
 */

@Repository
public interface StudentRepository extends MongoRepository<StudentBean, ObjectId>, CustomStudentRepository {
	public StudentBean findStudentById(int id);
}
