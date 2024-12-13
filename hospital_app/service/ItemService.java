package com.ty.hospital_app.service;



import java.util.List;

import com.ty.hospital_app.dao.imp.ItemDaoImp;
import com.ty.hospital_app.dto.Item;

public class ItemService {
	public void SaveItem(int mid,Item item) {
		ItemDaoImp daoImp=new ItemDaoImp();
		Item item1=daoImp.saveItem(mid,item);
		if(item1!=null) {
			System.out.println("data saved");
		}
		else {
			System.out.println("unfaortunatly data not saved");
		}
	}
	public Item getItemById(int iid) {
		ItemDaoImp daoImp=new ItemDaoImp();
		Item item1=daoImp.getItemId(iid);
		if(item1!=null) {
			return item1;
		}
		else {
			return null;
		}

}
	public void deleteItemById(int iid) {
		ItemDaoImp daoImp=new ItemDaoImp();
		boolean flag=daoImp.deleteItemId(iid);
		if(flag) 
		{
			System.out.println("data deleted");;
		}
		else {
			System.out.println("data not found");
		}
}
	public Item updateItemById(int iid,Item item) {
		ItemDaoImp daoImp=new ItemDaoImp();
		Item item1=daoImp.updateItem( iid,item);
		if(item1!=null) 
		{
		return item1;
		}
		else {
			return null;
		}
}
	public List<Item> getAllItem(){
		ItemDaoImp daoImp=new ItemDaoImp();
		List<Item> item=daoImp.getAllItem();
	     return item;
	}

}
