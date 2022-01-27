package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.CompanyDao;
import com.app.dao.Dao;
import com.app.pojos.Company;

@Service("companyservice")
@Transactional
public class CompanyService implements Serv {

	@Autowired
	@Qualifier("companydao")
	private Dao dao;
	
	public Integer registerCompany(Company c){
		Integer id = null;
		id=(Integer)((CompanyDao)dao).registerCompany(c);
		if(id<0)
			return null;
		return id;
	}
	public Company validateCompany(Company c){
		Company t = ((CompanyDao)dao).validateCompany(c);
		if(t==null)
			return null;
		return t;
	}
	
}
