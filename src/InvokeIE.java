import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class InvokeIE {

	public static void main(String[] args) {
	  System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IE_Driver\\MicrosoftWebDriver.exe");
      WebDriver driver=new InternetExplorerDriver();
	  driver.get("http://facebook.com");
	  System.out.println (driver.getTitle());
	}

}
