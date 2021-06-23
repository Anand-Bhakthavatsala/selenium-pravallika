import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestNGBrowserDemo extends BaseClass{

//	public static void main(String[] args) throws InterruptedException {
	
	@Test
	public void invoke()
	{
		// Below two lines are responsible to invoke/open the browser
		//	SeleniumDemo1 sd = new SeleniumDemo1();
		invokeBrowser();
		driver.get("https://www.google.com/");
		String expectedTitle=driver.getTitle();//actual 
		String actualTitle="google";

		if(actualTitle.equalsIgnoreCase(expectedTitle))//validation
		{
			System.out.println("Title matching & hence Test case pass");
		}
		else
			System.out.println("Title not matching & hence Test fail");	
		
		//driver.findElement(By.name("q")).sendKeys("Java");//identify and perform action
		
		/*WebElement textBox = driver.findElement(By.name("q"));
		textBox.sendKeys("Automation");
		textBox.sendKeys(Keys.ENTER);*/
	//	driver.findElement(By.xpath("//input[@name='btnK']")).click();
		
		driver.findElement(By.linkText("Gmail")).click();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(WebElement link:links )
		{
			System.out.println(link.getText()+" link name: "+link.getAttribute("href"));
		}
	//	closeBrowser();
	}

}
