import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeFirefox {

	public static void main(String[] args) {
	  System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.20.1-win64\\geckodriver.exe");
      WebDriver driver=new FirefoxDriver();
	  driver.get("http://facebook.com");
	  System.out.println (driver.getTitle());
	}

}
