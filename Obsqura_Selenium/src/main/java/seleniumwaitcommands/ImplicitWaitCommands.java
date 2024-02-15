package seleniumwaitcommands;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitCommands {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); deprecated method
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); Second time declared will overwrite the previous value
		driver.manage().window().maximize();
		
		WebElement strt_btn = driver.findElement(By.xpath("//button[text()='Start']"));
		strt_btn.click();
//		Thread.sleep(7000);
		
		WebElement message = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
		System.out.println(message.getText());
		
		
	}

}
