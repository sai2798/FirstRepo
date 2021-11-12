package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage (WebDriver driver){
		this.driver= driver;
	}
	
	//Find the all webelements
	
	By fullName= By.id("name");
	By pass= By.id("password");
	By login= By.id("login");
	
	//Create Action Methods
	
	public void enterName (String name){
		driver.findElement(fullName).sendKeys(name);
	}
	
	public void enterPass (String password){
		driver.findElement(pass).sendKeys(password);
	}
	
	public void clickLogin(){
		driver.findElement(login).click();
	}
}
