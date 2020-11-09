package liquibase.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LiquibaseTest {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C://Driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://hub-staging.liquibase.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Log In']")).click(); 
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("kamruzzaman");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("Zaman@1968");
	     Thread.sleep(3000);                                
        driver.findElement(By.xpath(" //body/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/form[1]/input[3]")).click();
        Thread.sleep(5000);    
        driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-0\"]/div/button/span")).click();
        Thread.sleep(5000); 
        driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-1\"]/div/button[2]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/div/button[2]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//body/lhw-root[1]/lhw-layout[1]/mat-sidenav-container[1]/mat-sidenav[1]/div[1]/lhw-sidenav[1]/div[1]/div[2]/div[3]")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//div[contains(text(),'User Info')]")).click();
    	Thread.sleep(3000);
     	driver.findElement(By.xpath("/html[1]/body[1]/lhw-root[1]/lhw-layout[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/lhw-settings-user-info[1]/div[1]/lhw-edit-user[1]/div[1]/div[1]/form[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")).sendKeys("sarker");
   		Thread.sleep(3000);
   		driver.findElement(By.xpath(" //input[@id='mat-input-4']")).sendKeys("N/A");
   		Thread.sleep(3000);
   		driver.findElement(By.xpath("//*[@id='mat-input-5']")).sendKeys("kamruzzaman");
   		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='mat-input-8']")).sendKeys("linkedin.com/in/sarker-kamruzzaman-b231051b4");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='mat-input-9']")).sendKeys("Sarker Automation Lab");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/lhw-root/lhw-layout/mat-sidenav-container/mat-sidenav-content/div/lhw-settings-user-info/div/lhw-edit-user/div/div[1]/form/button/span")).click();
      //  boolean b=driver.findElement(By.xpath("/html/body/lhw-root/lhw-layout/mat-sidenav-container/mat-sidenav-content/div/lhw-settings-user-info/div/lhw-edit-user/div/div[1]/form/button/span")).isEnabled();

       //  if(b=false) {
        //	System.out.println("Test is passed");
      //  }else {
        	
      //  }System.out.println("Test is failled");
	
}
	
}
