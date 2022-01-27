package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.AdminDao;
import com.app.pojos.Administrator;
import com.app.pojos.Company;
import com.app.pojos.Student;

@Service("adminservice")
@Transactional
public class AdminService implements Serv {
	
	
	@Autowired
	@Qualifier("admindao")//injecting admindao object byname(Autowiring)
	private AdminDao dao;
	
	public Administrator valAdmin(Administrator a){
		
		Administrator t = dao.valAdmin(a);
		if(t!=null){
			if(t.getPassword().equals(a.getPassword()))
				return t;
		}
		return null;
	}
	
	public Student getStudent(Student a){
		
		return dao.getStudent(a);
	}
	
	public Student modifyStudent(Student a){
		System.out.println("In modifystudent Service "+a);
		return dao.modifyStudent(a);
	}
	public List<Company> getCompanyInfo(){
		return dao.getCompanyInfo();
	}
	public Company validateCompany(Company c){
		return dao.validateCompany(c);
	}
	public void deleteCompany(Company c){
		dao.deleteCompany(c);
	}
}
