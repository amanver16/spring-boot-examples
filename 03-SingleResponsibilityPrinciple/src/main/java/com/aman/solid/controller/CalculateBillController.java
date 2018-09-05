package com.aman.solid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aman.solid.bean.OrderBean;
import com.aman.solid.service.CalculateBillService;

/**
 * @author aman.verma
 *
 */

@RestController
@EnableAutoConfiguration
@RequestMapping("/order")
public class CalculateBillController {

	@Autowired
	private CalculateBillService calculateBillService;

	@PostMapping("/calculateBill")
	public String calculateBill(@RequestBody OrderBean orderBean) {
		long billAmount = calculateBillService.calculateBill(orderBean.getOrderNumber());
		return "The total bill amount is $" + billAmount;
	}
}
