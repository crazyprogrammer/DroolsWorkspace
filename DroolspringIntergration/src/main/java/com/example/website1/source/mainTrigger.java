package com.example.website1.source;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.website1.bean.MediclaimProcessModel;

public class mainTrigger {

	private static ApplicationContext context;

	public static void main(String[] args)
	{
		rule R1 = new rule();

		context = new ClassPathXmlApplicationContext("Beans.xml");
	
		MediclaimProcessModel obj = (MediclaimProcessModel) context.getBean("eval");
		
		R1.check(obj, "medical-rules");
		//R1.check(obj, "sample-process-rules");
	}

}
