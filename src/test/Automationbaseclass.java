package test;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Automationbaseclass {
WebDriver driver;
@BeforeClass
public void test() throws InterruptedException, AWTException {
	driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Register.html");
}

}
