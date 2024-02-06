package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementIsDisplayed {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement logo = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
//		boolean logo_status = logo.isDisplayed();
		System.out.println("Logo is displayed "+logo.isDisplayed());
		
		WebElement searchfield = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		System.out.println("Search field is displayed "+ searchfield.isDisplayed());
		
		

	}

}
