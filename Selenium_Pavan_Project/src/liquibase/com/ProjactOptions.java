package liquibase.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class ProjactOptions {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "C://Driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// Open the login page
		driver.get("https://hub-staging.liquibase.com/");
		Thread.sleep(3000);
		//Click on login button
		driver.findElement(By.xpath("//span[text()='Log In']")).click(); 
		Thread.sleep(3000);
		// username
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("kamruzzaman");
		//password
		Thread.sleep(4000);
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("Zaman@1968");
		// clock on signin Button
	    driver.findElement(By.xpath(" //body/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/form[1]/input[3]")).click();
	    Thread.sleep(5000);    
        driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-0\"]/div/button/span")).click();
        Thread.sleep(5000); 
        driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-1\"]/div/button[2]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/div/button[2]")).click();
        Thread.sleep(5000);
   
		//Click on the second option (Projects) in the left nav.
		
        driver.findElement(By.xpath("/html/body/lhw-root/lhw-layout/mat-sidenav-container/mat-sidenav/div/lhw-sidenav/div/div[2]/div[2]")).click();
        Thread.sleep(5000);
        //Click to expand the default project.
		driver.findElement(By.xpath("/html/body/lhw-root/lhw-layout/mat-sidenav-container/mat-sidenav/div/lhw-sidenav/div/div[3]/lhw-projects-tree/div/div/div/button/span/mat-icon")).click();
		Thread.sleep(3000);
		//Click on the Operations tab under this project.
		 driver.findElement(By.xpath("//body/lhw-root[1]/lhw-layout[1]/mat-sidenav-container[1]/mat-sidenav[1]/div[1]/lhw-sidenav[1]/div[1]/div[3]/lhw-projects-tree[1]/div[1]/div[1]/div[2]/div[1]/div[2]")).click();
		 Thread.sleep(3000);
		 // click on the Result
		 driver.findElement(By.xpath("//span[contains(text(),'Result')]")).click();
		 Thread.sleep(3000);
		 //In the filter options, select Result = Pass.
		 driver.findElement(By.xpath("//span[contains(text(),'Pass')]")).click();
		 Thread.sleep(3000);
		 //Expand the dropdown below (titled No Operations to display).
		driver.findElement(By.xpath("//span[contains(text(),'Expand All')]")).click();
		
		//You should expect to have zero results, since no corresponding data has been created
		String text=driver.findElement(By.xpath(" //div[contains(text(),'0 of 0')]")).getText();
       //Validaiton
		 System.out.println(text);
		//Assert.assertEquals("Text1", text);
		String text1="0 of 0";
       		
        if (text==text1){
        	System.out.println("Test is passed");
        }else {
        	System.out.println("Test is Failed");
        }

	}

}
