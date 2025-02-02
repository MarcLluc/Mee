package frd;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class tonto {

	@Test
	public void Billexp() throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.billboards.com.ng/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("button[class='cky-btn cky-btn-accept']")).click();
		
		WebElement boardcatdropdown = driver.findElement(By.linkText("Board Categories"));
		//WebElement gantry = driver.findElement(By.cssSelector("li[id='menu-item-6005'] a[title='Gantry']"));

		
	//	Select dropdown = new Select(boardcatdropdown);
		
		Actions mouseover = new Actions(driver);
		
		mouseover.moveToElement(boardcatdropdown).perform();
		driver.findElement(By.id("menu-item-6005")).click();
		//driver.findElement(By.cssSelector("li[id='menu-item-5997'] a[title='48 Sheet']")).click();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//mouseover.click(gantry).perform();
		driver.findElement(By.xpath("//a[normalize-space()='Directional Gantry AT FESTAC (PM)']")).click();
		driver.findElement(By.name("add-to-cart")).click();
		//WebElement scartIcon = driver.findElement(By.linkText("2"));
		//mouseover.moveToElement(scartIcon).perform();
		System.out.println(driver.findElement(By.xpath("//span[@class='count']")).getText());
		//driver.findElement(By.xpath("//span[text()='1']")).getText();
		
		if (driver.findElement(By.xpath("//span[@class='count']")).getText().equals("1"))
				
				{
			System.out.println("Verification Passed");
				
				}
		else {
			System.out.println("Verification Failed");
		}
		
		
		
		Thread.sleep(3000);
		
		
		//driver.findElement(By.xpath("//a[@class='link-dropdown']"));
		driver.findElement(By.className("flaticon-online-shopping-cart")).click();
		//driver.findElement(By.xpath("//span[@class='flaticon-online-shopping-cart']")).click();
		driver.findElement(By.xpath("//a[@class='button wc-forward']")).click();
		driver.findElement(By.xpath("//a[@class='checkout-button button alt wc-forward']")).click();
		
		driver.findElement(By.id("select2-billing_country-container")).click();
		driver.findElement(By.xpath("//li[contains(@id, 'PL')]")).click();
		
		driver.findElement(By.id("billing_last_name")).sendKeys("ADrain");
		
		driver.findElement(By.id("billing_first_name")).sendKeys("Turms");
		
		driver.findElement(By.id("billing_company")).sendKeys("Turms-ADrain SP ZOO");
		driver.findElement(By.id("billing_address_1")).sendKeys("Szlak 77/222");
		driver.findElement(By.id("billing_city")).sendKeys("Krakow");
		driver.findElement(By.id("billing_phone")).sendKeys("+487306712345");
		driver.findElement(By.id("billing_email")).sendKeys("Sum@yahoo.com");
		
		
		driver.findElement(By.id("billing_postcode")).sendKeys("77789");
		
		
	System.out.println("Pop up needs to be clicked");
		
		//WebElement chatpopup = driver.findElement(By.className("tawk-message-preview-chat-bubble"));
	
	Thread.sleep(3000);
		
		//driver.findElement(By.id("tawk-message-preview")).click();
		
	//	if (driver.findElement(By.id("tawk-message-preview")).isDisplayed())
				
			//	{
			
			//mouseover.moveToElement(chatpopup).perform();
			
			//driver.findElement(By.className("tawk-icon-close")).click();
			
		//	driver.findElement(By.xpath("//i[contains(@class; 'tawk-icon-close')]"));
			
			//	}
		
		
	driver.findElement(By.id("place_order")).click();
	
	driver.close();
	
	Thread.sleep(2000);
	
	}

	@Test
	public void Direct_From_Cart () throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.billboards.com.ng/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("button[class='cky-btn cky-btn-accept']")).click();
		
		WebElement boardcatdropdown = driver.findElement(By.linkText("Board Categories"));
		//WebElement gantry = driver.findElement(By.cssSelector("li[id='menu-item-6005'] a[title='Gantry']"));

		
	//	Select dropdown = new Select(boardcatdropdown);
		
		Actions mouseover = new Actions(driver);
		
		mouseover.moveToElement(boardcatdropdown).perform();
		driver.findElement(By.id("menu-item-6005")).click();
		
		
		//driver.findElement(By.cssSelector("li[id='menu-item-5997'] a[title='48 Sheet']")).click();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//mouseover.click(gantry).perform();
		driver.findElement(By.xpath("//a[normalize-space()='Directional Gantry AT FESTAC (PM)']")).click();
		driver.findElement(By.name("add-to-cart")).click();
		//WebElement scartIcon = driver.findElement(By.linkText("2"));
		//mouseover.moveToElement(scartIcon).perform();
		System.out.println(driver.findElement(By.xpath("//span[@class='count']")).getText());
		//driver.findElement(By.xpath("//span[text()='1']")).getText();
		
		if (driver.findElement(By.xpath("//span[@class='count']")).getText().equals("1"))
				
				{
			System.out.println("Verification Passed");
				
				}
		else {
			System.out.println("Verification Failed");
		}
		
		
		
		Thread.sleep(3000);
		
		//WebElement chatpopup = driver.findElement(By.xpath("//iframe[@id='s9j4u48t7361735477427571']"));
		
		//mouseover.moveToElement(chatpopup).build().perform();
		
		//driver.findElement(By.className("tawk-icon-close")).click();
		driver.findElement(By.id("menu-item-4627")).click();
		
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//a[@class='link-dropdown']"));
		driver.findElement(By.className("flaticon-online-shopping-cart")).click();
		//driver.findElement(By.xpath("//span[@class='flaticon-online-shopping-cart']")).click();
		//driver.findElement(By.xpath("//a[@class='button wc-forward']")).click();
		driver.findElement(By.xpath("//a[@Class='button checkout wc-forward']")).click();
		
		//driver.findElement(By.xpath("//a[@class='checkout-button button alt wc-forward']")).click();
		
		driver.findElement(By.id("select2-billing_country-container")).click();
		driver.findElement(By.xpath("//li[contains(@id, 'PL')]")).click();
		
		driver.findElement(By.id("billing_last_name")).sendKeys("ADrain");
		
		driver.findElement(By.id("billing_first_name")).sendKeys("Turms");
		
		driver.findElement(By.id("billing_company")).sendKeys("Turms-ADrain SP ZOO");
		driver.findElement(By.id("billing_address_1")).sendKeys("Szlak 77/222");
		driver.findElement(By.id("billing_city")).sendKeys("Krakow");
		driver.findElement(By.id("billing_phone")).sendKeys("+487306712345");
		driver.findElement(By.id("billing_email")).sendKeys("Sum@yahoo.com");
		
		
		driver.findElement(By.id("billing_postcode")).sendKeys("77789");
		
		
	System.out.println("Pop up needs to be clicked");
		
		//WebElement chatpopup = driver.findElement(By.className("tawk-message-preview-chat-bubble"));
	
	Thread.sleep(3000);
		
		//driver.findElement(By.id("tawk-message-preview")).click();
		
	//	if (driver.findElement(By.id("tawk-message-preview")).isDisplayed())
				
			//	{
			
			//mouseover.moveToElement(chatpopup).perform();
			
			//driver.findElement(By.className("tawk-icon-close")).click();
			
		//	driver.findElement(By.xpath("//i[contains(@class; 'tawk-icon-close')]"));
			
			//	}
		System.out.println("My Name");
		
	driver.findElement(By.id("place_order")).click();

	driver.close();
	
	Thread.sleep(2000);
		
}
}

