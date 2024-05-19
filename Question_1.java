package task_16_guvi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Question_1 {

	public static void main(String[] args) {
//		set the path to the location of geckodriver executable
		System.setProperty("webdriver.gecko.driver", "S:\\Selenium Tools\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
//		create an instance of FireFoxDriver(GeckoDriver)
		WebDriver driver = new FirefoxDriver();
		
//		Maximize the Window
		driver.manage().window().maximize();
		
//		Launch the firefox browser and redirect to it to the specified URL
		driver.navigate().to("http://www.google.com/");
		
//		print the URL of the current page opened using getCurrentUrl() method
		System.out.println(driver.getCurrentUrl());
		
//		reload the page using one of the navigate() methods 
		driver.navigate().refresh();
		
//		close the browser using close() method
		driver.close();

	}

}
