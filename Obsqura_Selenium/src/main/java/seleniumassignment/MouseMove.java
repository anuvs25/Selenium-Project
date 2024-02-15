package seleniumassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMove {

	public static void main(String[] args) {
		// launch url https://the-internet.herokuapp.com/hovers using actions , move mouse cursor 
		//to first profile icon. Then print text "name: user1" in console
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/hovers");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement first_profile = driver.findElement(By.xpath("//div[@class='figure'][1]"));
		Actions action = new Actions(driver);
		action.moveToElement(first_profile).build().perform();
		
		WebElement first_profile_name = driver.findElement(By.xpath("//h5[text()='name: user1']"));
		System.out.println(first_profile_name.getText());
	}

}
