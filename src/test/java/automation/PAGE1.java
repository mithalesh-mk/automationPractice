package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driver.DriverSetup;

public class PAGE1 {
	
	public static WebDriver driver;
	
	public void setupDriver() {
		driver = DriverSetup.getDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
	}
	
	public void setName(String username) {
		driver.findElement(By.id("user-name")).sendKeys(username);
	}
	
	public void setPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(By.id("login-button")).click();
	}

}
