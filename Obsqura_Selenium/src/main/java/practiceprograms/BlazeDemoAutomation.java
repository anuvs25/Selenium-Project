package practiceprograms;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BlazeDemoAutomation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();


		WebElement depature_drp_dwn = driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select dep_cities = new Select(depature_drp_dwn);
		//dep_cities.selectByVisibleText("Portland");
		dep_cities.selectByIndex(1);

		WebElement destination_drp_dwn = driver.findElement(By.xpath("//select[@name='toPort']"));
		Select dest_cities = new Select(destination_drp_dwn);

		List<WebElement> cities = dest_cities.getOptions();

		for (WebElement city_ob : cities) {
			String sel_city = city_ob.getText();
			String city_to_sel = "Rome";

			if (sel_city.equals(city_to_sel)) {
				city_ob.click();
			}
		}

		WebElement find_flight_btn = driver.findElement(By.xpath("//input[@value='Find Flights']"));
		find_flight_btn.click();

		/* Selecting cheapest flight */

		// Find rows
		int rows = driver.findElements(By.xpath("//table[@class='table']//tbody//tr")).size();

		String fare_list[] = new String[rows];

		for (int r = 1; r <= rows; r++) {
			String flight_fare = driver.findElement(By.xpath("//table[@class='table']//tr[" + r + "]//td[6]")).getText();
			fare_list[r - 1] = flight_fare;
			// System.out.println(fare_list[r-1]);
		}
		Arrays.sort(fare_list);
		String lowest_price = fare_list[0];
		// System.out.println(lowest_price);

		for (int r = 1; r <= rows; r++) {
			String flight_fare = driver.findElement(By.xpath("//table[@class='table']//tr[" + r + "]//td[6]")).getText();
			if (flight_fare.equals(lowest_price)) {
				driver.findElement(By.xpath("//table[@class=\"table\"]//tr[" + r + "]//td[1]")).click();
				break;
			}
		}
		
		// Flight Purchase
		WebElement pass_name = driver.findElement(By.xpath("//input[@id='inputName']"));
		WebElement pass_address= driver.findElement(By.xpath("//input[@id='address']"));
		WebElement pass_city = driver.findElement(By.xpath("//input[@id='city']"));
		WebElement pass_state = driver.findElement(By.xpath("//input[@id='state']"));
		WebElement pass_zipcode = driver.findElement(By.xpath("//input[@id='zipCode']"));
		WebElement pass_card = driver.findElement(By.xpath("//select[@id='cardType']"));
		WebElement pass_card_no = driver.findElement(By.xpath("//input[@id='creditCardNumber']"));
		WebElement pass_card_mnth = driver.findElement(By.xpath("//input[@id='creditCardMonth']"));
		WebElement pass_card_year = driver.findElement(By.xpath("//input[@id='creditCardYear']"));
		WebElement pass_nameon_card = driver.findElement(By.xpath("//input[@id='nameOnCard']"));
		
		pass_name.sendKeys("Anu");
		pass_address.sendKeys("Trivandrum");
		pass_city.sendKeys("Trivandrum");
		pass_state.sendKeys("Kerala");
		pass_zipcode.sendKeys("695032");
		Select card_drp = new Select(pass_card);
		card_drp.selectByIndex(2);
		pass_card_no.sendKeys("1234875962402359");
		pass_card_mnth.sendKeys("10");
		pass_card_year.sendKeys("2030");
		pass_nameon_card.sendKeys("ANU V S");
		
		driver.findElement(By.xpath("//input[@name='rememberMe']")).click();
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		System.out.println(driver.findElement(By.xpath("//h1[text()='Thank you for your purchase today!']")).getText());
		

	}

}
