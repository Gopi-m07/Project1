package servlet_login_validation_dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import servlet_login_validation_dto.Employeedto;

public class Employeedao {
     EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
     EntityManager em=emf.createEntityManager();
     EntityTransaction et=em.getTransaction();
     
     public void signup(Employeedto dto) {
    	 et.begin();
    	 em.persist(dto);
    	 et.commit();
     }

	public Employeedto login(String email) {
		Employeedto dto1=em.find(Employeedto.class, email);
		return dto1;
	}
     
}

	
