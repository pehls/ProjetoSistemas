package managedbean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

import controller.FullDAO;
import model.Order;
 
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
				FullDAO.salvar(order);
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
