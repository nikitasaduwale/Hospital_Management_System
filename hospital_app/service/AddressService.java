package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.AddressDaoImp;
import com.ty.hospital_app.dto.Address;

public class AddressService {
	public void SaveAddress(int bid,Address address) {
		AddressDaoImp daoImp=new AddressDaoImp();
		Address address1=daoImp.saveAddress(bid,address);
		if(address1!=null) {
			System.out.println("data saved");
		}
		else {
			System.out.println("unfaortunatly data not saved");
		}
	}
	public Address getAddressById(int aid) {
		AddressDaoImp daoImp=new AddressDaoImp();
		Address address1=daoImp.getAddressId(aid);
		if(address1!=null) {
			return address1;
		}
		else {
			return null;
		}

}
	public void deleteAddressById(int aid) {
		AddressDaoImp daoImp=new AddressDaoImp();
		boolean flag=daoImp.deleteAddressId(aid);
		if(flag) 
		{
			System.out.println("data deleted");;
		}
		else {
			System.out.println("data not found");
		}
}
	public Address updateAddressById(int aid,Address address) {
		AddressDaoImp daoImp=new AddressDaoImp();
		Address address1=daoImp.updateAddress( aid,address);
		if(address1!=null) 
		{
		return address1;
		}
		else {
			return null;
		}

}
	public List<Address> getAddressAll(){
		AddressDaoImp daoImp=new AddressDaoImp();
		List<Address>address=daoImp.getAddressAll();
		return address;
	}
}
