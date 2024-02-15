package javascriptorsample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickUsingJScCommand {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement forgot_pw = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		JavascriptExecutor js= (JavascriptExecutor) driver ;
		js.executeScript("arguments[0].scrollIntoView();", forgot_pw);
		js.executeScript("arguments[0].click();",forgot_pw);
	}

}
