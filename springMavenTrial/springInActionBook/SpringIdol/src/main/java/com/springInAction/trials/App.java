package com.springInAction.trials;

import com.springInAction.trials.interfaces.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-idol.xml");

        Performer performer = (Performer) context.getBean("Jugo");
        performer.perform();
        performer = (Performer) context.getBean("Pinto");
        performer.perform();
    }
}
