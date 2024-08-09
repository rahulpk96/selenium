package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class waits {
WebDriver driver; 
@BeforeMethod
public void setup()
{
	driver=new EdgeDriver();
	driver.get("https://www.ebay.com/");
}
@Test
public void set()
{
	Actions act=new Actions(driver);
WebElement element=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/a"));
act.moveToElement(element).perform();
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
wait.until(ExpectedConditions.visibilityOf(element));
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//Thread.sleep(1000);
WebElement item=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"] /ul/li[2]/div[2]/div[1]/nav[2]/ul/li[1]/a"));
item.click();
act.perform();
}
}
