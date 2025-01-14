package Testing;

import java.io.Closeable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto {
    public static void main(String[] args) throws Exception { 
        System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe"); 
        WebDriver driver = new ChromeDriver(); 
        Thread.sleep(2000); 
        driver.get("https://www.google.com/"); 
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize(); 
        String title = driver.getTitle(); 
        System.out.println("Title--"+title);
        String url = driver.getCurrentUrl(); 
        System.out.println("URL--"+url);
        Thread.sleep(2000);
        WebElement D = driver.findElement(By.name("q"));
        D.sendKeys("Happyface");
        driver.findElement(By.name("q")).submit();
        Thread.sleep(3000);
        driver.navigate().to("https://www.facebook.com/");        
        String title1 = driver.getTitle(); 
        System.out.println("Title--"+title1);
        String url1 = driver.getCurrentUrl(); 
        System.out.println("URL--"+url1);
        Thread.sleep(2000);
        driver.navigate().back(); 
        Thread.sleep(2000); 
        driver.navigate().forward(); 
        Thread.sleep(2000);
        driver.navigate().refresh(); 
        driver.get("https://www.facebook.com/");        
        WebElement W = driver.findElement(By.name("email"));
        W.sendKeys("Aparna"); 
        String A = driver.findElement(By.name("email")).getAttribute("value");
        System.out.println("Usename--"+A);
        Thread.sleep(3000);
        WebElement W1 = driver.findElement(By.id("pass"));
        W1.sendKeys("Naidu1");
        String A1 = driver.findElement(By.id("pass")).getAttribute("value");
        System.out.println("password--"+A1);
        Thread.sleep(3000);
//        boolean logo = driver.findElement(By.xpath("//*[@id='email']")) 
//                .isEnabled(); 
//                if (logo == true) { 
//                System.out.println("Text box is enable to print"); 
//                } else { 
//                System.out.println("not enable"); 
//        WebElement W2 = driver.findElement(By.id("u_0_4_4Y"));
//        W2.click();
//        Thread.sleep(3000);
        WebElement W3 = driver.findElement(By.name("login"));
        W3.click();
        Thread.sleep(11000);
        WebElement W4 = driver.findElement(By.linkText("Forgot password?"));
        W4.click();
        Thread.sleep(3000);
        driver.close();       
      
    }
}
    
