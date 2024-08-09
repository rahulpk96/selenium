package seleniumpack;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotpgm {
ChromeDriver driver;
	@Before
public void set()
{
 driver=new ChromeDriver();
		driver.get("file:///C:/Users/USER/Documents/lum.html");
}
@Test
public void get() throws IOException
{
driver.findElement(By.xpath("/html/body/input[1]")).click();	;
Alert s=driver.switchTo().alert();
s.accept();
driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("rahul");
driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("pk");
driver.findElement(By.xpath("/html/body/input[4]")).click();
String actual=driver.findElement(By.xpath("/html/body/input[1]")).getAttribute("value");

String exp="Display alert box";
if (exp.equals(actual))
{
	System.out.println("passed");
} 
else
{
	System.out.println("failed");
} 

WebElement screen=driver.findElement(By.xpath("//*[@value=\"Display alert box\"]"));
File src=screen.getScreenshotAs(OutputType.FILE);

//File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileHandler.copy(src,new File("C:\\Users\\USER\\Documents\\screen\\screen1.png"));


}}