package seleniumPractice;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class HandsOnSesion {
	static WebDriver driver;
	public HandsOnSesion(WebDriver driver){
		this.driver=driver;
	}
	public void initBrowsr(String brows){
		if(brows.equalsIgnoreCase("chrome")){
		driver= new ChromeDriver();
		}
		else
			driver= new FirefoxDriver();
	}
	public void countLinks(){
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("No. of links on Flipkart Home Page is: "+list.size());
	}
	public void print(){
		List<WebElement> list = driver.findElements(By.tagName("a"));
		for(WebElement ele:list){
			System.out.println("Link Text: "+ele.getText());
			System.out.println("Link URL: "+ele.getAttribute("href"));
		}
	}
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	HandsOnSesion hd= new HandsOnSesion(driver);
	hd.initBrowsr("chrome");
	driver.get("https://www.flipkart.com/");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	hd.countLinks();
	hd.print();
}
}
