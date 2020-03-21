package com.kirty.springproject.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/kirty/springproject/Set/SetConfig.xml");
		Cardealer bean = (Cardealer)ctx.getBean("cardealer");
		System.out.println(bean.getName()+" :: "+ bean.getModels());
	}

}
