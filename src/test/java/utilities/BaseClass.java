package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void browserLaunch() {

		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();

		driver.manage().window().maximize();
	}

	public static void url(String value) {
		driver.get(value);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void title() {

		driver.getTitle();
		
		
	}
	
public static void iwait() {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}	
	
public static void frame(WebElement xpath) {
	

	driver.switchTo().frame(xpath);
	

}

	public static void currentUrl() {

		driver.getCurrentUrl();
	}
	
	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static void goTo() {
		driver.navigate().to("address");
	}

	public static void goBack() {
		driver.navigate().back();
	}

	public static void goFor() {
		driver.navigate().forward();
	}

	public static void load() {
		driver.navigate().refresh();
	}

	public static void get(String value) {
		driver.get(value);
	}

	public static void caution() {
		driver.switchTo().alert().accept();
	}

	public static void casee(WebElement elemnet) {
		Actions ac = new Actions(driver);
		ac.moveToElement(elemnet).build().perform();
	}

	public static void windowsHandle() throws InterruptedException {

		String parentId = driver.getWindowHandle();
		Set<String> allwindowsId = driver.getWindowHandles();
	
	for (String eachId : allwindowsId) {
		
		if (!parentId.equals(eachId)) {
			
			driver.switchTo().window(eachId);
			
		}
		Thread.sleep(1000);
	}
	
	
	}
	
	public static void iframe(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void rob(WebElement element) throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_UP);
	}

	public static void checkBox(WebElement element) {
		element.click();
	}

	public static void isEnable(WebElement element) {
		element.isEnabled();
	}

	public static void isDisplay(WebElement element) {
		element.isDisplayed();
	}

	public static void isSelect(WebElement element) {
		element.isSelected();
	}

	public static void current(String url) {
		driver.get(url);
		System.out.println(url);
	}

	public static void getOptions(WebElement element) {
		Select s1 = new Select(element);
		s1.getOptions();
	}

	public static void getTi(String title) {
		driver.getTitle();
		System.out.println(title);
	}

	public static void sendKeys(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static void erase(WebElement element) {
		element.clear();
	}

	public static void dropDown(WebElement element, String options, String value) {
		Select s = new Select(element);

		try {
			if (options.equalsIgnoreCase("byIndex")) {
				int parsInt = Integer.parseInt(value);
				s.deselectByIndex(parsInt);
			} else if (options.equalsIgnoreCase("byValue")) {
				s.selectByValue(value);
			} else if (options.equalsIgnoreCase("byVisibleText")) {
				s.selectByVisibleText(value);

			} else {
				System.out.println("Invalid");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

	}

	public static void text(WebElement element) {
		element.getText();

	}

public static void toHighlight(WebElement xpath) {

	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
	
	jsExecutor.executeScript("arguments[0].style.border='4px solid red'", xpath);
}	
	
public static void tkscreenshot(String name) throws IOException {

	TakesScreenshot tk = (TakesScreenshot)driver;
	
	File src = tk.getScreenshotAs(OutputType.FILE);
	
	File des = new File("C:\\Users\\Homeeee\\eclipse-workspace\\AgodaTesting\\target\\screenshot\\"+name+".jpg");
	
		FileUtils.copyFile(src, des);

}

public static void CurUrl(String url) {
	
	driver.getCurrentUrl();
}
}