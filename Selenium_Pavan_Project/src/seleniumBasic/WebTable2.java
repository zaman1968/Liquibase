package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	    driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	    driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	
	
	
	    driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
	    driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]")).click();
	    
		int rows=driver.findElements(By.xpath("//*[@id=\"resultTable\"]/tbody/tr")).size();
		
		System.out.println(rows);
		
		int Count=0;
		
		for(int r=2;r<=rows;r++) {
			String status=driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr["+r+"]/td[5]")).getText();
			
			if(status.equals("Enable")) {
				
				Count++;
			}
		}
		System.out.println(Count);
	}  
	
	
	

}
