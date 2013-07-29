package spring.core.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.core.beans.PersonHelper;
import spring.core.beans.Student;

/**
 * Main Program
 *
 */
public class CoreExample 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        //Student stdObj = (Student) context.getBean("student");
    	//ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);
        PersonHelper personObj = (PersonHelper) context.getBean("personHelperProxy");
        //Student stdObj = (Student) context.getBean(Student.class);
        //stdObj.setName("Anderson");
        //personObj.setPerson(stdObj);
        System.out.println("Hello " + personObj.getPerson().getName());
    }
}
