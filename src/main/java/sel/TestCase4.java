package sel;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase4 {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	System.out.println("Testcase 4");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(3000);
	
	driver.manage().window().maximize();
	String amt = driver.getTitle();
	System.out.println("Title: " + amt);
	WebElement element = driver.findElement(By.linkText("Amazon Pay"));
	element.click();
	Thread.sleep(3000);
	
	String amt2 = driver.getTitle();
	System.out.println("Title: " + amt2);
	driver.navigate().back();
	if (amt.equalsIgnoreCase(driver.getTitle())) {
		System.out.println("We are on Right page");
	} else
		System.out.println("We are on Wrong Page");
	driver.close();
}
}
