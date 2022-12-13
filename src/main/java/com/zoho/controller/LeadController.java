package com.zoho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zoho.entities.Lead;
import com.zoho.services.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	//http://localhost:8080/create
	@RequestMapping(value="/create", method = RequestMethod.GET)
	public String viewCreateLeadForm() {
		return "create_lead";
	}
	@RequestMapping(value = "/saveLead",method = RequestMethod.POST)
	public String saveOneLead(@ModelAttribute("lead")Lead lead,Model model) {
		leadService.saveLeadInformation(lead);
		model.addAttribute("lead", lead);
		model.addAttribute("msg", "Lead is saved!!");
		
		return "lead_info";
	}
 }
