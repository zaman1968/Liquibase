package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C://Driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("http://demo.guru99.com/test/web-table-element.php");
	   // int rows= driver.findElements(By.tagName("tr")).size();
		
	   int rows=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr")).size();
	   System.out.println(rows);
	   int columns=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[2]/td")).size();
	   System.out.println(columns);
	   System.out.println("Company"+"  "+"Group"+"   "+"Prev Close (Rs)"+"	  "+"Current Price (Rs)"+"   "+"% Change");
	   for(int r=2;r<=rows;r++) {
		   
		   for(int c=1;c<=columns;c++) {
			   
			  String value= driver.findElement(By.xpath("\r\n" + 
			   		"//*[@id=\"leftcontainer\"]/table/tbody/tr["+r+"]/td["+c+"]")).getText();
			  
			  System.out.println(value+"  ");
		   }
		   
		   System.out.println();
	   }

	}

}
