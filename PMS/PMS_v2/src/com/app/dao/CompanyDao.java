package com.app.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Company;

@Repository("companydao")
public class CompanyDao implements Dao {
	
	
	@Autowired//injecting sessionfactory by bytype(Autowiring)
	private SessionFactory sf;
	
	
	public Integer registerCompany(Company c){
		c.setStatus("false");
		return (Integer)sf.getCurrentSession().save(c);
		
		
	}
	public Company validateCompany(Company c){
		Company t=(Company)sf.getCurrentSession().createQuery("select c from Company c where email=:em and password=:pw").setParameter("em", c.getEmail()).setParameter("pw", c.getPassword()).uniqueResult();
		System.out.println(t);
		return t;
	}
	
	
}
