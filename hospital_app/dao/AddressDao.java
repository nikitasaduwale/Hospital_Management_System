package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Address;

public interface AddressDao 
{
    public Address saveAddress(int bid,Address address);
	
	public Address getAddressId(int aid);
	
	public boolean deleteAddressId(int aid);
	
	public Address updateAddress(int aid,Address address);
	
	public List<Address> getAddressAll();
	}


