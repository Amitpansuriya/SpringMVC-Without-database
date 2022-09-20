package com.Listener;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.entities.AddMvcApp;

public class MyListener implements ServletContextListener{

	public void contextDestroyed(ServletContextEvent sce) {
		
	}

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("context created......");
	
	List<AddMvcApp> list=new ArrayList<AddMvcApp>();
	ServletContext contex=sce.getServletContext();
	contex.setAttribute("list", list);
	}
}