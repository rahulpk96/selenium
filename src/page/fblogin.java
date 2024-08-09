package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fblogin {
WebDriver driver;
 
By email=By.id("email");
By password=By.id("pass");
By login=By.id("loginbutton");
public fblogin(WebDriver driver)
{
	this.driver=driver;
}
 public void login(String emaill,String passwordd)
 {
	 driver.findElement(email).sendKeys(emaill);
	 driver.findElement(password).sendKeys(passwordd);
 }

public void click()
{
	driver.findElement(login).click();
}




}
