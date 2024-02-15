package seleniumwaitcommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitCommand {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.manage().window().maximize();
		
		//object creation
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement strt_btn = driver.findElement(By.xpath("//button[text()='Start']"));
//		wait.until(ExpectedConditions.elementToBeClickable(strt_btn));
		strt_btn.click();
//		Thread.sleep(7000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Hello World!']")));
		WebElement message = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
		System.out.println(message.getText());
		

	}

}
