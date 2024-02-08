package webelementmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayWebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		WebElement top_menu = driver.findElement(By.xpath("//ul[@class='top-menu']/li/a"));
		System.out.println(top_menu.getText());
		
		List<WebElement> menu = driver.findElements(By.xpath("//ul[@class='top-menu']/li/a"));
		System.out.println(menu.size());
		
//		for(int i=0; i<menu.size();i++) {
//			String menu_items = menu.get(i).getText();
//			System.out.println(menu_items);
//		}
//		
		for(WebElement ob: menu) {
			System.out.println(ob.getText());
			System.out.println(ob.getCssValue("font-size"));
			
			
		}

	}

}
