package testngpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sectestcase {
	@Test
 public void methodname() {
	 System.setProperty("webdriver.chrome.driver", "D:\\New folder\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		driver.findElement(By.id("Form_submitRequest_FirstName")).sendKeys("Geoffrin");
		driver.close();
 }
}
