package Mypack;
import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class LaunchURL {
 private static ChromeDriver chromeDriver;
    private static DevTools chromeDevTools;
	@Test
	public void launch() {
		/*
		 * System.setProperty("webdriver.chrome.whitelistedIps", ""); chromeDriver = new
		 * ChromeDriver();
		 * 
		 * chromeDevTools = chromeDriver.getDevTools(); chromeDevTools.createSession();
		 * chromeDriver.get("https://www.javatpoint.com/");
		 */
		
		ChromeOptions options=new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		driver.get("https://www.twitter.com/");
		
	}
	
	
	

}
