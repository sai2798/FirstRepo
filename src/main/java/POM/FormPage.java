package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FormPage {
WebDriver driver;
	public FormPage(WebDriver driver){
		this.driver= driver;
	}
	//Find the all webelements
	By country= By.id("country");
	By addrs= By.id("address");
	By mail= By.id("email");
	By phone= By.id("phone");
	By saveBtn= By.id("save");
	
	// Create Action Methods
	
	public void selectCountry (String name){
		Select select= new Select(driver.findElement(country));
		select.selectByVisibleText(name);
		
	}
	
	public void enterAdress (String adrs){
		driver.findElement(addrs).sendKeys(adrs);
	}
	public void enterEmail (String email){
		driver.findElement(mail).sendKeys(email);
	}
	public void enterNo (String phoneNo){
		driver.findElement(phone).sendKeys(phoneNo);
	}
	public void clickOnSave (){
		driver.findElement(saveBtn).click();
	}
	
}
