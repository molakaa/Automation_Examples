package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe"); 
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		driver.findElement(By.id("name")).sendKeys("Text1"); 
        System.out.println("Entered 'Text1' in the 'name' field.");
        
		driver.switchTo().frame("frm1");
        System.out.println("Switched to frame: frm1");
	    Thread.sleep(5000);

		Select courseName_dd = new Select(driver.findElement(By.id("course")));
		courseName_dd.selectByVisibleText("Java");
        System.out.println("Selected 'Java' from the course dropdown.");
	    Thread.sleep(5000);
	    
		driver.switchTo().defaultContent();
        System.out.println("Switched back to default content.");
		
		driver.switchTo().frame("frm2"); 
        System.out.println("Switched to frame: frm2");
        
		driver.findElement(By.id("firstName")).sendKeys("Naidu");
        System.out.println("Entered 'Naidu' in the 'firstName' field.");
	    Thread.sleep(5000);
	    
		driver.switchTo().defaultContent();
        System.out.println("Switched back to default content.");
        
		driver.switchTo().frame("frm1"); 
        System.out.println("Switched back to frame: frm1");
        
		courseName_dd.selectByVisibleText("Dot Net");
        System.out.println("Selected 'Dot Net' from the course dropdown.");
		Thread.sleep(5000);

		
		driver.switchTo().defaultContent();
        System.out.println("Switched back to default content.");

		driver.findElement(By.id("name")).clear();
        System.out.println("Cleared the 'name' field.");

		driver.findElement(By.id("name")).sendKeys("Text2");
        System.out.println("Entered 'Text2' in the 'name' field.");

		driver.close();

	}


	}


