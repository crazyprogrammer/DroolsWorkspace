package com.mediclaim;

import java.util.HashMap;
import java.util.Map;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * Get set go!!!
 */
public class MediclaimRuleTest {

	public static final void main(String[] args) {
		try {
			// load up the knowledge base
			KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession ksession = kContainer.newKieSession("medical-rules");
			
			// set the parameters
			Map<String, Object> params = new HashMap<String, Object>();
			MediclaimProcessModel mpm = new MediclaimProcessModel();
			
			mpm.setUserName("Sudharshan");
			mpm.setUserAge(23);
			mpm.setUserCoverage(true);
			params.put("mpm", mpm);
			ksession.startProcess("mediclaimrule",params);
		
			ksession.fireAllRules();
			
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	
}