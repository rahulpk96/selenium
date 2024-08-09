package testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Grouping {
	@BeforeMethod
	public void test()
	{
		System.out.println("hello");
	}
	@Test(groups = "smoke")
	public void test1()
	{
	System.out.println("am");
	}
	@Test(groups ="smoke" )
	public void test2()
	{
		System.out.println("i");
	}
	@Test(groups = "sanity")
	public void test3()
	{
		System.out.println("rahul");
	}
	@Test(groups = "sanity")
	public void test4()
	{
	System.out.println("pk");	
	}}

