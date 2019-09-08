package org.zoomcar.pages;

import org.zoomcar.base.ProjectSpecificFunction;

public class StartPage extends ProjectSpecificFunction {

	public StartPage clickThuraipakkam() {
		driver.findElementByXPath("//div[contains(text(),'Thuraipakkam')]").click();
		return this;
	}
	public PickupPage clickNext() throws InterruptedException {
		driver.findElementByXPath("//button[(text()='Next')]").click();
		Thread.sleep(3000);
		return new PickupPage();
	}

}
