package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Booking {
WebDriver driver;
By search=By.xpath("//*[@id=\":rh:\"]");
By elementtohower=By.xpath("//*[@id=\"autocomplete-result-0\"]/div/div/div/div[1]");
By date=By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[2]/div/div/button[1]/span");
public Booking(WebDriver driver) {
this.driver=driver;
}
public void hower()
{
    driver.manage().window().maximize();
	WebElement search1=driver.findElement(search);
	search1.click();
    WebElement elementhoweer=driver.findElement(elementtohower);
    Actions act=new Actions(driver);
    act.moveToElement(elementhoweer).perform();
    }
public void date() throws InterruptedException {
	WebElement date1=driver.findElement(date);
	date1.click();

		String date="31";
		String date2="3";
		WebElement from=driver.findElement(By.xpath("//*[@id=\":rh:\"]"));
		from.click();
		WebElement mun=driver.findElement(By.xpath("//*[@id=\"autocomplete-result-0\"]/div/div/div/div[1]"));
		mun.click();
		Thread.sleep(2000);
		
		
		WebElement ckin=driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[2]/div/div[1]/button[1]/span"));
		ckin.click();
		while(true) {
			String act=driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/table/tbody/tr[5]/td[4]/span/span")).getText();
			if(act.equals(date)) {
				break;
			}
			else
				Thread.sleep(2000);
		}
		WebElement ckout=driver.findElement(By.xpath("//*[@id=\"rt_ui_picker\"]/span[3]/span/span"));
		ckout.click();
	while(true) {
			String ac=driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[2]/table/tbody/tr[1]/td[7]/span/span")).getText();
			if(ac.equals(date2)){
				break;
			}
			else
			Thread.sleep(2000);
		}
	
	WebElement person=driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[3]/div/button/span[1]"));
	person.click();

		String adult=driver.findElement(By.xpath("//*[@id=\":ri:\"]/div/div[1]/div[2]/span")).getText();
		
		
	}
}
