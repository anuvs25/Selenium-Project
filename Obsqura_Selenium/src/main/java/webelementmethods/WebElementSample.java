package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementSample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		
		WebElement checkbox_one = driver.findElement(By.xpath("//form[@id='checkboxes']//input[1]"));
		WebElement checkbox_two = driver.findElement(By.xpath("//form[@id='checkboxes']//input[2]"));
		
		boolean status_one = checkbox_one.isSelected();
		
		if(status_one==false) {
			checkbox_one.click();
		} 
		
		System.out.println("First check box is clicked "+status_one);
		
		boolean status_two = checkbox_two.isSelected();
		
		if(status_two==false) {
			checkbox_two.click();
		}

		System.out.println("Second check box is clicked "+status_two);
		
		// Whether an element is present or not
		boolean btnstatus_one = checkbox_one.isDisplayed();
		System.out.println("First check box is present "+btnstatus_one);
			
	}

}
