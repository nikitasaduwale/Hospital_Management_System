package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.PersonDao;

import com.ty.hospital_app.dto.Person;

public class PersonDaoImp implements PersonDao{

	public Person savePerson(int eid, Person person) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("nikita");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
		return person;
	
	}

	public Person getPersonId(int pid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("nikita");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
	    Person person=entityManager.find(Person.class,pid);
		return person ;
	}

	public boolean deletePersonId(int pid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("nikita");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Person person=entityManager.find(Person.class,pid);
		if(person!=null) 
		{
			entityTransaction.begin();
			entityManager.remove(person);
			entityTransaction.commit();
			return true;
			
		}
		
		else {
			return false;
		}

	}

	public Person updatePerson(int pid, Person Person) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("nikita");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Person person1=entityManager.find(Person.class,pid);
		if(person1!=null) 
		{
			person1.setName(Person.getName());
			person1.setGender(Person.getGender());
			person1.setPhno(Person.getPhno());
			person1.setEncounter(Person.getEncounter());
			person1.setAge(Person.getAge());
			person1.setAddress(Person.getAddress());
			entityTransaction.begin();
			entityManager.merge(person1);
			entityTransaction.commit();
			return person1;
		}
		else {
			return null;
		}
		
	}

	public List<Person> getAllPerson() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("nikita");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Person s");
		List<Person> person=query.getResultList();
		return person;
	}

	public List<Person> getPersonByGender(String gender) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("nikita");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select p from Person m WHEREp.gender=?",Person.class);
		query.setParameter(1, gender);
		List<Person> person=query.getResultList(); 
		return  person;
		
	}

	public List<Person> getPersonByAge(int age) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("nikita");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select p from Person m WHEREp.age=?",Person.class);
		query.setParameter(1, age);
		List<Person> person=query.getResultList(); 
		return  person;
		
	}

	public List<Person> getPersonByPhone(long phone) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("nikita");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select p from Person m WHEREp.phone=?",Person.class);
		query.setParameter(1, phone);
		List<Person> person=query.getResultList(); 
		return  person;
	}

}
