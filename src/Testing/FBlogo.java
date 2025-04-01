package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBlogo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrom.driver", "./Resources/chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
	    driver.get("https://www.facebook.com/"); 
        boolean logo = driver.findElement(By.xpath("//*[@class='fb_logo _8ilh img']")).isDisplayed();
	    if (logo == true) { 
	    System.out.println("logo is available"); 
	    } else { 
	    System.out.println("logo is not available"); 
	    
	    
	    } 
	    } 
	    } 