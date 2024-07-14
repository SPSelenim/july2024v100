package POMSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POMSearch {

	public WebDriver driver = null;

	public String first="fname";
	public String last="lname";
	public String qa="//a[@name='QA']";
	
	public POMSearch(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFirstName() {
		WebElement ele=null;
		ele=driver.findElement(By.id(first));
		return ele;
	}
	
	public WebElement getLastName() {
		WebElement ele=null;
		ele=driver.findElement(By.id(last));
		return ele;
	}

	
	public WebElement getQA() {
		WebElement ele=null;
		ele=driver.findElement(By.xpath(qa));
		return ele;
	}
	
	public void SendFirst(String myData)
	{
		getFirstName().sendKeys(myData);
	}

	public void SendLast(String myData)
	{
		getLastName().sendKeys(myData);
	}

	public void clickQA()
	{
		try {
		getQA().click();
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
	}

}
