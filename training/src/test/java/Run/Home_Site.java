package Run;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.pages.Home;

import Common.browsers;


public class Home_Site extends browsers {
	
  @Test
  public void f() throws InterruptedException {
//	  com.pages.Home home=new com.pages.Home(driver);
	  Home home=new Home(driver);
	  home.Emailidfield("farhan@gmail.com");
	  home.psswordfield("password");
	  home.loginbt();
	  Thread.sleep(6000);
	  driver.navigate().back();
  }
}
