
	package test;
import org.testng.annotations.Test;

import page.Vijayanandrepo;
public class Vijayanandtest extends Vijayanandbaseclass {

@Test
		public void test1() throws InterruptedException
		{
Vijayanandrepo vj=new Vijayanandrepo(driver);
vj.alert();
vj.selsource("ahmedabad");
vj.seldestination("bangalore");
vj.datepicker();
vj.search();
	}
	}


