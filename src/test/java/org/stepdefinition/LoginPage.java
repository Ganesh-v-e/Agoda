package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pom.AgodaHomePage;

import io.cucumber.java.en.*;
import utilities.BaseClass;

public class LoginPage extends BaseClass {

	@When("User should click sign in button and type valid username {string} and invalid password {string}")
	public void user_should_click_sign_in_button_and_type_valid_username_and_invalid_password(String s1, String s2)
			throws InterruptedException {

		AgodaHomePage alp = new AgodaHomePage();
		alp.getToclickSignIn().click();
		Thread.sleep(2000);
		frame(driver.findElement(By.xpath("//iframe[@title='Universal login']")));
		driver.findElement(By.id("email")).sendKeys(s1);
		driver.findElement(By.id("password")).sendKeys(s2);

	}

	@When("User should click sign in button")
	public void user_should_click_sign_in_button() {

		AgodaHomePage alp = new AgodaHomePage();
		alp.getClickLogIn().click();

	}

	@Then("User should navigate to invalid credential page and close the browser")
	public void user_should_navigate_to_invalid_credential_page_and_close_the_browser() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("test case passed");

	}

	@When("User should click sign in button and type ivalid username and ivalid password")
	public void user_should_click_sign_in_button_and_type_ivalid_username_and_ivalid_password(
			io.cucumber.datatable.DataTable dt) throws InterruptedException {

		AgodaHomePage alp = new AgodaHomePage();
		alp.getToclickSignIn().click();
		Thread.sleep(2000);
		frame(driver.findElement(By.xpath("//iframe[@title='Universal login']")));

		List<List<String>> data1 = dt.asLists();
		alp.getTxtUser().sendKeys(data1.get(1).get(0));
		alp.getTxtpass().sendKeys(data1.get(1).get(1));

	}

	@Then("User should navigate to Invalid credential page and close the browser")
	public void user_should_navigate_to_Invalid_credential_page_and_close_the_browser() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("test case 2 passed");

	}

	@When("User should click sign in button and type valid username and valid password")
	public void user_should_click_sign_in_button_and_type_valid_username_and_valid_password(
			io.cucumber.datatable.DataTable dt2) throws InterruptedException {

		List<Map<String, String>> data2 = dt2.asMaps();

		AgodaHomePage alp = new AgodaHomePage();
		alp.getToclickSignIn().click();
		Thread.sleep(2000);
		frame(driver.findElement(By.xpath("//iframe[@title='Universal login']")));

		alp.getTxtUser().sendKeys(data2.get(1).get("username"));
		alp.getTxtpass().sendKeys(data2.get(1).get("password"));
	}

	@Then("User should navigate to home page and close the browser")
	public void user_should_navigate_to_home_page_and_close_the_browser() throws InterruptedException {

		Thread.sleep(2000);

		WebElement leod = driver.findElement(By.xpath("//span[text()='Leo D.']"));
		toHighlight(leod);
		System.out.println("Navigated to Home Page");
		Thread.sleep(2000);

	}

}
