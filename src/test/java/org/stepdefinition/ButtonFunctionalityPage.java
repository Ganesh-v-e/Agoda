package org.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pom.AgodaHomePage;

import io.cucumber.java.en.*;
import utilities.BaseClass;

public class ButtonFunctionalityPage extends BaseClass {

	@When("User verify the country flag")
	public void user_verify_the_country_flag() throws InterruptedException {

		

		WebElement cflag = driver.findElement(By.xpath("//i[@class='sc-gKsewC gCkWnc language-trigger__icon flag flag-18 flag-18-us']"));

		toHighlight(cflag);
		iwait();

		Assert.assertTrue("Check wthether the flag is present", cflag.isDisplayed());

		System.out.println("Country flag is verified");

	}

	@When("User click the country flag and select their country flag")
	public void user_click_the_country_flag_and_select_their_country_flag() throws InterruptedException {

		AgodaHomePage abp = new AgodaHomePage();
		
		abp.getCountryFlag().click();
		iwait();
		abp.getLanguageEnglish().click();

		
	}

	@Then("User should navigate to the Home Page with selected country flag and close the browser")
	public void user_should_navigate_to_the_Home_Page_with_selected_country_flag_and_close_the_browser() {

		iwait();
		System.out.println("Country flag functionality is passed");
		
	}

}
