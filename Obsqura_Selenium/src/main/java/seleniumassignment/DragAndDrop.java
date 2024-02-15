package seleniumassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop {

	public static void main(String[] args) {
		// launch url= https://formy-project.herokuapp.com/dragdrop using Drag & Drop , 
		//Drag Selenium logo into the right side box ("Drop here" )box
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/dragdrop");
		driver.manage().window().maximize();
		
		WebElement source = driver.findElement(By.xpath("//div[@id='image']"));
		WebElement destination = driver.findElement(By.xpath("//div[@id='box']"));
		
		Actions action =new Actions(driver);
		action.dragAndDrop(source, destination).build().perform();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[text()='Dropped!']")));
		
		WebElement message = driver.findElement(By.xpath("//p[text()='Dropped!']"));
		System.out.println(message.getText());

	}

}
