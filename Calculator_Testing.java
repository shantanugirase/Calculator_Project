package selenium_amazonExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calculator_Testing {

public static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.calculator.net/");
		Thread.sleep(3000);
		
		                //Addition of 400+23
		//click on 4 button
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
		//click on 0 button
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
		//click on 0 button
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
		// click on + button
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[4]")).click();
		//click on 2 button
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
		//click on 3 button
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
		//click on = button
		 driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();
		    Thread.sleep(3000);
		    //click on AC button
		    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[3]")).click();
		    Thread.sleep(3000);
		    
		    	           //Multiplication of 423*525
		      //click on 4 button
		    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
		    //click on 2 button
		    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
		     //click on 3 button
		    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
		    //click on * button
		    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[4]")).click();
		    //click on 5 button
		    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();
		     //click on 2 button
		    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
		     //click on 5 button
		    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();
		    //click on = button
		    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();
		    Thread.sleep(3000);
		    //click on AC button
		    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[3]")).click();
		    Thread.sleep(3000);
		    
		                 //division of 4000/200
		    //click on 4 button
		    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
		   //click on 0 button
		    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
		   //click on 0 button
		    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
		   //click on 0 button
		    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
		    //click on / button
		    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[4]")).click();
		  //click on 2 button
		    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
		   //click on 0 button
		    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
		   //click on 0 button
		    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
		    //click on = button
		    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();
		    Thread.sleep(3000);
		   //click on AC button
		    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[3]")).click();
		    Thread.sleep(3000);
		    
		                    //Addition of (-234234)+(345345)
		  //click on - button
		    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[4]")).click();
		   //click on 2 button
		    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
		   //click on 3 button
		    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click(); 
		   //click on 4 button
		    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
		    //click on 2 button
		    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
		   //click on 3 button
		    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
		   //click on 4 button
		    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
		    //click on + button
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[4]")).click();
			//click on 3 button
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
			//click on 4 button
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
			//click on 5 button
		    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();
		    //click on 3 button
		  	driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
		    //click on 4 button
		  	driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
		  	//click on 5 button
		  	driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();
		   //click on = button
		    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();
		    Thread.sleep(3000);
		   //click on AC button
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[3]")).click();
			Thread.sleep(3000);
			
			//Substraction of 234823- (-23094823)
			//click on 2 button
		    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
		  //click on 3 button
		  	driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
		  //click on 4 button
		  	driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
		  	//click on 8 button
		  	driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[2]")).click();
		  //click on 2 button
		    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
		  //click on 3 button
		  	driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
		  //click on - button
		  	driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[4]")).click();
		  	//click on ( button 
		  	driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[1]/div/div[5]/span[1]")).click();
		  //click on - button
		  	driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[4]")).click();
		  	//click on 2 button 
		  	driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
		   //click on 3 button
		  	driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
		   //click on 0 button
		    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
		    //click on 9 button
		    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[3]")).click();
			  //click on 4 button
			  	driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
			  	//click on 8 button 
			  	driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[2]")).click();
			  //click on 2 button 
			  	driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
			   //click on 3 button
			  	driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
			  	//click on ) button
			  	driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[1]/div/div[5]/span[2]")).click();
			  //click on = button
			    driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();
			    Thread.sleep(3000);
			   //click on AC button
				driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[3]")).click();
				Thread.sleep(3000);
				
				driver.close();
	}
}
