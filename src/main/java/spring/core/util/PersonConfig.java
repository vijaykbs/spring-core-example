package spring.core.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.core.beans.Student;
import spring.core.interfaces.Person;

@Configuration
public class PersonConfig {

	@Bean(name="personBean")
	public Person getPerson() {
		return new Student();
	}
}
