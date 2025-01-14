package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HYR {
 public static void main(String[] args) throws Exception {
	 System.setProperty("Webdriver.chrome.driver", "./Resources/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
	 driver.manage().deleteAllCookies();
	 driver.manage().window().maximize();
	 String title = driver.getTitle();
	 System.out.println("Title"+title);
	 String url = driver.getCurrentUrl();
	 System.out.println("url"+url);
	 WebElement W = driver.findElement(By.name("fName"));
	 W.sendKeys("Aparna");
	 WebElement W1 = driver.findElement(By.id("lastName"));
	 W1.sendKeys("Molaka");
	 WebElement W2 = driver.findElement(By.id("femalerb"));
	 W2.click();
	 WebElement W3 = driver.findElement(By.id("englishchbx"));
	 W3.click();
	 WebElement W4 = driver.findElement(By.id("chinesechbx"));
	 W4.click();
	 WebElement W5 = driver.findElement(By.id("email"));
	 W5.sendKeys("molaka@gmail.com");
	 WebElement W6 = driver.findElement(By.id("password"));
	 W6.sendKeys("Naidu2");
	 Thread.sleep(3000);
	 
	  driver.findElement(By.id("registerbtn")).click();
	 System.out.println(driver.findElement(By.id("msg")).getText());
	 WebElement W7 = driver.findElement(By.partialLinkText("home page"));
	 W7.click();
	 Thread.sleep(3000);
     driver.close();
	 
	 
}
}