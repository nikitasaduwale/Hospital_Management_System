package com.ty.hospital_app.service;

import com.ty.hospital_app.dao.imp.HospitalDaoImp;
import com.ty.hospital_app.dto.Hospital;

public class HospitalService {
	public void SaveHospital(Hospital hospital) {
		HospitalDaoImp daoImp=new HospitalDaoImp();
		Hospital hospital1=daoImp.saveHospital(hospital);
		if(hospital1!=null) {
			System.out.println("data saved");
		}
		else {
			System.out.println("unfaortunatly data not saved");
		}
	}
	public Hospital getHospitalById(int hid) {
		HospitalDaoImp daoImp=new HospitalDaoImp();
		Hospital hospital1=daoImp.getHospitalId(hid);
		if(hospital1!=null) {
			return hospital1;
		}
		else {
			return null;
		}

}
	public void deleteHospitalById(int hid) {
		HospitalDaoImp daoImp=new HospitalDaoImp();
		boolean flag=daoImp.deleteHospitalId(hid);
		if(flag) 
		{
			System.out.println("data deleted");;
		}
		else {
			System.out.println("data not found");
		}
}
	public Hospital updateHospitalById(int hid,Hospital hospital) {
		HospitalDaoImp daoImp=new HospitalDaoImp();
		Hospital hospital1=daoImp.updateHospital( hid,hospital);
		if(hospital1!=null) 
		{
		return hospital1;
		}
		else {
			return null;
		}
}
}
