package com.ford.purchase.prms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ford.purchase.prms.entity.Person;

@Repository
public interface PersonDao extends CrudRepository<Person, Long>{

}
