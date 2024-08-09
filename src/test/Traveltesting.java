package test;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

import page.Traveltest;

	

	public class Traveltesting extends Traveltestbaseclass{
		
		@Test
		public void test1() throws InterruptedException
		{
Traveltest ts=new Traveltest(driver);
ts.alert();
ts.selsource("ahmedabad");
ts.seldestination("bangalore");
ts.datepicker();
ts.search();
	}
	}
