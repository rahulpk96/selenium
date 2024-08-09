package test;

import org.testng.annotations.Test;

import page.Booking;

public class Bookingtest extends Baseclassbooking {
@Test
public void test1() throws InterruptedException
{
	Booking bg=new Booking(driver);
bg.hower();
bg.date();
}
}
