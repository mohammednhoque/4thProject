package com.qa.wildcart.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.wildcart.base.BasePage;
import com.qa.wildcart.base.BaseTest;
import com.qa.wildcart.pages.LoginPage;
import com.qa.wildcart.testlisteners.TestAllureListener;
import com.qa.wildcart.utilites.Constants;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;


public class LoginPageTest extends BaseTest {
	
	
	

	@Test(priority = 1)
	public void verifySignUpLinkTest() {

		Assert.assertEquals(loginpage.isSignUpButtonExists(), true);

	}

	@Test(priority = 2)
	public void verifyPageTitle() {
		String title = loginpage.getLoginPageTitle();
		System.out.println("Title is " + title);
		Assert.assertEquals(title, Constants.LOGIN_PAGE_TITLE);
	}

	@Test(priority = 3)
	public void loginTest() {
		loginpage.doLogin(prop.getProperty("username"),prop.getProperty("password"));

	}

}
