package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentSeven {

	public static void main(String[] args) {
	
		//launch https://demowebshop.tricentis.com/login print whether "Remember me?" 
		//check box is Enabled or Not Then print "Forgot password?" IsDisplayed or Not
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		WebElement check_box = driver.findElement(By.xpath("//input[@id='RememberMe']"));
		System.out.println("Remember me? is enabled : "+check_box.isEnabled());
		
		WebElement forgot_txt = driver.findElement(By.xpath("//a[contains(text(),'Forgot password?')]"));
		System.out.println("Forgot password? is displayed : "+forgot_txt.isDisplayed());
		

	}

}
