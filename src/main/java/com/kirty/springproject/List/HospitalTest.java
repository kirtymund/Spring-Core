package com.kirty.springproject.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HospitalTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/kirty/springproject/List/hospitalConfig.xml");
		Hospital bean = (Hospital)ctx.getBean("hospital");
		System.out.println(bean.getName() +" :: "+bean.getDepartments());
	}

}
