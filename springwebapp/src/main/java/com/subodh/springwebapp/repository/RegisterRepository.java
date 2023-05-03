package com.subodh.springwebapp.repository;
import java.util.Collections;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.subodh.springwebapp.entity.RegisterEntity;
@Component
public class RegisterRepository {
	@Autowired
	private SessionFactory sessionFactory;
	
    public void save(RegisterEntity register) {
    Session session = sessionFactory.openSession();	
      System.out.println(register);
    try {
    Transaction transaction = session.beginTransaction();
    session.merge(register);
    transaction.commit();
    }
    catch (Exception e) {
		// TODO: handle exception
	}
    finally {
		session.close();
	}
  } 
    public List<RegisterEntity> findAll(){
    	 Session session = sessionFactory.openSession();	
    	 try {
    		 String hql = "from Register";
    		 Query query = session.createQuery(hql);
    		 return query.list();
    	 }
    	 catch(Exception e){
    		 
    	 }
    	 finally {
    		 session.close();
    	 }
    	 return Collections.EMPTY_LIST;
    }
    public RegisterEntity findByName(String name) {
	  Session session = sessionFactory.openSession();
	  RegisterEntity registerEntity = null;
	  try {
		  String hql = "from Register where name=:n";
		  Query query = session.createQuery(hql);
		  query.setParameter("n", name);
		registerEntity=(RegisterEntity)query.uniqueResult();
	  }catch(Exception e) {
	  }
		finally {
			session.close();
		}
	  System.out.println(registerEntity);
	return registerEntity;
    }
}
