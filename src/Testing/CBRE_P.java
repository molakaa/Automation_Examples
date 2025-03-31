package Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CBRE_P {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe"); 
		 WebDriver driver = new ChromeDriver(); 
	     driver.get("https://www.cbre.com/");
	     driver.manage().window().maximize();
	     Thread.sleep(2000);

         driver.findElement(By.id("onetrust-accept-btn-handler")).click();

	     String title = driver.getTitle();
	     System.out.println("Page Title: " + title );
	     String url = driver.getCurrentUrl();
		 System.out.println("Page url" +url);
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        
	        // Locate the "Properties" menu item
	        WebElement propertiesMenu = driver.findElement(By.xpath("//span[@class='cbre-c-globalNav__link' and text()='Properties']"));
	        Actions actions = new Actions(driver);
	        actions.moveToElement(propertiesMenu).build().perform();
	        Thread.sleep(2000);

	        // Click on "Properties for Lease" link in the dropdown
	        WebElement propertiesForLeaseLink = wait.until(ExpectedConditions.elementToBeClickable(
	            By.xpath("//a[@class='cbre-c-globalNavDropdown__link' and text()='Properties for Lease']")));
	        propertiesForLeaseLink.click();

	        // Wait for the new page to load and verify title
	        wait.until(ExpectedConditions.urlContains("properties-for-lease"));
	        System.out.println("After clicking 'Properties for Lease', the new page title is: " + driver.getTitle());
	        Thread.sleep(2000);

	        // Close the browser
	        driver.quit();
	    }
	}