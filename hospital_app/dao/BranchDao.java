package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Branch;

public interface BranchDao {
	public Branch saveBranch(int hid,Branch branch);
	
	public Branch getBranchId(int bid);
	
	public boolean deleteBranchId(int bid);
	
	public Branch updateBranch(int bid,Branch branch);
	
	public List<Branch> getAllBranch();

}
