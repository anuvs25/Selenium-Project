package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentNine {

	public static void main(String[] args) {
		//launch https://the-internet.herokuapp.com/dropdown using Select class , 
		//select option "Option 1"
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		driver.manage().window().maximize();
		
		WebElement select_opt = driver.findElement(By.xpath("//select[@id='dropdown']"));
		Select opt_list = new Select(select_opt);
		opt_list.selectByVisibleText("Option 1");

	}

}
