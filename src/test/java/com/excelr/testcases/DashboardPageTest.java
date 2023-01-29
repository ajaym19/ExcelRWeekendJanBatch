package com.excelr.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.excelr.pages.DashboardPage;
import com.excelr.pages.LoginPage;

public class DashboardPageTest {
	LoginPage lp;
	DashboardPage dp;

	@BeforeMethod
	public void browserConfig() {
		lp = new LoginPage();
		lp.initialization();
	}

	@Test
	public void validateMyActionSection() {
		dp = lp.login();
		Assert.assertTrue(dp.myActionSectionPresent());
	}
	
	@Test
	public void validateTimeAtWorkSection() {
		
	}
	
	@Test
	public void quickLaunchSection() {
		
	}
	
	public void validateDashboardLabel() {
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		lp.tearDown();
	}
}
