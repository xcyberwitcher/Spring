package com.subodh.springwebapp.appconfi;
import java.util.Properties;

import javax.sql.DataSource;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration  //
@EnableWebMvc
@ComponentScan("com.subodh.springwebapp")//scan classes 
public class AppConfigure {
	@Bean
	public ModelMapper getModelMapper() {
		
		return new ModelMapper();
	}
	
	@Bean  //create the object
	public LocalSessionFactoryBean getSessionFactory() {
	   LocalSessionFactoryBean sessionFactory = 
			   new	LocalSessionFactoryBean();
	   sessionFactory.setDataSource(getDataSource());
	   sessionFactory.setPackagesToScan("com.subodh.springwebapp.entity");
	 // sessionFactory .setHibernateProperties(null);
	  Properties properties = new Properties();
	  properties.setProperty("hibernate.show_sql", "true");
	  properties.setProperty("hibernate.hbm2ddl.auto", "update"); 
	  sessionFactory.setHibernateProperties(properties);
	   return sessionFactory;
	}
	
    @Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = 
				new DriverManagerDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/springweb");
		dataSource.setUsername("root");
		dataSource.setPassword("javascript");
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		return dataSource;
		
	}
}
