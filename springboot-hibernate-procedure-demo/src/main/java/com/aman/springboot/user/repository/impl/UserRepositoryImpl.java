package com.aman.springboot.user.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import com.aman.springboot.user.repository.UserRepository;

import org.springframework.stereotype.Service;

@Service
public class UserRepositoryImpl implements UserRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> getUserInformation() {
		StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery("USER_LIST");
		List<Object[]> userList =  storedProcedureQuery.getResultList();
		if(storedProcedureQuery.hasMoreResults()) {
			System.out.println("Print");
		}
		return userList;
	}

}
