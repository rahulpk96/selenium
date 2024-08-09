package testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ilovepdfrobot {
WebDriver driver;
@BeforeTest
public void get()
{
	driver=new ChromeDriver();	
}


@Test
public void gett() throws InterruptedException, AWTException
{

	driver.get("https://www.ilovepdf.com/word_to_pdf");
    driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
    
	fileupload("\"C:\\Users\\USER\\Documents\\Doc1.docx\"");
driver.manage().window().maximize();
}
public void fileupload(String p) throws InterruptedException, AWTException 
{
	StringSelection stringselect=new StringSelection(p);
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
}
