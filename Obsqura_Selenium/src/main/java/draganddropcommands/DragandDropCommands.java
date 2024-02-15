package draganddropcommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement source_element = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement dest_element = driver.findElement(By.xpath("//ol[@id='bank']"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source_element, dest_element).build().perform();
	}

}
