package GBIT;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SingUp {

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

        // Print page title and URL
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);
        String url = driver.getCurrentUrl();
        System.out.println("Page url is : " + url);
        
        driver.findElement(By.linkText("Sign Up")).click();

        // Fill registration form
        driver.findElement(By.name("userName")).sendKeys("Aparnam");
        driver.findElement(By.name("password")).sendKeys("Aparna123");
        driver.findElement(By.name("firstName")).sendKeys("Aparna");
        driver.findElement(By.name("lastName")).sendKeys("Molaka");
        driver.findElement(By.name("emailId")).sendKeys("molaka.saiaparna96@gmail.com");

        WebElement genderElement = driver.findElement(By.name("gender"));
        Select gender = new Select(genderElement);
        List<WebElement> genderOptions = gender.getOptions();
        for (WebElement option : genderOptions) {
            System.out.println(option.getText());
        }
        gender.selectByValue("Female");

        // Fill additional fields
        driver.findElement(By.name("mobileNumber")).sendKeys("+14808050511");
        driver.findElement(By.name("zipcode")).sendKeys("75063");
        
        WebElement userTypeElement = driver.findElement(By.name("typeOfUser"));
        Select typeOfUser = new Select(userTypeElement);
        List<WebElement> userOptions = typeOfUser.getOptions();
        for (WebElement option : userOptions) {
            System.out.println(option.getText());
        }
        typeOfUser.selectByValue("CUSTOMER");

        // Click Create User button using JavaScript
        WebElement createUserButton = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//a[text()='Create User ']")));
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", createUserButton);
        js.executeScript("arguments[0].click();", createUserButton);

        System.out.println("Signed Up successfully");
    }
        
        @AfterMethod
        public void tearDown() {
            if (driver != null) {
        
        driver.close();
        
    }
	

}}
