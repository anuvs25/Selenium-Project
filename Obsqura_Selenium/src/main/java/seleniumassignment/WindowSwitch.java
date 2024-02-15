package seleniumassignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitch {
	
	public static void main(String[] args) {
		// launch url= https://formy-project.herokuapp.com/switch-window 
		//Print current window title and current url click on button 
		//" Open new tab" New Tab will be opened , Print title of new tab ,
		//print Text "Welcome to Formy" then close newly opened tab and switch back
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/switch-window ");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		System.out.println("Current Window title: "+driver.getTitle());
		System.out.println("Current Window url: "+driver.getCurrentUrl());
		String parent_win_id = driver.getWindowHandle();
		WebElement open_btn = driver.findElement(By.xpath("//button[@id='new-tab-button']"));
		open_btn.click();
		Set<String> window_ids = driver.getWindowHandles();
		
		for(String ids:window_ids) {
			if(ids.compareTo(parent_win_id)!=0) {
				driver.switchTo().window(ids);
			}
		}
		WebElement new_win_txt = driver.findElement(By.xpath("//h1[text()='Welcome to Formy']"));
		System.out.println("Current Window title: "+driver.getTitle());
		System.out.println("Current Window text: "+new_win_txt.getText());
		driver.close();
		driver.switchTo().window(parent_win_id);
		System.out.println("Switched to parent window");
	}

}
