package spring.core.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.core.beans.Student;
import spring.core.interfaces.Person;
import spring.core.util.PersonConfig;

/**
 * Main Program
 *
 */
public class CoreExample 
{
    public static void main( String[] args )
    {
        //ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        //Student stdObj = (Student) context.getBean("student");
    	ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);
        Person personObj = (Student) context.getBean("personBean");
        personObj.setName("Jimmy");
        System.out.println("Hello " + personObj.getName());
    }
}
