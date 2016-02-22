package com.sample;

import java.util.HashMap;
import java.util.Map;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * Get set go!!!
 */
public class MediclaimRuleTest {

	public void Check(Object obj, String Ruleconfig) {
		try {
			// load up the knowledge base
			KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession ksession = kContainer.newKieSession(Ruleconfig);
			
			ksession.insert(obj);
			ksession.fireAllRules();
			
			
			//MediclaimProcessModel mpm = new MediclaimProcessModel();
			//System.out.println(mpm.getResult());
			
		} catch (Throwable t) {
			t.printStackTrace();
		}
		finally {
			System.out.println("*******END*******");
		}
	}

	
}