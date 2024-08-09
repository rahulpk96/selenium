package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class Dummy {
WebDriver driver;
@BeforeTest
public void login(WebDriver driver)
{
	By email=By.name("email");
	By password=By.name("pass");
	By loginbutton=By.name("login");
}
public Dummy() {

}
public void loginn(String emaill,String passwordd) {
	driver.findElement(email).sendkeys(abc@123);
    driver.findElement(password).
}
}







}
