package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
    public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		Thread.sleep(3000);
		String month="March 2021";
		String day="15";
		
		System.setProperty("webdriver.chrome.driver", "C://Driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://phptravels.net");
		
		driver.findElement(By.xpath("//input[@id='checkin']")).click();
		
		Thread.sleep(3000);
		
		while(true) {
			
			String title=driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[1]/nav/div[2]")).getText();
			
			if(title.equals(month)) {
				break;
			}else {
				
				
				driver.findElement(By.xpath("/html/body/div[9]/div[1]/table/thead/tr[1]/th[3]")).click();
		
				
			}
		}
		
		
		 driver.findElement(By.xpath("//div[9]//div[1]//table[1]//tbody//tr//td[contains(text(),'15')]")).click();

	
		
	
	}
	
}
