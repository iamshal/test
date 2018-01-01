package TestNG;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Windowhandle {
	public WebDriver driver;
	public String url="http://www.hdfcbank.com";
	
	
	
	
  @BeforeClass
  public void launch(){
	  driver=new FirefoxDriver();
	  driver.get(url);
	  String parent=driver.getWindowHandle();
		System.out.println("parent window id is"  +parent);
	  
  }
  @Test(priority=1)
  public void verifylink(){
	driver.findElement(By.xpath("html/body/div[1]/div[5]/div/div[1]/div[3]/ul/li[1]/a")).click();
	Set<String>allwindow=driver.getWindowHandles();
	System.out.println(allwindow.size());
	Assert.assertEquals(2,allwindow.size());
  }
  
  
  
  
  
}
