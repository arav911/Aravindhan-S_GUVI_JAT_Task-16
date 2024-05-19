package task_16_guvi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_3 {

	public static void main(String[] args) {
//		set the path to the location of chromedriver executable
		System.setProperty("webdriver.chrome.driver", "S:\\Selenium Tools\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
//		create an instance of ChromeDriver
		WebDriver driver = new ChromeDriver();
		
//		Maximize the Window
		driver.manage().window().maximize();
		
//		Launch the chrome browser and redirect to it to the specified URL
		driver.get("https://www.wikipedia.org/");
		
//		find the search box element by ID locator and send the input as "Artificial Intelligence" 
		driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence");
		
//		find the search button element by xpath locator and click on it
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
//		find the History section element by linkText locator
		driver.findElement(By.linkText("History")).click();
		
//		print the "History" section title from the page using getText() method
		System.out.println(driver.findElement(By.id("History")).getText());

	}

}
