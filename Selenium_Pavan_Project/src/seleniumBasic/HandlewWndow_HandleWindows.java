package seleniumBasic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlewWndow_HandleWindows {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C://Driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumhg.org");
		
		// String windowvalue =driver.getWindowHandle();
		// System.out.println(windowvalue);
	
		driver.findElement(By.xpath("//*[@id=\"adBlock\"]/div[2]/div[3]/a/span")).click();
		 
		 
		Set <String>   handllvalues=driver.getWindowHandles();
		
		for(String  h :handllvalues ) {
			
			System.out.println(h);
			//String title=driver.switchTo().window(h).getTitle();
			//System.out.println(title);
		
			
		}
		 
	}

}
