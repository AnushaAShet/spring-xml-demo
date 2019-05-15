package com.stackroute.springapplication.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;

public class Movie {
    Actor actor = new Actor();
    private BeanFactory beanFactory;
    private Object applicationContextAware;

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException{
        this.beanFactory=beanFactory;
    }

    public void setBeanName(String s) {
        System.out.println("Bean name is "+s);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContextAware=applicationContextAware;
    }

}
