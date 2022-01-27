package com.app.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.pojos.Administrator;
import com.app.pojos.Company;
import com.app.pojos.Student;

@Controller
public class GloabalController {

	
	@RequestMapping(value="/{abc}")
	public String forwardToView(@PathVariable String abc,Student s,Company c,Administrator a) {
		System.out.println("in gloabal"+ " "+abc);
		return abc;//forward
	}
	
	
	
}
