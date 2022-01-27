package com.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.pojos.Company;
import com.app.service.CompanyService;

@Controller
@RequestMapping("/company")
public class CompanyController {
	
	@Autowired
	@Qualifier("companyservice")
	private CompanyService service;
	
	
	
	@RequestMapping("/login")
	public ModelAndView showLoginForm(Company c){
		//showing login form
		return new ModelAndView("companylogin","msg","Welcome Company");
	}
	
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public ModelAndView processLoginForm(Company c){
		Company res = service.validateCompany(c);
		System.out.println(res);
		if(res==null)
			return new ModelAndView("companylogin","smsg","Id and Password not found");
		if(res.getStatus().equals("false"))
		{
			return new ModelAndView("companylogin","smsg","Admin has not valid yet");
		}
		if(res!=null)
		return new ModelAndView("companyhome","hmsg","Successfull login"+" "+res.getName());
		
		return new ModelAndView("companylogin","smsg","Id and Password not found");
	}
	
	
	@RequestMapping("/register")
	public ModelAndView showRegisterForm(Company c){
		return new ModelAndView("registercompany","","");
	}
	
	
	@RequestMapping(value="/register",method = RequestMethod.POST)
	public ModelAndView processRegisterForm(Company c){
			Integer id = null;
			id=service.registerCompany(c);
			if(id>-1){
				return new ModelAndView("registercompany","rmsg","Successfully Registerd <br> You Can Login After Admin Validation");
			}
		return new ModelAndView("registercompany","rmsg","UnSuccessfully Registerd");
	}
}
