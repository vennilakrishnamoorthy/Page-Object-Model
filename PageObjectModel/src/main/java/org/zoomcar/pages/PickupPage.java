package org.zoomcar.pages;

import org.zoomcar.base.ProjectSpecificFunction;

public class PickupPage extends ProjectSpecificFunction {
	public PickupPage clickTomorrow() {
		driver.findElementByXPath("(//div[@class='day low-price'])[1]").click();
		return this;
	}

	public DropoffPage clickNext() {
		driver.findElementByXPath("//button[(text()='Next')]").click();
		return new DropoffPage();
	}
}
