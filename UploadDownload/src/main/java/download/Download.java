package download;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Download {

	


	       static WebDriver driver;
	       public static void main(String[] args) {
	              String chromePath = "C:\\Users\\M1046899\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe";
	              System.setProperty("webdriver.chrome.driver", chromePath);
	              driver = new ChromeDriver();
	              driver.get("https://www.contextures.com/xlSampleData01.html");
	              driver.findElement(By.linkText("Excel sample data workbook")).click();
	              

	       }

	

}
