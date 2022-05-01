package selenium_amazonExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial2 {

	static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		

		
		
		
		
		driver.get("http://www.amazon.in/");
		
		String expsearch = "Samsung Mobiles";
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.clear();
		search.sendKeys(expsearch);
		System.out.println(expsearch);
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(3000);
		
		String actsearch = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
		System.out.println(actsearch);
		
		if(expsearch.equalsIgnoreCase(actsearch)) {
			System.out.println("Search step verified");
		}else
		{
			System.out.println("step failed");
		}
		
		Thread.sleep(3000);
		
		driver.close();
		

	}

}
