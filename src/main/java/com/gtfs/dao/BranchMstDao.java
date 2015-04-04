package com.gtfs.dao;

import java.util.List;

import com.gtfs.dto.BranchMstDto;

public interface BranchMstDao {
	List<BranchMstDto> findAll();
	List<BranchMstDto> findById(Long id);
}
