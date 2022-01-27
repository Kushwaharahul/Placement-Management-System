package com.app.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.Student;
import com.app.service.Serv;
import com.app.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	
		@Autowired
		@Qualifier("studentservice")
		private Serv service;

		@RequestMapping("/login")
		public ModelAndView showLoginForm(Student s,Model map){
		return new ModelAndView("studentlogin","","");
		}

		
		@RequestMapping(value="/login",method = RequestMethod.POST)
		public ModelAndView processLoginForm(Student s,Model map,HttpSession hs){
		Student t=((StudentService)service).validateStudent(s);
		if(t!=null){
			System.out.println(t);
			hs.setAttribute("student",t);
			return new ModelAndView("studenthome","msg",t);
		}
		return new ModelAndView("studentlogin","msg","Invalid Id and Password");
		}
	
		
		@RequestMapping("/registerstudent")
		public ModelAndView showRegisterForm(Student s,Model map,HttpSession hs){
			if(((Student)hs.getAttribute("student")).getName()!=null){
				return new ModelAndView("studenthome","msg2","Already Registerd.");
			}
		return new ModelAndView("registerstudent","msg","");
		}

		
		@RequestMapping(value="/registerstudent",method = RequestMethod.POST)
		public ModelAndView processRegisterForm(Student s,Model map,HttpSession hs){
		s.setId(((Student)hs.getAttribute("student")).getId());
		s.setPassword(((Student)hs.getAttribute("student")).getPassword());
		System.out.println(s);
		Student sp=null;
		sp=((StudentService)service).regiterStudent(s);
		if(sp.equals(null)){
			return new ModelAndView("registerstudent","msg","Server side problem");
		}
		return new ModelAndView("registerstudent","msg","Successfully registerd");
	}
		
		@RequestMapping("/studentchangepassword")
		public ModelAndView showChangePasswordForm(Student s,HttpSession hs){
			return new ModelAndView("studentchangepassword","","");
		}
		
		@RequestMapping(value="/studentchangepassword",method = RequestMethod.POST)
		public ModelAndView processChangePasswordForm(Student s,HttpSession hs,HttpServletRequest req){
			Student p=(Student)hs.getAttribute("student");
			if(s.getId()!=p.getId()){
				return new ModelAndView("studentchangepassword","rollmsg","Roll Number Should Be matched");
			}
			if(!s.getPassword().equals(p.getPassword())){
				return new ModelAndView("studentchangepassword","passmsg","Old Password Should Be matched");
			}
			String newpass= req.getParameter("newpass");
			String confirmpass= req.getParameter("confirmpass");
			if(newpass.equals(confirmpass)){
			Student res=((StudentService)service).changePassword(s,p,newpass);
			if(res!=null){
				hs.setAttribute("student", res);
				return new ModelAndView("studentchangepassword","changemsg","Successfully Changed Password");
			}
			}
			return new ModelAndView("studentchangepassword","confirmmsg","new and confirm password should match");
		}
		@RequestMapping("/logout")
		public ModelAndView logout(Student s,HttpSession hs,RedirectAttributes flash){
			hs.invalidate();
			flash.addFlashAttribute("Q","Successfully Logged Out");
			return new ModelAndView("redirect:/student/login","","");
		}
		
}
