package fileuploading;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadsSample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\ObsquraSelenium\\LocalDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		
		WebElement choose_filebtn = driver.findElement(By.xpath("//input[@id='file-upload']"));
		String file_location = "D:\\EmployeeDetails.xlsx";
		//choose_filebtn.sendKeys(file_location);
		
//		Using file method
		File file_det = new File(file_location);
		choose_filebtn.sendKeys(file_det.getAbsolutePath());
		
//		File file= new File(location);
//		choose_file.sendKeys(file.getAbsolutePath());
		
		WebElement upload_btn = driver.findElement(By.xpath("//input[@id='file-submit']"));
		upload_btn.click();
		
		WebElement upload_mssg = driver.findElement(By.xpath("//h3[text()='File Uploaded!']"));
		System.out.println(upload_mssg.getText());
		
		
	}

}
