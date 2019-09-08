package org.zoomcar.pages;

import org.zoomcar.base.ProjectSpecificFunction;

public class CarbookPage extends ProjectSpecificFunction {
	public CarbookPage clickDesSort() throws InterruptedException {
		driver.findElementByXPath("(//div[@class='item'])[7]").click();
		Thread.sleep(2000);
		return this;
	}
	public CarbookPage getFirstCarName() {
		String carName = driver.findElementByXPath("(//div/h3)[1]").getText();
		System.out.println(carName);
		return this;
	}
}
