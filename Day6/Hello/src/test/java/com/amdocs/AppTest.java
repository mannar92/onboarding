package com.amdocs;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

	@Test
	public void testSayHello() {
		App app = new App();

		String actualResponse   = app.sayHello();
		String expectedResponse = "Hello Maven!!";

		//assertEquals ( expectedResponse, actualResponse );
	} 

}
