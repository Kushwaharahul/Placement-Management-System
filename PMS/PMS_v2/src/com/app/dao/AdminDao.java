package com.app.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Administrator;
import com.app.pojos.Company;
import com.app.pojos.Student;

@Repository("admindao")
public class AdminDao implements Dao {
	
	@Autowired//injecting sessionfactory by bytype(Autowiring)
	private SessionFactory sf;
	
	public Administrator valAdmin(Administrator a){
		
		String hql="select a from Administrator a where name=:nm";
		
		return (Administrator)sf.getCurrentSession().createQuery(hql).setParameter("nm", a.getName()).uniqueResult();
	}
	
	public Student getStudent(Student s){
		return (Student)sf.getCurrentSession().get(Student.class,s.getId());
	}
	
	public Student modifyStudent(Student s){
		System.out.println("Admin Dao"+s);
		Student t = (Student)sf.getCurrentSession().get(Student.class,s.getId());
		t.setEmail(s.getEmail());
		t.setGraduationPercentage(s.getGraduationPercentage());
		t.setHscPercentage(s.getHscPercentage());
		t.setName(s.getName());
		t.setSscPercentage(s.getSscPercentage());
		t.setPassword(s.getPassword());
		t.setPhoneNumber(s.getPhoneNumber());
		return t;
	}
	
	public List<Company> getCompanyInfo(){
		List<Company> r = sf.getCurrentSession().createQuery("select c from Company c").list();
		return r;
	}
	
	public Company validateCompany(Company c){
		System.out.println(c);
		Company t = (Company)sf.getCurrentSession().get(Company.class,c.getId());
		t.setStatus("true");
		return t;
	}
	
	public void deleteCompany(Company c){
		System.out.println(c);
		Company temp = (Company)sf.getCurrentSession().get(Company.class,c.getId());
		sf.getCurrentSession().delete(temp);
	}
}
