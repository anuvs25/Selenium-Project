package seleniumassignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClick {

	public static void main(String[] args) {
		// launch url https://demo.guru99.com/test/radio.html using mouse 
		//click on Radio button "Option2" and Check box "Checkbox3" //then print isSelected() of All radio buttons & checkboxes one by one
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement radio_btn = driver.findElement(By.xpath("//input[@value='Option 2']"));
		WebElement check_box = driver.findElement(By.xpath("//input[@value='checkbox3']"));
		
		Actions action =new Actions(driver);
		action.click(radio_btn).build().perform();
		action.click(check_box).build().perform();
		
		List<WebElement> selection_check = driver.findElements(By.xpath("//div//input[@name='webform']"));
		
		for(WebElement selection:selection_check) {
			String selection_name=selection.getAttribute("value");
			boolean selected = selection.isSelected();
			System.out.println(selection_name+" "+"is selected : "+selected);
			
		}

	}

}
