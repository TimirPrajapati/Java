import java.time.Duration;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompleteLoginWithDummyPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // driver waits for 10 sec for the getting
																			// element on webpage.
		driver.get("https://rahulshettyacademy.com/locatorspractice/"); // To Hit the URL on browser.
		System.out.println(driver.getTitle()); // To get the title of the above mentioned web page.
		driver.findElement(By.id("inputUsername")).sendKeys("jack"); // Enter username jack in usrname txtbox on login
																		// page.
		driver.findElement(By.name("inputPassword")).sendKeys("Mypass"); // Enter pass in pass txtbox on login page.
		// <button class="submit signInBtn" type="submit" xpath="1">Sign In</button>.
		// className --> signInBtn.
		driver.findElement(By.className("signInBtn")).click();
		driver.close(); // To close current window. Use this when this script only works one time.
		// driver.quit(); // Closing all associated windows. Use this when this script.

	}

}
