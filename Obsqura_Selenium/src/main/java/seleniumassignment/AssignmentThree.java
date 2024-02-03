package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentThree {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/V4/index.php");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.name("uid"));
		username.sendKeys("abcd");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("abcd@1234");
		WebElement loginbtn = driver.findElement(By.xpath("//input[@name='btnLogin']"));
		loginbtn.click();

	}

}
