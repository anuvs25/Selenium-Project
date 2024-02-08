package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssProperty {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.keralartc.com/");
		driver.manage().window().maximize();
		
//		WebElement back_color = driver.findElement(By.xpath("//a[text()='Book Now']"));
		WebElement back_color = driver.findElement(By.xpath("//a[@class='btn-theme']"));
		System.out.println(back_color.getCssValue("background-color"));
		System.out.println(back_color.getCssValue("font-color"));
		System.out.println(back_color.getCssValue("font-style"));
		System.out.println(back_color.getCssValue("font-size"));
		System.out.println(back_color.getCssValue("color"));
		
		
		
		
		

	}

}
