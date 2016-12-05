package com.notify.it.managedbean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

import com.notify.it.model.Provider;
import com.notify.it.util.JpaUtil;

@ManagedBean
public class ProviderMB {
	private Provider provider;
	private ArrayList<Provider> providers;

	public ProviderMB() {
		super();
		this.provider = new Provider();
		this.providers = new ArrayList<Provider>();
	}

	public Provider getprovider() {
		return provider;
	}

	public void setprovider(Provider provider) {
		this.providers.add(provider);
	}

	public boolean adicionar() {
		try {
			for (Provider provider : providers) {
				JpaUtil.salvar(provider);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public ArrayList<Provider> getProviders() {
		return providers;
	}
}
