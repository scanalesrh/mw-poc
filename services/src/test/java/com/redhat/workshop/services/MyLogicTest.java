package com.redhat.workshop.services;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.switchyard.component.test.mixins.cdi.CDIMixIn;
import org.switchyard.test.Invoker;
import org.switchyard.test.ServiceOperation;
import org.switchyard.test.SwitchYardRunner;
import org.switchyard.test.SwitchYardTestCaseConfig;
import org.switchyard.test.SwitchYardTestKit;

@RunWith(SwitchYardRunner.class)
@SwitchYardTestCaseConfig(config = SwitchYardTestCaseConfig.SWITCHYARD_XML, mixins = { CDIMixIn.class })
public class MyLogicTest {

	private SwitchYardTestKit testKit;
	private CDIMixIn cdiMixIn;
	@ServiceOperation("MyLogic")
	private Invoker service;

	@Test
	public void testProcessService() throws Exception {
		// TODO Auto-generated method stub
		// initialize your test message
		MyForm message = new MyForm();
		message.setTipo("TIPOA");
		String result = service.operation("processService").sendInOut(message)
				.getContent(String.class);
		System.out.println(result);
		// validate the results
//		Assert.assertTrue("Implement me", false);
	}

}
