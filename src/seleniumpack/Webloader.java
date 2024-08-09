package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webloader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobiles");
driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
driver.findElement(By.xpath("//*[@id=\"nav-cart-count\"]")).click();
driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
driver.findElement(By.xpath("//*[@id=\"ap_email_login\"]")).sendKeys("abcd123");
driver.navigate().back();
driver.navigate().back();	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
