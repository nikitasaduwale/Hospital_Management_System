package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Item;

public interface ItemsDao {
    public Item saveItem(int mid,Item item);
	
	public Item getItemId(int iid);
	
	public boolean deleteItemId(int iid);
	
	public Item updateItem(int iid,Item item);
	
	public List<Item> getAllItem();
	}


