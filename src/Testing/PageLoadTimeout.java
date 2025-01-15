package Testing;

import java.time.Duration;
import java.time.Instant;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeout {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");;
    ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
	Instant StartTime = Instant.now();
	System.out.println(StartTime.toString());
	driver.get("https://www.royalmansour.com/en/");
	Instant EndTime = Instant.now();
	System.out.println(EndTime.toString());
	System.out.println("PageLoad Time:"+Duration.between(StartTime, EndTime).toSeconds()+ "Seconds");
	System.out.println(driver.getTitle());
	driver.close();
	
	}
	}
