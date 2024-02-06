package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementIsEnabled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/enabled");
		driver.manage().window().maximize();
		WebElement inp_box_one = driver.findElement(By.xpath("//input[@id='disabledInput']"));
		WebElement inp_box_two = driver.findElement(By.xpath("//input[@id='input']"));
		
		System.out.println("Input field enabled "+inp_box_one.isEnabled());
		System.out.println("Input field enabled "+inp_box_two.isEnabled());
		
		System.out.println("Input field displayed "+inp_box_one.isDisplayed());
		System.out.println("Input field displayed "+inp_box_two.isDisplayed());
		
		int xlocation = inp_box_one.getLocation().getX();
		int ylocation = inp_box_one.getLocation().getY();
		
		System.out.println("X Coordinate " + xlocation );
		System.out.print("Y Coordinate " + ylocation );
	}

}
