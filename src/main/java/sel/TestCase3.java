package sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	System.out.println("Testcase 3");
	WebDriver driver3 = new ChromeDriver();
	driver3.get("https://in.godaddy.com/");
	driver3.manage().window().maximize();
	String title = driver3.getTitle();
	System.out.println("Title: " + title);
	System.out.println("URL: " + driver3.getCurrentUrl());
	String source = driver3.getPageSource();
	System.out.println("Page Source: "+source);
	if (source.contains(title)) {
		System.out.println("Title is present in Page Source");
	} else
		System.out.println("Title is not present in Page Source");
	driver3.close();
}
}
