import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationPractice {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=order");
		//driver.manage().window().maximize();
		
	}

	@Test
	public void verifyLogo() {
		WebElement logo=driver.findElement(By.xpath("//img[@class='logo img-responsive']"));
		Assert.assertTrue(logo.isDisplayed());
	}
	@Test
	public void verifyElements(){
		WebElement search=driver.findElement(By.id("search_query_top"));
		System.out.println("The Search field is displayed:(True/Falls):=  "+search.isDisplayed());
		WebElement contactUs=driver.findElement(By.xpath("//a[@title='Contact Us']"));
		System.out.println("The ContactUs button is displayed:(True/Falls):=  "+contactUs.isDisplayed());
		WebElement signIn=driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
		System.out.println("The Sign In button is displayed:(True/Falls):=  "+signIn.isDisplayed());
	}
	@Test
	public void addToCart() throws InterruptedException{
		WebElement dress=driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
		dress.click();
		WebElement prod=driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
		WebElement addToCart=driver.findElement(By.xpath("(//span[text()='Add to cart'])[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(prod).moveToElement(addToCart).click().build().perform();
		//WebElement msg=driver.findElement(By.xpath("//div[@class='layer_cart_product col-xs-12 col-md-6']//child::h2"));
		Thread.sleep(5000);
		WebElement msg=driver.findElement(By.xpath("(//h2)[1]"));
		String expMsg="Product successfully added to your shopping cart";
		String actMsg=msg.getText();
		System.out.println("Actual Msg: "+msg.getText());
		Assert.assertEquals(actMsg, expMsg);
	}
	@Test
	public void removeFromCart() throws InterruptedException{
		WebElement proceedToCheckout=driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		Thread.sleep(5000);
		proceedToCheckout.click();
		//remove from cart by clicking on minus
		driver.findElement(By.xpath("//i[@class='icon-minus']")).click();
		Thread.sleep(3000);
		WebElement msg=driver.findElement(By.xpath("//p[text()='Your shopping cart is empty.']"));
		String actMsg=msg.getText();
		String expMsg="Your shopping cart is empty.";
		System.out.println("Actual Msg: "+actMsg);
		Assert.assertEquals(actMsg, expMsg);
	}
	

}
