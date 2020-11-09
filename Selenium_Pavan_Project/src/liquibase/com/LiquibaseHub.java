package liquibase.com;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LiquibaseHub {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C://Driver//chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(40000,TimeUnit.MILLISECONDS);//page load timeout
	driver.manage().timeouts().implicitlyWait(40000, TimeUnit.MILLISECONDS);
	driver.get("https://hub-staging.liquibase.com/");
	driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
   // driver.manage().timeouts().pageLoadTimeout(40000,TimeUnit.MILLISECONDS);//page load timeout
	//driver.manage().timeouts().implicitlyWait(40000, TimeUnit.MILLISECONDS);
	
	}
	
	@Test
	public void test1() throws Exception{
	driver.findElement(By.xpath("//span[text()='Log In']")).click(); 
	driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("kamruzzaman");
    Thread.sleep(2000);
	driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("Zaman@1968");
     Thread.sleep(2000);                                
    driver.findElement(By.xpath(" //body/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/form[1]/input[3]")).click();
    Thread.sleep(2000);    
    driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-0\"]/div/button/span")).click();
    Thread.sleep(2000); 
    driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-1\"]/div/button[2]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/div/button[2]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//body/lhw-root[1]/lhw-layout[1]/mat-sidenav-container[1]/mat-sidenav[1]/div[1]/lhw-sidenav[1]/div[1]/div[2]/div[3]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(text(),'User Info')]")).click();
	Thread.sleep(2000);
 	driver.findElement(By.xpath("/html[1]/body[1]/lhw-root[1]/lhw-layout[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/lhw-settings-user-info[1]/div[1]/lhw-edit-user[1]/div[1]/div[1]/form[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")).sendKeys("sarker");
	Thread.sleep(2000);
	driver.findElement(By.xpath(" //input[@id='mat-input-4']")).sendKeys("N/A");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='mat-input-5']")).sendKeys("kamruzzaman");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='mat-input-8']")).sendKeys("linkedin.com/in/sarker-kamruzzaman-b231051b4");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@id='mat-input-9']")).sendKeys("Sarker Automation Lab");
	 //boolean b= driver.findElement(By.xpath("//span[contains(text(),'Update Profile')]")).isEnabled();
    Thread.sleep(2000);
    driver.findElement(By.xpath("/html[1]/body[1]/lhw-root[1]/lhw-layout[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/lhw-settings-user-info[1]/div[1]/lhw-edit-user[1]/div[1]/div[1]/form[1]/button[1]/span[1]")).click();
    Thread.sleep(3000);
        
   
  // Thread.sleep(2000);
  // Assert.assertTrue(b);
   
   
}
	
	@Test
	 public void test2() throws Exception {
	  //Click on login button
     driver.findElement(By.xpath("//span[text()='Log In']")).click(); 
     Thread.sleep(2000);
	// username
	driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("kamruzzaman");
	//password
	Thread.sleep(2000);
	driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("Zaman@1968");
	// clock on signin Button
    driver.findElement(By.xpath(" //body/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/form[1]/input[3]")).click();
    Thread.sleep(2000);    
    driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-0\"]/div/button/span")).click();
    Thread.sleep(2000); 
    driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-1\"]/div/button[2]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/div/button[2]")).click();
    Thread.sleep(2000);

	//Click on the second option (Projects) in the left nav.
	
    driver.findElement(By.xpath("/html/body/lhw-root/lhw-layout/mat-sidenav-container/mat-sidenav/div/lhw-sidenav/div/div[2]/div[2]")).click();
    Thread.sleep(2000);
    //Click to expand the default project.
	driver.findElement(By.xpath("/html/body/lhw-root/lhw-layout/mat-sidenav-container/mat-sidenav/div/lhw-sidenav/div/div[3]/lhw-projects-tree/div/div/div/button/span/mat-icon")).click();
	Thread.sleep(2000);
	//Click on the Operations tab under this project.
	 driver.findElement(By.xpath("//body/lhw-root[1]/lhw-layout[1]/mat-sidenav-container[1]/mat-sidenav[1]/div[1]/lhw-sidenav[1]/div[1]/div[3]/lhw-projects-tree[1]/div[1]/div[1]/div[2]/div[1]/div[2]")).click();
	 Thread.sleep(2000);
	 // click on the Result
	 driver.findElement(By.xpath("//span[contains(text(),'Result')]")).click();
	 Thread.sleep(2000);
	 //In the filter options, select Result = Pass.
	 driver.findElement(By.xpath("//span[contains(text(),'Pass')]")).click();
	 Thread.sleep(2000);
	 //Expand the dropdown below (titled No Operations to display).
	driver.findElement(By.xpath("//span[contains(text(),'Expand All')]")).click();
	
	//You should expect to have zero results, since no corresponding data has been created
	Thread.sleep(2000);
	String text=driver.findElement(By.xpath(" //div[contains(text(),'0 of 0')]")).getText();
	System.out.println(text);
    //Validaiton
	Thread.sleep(2000);
	 Assert.assertEquals("0 of 0", text);
	}
   
 @AfterMethod
 public void teardown() {

 driver.close();
}


		
	
	
	
	
	
	
	

}
