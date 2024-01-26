package seleniumassignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*launch url= https://www.browserstack.com/ Then print current url & title*/

public class AssignmentOne {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		//Title of the page
		System.out.println(driver.getTitle());
		//Current url of page
		System.out.println(driver.getCurrentUrl());

	}

}
