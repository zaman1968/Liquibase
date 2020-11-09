package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

		
		public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.chrome.driver", "C://Driver//chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
			
			Thread.sleep(3000);
			WebElement source=driver.findElement(By.xpath("//div[@id='box3']"));
			WebElement target=driver.findElement(By.xpath("//div[@id='box103']"));
			Actions action =new Actions(driver);
			action.dragAndDrop(source, target).build().perform();
			
		
	}

}
