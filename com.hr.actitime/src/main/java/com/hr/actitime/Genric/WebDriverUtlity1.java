package com.hr.actitime.Genric;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtlity1 {

	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}

	/**
	 * this method minimize the browser window
	 * 
	 * @param driver
	 */
	public void minimize(WebDriver driver) {
		driver.manage().window().minimize();
	}

	/**
	 * this method wait the WebDriver for some time until the condition met
	 * 
	 * @param driver
	 */
	public void wait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IpathConstant1.implicitwaitDuration));
	}

	public void visibility(WebDriver driver, WebElement elemnt) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(IpathConstant1.explictwaitDuration));
		wait.until(ExpectedConditions.invisibilityOf(elemnt));
	}

	public void elementToBeClickable(WebDriver driver, WebElement elemnt) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(IpathConstant1.explictwaitDuration));
		wait.until(ExpectedConditions.elementToBeClickable(elemnt));
	}

	public void alertIsPresent(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(IpathConstant1.explictwaitDuration));
		wait.until(ExpectedConditions.alertIsPresent());
	}

	public void handleDropdown(WebElement elemnt, int indexno) {
		Select s = new Select(elemnt);
		s.selectByIndex(indexno);
	}

	public void handleDropdown(WebElement elemnt, String value) {
		Select s = new Select(elemnt);
		s.selectByVisibleText(value);
	}

	public void handleDropdown(String text, WebElement elemnt) {
		Select s = new Select(elemnt);
		s.selectByVisibleText(text);
	}

	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	public void getTextAlert(WebDriver driver) {
		String alerttext = driver.switchTo().alert().getText();

		System.out.println(alerttext);
	}

}
