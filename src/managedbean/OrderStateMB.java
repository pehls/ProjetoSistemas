package managedbean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

import controller.FullDAO;
import model.OrderState;

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
				FullDAO.salvar(orderState);
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

