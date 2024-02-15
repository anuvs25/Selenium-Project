package seleniumwaitcommands;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitCommand {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.manage().window().maximize();
		
		//object creation
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30)) //threshold time
				.pollingEvery(Duration.ofSeconds(5))//polling frequency
				.ignoring(NoSuchElementException.class);
		
		WebElement strt_btn = driver.findElement(By.xpath("//button[text()='Start']"));
		strt_btn.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Hello World!']")));
		WebElement message = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
		System.out.println(message.getText());
	}

}
