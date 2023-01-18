package WingifyTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Login_Home_PageTest {

	static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {

		String projectPath = System.getProperty("user.dir");
		System.setProperty("Webdriver.chrome.driver", projectPath+"/Drivers/Chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://sakshingp.github.io/assignment/login.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		//scroll down Login page
		JavascriptExecutor jsx = (JavascriptExecutor)driver;
		jsx.executeScript("window.scrollBy(0,350)","");

		//UserName block hover & Click
		WebElement UserName = driver.findElement(By.id("username"));
		UserName.click();
		Thread.sleep(2000);

		//UserName mentioned
		UserName.sendKeys("VaibhavTambe");
		Thread.sleep(1500);

		//password block hover & Click
		WebElement Pass = driver.findElement(By.id("password"));
		Pass.click();
		Thread.sleep(2000);

		//password mentioned
		Pass.sendKeys("Vaibhav@70395");
		Thread.sleep(1500);

		//LoginButton hover & Click
		driver.findElement(By.id("log-in")).click();
		Thread.sleep(2000);
		System.out.println("Successfully LogIn");

		//Demo Title hover & Click
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/a/div[2]")).click();
		Thread.sleep(1500);

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		//scroll down Home page
		JavascriptExecutor jsx1 = (JavascriptExecutor)driver;
		jsx1.executeScript("window.scrollBy(0,400)","");
		Thread.sleep(1500);

		//amount header transaction table click  
		driver.findElement(By.id("amount")).click();
		System.out.println("Successfully Click on AmountHeader- Transaction Table");
		Thread.sleep(2000);
		
		driver.close();
		//driver.quit();
		

	}

	




}


