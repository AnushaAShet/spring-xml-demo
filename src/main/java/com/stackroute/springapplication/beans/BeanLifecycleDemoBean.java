package com.stackroute.springapplication.beans;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


    public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
        public void destroy() throws Exception {
            System.out.println("Bean has been destroyed");
        }

        public void afterPropertiesSet() throws Exception {
            System.out.println("Bean has been initialised");
        }
        public void customInit(){
            System.out.println("This is custom init method");
        }
        public void customDestroy(){
            System.out.println("This is custom destroy method");
        }
    }