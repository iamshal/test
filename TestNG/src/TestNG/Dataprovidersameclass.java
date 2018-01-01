package TestNG;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovidersameclass {
	public WebDriver driver;
	public String url = "http://www.olx.in";

	@BeforeMethod
	public void Launch() {
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
//if data provider is in separate class give class name 
	//(@Test(DataProvider='SearchProvider',dataproviderClass=Dataproviderverifyolxsearch.class))
	
	
@Test(dataProvider="SearchProvider")
public void verifyolxsearch(String location, String product){
	
	
	driver.findElement(By.xpath("//*[@id='cityField']")).click();
	driver.findElement(By.xpath("//*[@id='filterCities']")).sendKeys(location);
	
	driver.findElement(By.xpath("//*[@id='filterCitiesAutosuggest']/li[1]/a")).click();
	driver.findElement(By.xpath("//*[@id='headerSearch']")).click();
	driver.findElement(By.xpath("//*[@id='headerSearch']")).sendKeys(product);
	driver.findElement(By.xpath("//*[@id='submit-searchmain']")).click();
	System.out.println(location+" " + product);
	boolean x = driver.findElement(By.xpath("//*[@id='body-container']/div/div/div[3]")).isDisplayed();
	System.out.println(x);
	Assert.assertFalse(false);
}
	
	@AfterMethod
	public void close(){
		driver.quit();
	}
	
	
	@DataProvider(name="SearchProvider")
	public Object[][] getData(){
		Object[][]data=new Object[3][2];
		data[0][0]="Hyderabad";
		data[0][1]="Cars";
		data[1][0]="Delhi";
		data[1][1]="Bikes";
		data[2][0]="Chennai";
		data[2][1]="Furniture";
		return data;
		
	
		
		//if making separate class for data provider make it static
		//public class Dataproviderverifyolxsearch{
	/*	@DataProvider(name="SearchProvider")
		public Static Object[][] getData(){
			Object[][]data=new Object[3][2];
			data[0][0]="Hyderabad";
			data[0][1]="Cars";
			data[1][0]="Delhi";
			data[1][1]="Bikes";
			data[2][0]="Chennai";
			data[2][1]="Furniture";
			return data;  */
		
	}
}









