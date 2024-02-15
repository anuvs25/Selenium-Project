package mouseandkeyboardinteraction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClickSampleTwo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement prd_search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Actions action = new Actions(driver);
		action.clickAndHold(prd_search).build().perform();
		action.release(prd_search).build().perform();
		action.sendKeys(prd_search,"shoes").build().perform();
		action.keyDown(prd_search, Keys.ENTER).build().perform();
		
	}

}
