package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Observation;

public interface ObservationDao {
    public Observation saveObservation(int eid,Observation observation);
	
	public Observation getObservationId(int oid);
	
	public boolean deleteObservationId(int oid);
	
	public Observation updateObservation(int oid,Observation observation);
	
	public List<Observation> getAllObservation();
	
	public List<Observation> getObservationByDoctorName(String name);
	}


