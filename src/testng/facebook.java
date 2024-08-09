package testng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class facebook {

	WebDriver driver;
@BeforeTest
public void gett()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
}
@Test
public void sett() throws IOException
{  
FileInputStream obj=new FileInputStream("C:\\Users\\USER\\Desktop//work.xlsx");

XSSFWorkbook wb=new XSSFWorkbook(obj);
XSSFSheet sh=wb.getSheet("sheet1");
int rowcount=sh.getLastRowNum();
for(int i=1;i<=rowcount;i++)
{
	String username=sh.getRow(i).getCell(0).getStringCellValue();
	String password=sh.getRow(i).getCell(1).getStringCellValue();
    System.out.println("username"+username);
    System.out.println("password"+password);
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys(username);
    driver.findElement(By.name("pass")).clear();
    driver.findElement(By.name("pass")).sendKeys(password);
    driver.findElement(By.name("login")).click();
}
}
}
