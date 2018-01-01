package TestNG;


import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest2 {
  @BeforeTest
  public void launch() {
	System.out.println("open the browser");  
  }  
	  
	  
@Test(priority=4)  
 public void search(){
	System.out.println("search for products");	
}




@Test(priority=7)	  
public void help(){
	System.out.println("help for products");	
}


@AfterTest 
public void close(){
	System.out.println("close the browser");	
}


	
}
