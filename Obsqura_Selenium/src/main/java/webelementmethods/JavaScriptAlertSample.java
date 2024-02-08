package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlertSample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		WebElement btn_one = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		WebElement btn_two = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		WebElement btn_three = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		btn_one.click();
		
		String alert_text = driver.switchTo().alert().getText();
		System.out.println(alert_text); //alert text
		driver.switchTo().alert().accept(); // click ok button
		
		btn_two.click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss(); // click cancel
		
		btn_three.click();
		driver.switchTo().alert().sendKeys("Hello"); //entering text in alert window
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
	}

}
