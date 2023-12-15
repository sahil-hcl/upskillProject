package com.hcl.upskill.api;

import com.hcl.upskill.model.Person;
import com.hcl.upskill.service.PersonService;

public class PersonController {
	private final PersonService personService;

	public PersonController(PersonService personService) {
		super();
		this.personService = personService;
	}

	public void addPerson(Person person) {
		personService.addPerson(person);
	}
}
