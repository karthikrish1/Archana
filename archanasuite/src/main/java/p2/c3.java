package p2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c3 {

	@Test(groups="two")
	public void t3()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	    ChromeDriver ob= new ChromeDriver();
	    ob.get("http://www.seleniumeasy.com");
	    
	    System.out.println(ob.executeScript("return document.title"));
	    System.out.println(ob.executeScript("return document.URL"));
	    ob.quit();
	}
}
