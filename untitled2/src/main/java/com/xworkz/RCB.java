package com.xworkz.mvc;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class RCB extends AbstractAnnotationConfigDispatcherServletInitializer {


    public  RCB(){
        System.out.println("Runing no argument constrancter....");
    }
    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("running gootConfigClass...");
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("running servletConfigClass...");
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("running Servletmappings....");
        return new String[0];
    }
}
