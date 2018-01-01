package TestNG;

import org.testng.annotations.AfterGroups;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupTest {
  @BeforeGroups(groups="email")
  public void login() {
	  System.out.println("login to gmail");
  }
  
  
  
  
  @Test(groups="email")
  public void Compose() {
	  System.out.println("compse email");
  }
  
  
  
  
  @Test(groups="email")
  public void sendemail() {
	  System.out.println("send email");
  }
  
  
  @Test(groups="email")
  public void deletemail() {
	  System.out.println("delete email");
  }
  
  
  
  @Test(groups="settings")
  public void changepswd() {
	  System.out.println("change pswd");
  }
  
  
  
  @AfterGroups(groups="email")
  public void logout() {
	  System.out.println("logout from gmail");
  }
}
