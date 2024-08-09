package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import test.Baseclasstest1cashonpick;

public class Cashonpick2 {
WebDriver driver;
By searchbar=By.id("adv");
By advancedbutton=By.id("adv");
By pricerange1=By.id("pf");
By pricerange2=By.id("pt");
By searchbutton=By.xpath("/html/body/div[7]/div[2]/div/div[2]/div/div[2]/div[1]/form/div[2]/input");


	  
public Cashonpick2(WebDriver driver)
{
	this.driver=driver;
}
public void searchbar(String oneplus) {
	driver.findElement(searchbar).sendKeys(oneplus);
}
public void buttonclick() {
	driver.findElement(searchbutton).click();
}
public void advsearch() {
	driver.findElement(advancedbutton).click();
}
public void pricerange1()
{
	driver.findElement(pricerange1).sendKeys(null);
}
public void pricerange2() {
	driver.findElement(pricerange2).sendKeys(null);
}
public void advsearchbutton() {
	driver.findElement(advancedbutton).click();
}
}
