package seleniumpack;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff {
ChromeDriver driver;
@Before

	public void set()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details/");
	}
@Test

	public void get()
	{
  WebElement button=driver.findElement(By.xpath("//td[@valign=\"bottom\"]/input[2]"));
	String actual=button.getAttribute("Check availability") ;
	String exp="check availability";
	if (exp.equals(actual))
	{
		System.out.println("pass");
	
	}
	else
	{
		System.out.println("failed");
	}
	}
}



