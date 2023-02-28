package edu.wccnet.mejia;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCDemo {
    public static void main(String[] args) {
        // IBird chickadee = new SeedEater();
        // System.out.println(chickadee.getEatingHabit());
        ApplicationContext context = new ClassPathXmlApplicationContext("beanconfig.xml");
        IBird bird = (IBird) context.getBean("bird");
        System.out.println(bird.getEatingHabit());

        ((ClassPathXmlApplicationContext)context).close();

    }
}
