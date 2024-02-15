package seleniumassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitOne {

	public static void main(String[] args) {
		//open url https://the-internet.herokuapp.com/dynamic_controls 
		//click on "Enable" button Print Message "It's enabled!" in console. 
		//Use Explicit Wait
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		driver.manage().window().maximize();
		
		WebElement enable_btn = driver.findElement(By.xpath("//button[text()='Enable']"));
		enable_btn.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
		
		WebElement enable_btn_txt = driver.findElement(By.xpath("//p[@id='message']"));
		System.out.println(enable_btn_txt.getText());

	}

}
