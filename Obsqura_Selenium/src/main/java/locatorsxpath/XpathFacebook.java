package locatorsxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("12345dfg");
		WebElement loginbtn= driver.findElement(By.xpath("//button[@name='login']"));
		loginbtn.click();
		
	}

}
