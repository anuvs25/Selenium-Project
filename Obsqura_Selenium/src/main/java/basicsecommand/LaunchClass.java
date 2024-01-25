package basicsecommand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("remote-allow-origins=*");
//		WebDriver driver = new ChromeDriver(options);
//		
		WebDriver driver = new ChromeDriver();
		
//		System.setProperty("webdriver.edge.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/"); //launch the url
		driver.manage().window().maximize(); // maximize the screen
		String title = driver.getTitle(); //get the title of launched page
		System.out.println(title);
//		String current_url = driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		
//		driver.get("https://www.flipkart.com/");
//		driver.manage().window().maximize(); // maximize the screen
//		System.out.println(driver.getTitle());
		
		driver.get(driver.getCurrentUrl()); // refresh the current url page
//		System.out.println(driver.getPageSource()); // returns the code of the page
	

	}

}
