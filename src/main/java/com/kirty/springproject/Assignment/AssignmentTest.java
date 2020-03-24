package com.kirty.springproject.Assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AssignmentTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/kirty/springproject/Assignment/AssignmentConfig.xml");
		ShoppingCart cart = (ShoppingCart) ctx.getBean("shoppingcart");
		System.out.println(cart.getItem());
	}

}
