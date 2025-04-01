package GBIT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Lease {

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
		System.out.println("Page url" + url);
		
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement propertiesSpan = driver.findElement(By.xpath("//span[@class='cbre-c-globalNav__link' and contains(text(), 'Properties')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(propertiesSpan).perform();
	    Thread.sleep(2000);
        
        WebElement D = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//div[@class='cbre-c-globalNavDropdown' and @aria-hidden='false']")));
        WebElement leaseMenu = driver.findElement(By.xpath("//a[@class='cbre-c-globalNavDropdown__link' and contains(text(), 'Properties for Lease')]"));
        leaseMenu.click();
        System.out.println("After clicking 'Lease Menu', the new page title is: " + driver.getTitle());      
        Thread.sleep(2000);
        
        driver.findElement(By.id("city-search")).clear();
        Thread.sleep(2000);
        
        driver.findElement(By.id("city-search")).sendKeys("Irving TX, USA");
        Thread.sleep(2000);
        
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        Thread.sleep(5000);
        
        WebElement W = driver.findElement(By.id("city-search"));
        String S = W.getAttribute("value");
        System.out.println("Entered text: " + S);
        
        driver.quit();
	    
	}

}
