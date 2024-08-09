package seleniumpack;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
  
public class Fbxpath {
ChromeDriver driver;

@Before
public void setup()
{
	driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");

}
@Test
public void test1()
{  
	driver.findElement(By.xpath("//*[@name=\"email\"]")).sendKeys("abcd@123");
driver.findElement(By.xpath("//*[@name=\"pass\"]")).sendKeys("abcd");
driver.findElement(By.xpath("//*[@name=\\login\\\"]")).click();
}
} 