package dummytest;

import java.awt.AWTException;
import java.awt.Window;

import org.testng.annotations.Test;

import dummy.Autopage;

public class Dummytest extends Dummybaseclass {
@Test
public void test() throws InterruptedException, AWTException
{

	Autopage at=new Autopage(driver);
	at.register("rahul", "pk", "kottayam", "abc@123", "8281167631", "software testing", "abcd", "abcd");
    at.gender();
    at.hobbies();
    at.languagesselect();
    at.skill("Adobe Photoshop");
  //  at.country();
    at.selectcountry();
    at.dob();
    at.fileupload();



}
}