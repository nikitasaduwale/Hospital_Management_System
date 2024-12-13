package com.ty.hospital_app.controll;


import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.HospitalService;

public class UpdateHospital {
	public static void main(String[] args) {
		Hospital hospital=new Hospital();
		HospitalService service=new HospitalService();
		hospital.setName("jadhav");
		service.updateHospitalById(1, hospital);
		
	}
	
	
	

}
