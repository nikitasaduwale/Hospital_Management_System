package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.BranchDaoImp;

import com.ty.hospital_app.dto.Branch;


public class BranchService {
	public void SaveBranch(Branch branch,int hid) {
		BranchDaoImp branchDaoImp=new BranchDaoImp();
		Branch branch1=branchDaoImp.saveBranch(hid,branch);
		if(branch1!=null) {
			System.out.println("Branch saved");
		}
		else {
			System.out.println("unfaortunatly Branch not saved");
		}

}
	public Branch getBranchById(int bid) {
		BranchDaoImp daoImp=new BranchDaoImp();
		Branch branch1=daoImp.getBranchId(bid);
		if(branch1!=null) {
			return branch1;
		}
		else {
			return null;
		}
		}
	public void deleteBranchById(int bid) {
		BranchDaoImp daoImp=new BranchDaoImp();
		boolean flag=daoImp.deleteBranchId(bid);
		if(flag) 
		{
			System.out.println("data deleted");;
		}
		else {
			System.out.println("data not found");
		}
}
	public Branch updateBranchById(int bid,Branch branch) {
		BranchDaoImp daoImp=new BranchDaoImp();
		Branch branch1=daoImp.updateBranch( bid,branch);
		if(branch1!=null) 
		{
		return branch1;
		}
		else {
			return null;
		}

	
}
	public List<Branch> getAllBranch(){
		BranchDaoImp daoImp=new BranchDaoImp();
		List<Branch>branch=daoImp.getAllBranch();
		return branch;
		
	}
}

