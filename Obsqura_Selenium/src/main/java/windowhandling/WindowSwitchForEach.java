package windowhandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitchForEach {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		
		
		//return id of current tab
		String parent_window = driver.getWindowHandle();
		System.out.println("Parent Window ID : "+parent_window);
		
		String parent_window_title= driver.getTitle();
		System.out.println("Parent Window Title : "+parent_window_title);
		
		WebElement new_window = driver.findElement(By.xpath("//a[text()='Click Here']"));
		new_window.click();
		
		//switch to new tab we have to declare set for storing ID
		Set<String>windows_id=driver.getWindowHandles();	//it will return id of all opened tabs
		
		for(String ids:windows_id) {
			if(parent_window.compareTo(ids)!=0) {
				driver.switchTo().window(ids);
			}
		}
		WebElement new_window_txt = driver.findElement(By.xpath("//h3[text()='New Window']"));
		System.out.println(new_window_txt.getText());
		System.out.println("Title of newly opened window : "+driver.getTitle());

	}

}
