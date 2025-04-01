package GBIT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SaveProp {

	public WebDriver driver;
    public WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }

    @Test
    public void testSignUp() throws InterruptedException {
        driver.get("http://134.33.193.148/");
        Thread.sleep(2000);

        String title = driver.getTitle();
        System.out.println("Page Title: " + title);
        String url = driver.getCurrentUrl();
        System.out.println("Page url is : " + url);
	     
	     System.out.println("Page url is : " + url);
	     driver.findElement(By.linkText("Login")).click();
		 driver.findElement(By.id("formBasicEmail")).sendKeys("aparnamol");
		 driver.findElement(By.id("formBasicPassword")).sendKeys("aparna123");
		 driver.findElement(By.xpath("//a[@class='sc-bdvvtL cJEFiR' and contains(text(), 'Login ')]"));
		 System.out.println("Logined  successfully");
		 driver.navigate().to("http://134.33.193.148/dashboard");
		 String T = driver.getTitle();
	     System.out.println("After login Page Title is : " + T );
	     String U = driver.getCurrentUrl();
		 System.out.println("Page url is :" + U);
		 driver.findElement(By.xpath("//a[@class='sc-iAKWXU hwzKVo' and contains(text(), ' Save Properties')]")).click();

	}

}
