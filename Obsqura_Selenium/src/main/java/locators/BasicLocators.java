package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		email.click();
		email.sendKeys("abcd@gmail.com");
//		email.clear();
		WebElement password = driver.findElement(By.name("pass"));
		password.click();
		password.sendKeys("abcd12344");
//		WebElement loginbtn = driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy"));
//		loginbtn.click();
		
	}

}
