package com.example.website1.source;

import java.util.HashMap;
import java.util.Map;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

//import com.example.website1.bean.MediclaimProcessModel;

public class rule {
	
	/**
	 * Get set go!!!
	 * @return 
	 */
	public void check (Object mpm, String Ruleconfig) {
			try {  
				// load up the knowledge base
				KieServices ks = KieServices.Factory.get();
	    	    KieContainer kContainer = ks.getKieClasspathContainer();
	        	KieSession ksession = kContainer.newKieSession(Ruleconfig);
				
				// set the parameters
				Map<String, Object> params = new HashMap<String, Object>();
				
				params.put("mpm", mpm);
				ksession.startProcess("mediclaimrule",params);
				
				ksession.insert(mpm);
				ksession.fireAllRules();
				
			} catch (Throwable t) {
				t.printStackTrace();
			}
		}

		
	}
