package locatorsxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FollowPrecedXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/radiobutton");
		driver.manage().window().maximize();
		String btn_name = "Radio button 3";
//		WebElement radiobtn = driver.findElement(By.xpath("//label[contains(text(),'Radio button 2')]//preceding-sibling::input"));
//		radiobtn.click();
		
		//label[contains(text(),'"+variableName+"')]//preceding-sibling::input
		WebElement radiobtn = driver.findElement(By.xpath("//label[contains(text(),'"+btn_name+"')]//preceding-sibling::input"));
		radiobtn.click();

	}

}
