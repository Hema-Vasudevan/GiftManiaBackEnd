package com.niit.giftmaniabackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.giftmaniabackend.dao.ProductDao;
import com.niit.giftmaniabackend.model.Product;

public class App 
{
	@SuppressWarnings("resource")
    public static void main( String[] args)
    {
       AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
      ctx.scan("com.niit.giftmaniabackend.config");
      ctx.refresh();
      ProductDao pd=(ProductDao)ctx.getBean("productBean");
      Product p=new Product(1,"Bracelets","Friendship Bands","Women");
      pd.addProduct(p);
}
}
