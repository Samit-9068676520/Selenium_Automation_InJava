package ui;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicDriver {
	public static String browser = "Chrome";// External configuration
	public static WebDriver driver;

	// public static ChromeDriver driver1;
	public static void main(String[] args) {
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
//		driver.get("https://www.saucedemo.com/");
//		WebElement password=driver.findElement(By.id("password"));
//		//driver.findElement(RelativeLocator.with(By.tagName("input")).above(password)).sendKeys("Testing");
//		WebElement email= driver.findElement(RelativeLocator.with(By.tagName("input")).above(password));
//		driver.findElement(RelativeLocator.with(By.tagName("input")).below(password)).click();
		//driver.get("https://developer.salesforce.com/signup");
		//driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/div[2]/form/div[2]/div[1]/input")).sendKeys("Samit");
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title=driver.getTitle();
		System.out.println(title);
		 
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
		
		driver.navigate().to("http://www.google.com");
		driver.close();
	}
}
