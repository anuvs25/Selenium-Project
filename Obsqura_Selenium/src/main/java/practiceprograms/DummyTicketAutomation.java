package practiceprograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DummyTicketAutomation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.dummyticket.com/");
		driver.manage().window().maximize();
		
		WebElement buy_tkt = driver.findElement(By.xpath("//a[text()='Buy Ticket']"));
		buy_tkt.click();
		
		WebElement book_opt = driver.findElement(By.xpath("//input[@id='product_3186']"));
		boolean book_opt_status = book_opt.isSelected();
		
		if(book_opt_status==false) {
			book_opt.click();
		}
		
		driver.findElement(By.xpath("//input[@id='travname']")).sendKeys("Anu");
		driver.findElement(By.xpath("//input[@id='travlastname']")).sendKeys("Vijayalekshmi Sadhasivan");
		driver.findElement(By.xpath("//textarea[@name='order_comments']")).sendKeys("Ticket booking using automation");
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		
		WebElement dob_year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select year_options = new Select(dob_year);
		List<WebElement> years =  year_options.getOptions();
		
		for(WebElement year_ob:years) {
			String year = year_ob.getText();
			if(year.equals("1991")) {
				year_ob.click();
				break;
			}
		}
		

		WebElement dob_mnth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select month_options = new Select(dob_mnth);
		List<WebElement> months = month_options.getOptions();
		for(WebElement month_ob:months) {
			String month = month_ob.getText();
			
			if(month.equals("May")) {
				month_ob.click();
				break;
			}
		}

		List<WebElement> calendar_rows = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr"));
		int rows = calendar_rows.size();
		List<WebElement> calendar_col = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//thead//th"));
		int columns = calendar_col.size();
		
//		System.out.println(rows);
//		System.out.println(columns);
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=columns;j++) {
				WebElement date_opt = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr["+i+"]//td["+j+"]"));
				String date = date_opt.getText();
				if(date.equals("25")) {
					date_opt.click();
					break;
				}
			}
		}
		
		driver.findElement(By.xpath("//input[@id='sex_2']")).click();
		driver.findElement(By.xpath("//input[@id='traveltype_1']")).click();
		driver.findElement(By.xpath("//input[@id='fromcity']")).sendKeys("India");
		driver.findElement(By.xpath("//input[@id='tocity']")).sendKeys("London");
		driver.findElement(By.xpath("//input[@id='departon']")).click();
		
		WebElement dep_year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select dep_year_options = new Select(dep_year);
		List<WebElement> dep_years =  dep_year_options.getOptions();
		
		for(WebElement year_ob:dep_years) {
			String year = year_ob.getText();
			if(year.equals("2024")) {
				year_ob.click();
				break;
			}
		}
		WebElement dep_mnth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select dep_month_options = new Select(dep_mnth);
		List<WebElement> dep_months = dep_month_options.getOptions();
		
		for(WebElement month_ob:dep_months) {
			String month = month_ob.getText();
			
			if(month.equals("Jun")) {
				month_ob.click();
				break;
			}
		}

		List<WebElement> cal_rows = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr"));
		int depcal_rows = cal_rows.size();
		List<WebElement> cal_col = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//thead//th"));
		int depcal_columns = cal_col.size();
		
		for(int i=1;i<=depcal_rows;i++) {
			for(int j=1;j<=depcal_columns;j++) {
				WebElement date_opt = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr["+i+"]//td["+j+"]"));
				String date = date_opt.getText();
				if(date.equals("25")) {
					date_opt.click();
					break;
				}
			}
		}
		

		
		
		
		
		
		
//		driver.findElement(By.xpath("//input[@id='travname']")).sendKeys("Anu");
//		driver.findElement(By.xpath("//input[@id='travname']")).sendKeys("Anu");
//		driver.findElement(By.xpath("//input[@id='travname']")).sendKeys("Anu");
//		
	
		
	
	}

}
