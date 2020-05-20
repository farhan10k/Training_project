package Run;

import org.testng.annotations.Test;

import com.pages.Home;

import Common.browsers;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;

public class Testdata extends browsers {
  @Test(dataProvider = "signin")
  public void f(String n, String s) throws InterruptedException {
	  Home home=new Home(driver);
	  home.Emailidfield(n);
	  home.psswordfield(s);
	  home.loginbt();
	  driver.navigate().back();
	  home.clear();
	  Thread.sleep(6000);
	  Reporter.log("Executed successfully.");
  }

  @DataProvider
  public Object[][] signin() {
    return new Object[][] {
      new Object[] { "farhan@gmail.com", "a" },
      new Object[] { "zoha@gmail.com", "b" },
      new Object[] { "payman@gmail.com", "c" }
    };
  }
}
