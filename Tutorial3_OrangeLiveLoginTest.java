package selenium_amazonExamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial3_OrangeLiveLoginTest {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		/*driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.name("Submit")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
				
		driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a")).click();
		
		Thread.sleep(3000);
		
		
		driver.close();*/
		
		
		
		
		

	}

}
