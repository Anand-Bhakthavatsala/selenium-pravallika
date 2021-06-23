package testng;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SpiceJet extends BaseClass{

	//public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	@Test
	public void spicejet() throws InterruptedException
	{
		invokeBrowser();
		driver.navigate().to("https://www.spicejet.com/");
		WebElement currencydrpdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		String actualTitle="SpiceJet - Flight Booking for Domestic and International, Cheap Air";
		Assert.assertEquals(actualTitle, driver.getTitle());//verification
		//Currency selection
		Select currency = new Select(currencydrpdown);
		currency.selectByIndex(4);
		Thread.sleep(2000);
		currency.selectByValue("INR");
		Thread.sleep(2000);
		currency.selectByVisibleText("USD");
	//	Thread.sleep(2000);
		
		List<WebElement> radioBtns = driver.findElements(By.xpath("//input[@type='radio']"));
		int number = radioBtns.size();
		
		System.out.println("First radio button text "+radioBtns.get(0).getText());
		System.out.println("Selected value "+radioBtns.get(0).isSelected());
		System.out.println("Displayed value "+radioBtns.get(0).isDisplayed());
		System.out.println("Total number of radio buttons "+number);
		System.out.println(radioBtns.get(0).getAttribute("value"));
		closeBrowser();
	}

}
