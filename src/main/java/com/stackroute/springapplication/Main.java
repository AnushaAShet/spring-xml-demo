package com.stackroute.springapplication;

import com.stackroute.springapplication.beans.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        applicationContext.registerShutdownHook();
        Movie movie = (Movie)applicationContext.getBean("movie");
        System.out.println(movie.getActor());

    }
}
