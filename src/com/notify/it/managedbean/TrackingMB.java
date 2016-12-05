package com.notify.it.managedbean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

import com.notify.it.model.Tracking;
import com.notify.it.util.JpaUtil;

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
				JpaUtil.salvar(tracking);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public ArrayList<Tracking> getTrackings() {
		return trackings;
	}
}
