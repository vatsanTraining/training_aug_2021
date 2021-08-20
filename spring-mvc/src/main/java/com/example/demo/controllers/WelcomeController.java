package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.Student;

@Controller
public class WelcomeController {


	@Autowired
	private Student student;
	
	
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String init(Model model) {
		
		model.addAttribute("title", "National Institute of Technology");
		
		return "index";
	}
	
	
	@RequestMapping(value = "/students",method = RequestMethod.GET)
	public String initForm(Model model) {
		
    	model.addAttribute("command", student);
		
		return "addStudent";
	}
	
	@RequestMapping(value = "/students",method = RequestMethod.POST)
	public String submitForm(@ModelAttribute("command") Student student) {
		
		return "success";
	}
	
	
}
