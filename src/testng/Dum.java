package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dum {
WebDriver driver;
	@BeforeMethod
public void get() {
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
}
@Test
public void test1() {
	WebElement email=driver.findElement(By.xpath("//*[@id=\"email\"]"));
	email.click();
	email.sendKeys("abc@123");
	WebElement pass=driver.findElement(By.xpath("//*[@id=\"pass\"]"));
	pass.click();
	pass.sendKeys("abcd");
}
@Test
public void test2() {
	WebElement email=driver.findElement(By.xpath("//*[@id=\"email\"]"));
	WebElement pass=driver.findElement(By.xpath("//*[@id=\"pass\"]"));
    email.sendKeys("abcdefg");
	Actions act=new Actions(driver);
    act.keyDown(email,Keys.CONTROL).sendKeys("a").keyUp(email,Keys.CONTROL);
    act.keyDown(email,Keys.CONTROL).sendKeys("c").keyUp(email,Keys.CONTROL);
    act.keyDown(pass,Keys.CONTROL).sendKeys("v").keyUp(email,Keys.CONTROL);
act.perform();

}






}
