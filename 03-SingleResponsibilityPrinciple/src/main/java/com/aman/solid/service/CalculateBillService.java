package com.aman.solid.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.aman.solid.bean.ItemBean;
import com.aman.solid.bean.OrderBean;

/**
 * @author aman.verma
 *
 */

@Service
public class CalculateBillService {

	@Autowired
	private MongoTemplate mongoTemplate;

	public long calculateBill(int orderNumber) {

		Query orderQuery = new Query();
		orderQuery.addCriteria(Criteria.where("orderNumber").is(orderNumber));
		OrderBean orderBean = mongoTemplate.findOne(orderQuery, OrderBean.class);

		long billAmount = 0;

		if (orderBean != null) {
			List<ItemBean> purchasedItemList = orderBean.getPurchasedItemList();
			for (ItemBean itemBean : purchasedItemList) {
				billAmount = billAmount + itemBean.getItemPrice();
			}
		}

		return billAmount;
	}
}
