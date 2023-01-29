package com.excelr.pages;

import org.openqa.selenium.By;

import com.excelr.base.ExcelRBase;

public class DashboardPage extends ExcelRBase {

	public boolean myActionSectionPresent() {
		return driver.findElement(By.xpath("//p[text()='My Actions']")).isDisplayed();
	}
	
	public boolean getDashboardLabelPresence() {
		return driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
	}
}
