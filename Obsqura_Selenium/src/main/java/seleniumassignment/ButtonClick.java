package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//launch url= https://formy-project.herokuapp.com/buttons using x path ,text() 
//function click on "Dropdown" button 
//and then click on "Warning" button

public class ButtonClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/buttons");
		driver.manage().window().maximize();
		//tagName[contains(text(),'visible text')]
		WebElement dropdown = driver.findElement(By.xpath("//button[contains(text(),'Dropdown')]"));
		dropdown.click();
		System.out.println("Drop down clicked");
		WebElement warning = driver.findElement(By.xpath("//button[contains(text(),'Warning')]"));
		warning.click();
		System.out.println("Warning button clicked");

	}

}

