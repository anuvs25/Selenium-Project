package seleniumassignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTen {

	public static void main(String[] args) {
		// launch https://formy-project.herokuapp.com/buttons using List<WebElement> 
		//print background color of All buttons, Also print Text of All 12 buttons
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/buttons");
		driver.manage().window().maximize();
//		WebElement primary_btn = driver.findElement(By.xpath("//form//button"));
		
		List<WebElement> btn_buttons = driver.findElements(By.xpath("//form//button"));
		int i= 1;
		for(WebElement btnob:btn_buttons) {
			System.out.print(i+". ");
			System.out.print("Button Text : "+btnob.getText());
			System.out.println("------Back ground color of button : "+btnob.getCssValue("background-color"));
			i++;
		}

	}

}
