package lab3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab3_4_ClassName {

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
        
        //Instantiate Forgot Password web element
        WebElement forgotPassword = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[17]/a"));
        forgotPassword.click();
        
        //Wait for page load
        Thread.sleep(2000); 
        
        //Find Element by TagName
        WebElement email = driver.findElement(By.tagName("input"));
        email.sendKeys("abc@abc.com");
        
        //Wait for page load
        Thread.sleep(2000);
		
        //Find element using Class Name
        WebElement retrievePassword = driver.findElement(By.className("radius"));
        retrievePassword.click();
        
        //Wait for page load
        Thread.sleep(2000);
        
        //Close browser
        driver.close();

	}

}
