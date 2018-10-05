package com.aman.springboot.rest.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.aman.springboot.rest.api.bean.EmployeeBean;

/**
 * @author aman.verma
 *
 */

@Repository
public interface EmployeeRepository extends MongoRepository<EmployeeBean, String> {

}
