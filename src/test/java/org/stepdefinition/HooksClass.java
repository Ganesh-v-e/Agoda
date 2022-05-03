package org.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.BaseClass;

public class HooksClass extends BaseClass {

	@Before
	public void beforeScenario() {

		System.out.println("Before Execution");
		browserLaunch();
		url("https://www.agoda.com/");

		
	}

	@After
	public void afterScenario(Scenario s) throws IOException {
		System.out.println("After Execution");
		if (s.isFailed()) {

			TakesScreenshot tk = (TakesScreenshot)driver;
			byte[] ss = tk.getScreenshotAs(OutputType.BYTES);
			s.embed(ss, "image/png");
			
			
		} else {
			String names = s.getName();
			tkscreenshot(names);
			
		}
		
		close();
	}
}
