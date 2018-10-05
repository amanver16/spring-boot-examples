package com.aman.springboot.hibernate.proceduredemo.repository;

import java.util.List;

/**
 * @author aman.verma
 *
 */

public interface UserRepository {

	public List<Object[]> getUserInformation();
	
}
