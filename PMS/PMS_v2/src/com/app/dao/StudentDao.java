package com.app.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Student;

@Repository("studentdao")
public class StudentDao implements Dao {

	@Autowired//injecting sessionfactory by bytype(Autowiring)
	private SessionFactory sf;
	
	//Database interacting methods below(called by service layer)
	
	public Student validateStudent(Student s){
		return (Student)sf.getCurrentSession().get(Student.class, s.getId());
	}
	public Student regiterStudent(Student s){
		     Student sp=(Student)sf.getCurrentSession().get(Student.class,s.getId());
		     sp.setEmail(s.getEmail());
		     sp.setName(s.getName());
		     sp.setSscPercentage(s.getSscPercentage());
		     sp.setGraduationPercentage(s.getGraduationPercentage());
		     sp.setHscPercentage(s.getHscPercentage());
		     sp.setPhoneNumber(s.getPhoneNumber());
		return sp;
	}
	
	public Student changePassword(Student n,Student old,String newpass){
		
			Student ps=(Student)sf.getCurrentSession().get(Student.class, old.getId());
			ps.setPassword(newpass);
			return ps;
	}
}
