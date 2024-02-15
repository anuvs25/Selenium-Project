package iframessample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		
		// Method Overloading
		driver.switchTo().frame(0);
		driver.switchTo().frame("frame-middle");
		//driver.switchTo().frame(1);
		
		WebElement iframe_txt = driver.findElement(By.xpath("//div[@id='content']"));
		System.out.println(iframe_txt.getText());
		
		//for accessing next frame we have to go back to the initial state and the come back
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		WebElement iframe_txt_bot = driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]"));
		System.out.println(iframe_txt_bot.getText());
		
	}

}
