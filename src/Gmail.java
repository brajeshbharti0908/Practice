import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail{

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String url = "https://gmail.com";
		driver.get(url);
		WebElement email_phone = driver.findElement(By.xpath("//input[@id='identifierId']"));
		email_phone.sendKeys("brajeshbharti0908@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("identifierNext")).click();
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(password));
		password.sendKeys("brajeshbhartilovespapamummy9162464647");
		Thread.sleep(2000);
		driver.findElement(By.id("passwordNext")).click();
		
		WebElement comp=driver.findElement(By.xpath("//div[text()='COMPOSE']"));
		wait.until(ExpectedConditions.elementToBeClickable(comp));
		comp.click();
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//textarea[contains(@name,'to')]")).sendKeys("brajeshbharti0908@gmail.com"+Keys.ENTER);
		
		
	    driver.findElement(By.xpath("//input[contains(@name,'subjectbox')]")).sendKeys("brajeshbharti0908@gmail.com");
	    driver.findElement(By.xpath("//div[contains(@class,'Am Al editable LW-avf')]")).sendKeys("brajeshbharti0908@gmail.com");
	    
	    
	    
		driver.findElement(By.xpath("//div[@data-tooltip-delay='800']")).click();
		Thread.sleep(1000);
		driver.quit();
	}

}