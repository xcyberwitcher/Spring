package com.subodh.springwebapp.appconfi;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ServletConfiguration implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
	AnnotationConfigWebApplicationContext context=
			new AnnotationConfigWebApplicationContext();
	context.register(AppConfigure.class);
	
	DispatcherServlet servlet = new DispatcherServlet(context);
	
	Dynamic dynamic =servletContext.addServlet("dispacter", servlet);
	dynamic.addMapping("/");
	dynamic.setLoadOnStartup(1);
	}
}
