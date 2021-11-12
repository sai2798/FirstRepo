package sel;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase5 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		System.out.println("Testcase 5");
		WebDriver driver5 = new ChromeDriver();
		driver5.get("https://www.techlistic.com/");
		driver5.manage().window().maximize();

		WebElement element1 = driver5.findElement(By.linkText("JAVA"));
		element1.click();
		String title1=driver5.getTitle();
		System.out.println(title1);
		if(title1.equals("Techlistic"))
			System.out.println("Valid Page");
		driver5.navigate().back();
		Thread.sleep(3000);
		
		WebElement element2 = driver5.findElement(By.linkText("SELENIUM"));
		element2.click();
		String title2=driver5.getTitle();
		System.out.println(title2);
		if(title2.equals("Selenium Webdriver Tutorial - Techlistic"))
			System.out.println("Valid Page");
		driver5.navigate().back();
		Thread.sleep(3000);

		WebElement element3 = driver5.findElement(By.linkText("TESTNG"));
		element3.click();
		String title3=driver5.getTitle();
		System.out.println(title3);
		if(title3.equals("Selenium with TestNG Tutorial"))
			System.out.println("Valid Page");
		driver5.navigate().back();
		driver5.close();

	}
}