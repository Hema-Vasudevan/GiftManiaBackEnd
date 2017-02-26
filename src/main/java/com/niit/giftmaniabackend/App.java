package com.niit.giftmaniabackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.giftmaniabackend.dao.ProductDao;
import com.niit.giftmaniabackend.dao.UserDao;
import com.niit.giftmaniabackend.model.Product;
import com.niit.giftmaniabackend.model.User;

public class App 
{
	@SuppressWarnings("resource")
    public static void main( String[] args)
    {
       AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
      ctx.scan("com.niit.giftmaniabackend.config");
      ctx.refresh();
      ProductDao pd=(ProductDao)ctx.getBean("productBean");
      UserDao us=(UserDao)ctx.getBean("userBean");
}
}