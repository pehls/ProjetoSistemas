package managedbean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

import controller.FullDAO;
import model.Deliverer;

@ManagedBean
public class DelivererMB {

	private Deliverer deliverer;
	private ArrayList<Deliverer> deliverers;

	// private FullDAO DelivererDao;
	public DelivererMB() {
		deliverer = new Deliverer();
		deliverers = new ArrayList<Deliverer>();
		// DelivererDao = new FullDAO();
	}

	public Deliverer getDeliverer() {
		return deliverer;
	}

	public void setDeliverer(Deliverer deliverer) {
		this.deliverers.add(deliverer);
	}

	public boolean adicionarDeliverers() {
		try {
			for (Deliverer deliverer : deliverers) {
				FullDAO.salvar(deliverer);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public ArrayList<Deliverer> getDeliverers() {
		return deliverers;
	}

}
