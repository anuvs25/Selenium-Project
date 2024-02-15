package seleniumassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitSpeedTest {

	public static void main(String[] args) {
		// launch url https://fast.com/ use explicit wait & wait for some time till 
		//browser completely captures your internet speed. 
		//Then print final speed mb/s followed by message-> "Your Internet speed is ___Mbps"
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://fast.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='your-speed-message']")));
		
		WebElement speed_txt_mssg = driver.findElement(By.xpath("//div[@id='your-speed-message']"));
		WebElement speed_txt = driver.findElement(By.xpath("//div[@id='speed-value']"));
		WebElement speed_txt_mb = driver.findElement(By.xpath("//div[@id='speed-units']"));
		
		System.out.println(speed_txt_mssg.getText()+ " "+speed_txt.getText()+" "+speed_txt_mb.getText() );
	}

}
