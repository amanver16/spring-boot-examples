package com.aman.springboot.repository;

import com.aman.springboot.bean.StudentRepo;

/**
 * @author aman.verma
 *
 */


public interface CustomStudentRepository {

	public void addStudent(StudentRepo studentRepo);

	public void removeStudent(StudentRepo studentRepo);

	public void updateStudent(StudentRepo studentRepo);

	public StudentRepo searchStudent(StudentRepo studentRepo);

}
