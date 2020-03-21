package com.kirty.springproject.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kirty.springproject.Map.Customer;

public class PropertiesTest {

	public static void main(String[] args) {
ApplicationContext ctx = new ClassPathXmlApplicationContext("com/kirty/springproject/Properties/PropertyConfig.xml");
NationAndLanguage cust = (NationAndLanguage) ctx.getBean("nation");
System.out.println(cust.getNationAndlang());

	}

}
