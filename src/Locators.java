import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");	
     WebDriver driver=new ChromeDriver();
     driver.get("http://facebook.com");
     driver.findElement(By.id("email")).sendKeys("brajeshbharti0908@gmail.com");
     driver.findElement(By.name("pass")).sendKeys("xxxxxxxxx");
     //driver.findElement(By.linkText("Forgotten account?")).click();
     driver.findElement(By.xpath("//*[@id=\'u_0_2\']")).click();
	}

}