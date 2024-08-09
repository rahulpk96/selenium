package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dropdowns {
WebDriver driver;
@BeforeTest
public void set()
{
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
}
@Test
public void get()
{
  //driver.findElement(By.xpath("https://register.rediff.com/register/register.php?FormName=user_details"));
    WebElement day= driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
    Select dayelement=new Select(day);
    dayelement.selectByValue("07");
    WebElement month=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
    Select monthelement=new Select(month);
    monthelement.selectByValue("06");
    WebElement year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
    Select yearelement=new Select(year);
    yearelement.selectByValue("2024");

  
}










}
