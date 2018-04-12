package com.ford.purchase.prms;

import org.springframework.beans.factory.annotation.Autowired;

import com.ford.purchase.prms.service.PersonService;

public class DbServiceTest {
	@Autowired
	PersonService personService;
	
	public void getDate(){
		personService.getAllPersons();
	}
	public static void main(String a[]){
		DbServiceTest d=new DbServiceTest();
		d.getDate();
		
	}

}
