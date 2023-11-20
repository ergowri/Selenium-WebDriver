package mouse_interactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//script to automate mouse hover using moveToElement() of actions class

public class Mouse_Hover {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/#top");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement mouseHover = driver.findElement(By.xpath("//*[@id=\"mousehover\"]"));
		WebElement clickTop = driver.findElement(By.xpath("/html/body/div[4]/div/fieldset/div/div/a[1]"));

		Actions a = new Actions(driver);
		a.moveToElement(mouseHover).moveToElement(clickTop).click().build().perform();

	}

}
