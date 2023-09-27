package com.hr.actitime.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.hr.actitime.Genric.FileUtlity;
import com.hr.actitime.Genric.WebDriverUtlity1;

import Objectrepo.LoginPage;
import Objectrepo.NewUserPage;
import Objectrepo.SettingButton;

public class Class_Practice {

	public static void main(String[] args) throws Throwable {

		FileUtlity f = new FileUtlity();

		String u = f.getdatafromPropertyFile("url");

		String user = f.getdatafromPropertyFile("username");

		String p = f.getdatafromPropertyFile("password");

		WebDriver driver = new FirefoxDriver();

		WebDriverUtlity1 xyz = new WebDriverUtlity1();

		xyz.maximize(driver);

		// xyz.wait();

		driver.get(u);

		LoginPage lp = new LoginPage(driver);

		lp.logintoApp(user, p);

		Thread.sleep(5000);

		SettingButton sb = new SettingButton(driver);

		sb.SettingAction();

		NewUserPage nwp = new NewUserPage(driver);

		nwp.NwAction(driver);

		// System.out.println(xyz.getTextAlert(driver));

	}

}
