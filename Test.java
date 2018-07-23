package com.siri.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.siri.onetoone.model.Friends;
import com.siri.onetoone.model.Vehicle;
import com.siri.onetoone.session.HibernateSession;

public class Test {
	static SessionFactory sessionFactory = null;

	public static void main(String[] args) {
		
	
			sessionFactory = HibernateSession.buildSessionFactory();
			Session session = sessionFactory.getCurrentSession();

			session.beginTransaction();
			Vehicle friendvehicle = new Vehicle();
			//friendvehicle.setVehicleID(1);
			friendvehicle.setVehicleName("car");
			
			//session.save(friendvehicle);
			
			Friends friend = new Friends();
			friend.setFriendName("bharath");
			friend.setVehicle(friendvehicle);
			session.save(friend);
			session.getTransaction().commit();
	
	
	
	
	}
	
	
	
	

}
