package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementSampleTwo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//Not used commonly bcoz easily breakable
		WebElement searchfield = driver.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[2]"));
		searchfield.click();
		//Another method using and operator
		//input[@class='nav-input nav-progressive-attribute' and @id='value']
		WebElement searchfield_one = driver.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute' and @id='value']"));
		searchfield_one.click();

	}

}
