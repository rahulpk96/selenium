package testng;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

public class Brokenlinks {
WebDriver driver;
@BeforeMethod
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.google.com/");
}
@Test
public void sett()
{
    List<WebElement> links = driver.findElements(By.tagName("a"));
    for(WebElement link:links)
    {
    	String s=link.getAttribute("href");
    	verifylink(s);
    }
}
public void verifylink(String s)
{
	   try {
           URL link = new URL(s);
           HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
           httpConn.setConnectTimeout(2000); // Timeout for connecting
           httpConn.connect();

           if (httpConn.getResponseCode() == 200) {
           } else {
               System.out.println(s+ " - " + httpConn.getResponseMessage() + " - " + HttpURLConnection.HTTP_NOT_FOUND);
           }
       } catch (Exception e) {
           System.out.println(s+ " - " + e.getMessage());
       }
   }


@AfterTest
public void over()
{
	driver.close();
}
}