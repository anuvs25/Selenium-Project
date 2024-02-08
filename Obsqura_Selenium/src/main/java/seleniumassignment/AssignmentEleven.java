package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentEleven {

	public static void main(String[] args) {
		// launch https://the-internet.herokuapp.com/login * Print Whether username & 
		//password fields are Displayed or not , also Enabled * Input user name "usr" password "pwd" 
		//Then click on Login button Then print message "Your username is invalid" Error Message 
		//also Print Background color of Error Message
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
		
		WebElement user_name = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement pass_word = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement login_btn = driver.findElement(By.xpath("//button[@class='radius']"));
		
		System.out.println("User name field is displayed : "+user_name.isDisplayed());
		System.out.println("User name field is enabled : "+user_name.isEnabled());
		System.out.println("Password field is displayed : "+pass_word.isDisplayed());
		System.out.println("Password field is enabled : "+pass_word.isDisplayed());
		System.out.println();
		user_name.sendKeys("Anu");
		pass_word.sendKeys("123456");
		login_btn.click();
		
		WebElement error_mssg = driver.findElement(By.xpath("//div[@id='flash']"));
		System.out.println("Error Message is :"+error_mssg.getText());
		System.out.println("Background Color of Error Message is :"+error_mssg.getCssValue("background-color"));
		
		
	}

}
