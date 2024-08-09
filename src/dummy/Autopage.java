package dummy;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;

public class Autopage {
	WebDriver driver;
	By fullname=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input");
	By lastname=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input");
	By address=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea");
	By emailaddress=By.xpath("//*[@id=\"eid\"]/input");
	By phone=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input");
	By male=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input");
	By female=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input");
	By cricket=By.xpath("//*[@id=\"checkbox1\"]");
	By movies=By.xpath("//*[@id=\"checkbox2\"]");
	By hockey=By.xpath("//*[@id=\"checkbox3\"]");
	By languages=By.xpath("//*[@id=\"msdd\"]");
	By skills=By.xpath("//*[@id=\"Skills\"]");
	By country=By.xpath("//*[@id=\"countries\"]");
	By selectcountry=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span");
	By dobyear=By.xpath("//*[@id=\"yearbox\"]");
	By dobmonth=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select");
	By dobday=By.xpath("//*[@id=\"daybox\"]");
	By password=By.xpath("//*[@id=\"firstpassword\"]");
	By confirmpassword=By.xpath("//*[@id=\"secondpassword\"]");
	By submit=By.xpath("//*[@id=\"submitbtn\"]");
	By choosefile=By.xpath("//*[@id=\"imagesrc\"]");
	
	public Autopage(WebDriver driver) {
		this.driver=driver;
	}
	public void fileupload() throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		   driver.manage().window().maximize();

		String filepath1="C:\\Users\\USER\\Desktop.xlsx";
		WebElement upload=driver.findElement(choosefile);
		Actions act=new Actions(driver);
		act.click(upload);

		
		StringSelection stringselect=new StringSelection(filepath1);
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselect,null);
		Thread.sleep(2000);
	    Robot rb=new Robot();
	    rb.keyPress(KeyEvent.VK_CONTROL);
	    rb.keyPress(KeyEvent.VK_V);
	    rb.keyRelease(KeyEvent.VK_CONTROL);
	    rb.keyRelease(KeyEvent.VK_V);
	    Thread.sleep(2000);
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);

	}
	public void register(String fullname1,String lastname1,String adress1,String emailaddress1,String phone1,String skill1,String password1,String confirmpassword1) throws InterruptedException, AWTException
	{
	
		driver.findElement(fullname).sendKeys(fullname1);
	    driver.findElement(lastname).sendKeys(lastname1);
	    driver.findElement(address).sendKeys(adress1);
	    driver.findElement(emailaddress).sendKeys(emailaddress1);
	    driver.findElement(phone).sendKeys(phone1);
	    driver.findElement(password).sendKeys(password1);
	    driver.findElement(confirmpassword).sendKeys(confirmpassword1);
	}
	public void gender() {
		driver.findElement(male).click();
	    driver.findElement(female).click();
	}

	public void hobbies() {
		driver.findElement(cricket).click();
		driver.findElement(movies).click();
		driver.findElement(hockey).click();
	}
	public void languagesselect() throws InterruptedException
	{    driver.findElement(languages).click();
		Thread.sleep(2000);
		WebElement language1=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]/a"));
	    WebElement language2=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[2]/a"));
	    
	    
	    language1.click();
	    language2.click();
	    }
	public void skill(String Skills) {
		WebElement skill= driver.findElement(skills);
	    Select sk=new Select(skill);
	    sk.selectByValue(Skills);
	    }
	public void country() {
		WebElement country1= driver.findElement(country);
	    Select co=new Select(country1);
	    co.selectByValue("Adobe Photoshop");
	    }
	public void selectcountry() throws InterruptedException
	{
		WebElement countrydrop = driver.findElement(selectcountry);
		countrydrop.click();
		By searchInput = By.xpath("/html/body/span/span/span[1]/input");
		WebElement searchField = driver.findElement(searchInput);
		searchField.sendKeys("Australia");
		Thread.sleep(2000);
		By searchresult = By.xpath("//*[@id=\"select2-country-results\"]/li[1]");

		WebElement option = driver.findElement(searchresult);
		option.click();
	    }
	public void dob()
	{
		 WebElement year= driver.findElement(dobyear);
		    Select yearelement=new Select(year);
		    yearelement.selectByValue("1989");
		    WebElement month=driver.findElement(dobmonth);
		    Select monthelement=new Select(month);
		    monthelement.selectByValue("March");
		    WebElement day=driver.findElement(dobday);
		    Select dayelement=new Select(day);
		    dayelement.selectByValue("5");

	}





}
