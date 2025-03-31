package GBIT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TypesofP {

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
		 WebElement servicesMenu = driver.findElement(By.className("cbre-c-globalNav__link"));
		 Actions actions = new Actions(driver);
	     actions.moveToElement(servicesMenu).build().perform();
		 Thread.sleep(2000);
		 WebElement AllPropertyTypes = wait.until(ExpectedConditions.elementToBeClickable(
		 By.xpath("//a[@class='cbre-c-ctaLink' and @href='/services/property-types' and text()='See All Property Types']")));
         AllPropertyTypes.click();
         WebElement netLeaseLink = wait.until(ExpectedConditions.presenceOfElementLocated(
         By.xpath("//a[@href='/services/property-types/alternatives/net-lease' and text()='Net Lease']")));
         netLeaseLink.click();
         driver.close();
        
	}

}
