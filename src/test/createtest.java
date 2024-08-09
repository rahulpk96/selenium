package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.createapagerepository;

public class createtest extends Baseclass{

@Test
public void test2() throws Exception {
	createapagerepository cr=new createapagerepository(driver);
cr.create();
Thread.sleep(2000);
cr.login1("abcd@1234","abcd");
cr.click1();
}











}
