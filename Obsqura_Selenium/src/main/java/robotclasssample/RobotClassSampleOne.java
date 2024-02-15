package robotclasssample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassSampleOne {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_DOWN);

		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_DOWN);


	}

}
