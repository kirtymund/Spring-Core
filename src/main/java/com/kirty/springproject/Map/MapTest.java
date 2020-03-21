package com.kirty.springproject.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/kirty/springproject/Map/MapConfig.xml");
		Customer cust = (Customer) ctx.getBean("cust");
		System.out.println(cust.getId() +" :: "+cust.getProducts());
	}

}
