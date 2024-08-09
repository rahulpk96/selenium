package seleniumpack;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assertions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver;
driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
String exp="facebook";
String actual=driver.getTitle();
Assert.assertEquals(exp, actual);
//if(actual.contains(exp))
//{
//	System.out.println("test passed");
//}
//else
//{
//	System.out.println("test failed");
//}
//	
	
	}

}
