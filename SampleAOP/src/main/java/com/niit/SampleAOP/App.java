package com.niit.SampleAOP;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.niit.bean.MyBusinessService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String confFile = "applicationContext.xml";
        ConfigurableApplicationContext context = 
                                new ClassPathXmlApplicationContext(confFile);
        MyBusinessService busServ = (MyBusinessService) context.getBean("busService");
        busServ.runMyBusinessLogic();
    }
}
