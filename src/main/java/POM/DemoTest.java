package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://example.testproject.io/web/index.html");
		
		// create object of LoginPage and FormPage to access WebElements
		
		LoginPage login= new LoginPage(driver);
		FormPage form= new FormPage (driver);
		
		login.enterName("Rex Jones II");
		login.enterPass("12345");
		login.clickLogin();
		
		Thread.sleep(3000);
		
		form.selectCountry("United States");
		form.enterAdress("1234 TestProject");
		form.enterEmail("Rex.Jones@Test4Success.com");
		form.enterNo("214-225-1234");
		form.clickOnSave();
		System.out.println("Login successful and Form Submision Successful");
		System.out.println("Save Button Displayed: "+driver.findElement(form.saveBtn).isDisplayed());
		
	}

}
