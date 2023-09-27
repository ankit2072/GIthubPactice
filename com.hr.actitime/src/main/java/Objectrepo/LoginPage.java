package Objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(css = "[id='username']")
	private WebElement usernameEdt;

	@FindBy(css = "[name='pwd']")
	private WebElement passwordEdt;

	@FindBy(id = "loginButton")
	private WebElement loginBtn;

	// instilize the element
	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void logintoApp(String username, String password) {

		usernameEdt.sendKeys(username);
		passwordEdt.sendKeys(password);

		loginBtn.click();
	}

}
