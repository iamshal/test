package TestNG;

import org.testng.annotations.Test;

public class NewTest3 {
  @Test(priority=8)
  public void select() {
	  System.out.println("select the product");
  }
	  
@Test(priority=9)	  
	  public void buy() {
		  System.out.println("buy the product");
		  
		  
		  
  }
}