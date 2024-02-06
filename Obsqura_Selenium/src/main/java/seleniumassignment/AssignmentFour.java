package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//open url-> https://phptravels.com/demo/ * Print text "Demonstration" 
//using getText * Print Header Menu "Demo" , "Pricing", "Product"

public class AssignmentFour {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		driver.manage().window().maximize();
		
		WebElement text_one = driver.findElement(By.xpath("//h1[contains(text(),'Demonstration')]"));
		System.out.println(text_one.getText());
		WebElement text_two = driver.findElement(By.xpath("//li[@class='nav-item']//a[contains(text(),'Demo')]"));
		System.out.println(text_two.getText());
		WebElement text_three = driver.findElement(By.xpath("//li[@class='nav-item']//a[contains(text(),'Pricing')]"));
		System.out.println(text_three.getText());
		WebElement text_four = driver.findElement(By.xpath("//span[contains(text(),'Product')]"));
		System.out.println(text_four.getText());
	}

}
