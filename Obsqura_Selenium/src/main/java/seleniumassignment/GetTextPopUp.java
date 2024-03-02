package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextPopUp {

	public static void main(String[] args) throws InterruptedException {
		//launch url= https://the-internet.herokuapp.com/entry_ad print 
		//text of opened pop up "THIS IS A MODAL WINDOW" and also click on "close " link
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/entry_ad");
		driver.manage().window().maximize();

		
		WebElement pop_up_txt = driver.findElement(By.xpath("//div[@class='modal-title']"));
		Thread.sleep(3000);
		System.out.println(pop_up_txt.getText());
		

	}

}
