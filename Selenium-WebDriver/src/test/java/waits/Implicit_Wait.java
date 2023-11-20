package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//script to handle synchronization issue for webpage using implicitwait
public class Implicit_Wait {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.co.in/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Find the search input field and enter "Selenium"
		driver.findElement(By.name("q")).sendKeys("Selenium");

		// Press Enter (RETURN key) to perform the search
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

		// Wait for the search results page to load (implicitly wait)

		// Locate an element on the search results page using XPath

		By elementLocator = By.xpath(
				"/html/body/div[6]/div/div[12]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3");

		driver.quit();
	}

}
