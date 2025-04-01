package GBIT;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Forgotpass {

	public WebDriver driver;
    public WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
        driver = new ChromeDriver();
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
        
	    driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("formBasicEmail")).sendKeys("aparnamol");
		driver.findElement(By.xpath("//a[text()='Forgot Password?']")).click();
		System.out.println("After clicking on Forgot Password new page landed");
		driver.findElement(By.id("formBasicEmail")).sendKeys("aparnamol");
		driver.findElement(By.id("formBasicPassword")).sendKeys("Aparna001");
		driver.findElement(By.xpath("//a[text()='Change Password ']")).click();
		System.out.println("Password changed successfully");
    }
		
		@AfterMethod
		 public void tearDown() {		
		driver.close();

            }
		}    





