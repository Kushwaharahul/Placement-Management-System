package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.Dao;
import com.app.dao.StudentDao;
import com.app.pojos.Student;

@Service("studentservice")
@Transactional
public class StudentService implements Serv {

	@Autowired
	@Qualifier("studentdao")//injecting Studentdao object byname(Autowiring)
	private Dao dao;
	
	//Actual business Login methods reside here(called by Controller layer)
	//this student Service Layer will call studentdao layer for DBMS interaction
	
	public Student validateStudent(Student s){
		Student result=((StudentDao)dao).validateStudent(s);
		if(result!=null){
			if(result.getPassword().equals(s.getPassword())){
			return result;
			}
		}
		return null;
	}

	public Student regiterStudent(Student s){
	     Student sp=null;
	     sp=((StudentDao)dao).regiterStudent(s);
	     if(!sp.getName().equals(null))
	     return sp;
	     return null;
}
	public Student changePassword(Student n,Student o,String newpass){
		
		Student s=((StudentDao)dao).changePassword(n,o,newpass);
		
		return s;
	}
	
}
