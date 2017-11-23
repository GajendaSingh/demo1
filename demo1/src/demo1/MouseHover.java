package demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MouseHover {

	@BeforeMethod
	public void browserInvoke()
	{
	//System.setProperty("webdriver.chrome.driver","C://l//Java Seleium//Seleium//chromedriver.exe");	
		System.setProperty("webdriver.gecko.driver","C://l//Java Seleium//Seleium//geckodriver.exe");
		//WebDriver driver = new ChromeDriver();
	}
		
	@Test
	public void executeLogin() throws InterruptedException
	{
		MouseHover m = new MouseHover();
		m.browserInvoke();
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
		Thread.sleep(2000);
		
		/*WebElement we= driver.findElement(By.xpath("//input[@id='user_login']"));
		we.sendKeys("opensourcecms");*/
		 driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("opensourcecms");
		 driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("opensourcecms");
		 driver.findElement(By.xpath("//input[@id='wp-submit' or @value ='Log In']")).click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 Action ac =new Actions();
		 
		
		System.out.println("Coming out");
		//driver.quit();
	}

}
