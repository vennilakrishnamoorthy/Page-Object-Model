package org.zoomcar.pages;

import org.zoomcar.base.ProjectSpecificFunction;

public class HomePage extends ProjectSpecificFunction {
	public StartPage clickStart() {
		driver.findElementByLinkText("Start your wonderful journey").click();
		return new StartPage();
	}

}
