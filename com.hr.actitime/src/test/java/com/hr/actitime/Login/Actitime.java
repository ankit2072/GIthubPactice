package com.hr.actitime.Login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitime {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.cssSelector("[id='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("[name='pwd']")).sendKeys("manager");
		WebElement checkox = driver.findElement(By.id("keepLoggedInCheckBox"));
		checkox.click();

		checkox.click();

		if (checkox.isSelected()) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		driver.findElement(By.id("loginButton")).click();

		driver.findElement(By.id("container_reports")).click();

		driver.findElement(By.xpath("//div[.='New Report']")).click();

		// WebDriverWait wait= new WebDriverWait(driver, 10);
		// wait.until(null);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement el = driver.findElement(By.xpath("//div[.='Configure Report Parameters']"));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[.='Configure Report Parameters']")));

		el.click();

		driver.findElement(By.cssSelector("[class='middle-left-cell contents customRightPart']")).click();

		// driver.findElement(By.xpath("//*[@id=\"ext-gen200\"]/span/div[2]")).click();
		
		/*WebDriverWait wai = new WebDriverWait(driver, Duration.ofSeconds(10));


		wai.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//a[@id='ext-gen200']//div[@class='rangeItemTitle'][normalize-space()='Previous month']")));
*/
		
		WebElement wai =	driver.findElement(
				By.xpath("//a[@id='ext-gen200']//div[@class='rangeItemTitle'][normalize-space()='Previous month']"));

      Actions a=new Actions(driver);
      
      a.doubleClick(wai).perform();
      //kkkk 
      System.out.println("heel");
	}

}
