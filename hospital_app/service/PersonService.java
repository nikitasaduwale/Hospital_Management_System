package com.ty.hospital_app.service;

import java.util.List;


import com.ty.hospital_app.dao.imp.PersonDaoImp;
import com.ty.hospital_app.dto.Person;

public class PersonService {
	public void SavePerson(int eid,Person person) {
		PersonDaoImp daoImp=new PersonDaoImp();
		Person person1=daoImp.savePerson(eid,person);
		if(person1!=null) {
			System.out.println("data saved");
		}
		else {
			System.out.println("unfaortunatly data not saved");
		}
	}
	public Person getPersonById(int pid) {
		PersonDaoImp daoImp=new PersonDaoImp();
		Person person1=daoImp.getPersonId(pid);
		if(person1!=null) {
			return person1;
		}
		else {
			return null;
		}

}
	public void deletePersonById(int pid) {
		PersonDaoImp daoImp=new PersonDaoImp();
		boolean flag=daoImp.deletePersonId(pid);
		if(flag) 
		{
			System.out.println("data deleted");;
		}
		else {
			System.out.println("data not found");
		}
}
	public Person updatePersonById(int pid,Person person) {
		PersonDaoImp daoImp=new PersonDaoImp();
		Person person1=daoImp.updatePerson( pid,person);
		if(person1!=null) 
		{
		return person1;
		}
		else {
			return null;
		}
}
	public List<Person> getAllPerson(){
		PersonDaoImp daoImp=new PersonDaoImp();
    	List<Person>Person=daoImp.getAllPerson();
    	return Person;
	}
	
	public List<Person> getPersonByGender(String gender){
		PersonDaoImp daoImp=new PersonDaoImp();
    	List<Person>Person=daoImp.getPersonByGender(gender);
    	return Person;
		
	}
	
	public List<Person> getPersonByAge(int age){
		PersonDaoImp daoImp=new PersonDaoImp();
    	List<Person>Person=daoImp.getPersonByAge(age);
    	return Person;
		
	}
	
	public List<Person> getPersonByPhone(long phone){
		PersonDaoImp daoImp=new PersonDaoImp();
    	List<Person>Person=daoImp.getPersonByPhone(phone);
    	return Person;
	}

}
