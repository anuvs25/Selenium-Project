package seleniumwaitcommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PositiveWayExplicitCommand {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		driver.manage().window().maximize();
		
		//object creation
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement remove_btn = driver.findElement(By.xpath("//button[text()='Remove']"));
		remove_btn.click();
		
		//positive condition
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
//		WebElement rem_mssg = driver.findElement(By.xpath("//p[@id='message']"));
//		System.out.println(rem_mssg.getText());
		
		//negative condition
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[text()='Remove']")));
//		WebElement rem_mssg = driver.findElement(By.xpath("//p[@id='message']"));
//		System.out.println(rem_mssg.getText());
//		
		//another way
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id='loading']")));
		WebElement rem_mssg = driver.findElement(By.xpath("//p[@id='message']"));
		System.out.println(rem_mssg.getText());

	}

}
