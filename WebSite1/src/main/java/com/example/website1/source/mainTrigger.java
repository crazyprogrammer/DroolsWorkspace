package com.example.website1.source;

import com.example.website1.bean.MediclaimProcessModel;
import com.example.website1.source.rule;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class mainTrigger {

	private static ApplicationContext context;

	public static void main(String[] args)
	{
		rule R1 = new rule();

		context = new ClassPathXmlApplicationContext("Beans.xml");
	
		MediclaimProcessModel obj = (MediclaimProcessModel) context.getBean("eval");
		
		R1.check(obj, "medirules");
		//R1.check(obj, "sample-process-rules");
	}

}
