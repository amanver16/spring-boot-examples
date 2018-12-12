package com.aman.springboot.employee.repository;

import com.aman.springboot.employee.bean.EmployeeBean;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author aman.verma
 *
 */

@Repository
public interface EmployeeRepository extends MongoRepository<EmployeeBean, String> {

}
