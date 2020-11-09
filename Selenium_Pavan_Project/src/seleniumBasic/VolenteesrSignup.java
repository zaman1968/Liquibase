package seleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VolenteesrSignup {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "C://Driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://opersource-demo.orangehrmlive.com/");
		
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println("Title of the page: " +title);
		String url=driver.getCurrentUrl();
		System.out.println("URL of the current page: " +url);
		//System.out.println(driver.getPageSource());
		
		//firstname:
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-1\"]")).sendKeys("Sarker");
		//lastname:
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-2\"]")).sendKeys("Kamruzzaman");
		//Phonenumber:
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-3\"]")).sendKeys("6827169256");
		//Country
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-4\"]")).sendKeys("United States");
		//city
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-5\"]")).sendKeys("Grand Prairie");
		//email
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-6\"]")).sendKeys("skzaman1168@gmail.com");
		
		//Gender(Handling radio button)
		//conditional commands
		WebElement rdmale=driver.findElement(By.xpath("//*[@id=\"q26\"]/table/tbody/tr[1]/td/label"));
		System.out.println(rdmale.isDisplayed());
		System.out.println(rdmale.isEnabled());
		System.out.println(rdmale.isSelected());
		rdmale.click();
		System.out.println(rdmale.isSelected());
		
		// Days of week(Check box)
		
		driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[2]/td/label")).click();
		driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[3]/td/label")).click();
		driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[4]/td/label")).click();
		driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[5]/td/label")).click();
		driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[6]/td/label")).click();
		driver.findElement(By.xpath("//select[@id='RESULT_RadioButton-9']")).click();
	    
		// Handle dropdown
		//WebElement drp=driver.findElement(By.xpath("//select[@id='RESULT_RadioButton-9']"));
		// Find out the dropdown options
		//Select dropdown=new Select(drp);
		Select dropdown=new Select(driver.findElement(By.xpath("//select[@id='RESULT_RadioButton-9']")));
		// Total number of options
		System.out.println( "Total options are : " +dropdown.getOptions().size());
		//Enhance for loop
		List <WebElement>  Options=dropdown.getOptions();
				    for(WebElement e: Options) {
		    	 System.out.println(e.getText());
		    	 }    	
				    
		    	 //Select option from dropdown
		    	 dropdown.selectByVisibleText("Morning");
		    	// dropdown.selectByIndex(2);
		    	// dropdown.selectByValue("Radio-2" );
		    	 
		    driver.quit();	 
		    	 
		    
		     }
		     
		     
		
		}
		
		



