package com.ty.hospital_app.service;

import java.util.List;

import javax.persistence.Query;

import com.ty.hospital_app.dao.imp.MedOrderDaoImp;
import com.ty.hospital_app.dto.MedOrder;

public class MedOrderService {
	public void SaveMedOrder(int eid,MedOrder medorder) {
		MedOrderDaoImp daoImp=new MedOrderDaoImp();
		MedOrder medorder1=daoImp.saveMedOrder(eid,medorder);
		if(medorder1!=null) {
			System.out.println("data saved");
		}
		else {
			System.out.println("unfaortunatly data not saved");
		}
	}
	public MedOrder getMedOrderById(int mid) {
		MedOrderDaoImp daoImp=new MedOrderDaoImp();
		MedOrder medorder1=daoImp.getMedOrderId(mid);
		if(medorder1!=null) {
			return medorder1;
		}
		else {
			return null;
		}

}
	public void deleteMedOrderById(int mid) {
		MedOrderDaoImp daoImp=new MedOrderDaoImp();
		boolean flag=daoImp.deleteMedOrderId(mid);
		if(flag) 
		{
			System.out.println("data deleted");;
		}
		else {
			System.out.println("data not found");
		}
}
	public MedOrder updateHospitalById(int mid,MedOrder medorder) {
		MedOrderDaoImp daoImp=new MedOrderDaoImp();
		MedOrder medorder1=daoImp.updateMedOrder( mid,medorder);
		if(medorder1!=null) 
		{
		return medorder1;
		}
		else {
			return null;
		}
}
    public List<MedOrder> getAllMedOrder()
    {
    	MedOrderDaoImp daoImp=new MedOrderDaoImp();
		List<MedOrder> medorder1=daoImp.getAllMedOrder();
		return medorder1;
		
    	
    }
	
	public List<MedOrder> getMedOrderByDoctorName(String name){
		MedOrderDaoImp daoImp=new MedOrderDaoImp();
		List<MedOrder>medorder=daoImp.getMedOrderByDoctorName(name);
		return medorder;
		
		
	}

}
