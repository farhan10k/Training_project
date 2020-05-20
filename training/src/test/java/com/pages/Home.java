package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	@FindBy(name="email")
	WebElement userid;
	@FindBy(name="pass")
	WebElement pssword;
	@FindBy(xpath="//*[@aria-label='Log In']")
	WebElement loginbutton;
	@FindBy(linkText="Forgot account?")
	WebElement forgotlk;

	public Home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void Emailidfield(String enteridmail) {
		userid.sendKeys(enteridmail);
	}

	public void psswordfield(String enterofpassword) {
		pssword.sendKeys(enterofpassword);
	}

	public void loginbt() {
		loginbutton.click();
	}

	public void forgotofpsswd() {
		forgotlk.click();
	}

	public void clear() {
		userid.clear();
	}
}
