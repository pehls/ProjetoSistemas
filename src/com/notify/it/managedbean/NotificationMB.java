package com.notify.it.managedbean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

import com.notify.it.model.Notification;
import com.notify.it.util.JpaUtil;

@ManagedBean
public class NotificationMB {
	private Notification notification;
	private ArrayList<Notification> notifications;

	public NotificationMB() {
		super();
		this.notification = new Notification();
		this.notifications = new ArrayList<Notification>();
	}

	public Notification getnotification() {
		return notification;
	}

	public void setnotification(Notification notification) {
		this.notifications.add(notification);
	}

	public boolean adicionar() {
		try {
			for (Notification notification : notifications) {
				JpaUtil.salvar(notification);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public ArrayList<Notification> getNotifications() {
		return notifications;
	}
}

