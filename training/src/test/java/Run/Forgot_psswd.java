package Run;

import org.testng.annotations.Test;

import com.pages.Home;

import Common.browsers;

public class Forgot_psswd extends browsers {
  @Test
  public void f() throws InterruptedException {
	  Home home=new Home(driver);
	  home.Emailidfield("farhan@gmail.com");
	  home.psswordfield("password");
	  home.loginbt();
	  Thread.sleep(6000);
	  driver.navigate().back();
  }
}
