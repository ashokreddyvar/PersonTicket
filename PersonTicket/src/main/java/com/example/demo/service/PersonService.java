package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.person.Person;
import com.example.demo.personDao.PersonDao;

@Service
public class PersonService {
	 
@Autowired
private PersonDao dao;

public List<Person> findBylastName(String lastName){
	return dao.findByLastName(lastName);
}
public List<Person> SavePersonDatalist(List<Person> personList){
	return dao.saveAll(personList);
}
public List<Person> findByFirstNameOrLastName(String firstName, String lastName){
	return dao.findByFirstNameOrLastName(firstName, lastName);
}

}
