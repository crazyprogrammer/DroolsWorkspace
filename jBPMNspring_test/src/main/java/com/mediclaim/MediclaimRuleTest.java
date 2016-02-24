package com.mediclaim;

import java.util.HashMap;
import java.util.Map;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.mediclaim.MediclaimProcessModel;

/**
 * Get set go!!!
 */
public class MediclaimRuleTest {

	public void Check(MediclaimProcessModel obj, String Ruleconfig) {
		try {
			// load up the knowledge base
			KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession ksession = kContainer.newKieSession(Ruleconfig);
			
			// set the parameters
			Map<String, Object> params = new HashMap<String, Object>();

			params.put("mpm", obj);
			ksession.startProcess("test_BPMN",params);
		
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	
}