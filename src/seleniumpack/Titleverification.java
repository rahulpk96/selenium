package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Titleverification {
	ChromeDriver driver;
	@BeforeTest
	public void get()
	{
		driver=new ChromeDriver();
	}
@BeforeMethod
public void gett()
{
	driver.get("https://www.rediff.com/");
}
@Test
public void test1()
{
	String actual=driver.getTitle();
	String exp="redif";
	if(exp.equals(actual))
	{
		System.out.println("test passed");
	}
	else
	{
		System.out.println("test failed"); 
	}}
@Test
public void testt2()
{
	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a[3]"));
}

}
