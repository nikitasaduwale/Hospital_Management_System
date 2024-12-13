package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Encounter;

public interface EncounterDao {
    public Encounter saveEncounter(int bid,Encounter encounter);
	
	public Encounter getEncounterId(int eid);
	
	public boolean deleteEncounterId(int eid);
	
	public  Encounter updateEncounter(int eid,Encounter encounter);
	
	public List<Encounter> getAllEncounter();
	}


