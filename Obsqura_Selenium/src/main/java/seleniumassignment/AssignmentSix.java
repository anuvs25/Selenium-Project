package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentSix {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/ajax.html");
		driver.manage().window().maximize();
		
		WebElement reset = driver.findElement(By.xpath("//input[@type='reset']"));
		System.out.println("Value attribute of reset button : "+reset.getAttribute("value"));
		
		WebElement radio_btnone = driver.findElement(By.xpath("//input[@id='yes']"));
		System.out.println("Type attribute of radio button : "+radio_btnone.getAttribute("type"));
		
		WebElement radio_btntwo = driver.findElement(By.xpath("//input[@id='no']"));
		
		System.out.println("Radio button 1 is enabled "+radio_btnone.isEnabled());
		System.out.println("Radio button 2 is enabled "+radio_btntwo.isEnabled());

	}

}
