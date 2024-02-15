package seleniumassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintMessage {

	public static void main(String[] args) {
		//launch url https://the-internet.herokuapp.com/notification_message_rendered click on 
		//"click here" link and print message "Action successful" using getText
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/notification_message_rendered");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement click_txt = driver.findElement(By.xpath("//a[text()='Click here']"));
		click_txt.click();
		
		WebElement click_txt_mssg = driver.findElement(By.xpath("//div[contains(text(),'Action successful')]"));
		System.out.println(click_txt_mssg.getText());
		
		
		
		
		
		

	}

}
