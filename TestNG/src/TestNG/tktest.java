package TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tktest {

	public WebDriver driver;
	public String url = "https://dss.tookitaki.com/#/login?redirect_to=%2Fapp%2Fdashboard";

	@BeforeMethod
	public void launch() {
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();

	}

	@Test(priority=1)
	public void login() throws InterruptedException {
		driver.findElement(By.xpath("html/body/div[1]/div/div/form/div[1]/input")).sendKeys(" tookitakiuser");

		driver.findElement(By.xpath("html/body/div[1]/div/div/form/div[2]/input")).sendKeys("Tookitaki123!");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();

	}
	
	
	@Test(priority=2)
	public void assemble() throws InterruptedException {
	Thread.sleep(5000);
	driver.findElement(By.xpath("//li[contains(@ng-click,'upload')]")).click();

	//Assert.fail("file not uploaded");


	//Take screenshot and store as a file format
	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
	// now copy the  screenshot to desired location using copyFile //method
	FileUtils.copyFile(src, new File("C:\\Users\\admin\\workspace\\selenium\\src\\testcases\\error.png"));
	}

	catch (IOException e)
	{
	System.out.println(e.getMessage());

	}
	}
	
	
	@Test(priority=3)
public void expolore() throws InterruptedException{
	driver.navigate().to("https://dss.tookitaki.com/#/app/dashboard");

	//driver.findElement(By.xpath("//li[contains(@ng-class,'explore')][contains(@ng-click,'dashboard')")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//li[contains(@ng-class,'analysis')][contains(@ng-click,'dashboard')]")).click();
	driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]")).click();
	

}
}