package com.excelr.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.excelr.pages.DashboardPage;
import com.excelr.pages.LoginPage;

public class LoginPageTest {
	
	/*
	 * Mistakes:
	 * 1. Repeating the same lines of webdriver code
	 * 2. Mixing the code and test case
	 * 3. Hard Coding the data
	 */
	
	LoginPage lp;
	DashboardPage dp;
	
	@BeforeMethod
	public void browserConfig() {
		lp = new LoginPage();
		lp.initialization();
	}

	@Test
	public void validateTitle() {
		String expTitle = "OrangeHRM";
		String actTitle = lp.getTitle();
		Assert.assertEquals(actTitle, expTitle);
	}
	
	@Test
	public void validateLogin() {
		dp = lp.login();
		Assert.assertTrue(dp.getDashboardLabelPresence());
	}
	
	@Test
	public void forgotPassword() {
		//validate that forgot password link is working
	}
	
	@Test
	public void companyLink() {
		//validate that the company link is displayed
	}
	
	@AfterMethod
	public void closeBrowser() {
		lp.tearDown();
	}
}
