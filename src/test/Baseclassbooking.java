package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Baseclassbooking {
WebDriver driver;
@BeforeClass
public void base()
{
	driver=new ChromeDriver();
	driver.get("https://www.booking.com/index.en-gb.html?label=gen173nr-1BCAEoggI46AdIM1gEaGyIAQGYAQm4ARfIAQzYAQHoAQGIAgGoAgO4ArXIobUGwAIB0gIkOTUxZjU3MzctOGNlNC00ZjMxLTkyMjctOTNiZDM0MzRhNTcx2AIF4AIB&sid=cf448093dc01f0caac886c97442f5c27&keep_landing=1&sb_price_type=total&");
}
}
