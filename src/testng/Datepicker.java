package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Datepicker {
WebDriver driver;
@BeforeMethod
public void get() {
	driver=new ChromeDriver();
	driver.get("https://phptravels.net/login");

}
@Test
public void test()
{
	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div[1]/ul/li[2]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"checkin\"]")).click();
    String month="December 2024";
    String date="20";
while(true)
{
    String act=driver.findElement(By.xpath ("//*[@id=\"fadein\"]/div[5]/div[1]/table/thead/tr[1]/th[2]")).getText();

	if(act.equals(month))
	{
		break;
	}

else
{
	driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[5]/div[1]/table/thead/tr[1]/th[3]")).click();
}
driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[5]/div[1]/table/tbody/tr[4]/td[6]")).click();
}
}
}







