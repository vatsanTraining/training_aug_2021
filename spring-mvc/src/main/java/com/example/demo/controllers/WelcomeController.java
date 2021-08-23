package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Student;
import com.example.demo.services.StudentService;

@Controller
public class WelcomeController {


	@Autowired
	private Student student;
	
	@Autowired
	private StudentService service;
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String init(Model model) {
		
		model.addAttribute("title", "National Institute of Technology");
		
		return "index";
	}
	
	
	@RequestMapping(value = "/students",method = RequestMethod.GET)
	public ModelAndView initForm() {
		
		ModelAndView mdl = new ModelAndView();
		
    			mdl.setViewName("addStudent");
    			mdl.addObject("commie", student);
    			
		return mdl;
	}
	
	@RequestMapping(value = "/students",method = RequestMethod.POST)
	public String submitForm(@ModelAttribute("command") Student student) {
		
		  
		return "success";
	}
	
	
	@RequestMapping(value = "/students/all",method = RequestMethod.GET)
	public String getAllStudents(Model model) {
		
    	List<Student> list=	this.service.findAll();
    	
    	model.addAttribute("list",list);
    	
    	return "showStudent";
	}
	

}
