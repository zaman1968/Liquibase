/*
1. Open web Browser Chrome
2. Open URL    https://opersource-demo.orangehrmlive.com/
3. Enterusername (Admin).
4. Enter password (admin123)
5. click on login
6. Capture the title of the page:OrangeHRM
7. Close the browser

*/
package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginTest_OrangeHRM {

	public static void main(String[] args) throws Exception {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	     //System.setProperty("webdriver. gecko. driver", "C:\\Driver\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		
		
		//System.setProperty("webdriver.ie.driver", "C:\\Driver\\IEDriverServer.exe"); 
		//WebDriver driver=new InternetExplorerDriver();
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
				
		driver.get("https://opersource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		String title=driver.getTitle();
		System.out.println(title);
		String Exp_title="OrangeHRM";

		if(title.equals(Exp_title)){
			System.out.println("Test is passed");
		}else {
			System.out.println("Test is failled");
		}
		
				
		
		WebElement admin=driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));
		WebElement usermanagement=driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]"));
		WebElement user=driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(admin).moveToElement(usermanagement).moveToElement(user).build().perform();
		
		
		
		
	}

}




