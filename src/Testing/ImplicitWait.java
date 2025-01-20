package Testing;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrom.driver", "./Resources/chromedriver.exe");
    WebDriver driver = new ChromeDriver(); 
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
    driver.manage().window().maximize();
    driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
    driver.findElement(By.id("btn1")).click();
    driver.findElement(By.id("txt1")).sendKeys("Naidu");
    TakesScreenshot Screen = (TakesScreenshot) driver;
	File sourceFile = Screen.getScreenshotAs(OutputType.FILE);
	File destFile = new File("./ScreenShot/Textimg1.jpg");
	FileUtils.copyFile(sourceFile, destFile);
	System.out.println("Screenshot saved successfully");

    driver.close();
}
}