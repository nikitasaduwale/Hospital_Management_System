package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.EncounterDaoImp;
import com.ty.hospital_app.dto.Encounter;

public class EncounterService {
	public void SaveHospital(int bid,Encounter encounter) {
		EncounterDaoImp daoImp=new EncounterDaoImp();
		Encounter encounter1=daoImp.saveEncounter(bid,encounter);
		if(encounter1!=null) {
			System.out.println("data saved");
		}
		else {
			System.out.println("unfaortunatly data not saved");
		}
	}
	public Encounter getEncounterById(int eid) {
		EncounterDaoImp daoImp=new EncounterDaoImp();
		Encounter encounter1=daoImp.getEncounterId(eid);
		if(encounter1!=null) {
			return encounter1;
		}
		else {
			return null;
		}

}
	public void deleteEncounterById(int eid) {
		EncounterDaoImp daoImp=new EncounterDaoImp();
		boolean flag=daoImp.deleteEncounterId(eid);
		if(flag) 
		{
			System.out.println("data deleted");;
		}
		else {
			System.out.println("data not found");
		}
}
	public Encounter updateEncounterById(int eid,Encounter encounter) {
		EncounterDaoImp daoImp=new EncounterDaoImp();
		Encounter encounter1=daoImp.updateEncounter( eid,encounter);
		if(encounter1!=null) 
		{
		return encounter1;
		}
		else {
			return null;
		}
}
	public List<Encounter> getAllEncounter(){
		EncounterDaoImp daoImp=new EncounterDaoImp();
		List<Encounter>encounter=daoImp.getAllEncounter();	
		return encounter;
	}


}
