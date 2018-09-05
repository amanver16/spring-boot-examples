package com.aman.solid.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.aman.solid.bean.OrderBean;

/**
 * @author aman.verma
 *
 */

@Service
public class PlaceOrderService {

	@Autowired
	private MongoTemplate mongoTemplate;

	public boolean placeOrder(OrderBean orderBean) {

		if (orderBean != null) {
			mongoTemplate.save(orderBean);
			return true;
		}
		
		return false;
	}
}
