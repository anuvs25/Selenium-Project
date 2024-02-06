package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementGetValue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement searchfield = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		System.out.println(searchfield.getAttribute("id"));
		System.out.println(searchfield.getAttribute("placeholder"));
		System.out.println(searchfield.getAttribute("aria-label"));
		System.out.println(searchfield.getAttribute("class"));
		
		WebElement drp_tooltip = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		System.out.println("Tool tip of drop down is " +drp_tooltip.getAttribute("title"));
		

	}

}
