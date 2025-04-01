package GBIT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Services {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe"); 
	     WebDriver driver = new ChromeDriver(); 
	     driver.get("https://www.cbre.com");
	     driver.manage().window().maximize();
	     Thread.sleep(2000);
	     
	     driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	     String title = driver.getTitle();
	     System.out.println("Page Title: " + title );
	     String url = driver.getCurrentUrl();
		 System.out.println("Page url" +url);
		 
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));	 
		 WebElement servicesMenu = driver.findElement(By.className("cbre-c-globalNav__link"));
		 Actions actions = new Actions(driver);
	     actions.moveToElement(servicesMenu).build().perform();
		 Thread.sleep(2000);	
		 
	     WebElement viewAllServicesLink = wait.until(ExpectedConditions.elementToBeClickable(
	     By.xpath("//a[@class='cbre-c-ctaLink' and text()='View All Services']")));
	     viewAllServicesLink.click();
	        
	     wait.until(ExpectedConditions.titleContains("Services"));
	     System.out.println("After clicking 'View All Services', the new page title is: " + driver.getTitle());
		 Thread.sleep(2000);

	     driver.findElement(By.cssSelector("a.cbre-c-gridCard__title-link[href='/services/plan-lease-and-occupy']")).click();
		 Thread.sleep(2000);
	     System.out.println("After clicking 'Plan, Lease & Occupy', the new page title is: " + driver.getTitle());
	        
	     driver.findElement(By.cssSelector("a.cbre-c-gridCard__title-link[href='/services/plan-lease-and-occupy/lease-administration']")).click();
	     System.out.println("After clicking 'lease Administration', the new page title is: " + driver.getTitle());
	     Thread.sleep(2000);
	     
		    
	     driver.findElement(By.cssSelector("a.cbre-c-ctaLink[href='/people/michelle-abramowitz']")).click();
		 Thread.sleep(2000);
		 String T = driver.getTitle();
		 System.out.println("Page Title: " + T );
		    
	     driver.quit(); 	

	}

}
