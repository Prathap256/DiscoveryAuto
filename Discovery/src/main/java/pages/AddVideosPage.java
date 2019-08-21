package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import genriclib.BaseClass;
import junit.framework.Assert;

public class AddVideosPage {

	
	static String title;
	static String desc;
	public void selectFav() throws InterruptedException
	{
		BaseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		for(int i=1;i<3;i++)
		{
		WebElement wb=BaseClass.driver.findElement(By.xpath("//div[text()='Shows You Might Like']/../../div/div/div/div/div["+i+"]"));
		Actions act=new Actions(BaseClass.driver);
		act.moveToElement(wb).perform();
		title=BaseClass.driver.findElement(By.xpath("(//span[text()='Add to Favorites'])["+i+"]/../preceding-sibling::h3/div")).getText();
		Thread.sleep(2000);
		 desc=BaseClass.driver.findElement(By.xpath("(//span[text()='Add to Favorites'])["+i+"]/../preceding-sibling::div/div")).getText();
		Thread.sleep(2000);
		BaseClass.driver.findElement(By.xpath("(//span[text()='Add to Favorites'])["+i+"]")).click();
		}		
	}
	public void validate() throws Exception
	{
		BaseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		for(int i=1;i<3;i++)
		{
		WebElement wb=BaseClass.driver.findElement(By.xpath("(//h2[text()='Favorite Shows']/../div/div/div/div/div/section)["+i+"]"));
		Actions act=new Actions(BaseClass.driver);
		act.moveToElement(wb).perform();
		String title1=BaseClass.driver.findElement(By.xpath("(//h2[text()='Favorite Shows']/../div/div/div/div/div/section)["+i+"]/div[3]/a/div/h3/div")).getText();
		Thread.sleep(2000);
		String desc1=BaseClass.driver.findElement(By.xpath("(//h2[text()='Favorite Shows']/../div/div/div/div/div/section)["+i+"]/div[3]/a/div/div[1]/div")).getText();
		Assert.assertEquals(title1, title);
		Assert.assertEquals(desc1, desc);
		}
	}
	
}
