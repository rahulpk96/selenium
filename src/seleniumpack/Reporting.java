package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting {
WebDriver driver;
ExtentHtmlReporter extent;
ExtentReports reports;
ExtentTest test;
@BeforeTest
public void test()
{
	extent=new ExtentHtmlReporter("./report/myreport.html");
	extent.config().setTheme(Theme.DARK);
	extent.config().setReportName("automation report");
	extent.config().setDocumentTitle("myreport");
    reports=new ExtentReports();
    reports.attachReporter(extent);
    reports.setSystemInfo("os", "windows");
    reports.setSystemInfo("host","general");
    reports.setSystemInfo("tested by", "rahul");
	driver=new ChromeDriver();

}
@BeforeMethod
public void set() {
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
}
@Test
public void title()
{
	test=reports.createTest("test1");
	String exp="facebook";
	String actual=driver.getTitle();
	if(actual.contains(exp))
	{
		System.out.println("test passed");
	}
	else
	{
		System.out.println("test failed");
	}
}
@Test
public void logo()
{
test=reports.createTest("test2");
	WebElement logo=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img"));	
if(logo.isDisplayed())
{
	System.out.println("logo is present");
}
else
{
	System.out.println("logo is not present");
}
}

@Test
public void email1()
{
test=reports.createTest("test3");
	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abc@123");
driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("abcd");

}
@AfterTest
public void after() {
	reports.flush();
}

}
