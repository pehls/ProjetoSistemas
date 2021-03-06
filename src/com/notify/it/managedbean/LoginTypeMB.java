package com.notify.it.managedbean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

import com.notify.it.model.LoginType;
import com.notify.it.util.JpaUtil;

@ManagedBean
public class LoginTypeMB {

	private LoginType lgnType;
	private ArrayList<LoginType> lgnTypes;

	public LoginTypeMB() {
		super();
		this.lgnType = new LoginType();
		this.lgnTypes = new ArrayList<LoginType>();
	}

	public LoginType getLgnType() {
		return lgnType;
	}

	public void setLgnType(LoginType lgnType) {
		this.lgnTypes.add(lgnType);
	}

	public boolean adicionarLgnTypes() {
		try {
			for (LoginType loginType : lgnTypes) {
				JpaUtil.salvar(loginType);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public ArrayList<LoginType> getLgnTypes() {
		return lgnTypes;
	}
}
