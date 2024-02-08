package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentEight {

	public static void main(String[] args) {
		// launch https://formy-project.herokuapp.com/form using 
		//Select class choose "Years of experience:" drop down value as "2-4"
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");
		driver.manage().window().maximize();
		
		WebElement exp_year = driver.findElement(By.xpath("//select[@id='select-menu']"));
		Select exp_drpdwn = new Select(exp_year);
		exp_drpdwn.selectByValue("2"); 
		System.out.println("Selected 2-4");
		driver.close();
	}

}
