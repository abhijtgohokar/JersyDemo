package com.abhijit.jerseydemo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
 
@SpringBootApplication
public class JerseydemoApplication extends org.springframework.boot.web.servlet.support.SpringBootServletInitializer 
{
    public static void main(String[] args) 
    {
        new JerseydemoApplication().configure(new SpringApplicationBuilder(JerseydemoApplication.class)).run(args);
    }
    
    
}
