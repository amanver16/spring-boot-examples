package com.aman.springboot.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.aman.springboot.bean.StudentRepo;

/**
 * @author aman.verma
 *
 */

@Repository
public interface StudentRepository extends MongoRepository<StudentRepo, ObjectId>, CustomStudentRepository {		
	public StudentRepo findStudentById(int id);
}
