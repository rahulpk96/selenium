package test;
import org.testng.annotations.Test;

import page.cashonpick;
public class Cashonpick extends Baseclasstest1cashonpick {
	cashonpick cp=new cashonpick(driver);

@Test
public void cahonpick() {
	
cp.searchbar("samsung");
cp.sort();
cp.display();
cp.click();

}
}
