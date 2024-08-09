package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Logoverification {
WebDriver driver;
@BeforeTest
public void get()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
}
@Test
public void test()
{
	WebElement logo=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img"));
if (logo.isDisplayed())
	{System.out.println("logo is present");
}
else
{
	System.out.println("logo is not present");
}

}









}
