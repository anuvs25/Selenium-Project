package locatorsxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathInnerText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
//		WebElement login = driver.findElement(null)
		//visible text containing space
		WebElement innertext = driver.findElement(By.xpath("//a[contains(text(),'Electronics')]"));
		innertext.click();
		//visible text without space
		WebElement innertexttwo = driver.findElement(By.xpath("//a[text()='Tricentis']"));
		innertexttwo.click();

	}

}
