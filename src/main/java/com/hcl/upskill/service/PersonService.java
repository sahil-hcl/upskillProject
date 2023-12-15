package com.hcl.upskill.service;

import org.springframework.stereotype.Service;

import com.hcl.upskill.dao.PersonDao;
import com.hcl.upskill.model.Person;

@Service
public class PersonService {
	private final PersonDao personDao;

	public PersonService(PersonDao personDao) {
		this.personDao = personDao;
	}
	public int addPerson(Person person){
		return personDao.insertPerson(person);
	}
}
