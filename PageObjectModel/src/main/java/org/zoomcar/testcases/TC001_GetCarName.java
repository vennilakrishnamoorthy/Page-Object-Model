package org.zoomcar.testcases;

import org.testng.annotations.Test;
import org.zoomcar.base.ProjectSpecificFunction;
import org.zoomcar.pages.HomePage;

public class TC001_GetCarName extends ProjectSpecificFunction {
	
	@Test
	public void runTC001() throws InterruptedException {
		new HomePage()
		.clickStart()
		.clickThuraipakkam()
		.clickNext()
		.clickTomorrow()
		.clickNext()
		.clickDone()
		.clickDesSort()
		.getFirstCarName();
	}
}
