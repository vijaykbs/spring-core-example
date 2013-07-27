package spring.core.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.core.beans.Employee;
import spring.core.beans.PersonHelper;
import spring.core.beans.Student;

@Configuration
public class PersonConfig {

	@Bean(name="personHelperBean")
	public PersonHelper getPerson() {
		return new PersonHelper();
	}
	
	@Bean(name="studentBean")
	public Student getStudent() {
		return new Student();
	}
	
	@Bean(name="employeeBean")
	public Employee getEmployee() {
		return new Employee();
	}
}
