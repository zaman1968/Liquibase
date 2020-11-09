package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Alert;

public class RightClick {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "C://Driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		driver.manage().window().maximize();
		
		Actions action =new Actions(driver);
		WebElement button=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		action.contextClick(button).build().perform();
		driver.findElement(By.xpath("/html/body/ul/li[3]/span")).click();
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println("Text present in the alert window is:"  + text);
		alert.accept();
		
	}

}
