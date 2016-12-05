package com.notify.it.managedbean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

import com.notify.it.model.Order;
import com.notify.it.util.JpaUtil;
 
@ManagedBean
public class OrderMB {
	private Order order;
	private ArrayList<Order> orders;

	public OrderMB() {
		super();
		this.order = new Order();
		this.orders = new ArrayList<Order>();
	}

	public Order getorder() {
		return order;
	}

	public void setorder(Order order) {
		this.orders.add(order);
	}

	public boolean adicionar() {
		try {
			for (Order order : orders) {
				JpaUtil.salvar(order);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public ArrayList<Order> getOrders() {
		return orders;
	}
}
