package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase6 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		System.out.println("Testcase 6");
		WebDriver driver6 = new ChromeDriver();
		driver6.get("https://www.amazon.in/");
		driver6.manage().window().maximize();
		String title1=driver6.getTitle();
		System.out.println("Main Page Title: "+title1);
		
		WebElement element = driver6.findElement(By.linkText("Amazon Pay"));
		element.click();
		Thread.sleep(3000);
		String title2 = driver6.getTitle();
		System.out.println("Title: "+title2);
		if (title2.equals("Amazon Pay")) {
			System.out.println("Page Title is Verified");
		}
		driver6.navigate().back();
		Thread.sleep(3000);
		
		WebElement element1 = driver6.findElement(By.linkText("Mobiles"));
		element1.click();
		Thread.sleep(3000);
		String title3 = driver6.getTitle();
		System.out.println("Title: "+title3);
		if (title3.equals("Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in")) {
			System.out.println("Page Title is Verified");
		}
		driver6.navigate().back();
		Thread.sleep(3000);
		
		
		WebElement element3 = driver6.findElement(By.linkText("Home & Kitchen"));
		element3.click();
		Thread.sleep(3000);
		String title4 = driver6.getTitle();
		System.out.println("Title: "+title4);
		if (title4.equals("Home Store: Buy Home & Kitchen products online at best prices in India - Amazon.in")) {
			System.out.println("Page Title is Verified");
		}
		driver6.navigate().back();
		
		driver6.close();
		
		
	}

}
