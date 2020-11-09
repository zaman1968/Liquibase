package liquibase.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ApplicationDefect {
	
	
	
WebDriver driver;
	
	@BeforeMethod
	public void setup() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C://Driver//chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://hub-staging.liquibase.com/");
	Thread.sleep(3000);
	driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(40000,TimeUnit.MILLISECONDS);//page load timeout
	driver.manage().timeouts().implicitlyWait(40000, TimeUnit.MILLISECONDS);
	
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
 	//driver.findElement(By.xpath("/html[1]/body[1]/lhw-root[1]/lhw-layout[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/lhw-settings-user-info[1]/div[1]/lhw-edit-user[1]/div[1]/div[1]/form[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")).sendKeys("sarker");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='mat-input-3']")).sendKeys("N/A");
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//*[@id='mat-input-4']")).sendKeys("kamruzzaman");
	
	}
	
	@AfterMethod
	 public void teardown() {

	 driver.close();
	}
	
	
	

}
