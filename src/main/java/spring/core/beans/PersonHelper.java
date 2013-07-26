package spring.core.beans;

import spring.core.interfaces.Person;

public class PersonHelper {
	Person person;
	
	public void setPerson(Person person) {
		this.person = person;
	}
	
	public Person getPerson() {
		return person;
	}
}
