package com.ford.purchase.prms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.ford.purchase.prms.entity.Person;
import com.ford.purchase.prms.repository.PersonDao;

@Service
public class PersonServiceImpl implements PersonService{
	
	
	@Autowired
	PersonDao personDao;
	

	@Override
	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return (List<Person>) personDao.findAll();
	}

}
