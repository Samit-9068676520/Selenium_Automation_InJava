package ui;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBroeser {
	public static WebDriver driver=null;
	@SuppressWarnings("deprecation")
	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		if (title.equalsIgnoreCase("Amazon.in"))
		{
			System.out.println("Title matches");
		}
		else {
			System.out.println(title);
		}
		//locate a webElement
		String tagname="";
		tagname=driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(3)")).getText();
		System.out.println(tagname);
		//dropdown
		WebElement prime=driver.findElement(By.cssSelector("#nav-link-prime > span:nth-child(1)"));
		Actions action=new Actions(driver);
		action.moveToElement(prime).perform();
		Thread.sleep(2000);
		//Shift the tab control
		java.util.Set<String> handles=driver.getWindowHandles();
		String winhandle1=driver.getTitle();
		handles.remove(winhandle1);
		String winHandle=handles.iterator().next();
		String winHandle2="";
		if (winhandle1!=winHandle)
		{
			winHandle2=winHandle;
			driver.switchTo().window(winHandle2);
			System.out.println(winHandle2);
		}
		Thread.sleep(2000);
	}
}
