package com.kirty.springproject.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("com/kirty/springproject/SpringCore/config.xml");
		Employee bean = (Employee) app.getBean("emp");
		System.out.println(bean.getId() + " :: " + bean.getName());
		
	}

}
