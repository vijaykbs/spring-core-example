package spring.core.beans;

import spring.core.interfaces.Person;

public class Student implements Person {
	String name;
		
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

}
