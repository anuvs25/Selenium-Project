package robotclasssample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadRobot {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		
		WebElement choose_filebtn = driver.findElement(By.xpath("//input[@id='file-upload']"));
		String file_location = "D:\\EmployeeDetails.xlsx";
		
		Actions action = new Actions(driver);
		Robot rob = new Robot();
		action.moveToElement(choose_filebtn).click().build().perform();
		
		//Adding file to clip board for that obj creation
		StringSelection ss = new StringSelection(file_location);
		
		//Added to clip board
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		// Time for copying file
		rob.delay(5000);
		
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		
		//release the keys
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_V);
		rob.delay(1000);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
	}

}
