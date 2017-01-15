package br.com.fiap.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.*;

public class JpaUtil {

	private static EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("jpaPU");
	
	public static EntityManager getEntityManager() {
//	EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaPU");
	
	return emf.createEntityManager();
	}
}
