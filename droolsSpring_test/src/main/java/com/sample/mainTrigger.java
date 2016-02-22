package com.sample;

import com.sample.MediclaimProcessModel;
import com.sample.MediclaimRuleTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class mainTrigger {

	private static ApplicationContext context;

	public static void main(String[] args)
	{
		MediclaimRuleTest R1 = new MediclaimRuleTest();

		context = new ClassPathXmlApplicationContext("Beans.xml");
	
		MediclaimProcessModel obj = (MediclaimProcessModel) context.getBean("eval1");
		
		R1.Check(obj, "ksession-rules");
	}

}
