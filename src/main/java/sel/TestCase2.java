package sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase2 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	System.out.println("Testcase 2");
	WebDriver driver2 = new ChromeDriver();
	driver2.get("https://in.godaddy.com/");
	driver2.manage().window().maximize();
	System.out.println("Title: " + driver2.getTitle());
	System.out.println("URL: " + driver2.getCurrentUrl());
	driver2.close();
}
}
