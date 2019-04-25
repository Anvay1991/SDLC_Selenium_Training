package lab3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab3_2_Link {
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

        //Link - 1.Find Element by Link Text
        WebElement linkText = driver.findElement(By.linkText("A/B Testing"));
		linkText.click();
		
		//Wait for page load
		Thread.sleep(3000);
				
		//Link - 2.Find Element by Partial Link Text
		WebElement partialLinkText = driver.findElement(By.partialLinkText("Elemental "));
		partialLinkText.click();
		
		//Wait for page load
		Thread.sleep(3000);
				
		//Close browser
        driver.close();
	}
}
