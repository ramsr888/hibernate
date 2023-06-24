package com.rao.program1.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.rao.program1.entity.Account;


public class Test_Approach1 {

	public static void main(String[] args) {
		Configuration congfigurat =new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=null;
		Session session=null;
		
		try {
			sessionFactory=congfigurat.buildSessionFactory();
			session=sessionFactory.openSession();
			Account account= (Account)session.get(Account.class, 1);
			System.out.println(account);
		}finally {
			if(session!=null) {
				session.close();
			}
			if(sessionFactory!=null) {
				sessionFactory.close();
			}
		}
		

	}

}
