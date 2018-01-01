package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class NewTest {
	public String baseurl =" http://amazon.com";
	public WebDriver driver;

	
	@Test(dependsOnMethods={"verifyurl"},alwaysRun=true,description="this method verifies the title")
	
	public void verifyTitle(){
		driver=new FirefoxDriver();
		driver.get(baseurl);
		
		String expectedtitle ="Amazommn.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
String actual =driver.getTitle();
System.out.println(actual);

Assert.assertEquals(expectedtitle, actual);
driver.quit();
	}

@Test
public void verifyurl(){
	driver=new FirefoxDriver();
	driver.get(baseurl);
	
	String expectedurl="ffff";
String actual =driver.getCurrentUrl();
System.out.println(actual);

Assert.assertEquals(expectedurl, actual);
driver.quit();
	

	
  
	
	
	
	
	
	
	
	
  }
}
