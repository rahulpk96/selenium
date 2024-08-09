package seleniumpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngannotations {
ChromeDriver driver;
	@BeforeTest
public void setup()
{
driver=new ChromeDriver();
}
@BeforeMethod
	public void sett()
{
	driver.get("https://www.linkedin.com/home");
}
@Test
public void testt()
{
	List <WebElement> list=driver.findElements(By.tagName("a"));	
	System.out.println("number of links="+list.size());
	}
@Test
public void test2()
{
	String actual=driver.getTitle();
	String exp="linkedin";
if (exp.equals(actual))
{
	System.out.println("test passed");
}
else 
{
	System.out.println("test failed");
}}
@AfterMethod
public void quit()
{
	driver.quit();

}
}
