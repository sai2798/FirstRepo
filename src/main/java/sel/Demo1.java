package sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {
	WebDriver driver;
	public Demo1(WebDriver driver){
		this.driver=driver;
	}
public static void main(String[] args) {
	Demo1 demo=new Demo1(new ChromeDriver());
	WebDriverManager.chromedriver().setup();
	//WebDriver driver= new ChromeDriver();
	demo.driver.get("https://www.google.com");
	demo.driver.manage().window().maximize();
	String title=demo.driver.getTitle();
	System.out.println("Page Title: "+title+" Legnth of title: "+title.length());
	String url=demo.driver.getCurrentUrl();
	System.out.println("Page URL: "+url+" Legnth of title: "+title.length());
	if(url.contains("https://www.google.com"))
	{
		System.out.println("We are at correct page");
	}
	else
		System.out.println("We are not on correct page");
	
	String source=demo.driver.getPageSource();
	//System.out.println("Page Source: "+source+" and Legnth of title: "+source.length());
	
	
	
	
}
}
