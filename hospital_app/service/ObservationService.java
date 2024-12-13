package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.ObservationDaoImp;
import com.ty.hospital_app.dto.Observation;

public class ObservationService {
	public void SaveObservation(int eid,Observation observation) {
		ObservationDaoImp daoImp=new ObservationDaoImp();
		Observation observation1=daoImp.saveObservation(eid,observation);
		if(observation1!=null) {
			System.out.println("data saved");
		}
		else {
			System.out.println("unfaortunatly data not saved");
		}
	}
	public Observation getObservationById(int oid) {
		ObservationDaoImp daoImp=new ObservationDaoImp();
		Observation observation1=daoImp.getObservationId(oid);
		if(observation1!=null) {
			return observation1;
		}
		else {
			return null;
		}

}
	public void deleteObservationById(int oid) {
		ObservationDaoImp daoImp=new ObservationDaoImp();
		boolean flag=daoImp.deleteObservationId(oid);
		if(flag) 
		{
			System.out.println("data deleted");
		}
		else {
			System.out.println("data not found");
		}
}
	public Observation updateObservationById(int oid,Observation observation) {
		ObservationDaoImp daoImp=new ObservationDaoImp();
		Observation observation1=daoImp.updateObservation( oid,observation);
		if(observation1!=null) 
		{
		return observation1;
		}
		else {
			return null;
		}
}
    public List<Observation> getAllObservation(){
    	ObservationDaoImp daoImp=new ObservationDaoImp();
    	List<Observation>observation=daoImp.getAllObservation();
    	return observation;
    	
    }
	
	public List<Observation> getObservationByDoctorName(String name){
		ObservationDaoImp daoImp=new ObservationDaoImp();
    	List<Observation>observation=daoImp.getObservationByDoctorName(name);
    	return observation;
		
	}

}
