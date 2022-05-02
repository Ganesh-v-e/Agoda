package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class AgodaHomePage extends BaseClass {

	public AgodaHomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='email']")
	private WebElement txtUser;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement txtpass;

	@FindBy(xpath = "//span[@class='Spanstyled__SpanStyled-sc-16tp9kb-0 kkSkZk kite-js-Span ']")
	private WebElement toclickSignIn;

	@FindBy(xpath = "//div[@class='sc-fzqNqU hFpwJY']")
	private WebElement clickLogIn;

	@FindBy(xpath = "//a[@class='LogoAndLinksMenu__Link']")
	private WebElement logo;

	@FindBy(xpath = "//span[@class='sc-gKsewC gCkWnc LinkContainer__Link__text']")
	private WebElement flightHotel;

	@FindBy(xpath = "(//span[@class='sc-gKsewC gCkWnc LinkContainer__Link__text'])[2]")
	private WebElement hotelsHomes;

	@FindBy(xpath = "(//span[@class='sc-gKsewC gCkWnc LinkContainer__Link__text'])[3]")
	private WebElement flights;

	@FindBy(xpath = "(//span[@class='sc-gKsewC gCkWnc LinkContainer__Link__text'])[4]")
	private WebElement todaysdeals;

	@FindBy(xpath = "(//span[@class='sc-gKsewC gCkWnc LinkContainer__Link__text'])[5]")
	private WebElement apartments;

	@FindBy(xpath = "(//span[@class='sc-gKsewC gCkWnc LinkContainer__Link__text'])[6]")
	private WebElement activities;

	@FindBy(xpath = "//i[@class='lang-us__icon flag flag-18 flag-18-us']")
	private WebElement languageEnglish;

	@FindBy(xpath = "//i[@class='sc-gKsewC gCkWnc language-trigger__icon flag flag-18 flag-18-us']")
	private WebElement countryFlag;

	public WebElement getLanguageEnglish() {
		return languageEnglish;
	}

	public WebElement getCountryFlag() {
		return countryFlag;
	}

	public WebElement getFlightHotel() {
		return flightHotel;
	}

	public WebElement getHotelsHomes() {
		return hotelsHomes;
	}

	public WebElement getFlights() {
		return flights;
	}

	public WebElement getTodaysdeals() {
		return todaysdeals;
	}

	public WebElement getApartments() {
		return apartments;
	}

	public WebElement getActivities() {
		return activities;
	}

	public WebElement getLogo() {
		return logo;
	}

	public WebElement getToclickSignIn() {
		return toclickSignIn;
	}

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getClickLogIn() {
		return clickLogIn;
	}

}
