package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
 public static void main(String[] args) throws Exception {
     System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe"); 
     WebDriver driver = new ChromeDriver(); 
     driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
     driver.manage().window().maximize();
     Thread.sleep(2000);
     WebElement W = driver.findElement(By.id("course"));
     Select courseName = new Select (W);
      List<WebElement> courseNameOptions = courseName.getOptions();
     for (WebElement Option : courseNameOptions) {
    	 System.out.println(Option.getText());
		
	}
      courseName.selectByValue("java");
     Thread.sleep(2000);
     courseName.selectByValue("net");
     Thread.sleep(2000);
     courseName.selectByValue("js");
     Thread.sleep(2000);
     driver.close();
 }
 
}
	