package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logo {
	public static void main(String[] args) { 
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe"); 
	     WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.google.co.in/"); 
		boolean logo = driver.findElement(By.xpath("//*[@id='hplogo']")) 
		.isDisplayed(); 
		if (logo == true) { 
		System.out.println("logo is available"); 
		} else { 
		System.out.println("logo is not available"); 
		} 
		driver.close();
		} 
		}

