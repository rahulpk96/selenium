package seleniumpack;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findanattribute {
ChromeDriver driver;
	@Before
public void setup()
{
driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
}
@Test
public void get()
{
	List <WebElement> list=driver.findElements(By.tagName("a"));	
	System.out.println("number of links="+list.size());
    for (WebElement link: list)
    {
    	System.out.println(link.getAttribute("href"));
        System.out.println(link.getText());
    }
}
}
