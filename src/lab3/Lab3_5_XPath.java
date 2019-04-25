package lab3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab3_5_XPath {

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
		
        //Instantiate Dynamic Controls web element and find element By XPath - Absolute XPath
        WebElement dynamicControls = driver.findElement(By.xpath("//div[@id='content']/ul/li[11]/a"));
        dynamicControls.click();
      
		//Find Element By XPath - Relative XPath 
        WebElement checkbox = driver.findElement(By.xpath("//div[@id='checkbox']"));
        checkbox.click();
        
        //Wait for page load
        Thread.sleep(3000); 
        
        WebElement clickRemove = driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']"));
        clickRemove.click();
        
        //Wait for page load
        Thread.sleep(3000);       

        //Close browser
        driver.close();

	}

}
