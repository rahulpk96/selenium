package seleniumpack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	WebDriver driver;

	@Before
	public void set()
	{
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	}
 @Test
 public void amaz()
 {
	 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobiles");
     
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
     driver.findElement(By.xpath("//div[@id=\"nav-cart-count-container\"]/span[1]")).click();
     driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
     driver.findElement(By.name("email")).sendKeys("abc@gmail.com",Keys.ENTER);
     driver.navigate().back();
    // driver.navigate().back();
     driver.findElement(By.id("nav-hamburger-menu")).click();
 }
@After

	public void am()
	{
    driver.quit();
	}
}

