package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.EncounterDao;
import com.ty.hospital_app.dto.Encounter;

public class EncounterDaoImp implements EncounterDao{

	public Encounter saveEncounter(int bid, Encounter encounter) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("nikita");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(encounter);
		entityTransaction.commit();
		return encounter;
	}

	public Encounter getEncounterId(int eid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("nikita");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Encounter encounter=entityManager.find(Encounter.class,eid);
		
		return encounter;
	}

	public boolean deleteEncounterId(int eid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("nikita");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Encounter encounter=entityManager.find(Encounter.class,eid);
		if(encounter!=null) 
		{
			entityTransaction.begin();
			entityManager.remove(encounter);
			entityTransaction.commit();
			return true;
			
		}
		
		else {
			return false;
		}
	
	}

	public Encounter updateEncounter(int eid, Encounter encounter) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("nikita");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Encounter encounter1=entityManager.find(Encounter.class,eid);
		if(encounter1!=null) 
		{
			
		    encounter1.setBranch(encounter.getBranch());
		    encounter1.setDateofjoin(encounter.getDateofjoin());
		    encounter1.setDdischarge(encounter.getDdischarge());
		    encounter1.setObs(encounter.getObs());
		    encounter1.setOrder(encounter.getOrder());
		    encounter1.setPersons(encounter.getPersons());
		    encounter1.setReason(encounter.getReason());
		   
			entityTransaction.begin();
			entityManager.merge(encounter1);
			entityTransaction.commit();
			return encounter1;
		}
		else {
			return null;
		}
	}

	public List<Encounter> getAllEncounter() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("nikita");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Encounter s");
		List<Encounter> encounter=query.getResultList();
		return encounter;
	}

}
