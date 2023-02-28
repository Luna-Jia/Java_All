package edu.wccnet.mejia;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        College college = (College)context.getBean("college");
        System.out.println(college);

        ((ClassPathXmlApplicationContext)context).close();
    }
}
