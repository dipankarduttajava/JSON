package com.gtfs.json;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gtfs.dto.BranchMstDto;
import com.gtfs.service.BranchMstService;

@Controller
public class BranchMstJson implements Serializable{
	
	private static Logger log = Logger.getLogger(BranchMstJson.class);
	
	@Autowired
	private BranchMstService branchMstService;
	
	@RequestMapping(value="/branch/findAll")	
	public @ResponseBody List<BranchMstDto> findAll(Model model){
		return branchMstService.findAll();
	}
	
	@RequestMapping(value="/branch/findBranchByName")	
	public @ResponseBody List<BranchMstDto> findBranchByName(Model model,@RequestParam("name") String name){
		return branchMstService.findBranchByName(name);
	}
	
	@RequestMapping(value="/branch/findById/{id}")	
	public @ResponseBody List<BranchMstDto> findAll(Model model,@PathVariable Long id){
		
		for(BranchMstDto dto:branchMstService.findById(id)){
			log.info("dd "+dto.getBranchName());
		}
		
		return branchMstService.findById(id);
	}
}
