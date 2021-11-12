package sel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;*/
import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartTask {
	public static void main(String[] args) throws InterruptedException {
		//Verify the no. of category product it should be 9
		/*int expectCatNo=9;
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List <WebElement> list=driver.findElements(By.xpath("//div[@class='eFQ30H']"));
		System.out.println("Expected product category no. is: "+expectCatNo);
		System.out.println("Actual product category no. is: "+list.size());
		if(list.size()==expectCatNo){
			System.out.println("All product category are present");
		}
		else{
			System.out.println("Expected category no. is: "+expectCatNo+" and Actual Category no. is: "+list.size());
		}*/
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement cross=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		cross.click();
		WebElement fur= driver.findElement(By.xpath("//div[text()='Furniture']"));
		fur.click();
		WebElement hf=driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		Thread.sleep(3000);
		Actions act= new Actions(driver);
		act.moveToElement(hf).build().perform();
		WebElement pt=driver.findElement(By.xpath("//a[text()='Paintings']"));
		act.moveToElement(pt).click().build().perform();
		String expTitle="Furniture Big Diwali Sale Store Online - Buy Furniture Big Diwali Sale Online at Best Price in India | Flipkart.com";
		System.out.println("Expected title: "+expTitle);
		String actTitle=driver.getTitle();
		System.out.println("Actual Title: "+actTitle);
		if(expTitle.equals(actTitle))
			System.out.println("Title Verified");
		
	
		
		
		
		
		
		
		
	}

}
