package seleniumassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseMoveSample {

	public static void main(String[] args) {
		// launch url= https://the-internet.herokuapp.com/jqueryui/menu# move mouse pointer 
		//to "Enabled" option Then move mouse to "Downloads"
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/jqueryui/menu#");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 WebElement enable_field = driver.findElement(By.xpath("//a[text()='Enabled']"));
		 Actions action = new Actions(driver);
		 action.moveToElement(enable_field).build().perform();
		 enable_field.click();
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Downloads']")));
		 WebElement download_field = driver.findElement(By.xpath("//a[text()='Downloads']"));
		 action.moveToElement(download_field).build().perform();
		

	}

}
