package com.springInAction.trials;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("knight.xml");

        Knight knight = (Knight) context.getBean("knight");
        knight.embarkQuest();
    }
}
