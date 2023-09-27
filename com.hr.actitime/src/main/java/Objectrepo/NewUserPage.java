package Objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hr.actitime.Genric.ExcelFileUtlity;
import com.hr.actitime.Genric.WebDriverUtlity1;

public class NewUserPage {

	@FindBy(name = "name")
	private WebElement nwuser;

	@FindBy(xpath = "//input[contains(@onclick,'handleCancel();')]")
	private WebElement cancel;

	public NewUserPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void NwAction(WebDriver driver) throws Throwable {

		nwuser.sendKeys("xyz");
		Thread.sleep(2000);
		cancel.click();

		WebDriverUtlity1 wd1 = new WebDriverUtlity1();

		wd1.getTextAlert(driver);

		ExcelFileUtlity ex = new ExcelFileUtlity();

		ex.UpdatedataFromExcel(null, 0, 0, null);
	}

}
