package com.example.website1.source;

import java.util.HashMap;
import java.util.Map;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class rule {
	
	/**
	 * Get set go!!!
	 * @return 
	 */
	public void check (Object mpm) {
			try {  
				// load up the knowledge base
				KieServices ks = KieServices.Factory.get();
	    	    KieContainer kContainer = ks.getKieClasspathContainer();
	        	KieSession ksession = kContainer.newKieSession("medical-rules");
				
				// set the parameters
				Map<String, Object> params = new HashMap<String, Object>();
				
				/*MediclaimProcessModel mpm = new MediclaimProcessModel();
				
				mpm.setUserName("Sudharshan");
				mpm.setUserAge(23);
				mpm.setUserCoverage(true);*/
				
				params.put("mpm", mpm);
				ksession.startProcess("mediclaimrule",params);
				
				ksession.insert(mpm);
				ksession.fireAllRules();
				
			} catch (Throwable t) {
				t.printStackTrace();
			}
		}

		
	}
