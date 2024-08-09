package test;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import dummy.Autopage;
import page.Automationdemo;

public class Automationtest extends Automationbaseclass{

	@Test
public void test() throws InterruptedException, AWTException
{
		Autopage at=new Autopage(driver);
		at.register("rahul","pk", "kottyam", "abc@123", "8281167631", "st", "abcd", "abcd");
       at.skill();
       at.gender();
       at.hobbies();
       //at.fileupload(null);
       at.languagesselect();
       
}
}