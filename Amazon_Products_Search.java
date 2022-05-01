package selenium_amazonExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Products_Search {

	static WebDriver driver = null;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver();
		
		//starting browser
		driver.get("http://www.amazon.in/");
		//webDriver Elements Locators are
		//By.name,By.ID,By.class,By.LinkText,By.PartialLinkText,By.Xpath,By.CssSelector
		
		//clearing search field 
		 driver.findElements(By.id("twotabsearchtextbox")).clear();
		 
		 //searching for apple phones 
		 driver.findElements(By.id("twotabsearchtextbox")).sendKeys("Apple Phones");
		 
		 // clicking search button
		 driver.findElements(By.id("nav-search-submit-button")).click();
		 
		 //waiting some time 
		 Thread.sleep(3000);
		 
		 driver.findElements(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/div[2]/div/div/div[1]/h2/a/span"));
		 
		 //closing browser
		 driver.close();
		 
		 
		//gettext
		 //send keys
		 //click
		
		

	}

}
