package spring.core.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        Student stdObj = (Student) context.getBean("student");
        System.out.println("Hello " + stdObj.getName());
    }
}
