package Testing;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshorts {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		// File
		driver.findElement(By.name("q")).sendKeys("Image 1");
		File sourceFile = driver.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./ScreenShot/Googlimg1.jpg");
		FileUtils.copyFile(sourceFile, destFile);
		System.out.println("Screenshot saved successfully");
		
		//Bytes
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("Image 2");
		byte[] byteArr = driver.getScreenshotAs(OutputType.BYTES);
	    destFile = new File("./ScreenShot/Gooleimg2.jpg");
		FileOutputStream fos = new FileOutputStream(destFile);
		fos.write(byteArr);
		fos.close();
		System.out.println("Screenshot saved successfully");

		//Base64
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("Image 3");
		String base64code = driver.getScreenshotAs(OutputType.BASE64);
		byte[] Base64byteArr = Base64.getDecoder().decode(base64code);
		destFile = new File("./ScreenShot/Gooleimg3.jpg");
		fos = new FileOutputStream(destFile);
		fos.write(Base64byteArr);
		fos.close();
		System.out.println("Screenshot saved successfully");
        driver.quit();

	}
	}
