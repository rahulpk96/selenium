package test;


import org.testng.annotations.Test;

import page.fblogin;

public class fbloginpom extends Baseclass{



@Test

public void test1() {
	
	fblogin fb=new fblogin(driver);
	fb.login("abc@1323","abcd");
    fb.click();
}















}
