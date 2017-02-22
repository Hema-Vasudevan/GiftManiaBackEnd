package com.niit.giftmaniabackend.dao.imple;


import java.util.*;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.giftmaniabackend.dao.ProductDao;
import com.niit.giftmaniabackend.model.Product;

@Repository("pd")
public class ProductDaoImple implements ProductDao {
	private List<Product> listProduct;
	@Autowired
	SessionFactory sessionFactory;
	@SuppressWarnings("unchecked")
	public List<Product> getProduct()
	{
		Session session=sessionFactory.openSession();
		listProduct=session.createQuery("FROM Product").list();
		return listProduct;
	}

	public List<Product> getProductbyCategory(String cat)
	{
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		listProduct=session.createQuery("FROM Product p where p.category=:cateogory").setParameter("category", cat).list();
		tx.commit();
		session.close();
		return (List<Product>) (listProduct.size()>0?listProduct:null);
	}
@Transactional
	public void addProduct(Product p) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(p);
		tx.commit();
		session.close();
		System.out.println("Product inserted");
	}

	public void removeProduct(int pid) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		Product p=(Product)session.load(Product.class,new Integer(pid));
		if(null!=p)
		session.delete(p);
		tx.commit();
		session.close();
	}

	public void updateProduct(Product p) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.update(p);
		tx.commit();
		session.close();
	}

	public Product getPersonById(int pid) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		Product p=(Product)session.load(Product.class,new Integer(pid));
		System.out.println(p);
		return p;
	}
}
