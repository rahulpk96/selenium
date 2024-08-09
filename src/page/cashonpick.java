package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class cashonpick  {
WebDriver driver;
By Searchbar=By.xpath("//*[@id=\"auto-searchterms1\"]");
By Sort=By.xpath("//*[@id=\"products-orderby\"]");
By display=By.xpath("//*[@id=\"products-pagesize\"]");

public cashonpick(WebDriver driver)
{
this.driver=driver;
}
public void searchbar(String Searchbar1)
{
WebElement searchbar=driver.findElement(Searchbar);
searchbar.sendKeys(Searchbar1);
searchbar.submit();
}
public void sort()
{
WebElement position=driver.findElement(Sort);
Select Sort1=new Select(position);
Sort1.selectByIndex(1);
}
public void display()
{
WebElement display1=driver.findElement(display);
Select display=new Select(display1);
display.selectByIndex(2);;
}
public void click()
{
driver.findElement(Searchbar).click();
}
}