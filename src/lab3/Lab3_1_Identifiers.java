package lab3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab3_1_Identifiers {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//To set Chrome Driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnvayPradhan\\Documents\\workspace\\SeleniumClass\\SDLC\\lib\\chromedriver.exe");
		
		//Create new instance of the Chrome Driver 
		WebDriver driver = new ChromeDriver();
		
		//Launch a new browser session and directs it to the URL
		driver.get("http://the-internet.herokuapp.com/");
		
		//Wait for page load
        Thread.sleep(2000);  

		//Instantiate Form Authentication web element
        WebElement formAuthentication = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[18]/a"));
        formAuthentication.click();
        
        //Identifiers - 1. Find Element by id 
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("abcd1");
        
        //Wait for page load
        Thread.sleep(3000); 
        
        //Identifiers - 2.Find Element by name
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("abc123");
		
		//Wait for page load
        Thread.sleep(3000);
        
        //Close browser
        driver.close();
	}

}
