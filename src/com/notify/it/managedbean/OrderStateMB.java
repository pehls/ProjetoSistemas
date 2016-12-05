package com.notify.it.managedbean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

import com.notify.it.model.OrderState;
import com.notify.it.util.JpaUtil;

@ManagedBean
public class OrderStateMB {
	private OrderState orderState;
	private ArrayList<OrderState> orderStates;

	public OrderStateMB() {
		super();
		this.orderState = new OrderState();
		this.orderStates = new ArrayList<OrderState>();
	}

	public OrderState getorderState() {
		return orderState;
	}

	public void setorderState(OrderState orderState) {
		this.orderStates.add(orderState);
	}

	public boolean adicionar() {
		try {
			for (OrderState orderState : orderStates) {
				JpaUtil.salvar(orderState);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public ArrayList<OrderState> getOrderStates() {
		return orderStates;
	}
}

