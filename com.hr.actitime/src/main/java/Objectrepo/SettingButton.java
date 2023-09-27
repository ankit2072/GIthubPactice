package Objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingButton {

	@FindBy(xpath = "//div[@class='popup_menu_button popup_menu_button_settings ']//div[@class='popup_menu_icon']//*[name()='svg']")
	private WebElement Setingicon;

	@FindBy(xpath = "//a[normalize-space()='Types of Work']")
	private WebElement TPW;

	@FindBy(className = "i")
	private WebElement cn;

	// instilize the element
	public SettingButton(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void SettingAction() throws InterruptedException {

		Setingicon.click();
		Thread.sleep(5000);
		TPW.click();
		Thread.sleep(5000);

		cn.click();

	}

}
