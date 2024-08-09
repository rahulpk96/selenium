package seleniumpack;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {
ChromeDriver driver;
	@Before
public void setup()
{
	driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
}
@Test
public void get()
{
List <WebElement> list=driver.findElements(By.tagName("a"));	
System.out.println("number of links="+list.size());
}
@After
public void sett()
{
	driver.close();
}
}

