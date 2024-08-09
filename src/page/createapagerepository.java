package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class createapagerepository {
WebDriver driver;

By email1=By.id("email");
By password1=By.id("pass");
By login1=By.id("loginbutton");
By create=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
public void create()
{
	driver.findElement(create).click();
}
public createapagerepository(WebDriver driver)
{
	this.driver=driver;
}



public void login1(String emaill,String passwordd)
{
	 driver.findElement(email1).sendKeys(emaill);
	 driver.findElement(password1).sendKeys(passwordd);
}

public void click1()
{
	driver.findElement(login1).click();
}

}











