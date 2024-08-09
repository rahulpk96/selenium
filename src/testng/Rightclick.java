package testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Rightclick {
WebDriver driver;
@BeforeMethod
public void sett()
{
	driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
}
@Test
public void setup()
{
	WebElement button=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	Actions act=new Actions(driver);
	act.contextClick(button);
act.perform();
WebElement c=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span"));
c.click();
Alert a=driver.switchTo().alert();
a.accept();
WebElement click=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
act.doubleClick(click);
act.perform();
}












}
