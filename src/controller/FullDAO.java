package controller;

import javax.persistence.EntityManager;

import util.JpaUtil;

public class FullDAO {

	private static EntityManager em;

	public FullDAO() {
		em = JpaUtil.getFactory();
	}

	public static boolean salvar(Object obj) {
		em = JpaUtil.getFactory();
		try {
			em.persist(obj);
			em.flush();
			em.getTransaction().commit();
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
