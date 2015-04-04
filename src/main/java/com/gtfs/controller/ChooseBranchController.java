package com.gtfs.controller;

import java.io.Serializable;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChooseBranchController implements Serializable {
	
	@RequestMapping("/chooseBranch")
	public String onLoad(Model model){
	//List<BranchMst> branchMsts = branchMstService.findAll();
		//model.addAttribute("branches", branchMsts);
		return "chooseBranch";
	}
}
