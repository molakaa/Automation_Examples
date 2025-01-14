package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multydrop {
	public static void main(String[] args) throws Exception {
	     System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe"); 
	     WebDriver driver = new ChromeDriver(); 
	     driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	     driver.manage().window().maximize();
	     Thread.sleep(2000);
	     WebElement W = driver.findElement(By.id("ide"));
	     Select ideDrop = new Select(W);
	      List<WebElement> ideDropOptions = ideDrop.getOptions();
	     for (WebElement Option : ideDropOptions) {
	    	 System.out.println(Option.getText());
	}
	    	 ideDrop.selectByValue("ij");
	    	 Thread.sleep(2000);
	    	 ideDrop.selectByValue("nb");
	    	 Thread.sleep(2000);	
	    	 
	    	 List<WebElement> selectedOptions = ideDrop.getAllSelectedOptions();
				for (WebElement selectedOption : selectedOptions) {
    	System.out.println("Selected visible text --"+selectedOption.getText());
	     Thread.sleep(3000);
	    	 
		}
		        driver.close(); 
}
}