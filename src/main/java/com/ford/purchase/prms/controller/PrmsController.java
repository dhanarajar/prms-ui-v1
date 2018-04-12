package com.ford.purchase.prms.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ford.purchase.prms.entity.Person;
import com.ford.purchase.prms.service.PersonService;

@RestController
@CrossOrigin("*")
@RequestMapping("/prms")
public class PrmsController {
	
	@Autowired
	PersonService personService;
	
	@RequestMapping("/cool-cars")
	 public String coolCars() {
		 System.out.println("********************called*******************");
	        return "Heloo_car";
	    }
	 
	@RequestMapping("/listOfStrings")
	 public List<String> getString(){
		 System.out.println("********************called*******************");
		 List<String> string=new ArrayList<String>();
		 string.add("uma");
		 string.add("mahes");
		 string.add("vinoth");
		 return string;
	 }
	
	@RequestMapping("/reposPerson")
	 public List<Person> getAllPerson() {
		 System.out.println("********************Person List from h2-DB*******************");
	        return personService.getAllPersons();
	    }

}
