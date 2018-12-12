package com.aman.springboot.student.repository;

import com.aman.springboot.student.bean.StudentBean;

/**
 * @author aman.verma
 *
 */


public interface CustomStudentRepository {

	public void addStudent(StudentBean studentBean);

	public void removeStudent(StudentBean studentBean);

	public void updateStudent(StudentBean studentBean);

	public StudentBean searchStudent(StudentBean studentBean);

}
