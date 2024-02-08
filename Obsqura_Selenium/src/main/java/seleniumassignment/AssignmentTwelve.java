package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentTwelve {

	public static void main(String[] args) throws InterruptedException {
		//launch https://formy-project.herokuapp.com/form Input any data Enter "First name" 
		//Enter "Last name" Enter "Job title" Choose "Highest level of education" radio button as 
		//"College" Choose "Sex" -> Male choose "Years of experience:" as 10+ Then click on "Submit" 
		//button and print message "Thanks for submitting your form"
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");
		driver.manage().window().maximize();
		
		WebElement first_name = driver.findElement(By.xpath("//input[@id='first-name']"));
		first_name.sendKeys("Abhijith");
		WebElement last_name = driver.findElement(By.xpath("//input[@id='last-name']"));
		last_name.sendKeys("S");
		WebElement job_title = driver.findElement(By.xpath("//input[@id='job-title']"));
		job_title.sendKeys("Test Engineer");
		WebElement edu_level = driver.findElement(By.xpath("//input[@id='radio-button-2']"));
		edu_level.click();
		WebElement per_sex = driver.findElement(By.xpath("//input[@id='checkbox-1']"));
		per_sex.click();
		WebElement year_exp = driver.findElement(By.xpath("//select[@id='select-menu']"));
		Select exp_ob = new Select(year_exp);
		exp_ob.selectByValue("4");
		WebElement submit_btn = driver.findElement(By.xpath("//a[@class='btn btn-lg btn-primary']"));
		submit_btn.click();
		driver.get("https://formy-project.herokuapp.com/thanks");
		WebElement message = driver.findElement(By.xpath("//h1[text()='Thanks for submitting your form']"));
		System.out.println(message.getText());

	}

}
