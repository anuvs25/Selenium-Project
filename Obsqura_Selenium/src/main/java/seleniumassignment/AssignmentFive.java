package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFive {
	
	//open url-- https://demo.guru99.com/test/login.html Enter any "Email address" & any "Password" 
	//then click on SignIn button.
	//Then print Message -> "Successfully Logged in..."

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/login.html");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//input[@name=\"email\"]"));
		email.sendKeys("anuvs25@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@name=\"passwd\"]"));
		password.sendKeys("123456");
		
		WebElement submit_btn = driver.findElement(By.xpath("//button[@id=\"SubmitLogin\"]"));
		submit_btn.click();
		
		WebElement message = driver.findElement(By.xpath("//h3[text()=\"Successfully Logged in...\"]"));
		System.out.println(message.getText());

	}

}
