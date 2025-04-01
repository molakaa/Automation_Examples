package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestingNG {
	WebDriver driver;

    @BeforeMethod
    public void setUp() {
    	System.setProperty("webdriver.chrome.driver", "RESOURCES/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testDropdown() {
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        WebElement W = driver.findElement(By.id("course"));
        Select courseName = new Select (W);
         List<WebElement> courseNameOptions = courseName.getOptions();
        for (WebElement Option : courseNameOptions) {
       	 System.out.println(Option.getText());
   		
   	}
         courseName.selectByValue("java");
        courseName.selectByValue("net");
        courseName.selectByValue("js");
        System.out.println("Dropdown test executed");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    
	}

}
