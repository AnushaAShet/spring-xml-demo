package com.stackroute.springapplication;

import java.beans.beancontext.BeanContext;

import com.stackroute.springapplication.beans.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
    public static void main(String[] args) {

//        Resource resource = new ClassPathResource("beans.xml");
//        BeanFactory beanFactory = new XmlBeanFactory(resource);

            //Lazy instantiation
//
//        Movie movie = (Movie) beanFactory.getBean("movie1");
//        System.out.println(movie.welcomeMsg());


//        BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
//        BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
//        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
//        Movie movie=(Movie) ((DefaultListableBeanFactory) beanDefinitionRegistry).getBean("movie1");

            ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
            Movie movie = (Movie) context.getBean("movie");

            Movie movie1 = (Movie) context.getBean("movie1");

            System.out.println(movie == movie1); // singleton scope (default) returns true, 'prototype' returns false



            System.out.println(movie.welcomeMsg()+"\nMovie name : "+movie.getMovieName()+"\nActor Name : "+movie.getActorNAme()+"\nGenre : "+movie.getGenre());

            System.out.println(movie1.welcomeMsg()+"\nMovie name : "+movie1.getMovieName()+"\nActor Name : "+movie1.getActorNAme()+"\nGenre : "+movie1.getGenre());

        }
    }
