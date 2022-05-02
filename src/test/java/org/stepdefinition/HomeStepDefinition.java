package org.stepdefinition;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.pom.AgodaHomePage;
import org.runner.HomeTestRunnerClass;

import io.cucumber.java.en.*;
import utilities.BaseClass;

public class HomeStepDefinition extends BaseClass {

	@Given("User launches the browser")
	public void user_launches_the_browser() throws InterruptedException {
//		browserLaunch();
//		url("https://www.agoda.com/");
	}

	@Then("User should navigate to the home page and close the browser")
	public void user_should_navigate_to_the_home_page_and_close_the_browser() throws InterruptedException {

		String title = driver.getTitle();

		Assert.assertTrue("Verify the Home Pge", title.contains("Agoda Official"));

		System.out.println("Home Page is passed");


	}

	@When("User should verify the logo")
	public void user_should_verify_the_logo() throws InterruptedException {

		AgodaHomePage ahp = new AgodaHomePage();

		ahp.getLogo().click();

		WebElement logoverify = driver.findElement(By.xpath("//a[@class='LogoAndLinksMenu__Link']"));

		toHighlight(logoverify);

		Thread.sleep(2000);

		Assert.assertTrue("Verify the Logo", logoverify.isDisplayed());

		System.out.println("Logo is available");

	}

	@When("User Should verify the Flight + Hotel button")
	public void user_Should_verify_the_Flight_Hotel_button() throws InterruptedException {

		WebElement flightHotelv = driver
				.findElement(By.xpath("//span[@class='sc-gKsewC gCkWnc LinkContainer__Link__text']"));

		toHighlight(flightHotelv);

		Thread.sleep(2000);

	}

	@When("User should click the Flight + Hotel button")
	public void user_should_click_the_Flight_Hotel_button() {

		AgodaHomePage ahp = new AgodaHomePage();
		ahp.getFlightHotel().click();

	}

	@Then("User should navigate to the Flight + Hotel page and close the browser")
	public void user_should_navigate_to_the_Flight_Hotel_page_and_close_the_browser() throws InterruptedException {

		String fhurl = driver.getCurrentUrl();

		Assert.assertTrue("Flight+Hotel is verified", fhurl.contains("agoda.com/en-gb/#packages"));

		System.out.println("User is on Flight+Hotel page");

	}

	@When("User Should verify the Hotels & Homes button")
	public void user_Should_verify_the_Hotels_Homes_button() throws InterruptedException {

		WebElement Hotelhomesv = driver
				.findElement(By.xpath("(//span[@class='sc-gKsewC gCkWnc LinkContainer__Link__text'])[2]"));

		toHighlight(Hotelhomesv);

		Thread.sleep(2000);
	}

	@When("User should click the Hotels & Homes button")
	public void user_should_click_the_Hotels_Homes_button() {
		AgodaHomePage ahp = new AgodaHomePage();
		ahp.getHotelsHomes().click();

	}

	@Then("User should navigate to the Hotels & Homes page and close the browser")
	public void user_should_navigate_to_the_Hotels_Homes_page_and_close_the_browser() {
		WebElement hotelandhomepage = driver.findElement(By.xpath(
				"//h6[@class='Typographystyled__TypographyStyled-sc-j18mtu-0 eBZFaj kite-js-Typography Box-sc-kv6pi1-0 gaTaSa']"));

		String hotelandhomepagetext = hotelandhomepage.getText();

		Assert.assertTrue("Hotel&Homes is verified", hotelandhomepagetext.contains("Hotels"));

		System.out.println("User is on Hotel&Homes page");


	}

	@When("User Should verify the Flights button")
	public void user_Should_verify_the_Flights_button() throws InterruptedException {

		WebElement flightsv = driver
				.findElement(By.xpath("(//span[@class='sc-gKsewC gCkWnc LinkContainer__Link__text'])[3]"));

		toHighlight(flightsv);

		Thread.sleep(2000);

	}

	@When("User should click the Flights button")
	public void user_should_click_the_Flights_button() {

		AgodaHomePage ahp = new AgodaHomePage();
		ahp.getFlights().click();

	}

	@Then("User should navigate to the Flights page and close the browser")
	public void user_should_navigate_to_the_Flights_page_and_close_the_browser() {

		WebElement flighttext = driver.findElement(By.xpath(
				"(//h6[@class='Typographystyled__TypographyStyled-sc-j18mtu-0 eBZFaj kite-js-Typography Box-sc-kv6pi1-0 gaTaSa'])[4]"));

		String flightstext = flighttext.getText();

		Assert.assertTrue("User is on Flight's Page", flightstext.contains("Flights"));

		System.out.println("user is on Flight's Page");


	}

	@When("User Should verify the Todays deals button")
	public void user3_Should_verify_the_Today_s_deals_button() throws InterruptedException {
		WebElement flightsv = driver
				.findElement(By.xpath("(//span[@class='sc-gKsewC gCkWnc LinkContainer__Link__text'])[4]"));

		toHighlight(flightsv);

		Thread.sleep(2000);

	}

	@When("User should click the Todays deals button")
	public void user_should_click_the_Today_s_deals_button() {

		AgodaHomePage ahp = new AgodaHomePage();

		ahp.getTodaysdeals().click();

	}

	@Then("User should navigate to the Todays deals page and close the browser")
	public void user_should_navigate_to_the_Today_s_deals_page_and_close_the_browser() throws InterruptedException {

		WebElement todaysdealpage = driver.findElement(By.xpath("(//div[@class='Box-sc-kv6pi1-0 hRUYUu'])[7]"));

		if (todaysdealpage.isDisplayed()) {

			System.out.println("user is on todays deal page");
		} else {

			System.out.println("user is not on todays deal page");
		}

		windowsHandle();
	}

	@When("User Should verify the Apartments button")
	public void user_Should_verify_the_Apartments_button() throws InterruptedException {

		WebElement apartmentsv = driver
				.findElement(By.xpath("(//span[@class='sc-gKsewC gCkWnc LinkContainer__Link__text'])[5]"));

		toHighlight(apartmentsv);

		Thread.sleep(2000);

	}

	@When("User should click the Apartments button")
	public void user_should_click_the_Apartments_button() {

		AgodaHomePage ahp = new AgodaHomePage();
		ahp.getApartments().click();
	}

	@Then("User should navigate to the Apartments page and close the browser")
	public void user_should_navigate_to_the_Apartments_page_and_close_the_browser() throws InterruptedException {

		iwait();
		windowsHandle();

		WebElement apartmentspage = driver.findElement(By.xpath("//h1[text()='Search for apartments']"));

		String apartmenttext = apartmentspage.getText();

		Assert.assertTrue(apartmenttext.contains("apartment"));

		System.out.println("user is on apartment page");

		windowsHandle();

	}

	@When("User Should verify the Activities button")
	public void user_Should_verify_the_Activities_button() throws InterruptedException {

		WebElement activitiesv = driver
				.findElement(By.xpath("(//span[@class='sc-gKsewC gCkWnc LinkContainer__Link__text'])[6]"));

		casee(activitiesv);

		Thread.sleep(2000);

		toHighlight(activitiesv);

	}

	@When("User should click the Activities button")
	public void user_should_click_the_Activities_button() {

		AgodaHomePage ahp = new AgodaHomePage();
		ahp.getActivities().click();

	}

	@Then("User should navigate to the Activities page and close the browser")
	public void user_should_navigate_to_the_Activities_page_and_close_the_browser() throws InterruptedException {

		String activitiespage = driver.getCurrentUrl();

		Assert.assertTrue(activitiespage.contains("activity"));

		System.out.println("User is on activitty page");

	}

}
