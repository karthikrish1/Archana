package p1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c2 {

	@Test(groups="one")
	public void t2() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	    ChromeDriver ob= new ChromeDriver();
	    ob.get("https://www.letskodeit.com/practice");
	    

	    List<WebElement> l = ob.findElementsByXPath("//*[@name='cars' and @type='checkbox']");
	    //for(datatype temvar:nameofthecollection)
	    for(WebElement x:l)
	    {
	    	x.click();
	    	Thread.sleep(2000);
	    }
	    
	 File f = ob.getScreenshotAs(OutputType.FILE);
	 //FileUtils => apache directory studio coomon io
	 FileUtils.copyFile(f, new File("C:\\Users\\hp\\eclipse-workspace\\archanasuite\\src\\main\\java\\p1\\arch.png"));
	    Thread.sleep(2000);
	    ob.quit();
	}
}
