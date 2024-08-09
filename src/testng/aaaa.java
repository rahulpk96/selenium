package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class aaaa {
WebDriver driver;
@BeforeMethod
public void sett()
{
	driver=new ChromeDriver();
}
@BeforeTest
public void gett()
{
	driver.get("https://www.amazon.in/");
}
@Test
public void gg()
{
	driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();
    driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[2]/a"));
}
}
