package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//script to handle synchronization issue for webpage using WebDriverWait
public class Explicit_Wait {

	public static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.co.in/");

		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		By elementlocator = By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/a/h3");

		explicit_Wait(driver, 20, elementlocator).click();

	}

	public static WebElement explicit_Wait(WebDriver driver, int time, By locator) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		WebElement e = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return driver.findElement(locator);
	}

}
