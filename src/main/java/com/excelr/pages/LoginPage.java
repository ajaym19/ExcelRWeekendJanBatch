package com.excelr.pages;

import org.openqa.selenium.By;

import com.excelr.base.ExcelRBase;

public class LoginPage extends ExcelRBase {

	public String getTitle() {
		return driver.getTitle();
	}

	public DashboardPage login() {
		driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		return new DashboardPage();
	}

}
