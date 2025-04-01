package GBIT;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class RAPP_Login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe"); 
	     WebDriver driver = new ChromeDriver(); 
	     driver.get("http://134.33.193.148/");
	     driver.manage().window().maximize();
	     Thread.sleep(2000);
	     
	     String title = driver.getTitle();
	     System.out.println("Page Title: " + title );
	     String url = driver.getCurrentUrl();
		 System.out.println("Page url is : " + url);
		 
	     driver.findElement(By.linkText("Sign Up")).click();

	     driver.findElement(By.name("userName")).sendKeys("Aparnam");
	     driver.findElement(By.name("password")).sendKeys("Aparna123");
	     driver.findElement(By.name("firstName")).sendKeys("Aparna");
	     driver.findElement(By.name("lastName")).sendKeys("Molaka");
	     driver.findElement(By.name("emailId")).sendKeys("molaka.saiaparna96@gmail.com");
	     
	     WebElement W = driver.findElement(By.name("gender"));	     
	     Select gender = new Select (W);
	     List<WebElement> genderOptions = gender.getOptions();
	     for (WebElement Option : genderOptions) {
	     System.out.println(Option.getText());
	     gender.selectByValue("Female"); 	     
	     }
	     
	     driver.findElement(By.name("mobileNumber")).sendKeys("+14808050511");
	     driver.findElement(By.name("zipcode")).sendKeys("75063"); 
	     
	     WebElement UTypes = driver.findElement(By.name("typeOfUser"));
	     Select typeOfUser = new Select (UTypes);
	     List<WebElement> UserOptions = typeOfUser.getOptions();
	     for (WebElement Options : UserOptions) {
	     System.out.println(Options.getText());
	     typeOfUser.selectByValue("CUSTOMER"); 
	     }
	     
	     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));         
         WebElement createUserButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Create User ']")));
         
         JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("arguments[0].scrollIntoView(true);", createUserButton);
         
         js.executeScript("arguments[0].click();", createUserButton);
		 System.out.println("Singed Up  successfully");   	    

		 driver.close();
	     }
	     
	}

