package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Draganddrop {
ChromeDriver driver;
@BeforeMethod
public void sett()
{
	ChromeDriver driver=new ChromeDriver(); 
	driver.get("https://demoqa.com/droppable/");
}
@Test
public void gett()
{
    WebElement draggable=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
    WebElement droppable=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
    Actions act=new Actions(driver);
    driver.manage().window().maximize();

   act.dragAndDrop(draggable,droppable);
    act.perform();
    
}
}

