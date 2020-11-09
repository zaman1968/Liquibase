package seleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "C://Driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		Thread.sleep(3000);
		
		List <WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		
		for(WebElement  e :links) {
			
			System.out.println(e.getText());
		}
		
		
	}

}
