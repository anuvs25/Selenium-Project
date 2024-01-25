package basicsecommand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().back(); // get previous selected 
		driver.navigate().forward(); // get forward tab
		driver.navigate().refresh(); //refresh page
	}

}
