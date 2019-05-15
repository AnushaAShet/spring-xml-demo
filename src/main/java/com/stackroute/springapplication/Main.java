package com.stackroute.springapplication;

import java.beans.beancontext.BeanContext;

import com.stackroute.springapplication.beans.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {


        ApplicationContext applicationContext3=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1=(Movie)applicationContext3.getBean("movie1");
        System.out.println(movie1.toString());

    }
}
