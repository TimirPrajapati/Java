import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Invoking Chrome Browser
		// System.setProperties("webdriver.chrome.driver","/Users/jack/Documents/chromedriver");
		//WebDriver driver = new ChromeDriver();
		
		// Invoking Firefox Browser
		// Firefox driver -- geckodriver
		//WebDriver driver = new FirefoxDriver();
		
		// Invoking microsoft Edge Browser
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
	}

}
