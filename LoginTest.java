package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	public static String browser = "Chrome";// External configuration
	public static WebDriver driver;

	// public static ChromeDriver driver1;
	public static void main(String[] args) throws InterruptedException {
		if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browser.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
//		driver.get("https://www.saucedemo.com/");
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input")).click();
//		driver.close();
		//driver.get("https://www.selenium.dev/documentation/en/getting_started_with_webdriver");
		//driver.navigate().to("https://www.selenium.dev/documentation/en/webdriver/js_alerts_prompts_and_confirmations/");
//		driver.get("https://app.testing-env.kloudlearn.com/");
//		Thread.sleep(5000);
//		driver.findElement(By.cssSelector("input#username")).sendKeys("wahid@kloudone.com");
//		driver.findElement(By.cssSelector("input#password")).sendKeys("test@123");
//		driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div[1]/div[1]/form/div[4]/input[2]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html/body/div[1]/div/section/main/div/div/div[2]/div/div/div/div/div/div/div/div[1]/div/div/div/div/div[1]/div/div[2]/div/span")).click();
//		Thread.sleep(5000);
//		driver.get("https://wahidkhan.testing-env.kloudlearn.com/onboarding");
//		Thread.sleep(3000);
		//driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[3]/button[1]")).click();
		//Xpath->   //input[starts-with(@id,'last_name_45666546677')]//This is used for dynamic we can also used for static.
		//Xpath->   //input[contains(@name,'user[email]')]  //This is similer to starts-with.
		//Xpath->   //a[text()='Master Subscription Agreement'] //This is used for chhosing the text which is majority time exist in blue colour.
		driver.get("https://developer.salesforce.com/signup");
		//driver.findElement(By.xpath("//a[text()='Master Subscription Agreement']")).click();
		//Xpath->   //input[@type='email' and @name='user[email]'] //AND and OR opeartor have used here.
		//Xpath->   //select[@name='user[country]']//child::option[6]  //Axes Method Parent,Child,Self
		//driver.findElement(By.xpath("//select[@name='user[country]']//child::option[6]")).click();
		//Xpath->   //option[@value='AF']//parent::select
		//Xpath->   //option[@value='AF']//self::option
		//XPath->   //div[@class='signup_container']//descendant::div[@class='layout_column_container']
		
	}
}
