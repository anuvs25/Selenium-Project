package webelementmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelection {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement drp_down = driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']"));
		Select drpob = new Select(drp_down); //aggregation
		
		drpob.selectByIndex(2); //index value
		drpob.selectByValue("search-alias=fashion"); //value attribute
		drpob.selectByVisibleText("Electronics"); //visible text
		
		List<WebElement> drp_items = drpob.getOptions();
		
		for(WebElement ob :drp_items) {
			System.out.println(ob.getText());
		}

	}

}
