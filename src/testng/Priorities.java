package testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priorities {
@BeforeMethod
public void test()
{
	System.out.println("hello");
}
@Test(priority = 2,invocationCount = 3)
public void test1()
{
System.out.println("am");
}
@Test(priority = 1,enabled = false)
public void test2()
{
	System.out.println("i");
}
@Test(priority = 4)
public void test3()
{
	System.out.println("rahul");
}
@Test(priority =3 )
public void test4()
{
System.out.println("pk");	
}}