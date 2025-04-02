package GBIT;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class REPMS {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe"); 
	     WebDriver driver = new ChromeDriver(); 
	     driver.get("http://134.33.193.148/");
	     driver.manage().window().maximize();
	     Thread.sleep(1000);
	     String title = driver.getTitle();
	     System.out.println("Page Title: " + title );
	     String url = driver.getCurrentUrl();
		 System.out.println("Page url is : " + url);
	     driver.findElement(By.linkText("Login")).click();
		 driver.findElement(By.id("formBasicEmail")).sendKeys("aparnamol");
		 driver.findElement(By.id("formBasicPassword")).sendKeys("aparna123");
		 driver.findElement(By.xpath("//a[@class='sc-bdvvtL cJEFiR' and contains(text(), 'Login ')]")).click();
		 System.out.println("Logined  successfully");
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		 WebElement otpField = wait.until(ExpectedConditions.elementToBeClickable(
	           By.xpath("//input[@placeholder='4-digit OTP']")));
		 otpField.sendKeys("1234");
		 driver.findElement(By.xpath(" //a[@class='sc-bdvvtL cJEFiR' and contains(text(), 'Submit ')]")).click();
		 String T = driver.getTitle();
	     System.out.println("After login Page Title is : " + T );
	     String U = driver.getCurrentUrl();
		 System.out.println("Page url is :" + U);
		 WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(5));
         WebElement saveProperties = Wait.until(
         ExpectedConditions.elementToBeClickable(By.linkText("Save Properties")));
         saveProperties.click();  
		 Thread.sleep(1000);
		 driver.navigate().back();		 
		 Thread.sleep(1000);
		 WebElement ViewdsaveProperties = Wait.until(
	     ExpectedConditions.elementToBeClickable(By.linkText("View Saved Properties")));
		 ViewdsaveProperties.click();
		 Thread.sleep(1000);
		 driver.close();
	}

}
