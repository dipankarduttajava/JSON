package com.gtfs.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gtfs.dao.BranchMstDao;
import com.gtfs.dto.BranchMstDto;
import com.gtfs.service.BranchMstService;

@Service
public class BranchMstServiceImpl implements BranchMstService,Serializable {
	@Autowired
	private BranchMstDao branchMstDao;
	
	
	public List<BranchMstDto> findAll(){
		return branchMstDao.findAll();
	}


	@Override
	public List<BranchMstDto> findById(Long id) {
		return branchMstDao.findById(id);
	}


	@Override
	public List<BranchMstDto> findBranchByName(String name) {
		return branchMstDao.findBranchByName(name);
	}
}
