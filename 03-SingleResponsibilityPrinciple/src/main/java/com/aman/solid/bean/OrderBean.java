package com.aman.solid.bean;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author aman.verma
 *
 */

@Document(collection = "orders")
public class OrderBean {

	@Id
	private int orderNumber;
	private CustomerBean customerBean;
	private List<ItemBean> purchasedItemList;

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public CustomerBean getCustomerBean() {
		return customerBean;
	}

	public void setCustomerBean(CustomerBean customerBean) {
		this.customerBean = customerBean;
	}

	public List<ItemBean> getPurchasedItemList() {
		return purchasedItemList;
	}

	public void setPurchasedItemList(List<ItemBean> purchasedItemList) {
		this.purchasedItemList = purchasedItemList;
	}
}
