package upload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {
	
	static WebDriver driver;

	public static void main(String[] args) throws AWTException {
	
		
        Robot robot = new Robot();
        String chromePath = "C:\\Users\\M1046899\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.get("https://smallpdf.com/edit-pdf");
        driver.findElement(By.xpath("//div[@class='smpdf_NABjI2p56Zm1Jd smpdf_1rUJEglcHkfMX6 smpdf_qEyYjvrNz7xOIk smpdf_3oSJakvWT-Bo8M smpdf_OTYrxRuhQyGXx8']")).click();
        
        robot.setAutoDelay(2000);
        
        String data;
        StringSelection strsel = new StringSelection( "C:\\Users\\M1046899\\Documents\\Linux.pdf");
        //String str = "C:\\Users\\M1047138\\Documents\\New folder\\afcat application form.pdf";
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strsel, null);
        
        robot.setAutoDelay(2000);
        
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        
        robot.keyPress(KeyEvent.VK_ENTER);
        
        


	}

}
