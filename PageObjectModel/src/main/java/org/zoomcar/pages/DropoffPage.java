package org.zoomcar.pages;

import org.zoomcar.base.ProjectSpecificFunction;

public class DropoffPage extends ProjectSpecificFunction {
	
	public CarbookPage clickDone() throws InterruptedException {
		driver.findElementByXPath("//button[(text()='Done')]").click();
		Thread.sleep(2000);
		return new CarbookPage();
	}

}
