package managedbean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

import controller.FullDAO;
import model.Tracking;

@ManagedBean
public class TrackingMB {
	private Tracking tracking;
	private ArrayList<Tracking> trackings;

	public TrackingMB() {
		super();
		this.tracking = new Tracking();
		this.trackings = new ArrayList<Tracking>();
	}

	public Tracking gettracking() {
		return tracking;
	}

	public void settracking(Tracking tracking) {
		this.trackings.add(tracking);
	}

	public boolean adicionar() {
		try {
			for (Tracking tracking : trackings) {
				FullDAO.salvar(tracking);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
}
