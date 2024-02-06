package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipDisplay {

	public static void main(String[] args) {
		//https://demo.guru99.com/test/social-icon.html
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/social-icon.html");
		driver.manage().window().maximize();
		
		WebElement tool_tip_one = driver.findElement(By.xpath("//a[@class='fa fa-lg fa-envelope']"));
		System.out.println(tool_tip_one.getAttribute("title"));
		
		WebElement tool_tip_two = driver.findElement(By.xpath("//a[@class='fa fa-lg fa-youtube']"));
		System.out.println(tool_tip_two.getAttribute("title"));
		
		

	}

}
