package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown1 {

	public static void main(String[] args, String i)
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/LENOVO/Desktop/sample.html");
		WebElement Element = driver.findElement(By.id("iyenger"));
		Select s=new Select(Element);
		s.selectByIndex(1);
		//s.selectByValue(i);
		s.deselectAll();
		
		
		
		
				
				


	}

}
