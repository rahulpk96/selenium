package dummytest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;

public class Dummybaseclass {
	WebDriver driver;

	@BeforeClass

public void base()
{
	driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Register.html");
}

}
