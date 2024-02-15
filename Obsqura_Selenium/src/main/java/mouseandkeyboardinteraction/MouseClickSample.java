package mouseandkeyboardinteraction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClickSample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement rt_click_btn = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions rt_act = new Actions(driver);
		//Mouse Right Click
		//method over loading example
		//without parameter
		//rt_act.contextClick().build().perform(); 
		
		//with parameter
		rt_act.contextClick(rt_click_btn).build().perform(); 
		WebElement rt_btn_opt = driver.findElement(By.xpath("//span[text()='Edit']"));
		rt_act.contextClick(rt_btn_opt).build().perform(); 
		driver.switchTo().alert().accept();
		
		WebElement double_click = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		rt_act.doubleClick(double_click).build().perform();
		
		String alert_text = driver.switchTo().alert().getText();
		System.out.println(alert_text); 
		driver.switchTo().alert().accept(); 
	}

}
