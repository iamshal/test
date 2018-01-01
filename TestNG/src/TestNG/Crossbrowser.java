package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Crossbrowser {
	public WebDriver driver;

	
	
  @BeforeMethod
  @Parameters({"browser"})
  public void launch(String browser) {
	  //driver=new FirefoxDriver();
	  
	  if(browser.equals("Mozilla")){
		  System.out.println("Running on firefox");
		  driver=new FirefoxDriver();
	  }
	  else if(browser.equals("chrome")){
		  System.out.println("Running on chrome");
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\executables\\chromedriver_win32\\chromedriver.exe");
					
			driver = new ChromeDriver();
		  
	  }
	  else if(browser.equals("IE")){
		  System.out.println("Running on IE");
		  System.setProperty("webdriver.ie.driver","C:\\Users\\admin\\executables\\IEDriverServer_x64_3.7.0\\IEDriverServer.exe");
					
			driver = new InternetExplorerDriver();
			}
	  
			driver.get("http://ebay.in");
	  }
  
  
	  @Test
	 public void verifytitle(){
		  String x=driver.getTitle();
		  System.out.println(x);
		  
		  Assert.assertEquals(x, x);
		  
	  }
	  
	  @AfterMethod
	  public void logout(){
		  driver.quit();
	  }
	  }

	  
 
