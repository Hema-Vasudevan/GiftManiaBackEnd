package com.niit.giftmaniabackend.dao.imple;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.giftmaniabackend.dao.UserDao;
import com.niit.giftmaniabackend.model.User;

@Repository("us")
public class UserDaoImple implements UserDao{

	public UserDaoImple() {
		// TODO Auto-generated constructor stub
	}
	private List<User> listUsers;
	@Autowired
	SessionFactory sessionFactory;
	@SuppressWarnings("unchecked")
	public List<User> getAllUserDetails() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		listUsers=session.createQuery("FROM User").list();
		System.out.println(listUsers);
		return listUsers;
	}

	@Transactional
	public void addUser(User s) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(s);
		tx.commit();
		session.close();
		System.out.println("User Details inserted");
	}

	public void removeUser(int uid) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		User s=(User)session.load(User.class,new Integer(uid));
		if(null!=s)
		session.delete(s);
		tx.commit();
		session.close();
	}

	public void updateUser(User s) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.update(s);
		tx.commit();
		session.close();
	}

	public User getPersonById(int uid) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		User s=(User)session.load(User.class,new Integer(uid));
		System.out.println(s);
		return s;
	}
}
