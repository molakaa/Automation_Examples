package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe"); 
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@class='//button[@class=''] _42ft _4jy0 _4jy1 _4jy6 _51sy _6lth selected']"));
		Thread.sleep(3000);

	}
	

}

