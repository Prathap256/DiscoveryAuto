package genriclib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




	public class Webdrivercommonlib {
		
	
		public void waitforpagetoload(){
			
			BaseClass.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		}
		public void waitforlinknamepresent(String linkname){
			WebDriverWait wait=new WebDriverWait(BaseClass.driver,20);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(linkname)));
		}
		public void waitforxpathpresent(String wbxpath){
			WebDriverWait wait=new WebDriverWait(BaseClass.driver,20);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(wbxpath)));
		}
		public void waitforidpresent(String wbid){
			WebDriverWait wait=new WebDriverWait(BaseClass.driver,20);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(wbid)));
		}
		public boolean verifytest(WebElement wb,String ExpectedMsg){
			boolean flag=false;
			String actMsg=wb.getText();
			if(ExpectedMsg.equals(actMsg)){
				flag=true;
				System.out.println("msg is verified==pass");
			}else{
				System.out.println("msg is not verified==fail");
			}
			return flag;
			
		}
		public void acceptAlert(){
			Alert alt=BaseClass.driver.switchTo().alert();
			alt.accept();
		}
		public void cancelAlert(){
			Alert alt=BaseClass.driver.switchTo().alert();
			alt.accept();
		}
	}

