package com.hynqn.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * ServletContext的生命周期监听器
 */
public class MyServletContextListener implements ServletContextListener {
    public MyServletContextListener() {
        // TODO Auto-generated constructor stub
    }

    public void contextDestroyed(ServletContextEvent sce)  { 
         System.out.println("ServletContext对象被销毁");
    }

    public void contextInitialized(ServletContextEvent sce)  { 
    	 System.out.println("ServletContext对象被创建");
    }
	
}
