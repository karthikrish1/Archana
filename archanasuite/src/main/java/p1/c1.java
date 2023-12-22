package p1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class c1 {

	
	@Test(groups="one")
	public void t1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	    ChromeDriver ob= new ChromeDriver();
	    ob.get("http://www.google.com");
	    
	    WebElement ele = ob.findElementByName("q");
	    Actions ac= new Actions(ob);
	    ac.click(ele).sendKeys("selenium").sendKeys(Keys.ENTER).build().perform();
	    Thread.sleep(3000);
	    ob.quit();
	}
}
