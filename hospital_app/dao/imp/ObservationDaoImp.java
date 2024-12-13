package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.ObservationDao;

import com.ty.hospital_app.dto.Observation;

public class ObservationDaoImp implements ObservationDao {

	public Observation saveObservation(int eid, Observation observation) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("nikita");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(observation);
		entityTransaction.commit();
		return observation;
		
	}

	public Observation getObservationId(int oid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("nikita");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Observation observation=entityManager.find(Observation.class,oid);
		return observation ;
	}

	public boolean deleteObservationId(int oid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("nikita");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Observation observation=entityManager.find(Observation.class,oid);
		if(observation!=null) 
		{
			entityTransaction.begin();
			entityManager.remove(observation);
			entityTransaction.commit();
			return true;
			
		}
		
		else {
			return false;
		}
	}

	public Observation updateObservation(int oid, Observation observation) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("nikita");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Observation observation1=entityManager.find(Observation.class,oid);
		if(observation1!=null) 
		{
			observation1.setDname(observation.getDname());
			observation1.setEncounter(observation.getEncounter());
		    observation1.setUrobservation(observation.getUrobservation());
			entityTransaction.begin();
			entityManager.merge(observation1);
			entityTransaction.commit();
			return observation1;
		}
		else {
			return null;
		}
	}

	public List<Observation> getAllObservation() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("nikita");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Observation s");
		List<Observation> observation=query.getResultList();
		return observation;
	}

	public List<Observation> getObservationByDoctorName(String name) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("nikita");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select m from Medorder m WHEREm.dname=?",Observation.class);
		query.setParameter(1, name);
		List<Observation> observation=query.getResultList(); 
		return  observation;

	}

}
