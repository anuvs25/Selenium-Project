package seleniumassignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//launch url= https://formy-project.herokuapp.com/radiobutton 
//using any locator click on Radio button 2 Then click on Radio button 1

public class RadioButtonClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/radiobutton");
		driver.manage().window().maximize();
		WebElement radiobtnone = driver.findElement(By.xpath("//input[@value='option2']"));
		radiobtnone.click();
		Thread.sleep(5000);
		System.out.println("Radio button 2 clicked");
		WebElement radiobtntwo = driver.findElement(By.xpath("//input[@value='option1']"));
		radiobtntwo.click();
		System.out.println("Radio button 1 clicked");
	}
}
