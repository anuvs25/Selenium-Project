package mouseandkeyboardinteraction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardInteraction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement prd_search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
//		prd_search.sendKeys("Shoes"+Keys.ENTER);
//		prd_search.sendKeys("shirts");
//		prd_search.sendKeys(Keys.BACK_SPACE);
		
		prd_search.sendKeys("shirts");
		prd_search.sendKeys(Keys.chord(Keys.CONTROL,"A"));
		prd_search.sendKeys(Keys.DELETE);
		

	}

}
