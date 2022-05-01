package selenium_amazonExamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial4_Facebook {

	static WebDriver driver;
	static String [][] user_Login_data = {{"tester1","admin1"},{"qatrainer","admin123"},{"tester3","admin3"}};
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		int user_Login_data_count = user_Login_data.length;
		System.out.println(user_Login_data_count);
		
		File file = new File("./TestData/Login.properties");
		try {
			FileInputStream fis = new FileInputStream(file);
			Properties prop = new Properties();
			prop.load(fis);
			
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//starting browser
		driver.get(prop.getProperty("url"));
		
		//insert username
		driver.findElement(By.name(prop.getProperty("userElement"))).sendKeys(prop.getProperty("username"));
		
		//insert password
		driver.findElement(By.name(prop.getProperty("passwordElement"))).sendKeys(prop.getProperty("password"));
		
		//click login
		driver.findElement(By.name(prop.getProperty("LoginButtonElement"))).click();
		
		try {
			
			String user_message = driver.findElement(By.id("right_col_top_err")).getText();
			System.out.println(user_message);
			
		}catch(NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		
		//waiting
		Thread.sleep(3000);
		
		try {
			//click signout
			driver.findElement(By.xpath("//*[@id=\"user_bar\"]/ul/li[1]/a")).click();
			System.out.println("Login Success");
			
		}catch(NoSuchElementException ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println("======================");
		
		
		
		//close browser
		driver.close();

	  } catch (FileNotFoundException e1) {
		
		e1.printStackTrace();	
		
	  }
		
		
	}

}
