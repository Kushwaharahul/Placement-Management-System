package com.app.controllers;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.Administrator;
import com.app.pojos.Company;
import com.app.pojos.Student;
import com.app.service.AdminService;
import com.app.service.Serv;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	@Qualifier("adminservice")
	private AdminService service;
	
	
	
	@RequestMapping("/login")
	public ModelAndView showLoginForm(Administrator a){
		return new ModelAndView("adminlogin","msg","Welcome Admin");
	}
	
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public ModelAndView processLoginForm(Administrator a,Model map,RedirectAttributes flash,HttpSession hs){
		Administrator t=service.valAdmin(a);
			if(t!=null){
			hs.setAttribute("admin",t);
			flash.addFlashAttribute("msg", "Successfully Login "+t.getName());
			return new ModelAndView("redirect:/adminhome","","");
		}
			flash.addAttribute("msgl","Invalid Id and Password");
		return new ModelAndView("adminlogin","","");
	}
		@RequestMapping("/studentinfo")
		public ModelAndView showStudentInfoForm(Student s){
		return new ModelAndView("adminstudentinfo","","");
		}
		
		@RequestMapping(value="/studentinfo",method = RequestMethod.POST)
		public ModelAndView processStudentInfoForm(Student s){
			Student r=service.getStudent(s);
			if(r==null){
			return new ModelAndView("adminstudentinfo","msg","invalid id");
			}
			return new ModelAndView("adminstudentdisplay","student",r);
		}
		
		@RequestMapping(value="/studentmodify",method = RequestMethod.POST)
		public ModelAndView modifyStudentInfoForm(Student s){
			System.out.println("In ControllerModify "+s);
			Student r=service.modifyStudent(s);
			
			return new ModelAndView("adminstudentdisplay","student",r);
		}
		
		@RequestMapping(value="/companyinfo")
		public ModelAndView showCompanyInfo(Company c,HttpSession hs){
			List<Company> res,g;
			res=new ArrayList<Company>();
			g=service.getCompanyInfo();
			for(Company temp : g){
				if(temp.getStatus().equals("true"))
					res.add(temp);
			}
			hs.setAttribute("com", res);
			return new ModelAndView("admincompanyinfo");
		}
		
		@RequestMapping(value="/companyinfo",method = RequestMethod.POST)
		public ModelAndView getCompany(Company c,HttpSession hs){
			@SuppressWarnings("unchecked")
			List<Company> t = (List<Company>)hs.getAttribute("com");
			Company m=null;
			for(Company temp:t){
				if(temp.getId()==c.getId()){
					m=temp;
				}
			}
			return new ModelAndView("admincompanydisplay","company",m);
		}
	
		@RequestMapping("/companyval")
		public ModelAndView showCompanyValidate(Company c,HttpSession hs){
			List<Company> res,g;
			res=new ArrayList<Company>();
			g=service.getCompanyInfo();
			for(Company temp : g){
				if(temp.getStatus().equals("false"))
					res.add(temp);
			}
			hs.setAttribute("val", res);
			return new ModelAndView("admincompanyvalidate");
		}
		
		@RequestMapping(value="/companyval",method = RequestMethod.POST)
		public ModelAndView processCompanyValidate(Company c,HttpSession hs){
			Company te=null;
			List<Company> p=(List<Company>)hs.getAttribute("val");
			for(Company temp : p){
				if(c.getId()==temp.getId())
					te=temp;
			}
			return new ModelAndView("admincompanyvaldisplay","company",te);
		}
		
		@RequestMapping(value="/companystatus",method = RequestMethod.POST)
		public ModelAndView processCompanyStatus(Company c,HttpSession hs,HttpServletRequest req){
			String status=req.getParameter("action");
			if(status.equals("Validate")){
				Company te=service.validateCompany(c);
				return new ModelAndView("redirect:/admin/companyval","company",te);
			}
			else if(status.equals("Delete")){
				service.deleteCompany(c);
				return new ModelAndView("redirect:/admin/companyval","","");
			}
			return new ModelAndView("admincompanyvaldisplay","","");
		}
}
