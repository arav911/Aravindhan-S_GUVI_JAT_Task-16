package task_16_guvi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_2 {

	public static void main(String[] args) {
//		set the path to the location of chromedriver executable
		System.setProperty("webdriver.chrome.driver", "S:\\Selenium Tools\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
//		create an instance of ChromeDriver
		WebDriver driver = new ChromeDriver();
		
//		Maximize the Window
		driver.manage().window().maximize();
		
//		Launch the chrome browser and redirect to it to the specified URL
		driver.get("https://www.demoblaze.com/");
		
//		print the URL of the current page opened
		String pageTitle = driver.getTitle();
		
//		validate the page title and prints output based on the condition
		if(pageTitle.equals("STORE"))
			System.out.println("Page landed on correct website");
		else
			System.out.println("Page not landed on correct website");

	}

}
