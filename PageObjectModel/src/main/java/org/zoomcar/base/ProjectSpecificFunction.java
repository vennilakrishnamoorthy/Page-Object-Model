package org.zoomcar.base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificFunction {
	/*String excelFileName = "TC001";
	@Parameters ({"url"})*/
	
	static public ChromeDriver driver;
	@BeforeMethod
	public void startApp() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.zoomcar.com/chennai");
		/*driver.findElementById("username").sendKeys(username);
		driver.findElementById("password").sendKeys(password);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();*/
	}

	@AfterMethod
	public void closeApp() {
		driver.close();
	}
	/*
	@DataProvider (name = "fetchData")
	public Object[][] sendData() throws IOException{
		
		String [][] data = new String [2][3];
		data[0][0] = "Tech Mahindra";
		data[0][1] = "Vennila";
		data[0][2] = "Krishnamoorthy";

		data[1][0] = "CTS";
		data[1][1] = "Sumathi";
		data[1][2] = "K";
		
		return ReadExcel.readData();
	}
*/
}
