package testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Guru99fileupload {
WebDriver driver;
@BeforeMethod
public void set()
{
	driver=new EdgeDriver();
	driver.get("https://demo.guru99.com/test/upload/");
}
@Test
public void sett() throws InterruptedException, Exception 
{
driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).click();	
driver.manage().window().maximize();
fileupload("\"C:\\Users\\USER\\Documents\\Book1.xlsx\"");
}
	
public void fileupload(String f) throws InterruptedException, Exception {
	// TODO Auto-generated method stub
	StringSelection stringselect=new StringSelection(f);
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselect,null);
	Thread.sleep(2000);
    Robot rb=new Robot();
    rb.keyPress(KeyEvent.VK_CONTROL);
    rb.keyPress(KeyEvent.VK_V);
    rb.keyRelease(KeyEvent.VK_CONTROL);
    rb.keyRelease(KeyEvent.VK_V);
    Thread.sleep(2000);
    rb.keyPress(KeyEvent.VK_ENTER);
    rb.keyRelease(KeyEvent.VK_ENTER);
    Thread.sleep(2000);
    driver.findElement(By.id("processTask")).click();
}
@AfterTest
public void gett()
{
	driver.close();
}









}
