package com.gtfs.service;

import java.util.List;

import com.gtfs.dto.BranchMstDto;

public interface BranchMstService {
	List<BranchMstDto> findAll();
	List<BranchMstDto> findById(Long id);
	List<BranchMstDto> findBranchByName(String name);
}
