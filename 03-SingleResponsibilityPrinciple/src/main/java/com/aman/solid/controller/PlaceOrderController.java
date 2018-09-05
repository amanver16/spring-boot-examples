package com.aman.solid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aman.solid.bean.OrderBean;
import com.aman.solid.service.PlaceOrderService;

/**
 * @author aman.verma
 *
 */

@RestController
@EnableAutoConfiguration
@RequestMapping("/order")
public class PlaceOrderController {

	@Autowired
	private PlaceOrderService placeOrderService;
	
	@PostMapping(value="/placeOrder")
	public String placeOrder(@RequestBody OrderBean orderBean) {
		
		if(placeOrderService.placeOrder(orderBean)) {
			return "Order placed successfully !!!";
		}
		
		return "Order failed !!!";
	}
}
