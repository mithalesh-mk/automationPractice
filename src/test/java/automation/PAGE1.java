package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driver.DriverSetup;

public class PAGE1 {
	
	public static WebDriver driver;
	
	public static void setupDriver() {
		driver = DriverSetup.getDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	public static void setName(String username) {
		driver.findElement(By.id("user-name")).sendKeys(username);
	}
	
	public static void setPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	public static void clickLogin() {
		driver.findElement(By.id("login-button")).click();
	}
	
	public static void main(String[] args) {
		setupDriver();
		setName("standard_user");
		setPassword("secret_sauce");
		clickLogin();
		
	}

}
