package mouse_interactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//script to automate dragAndDrop using dragAndDrop() of actions class
public class Drag_And_Drop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.switchTo().frame(driver.findElement(By.xpath("*//iframe[@class='demo-frame lazyloaded']")));
		WebElement drag_source_gallery = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]/img"));
		WebElement drag_target_trash = driver.findElement(By.xpath("//*[@id=\"trash\"]"));

		Actions ac = new Actions(driver);

		// first method
		// ac.dragAndDrop(drag_source_gallery, drag_target_trash).build().perform();

		// second method
		ac.clickAndHold(drag_source_gallery).moveToElement(drag_target_trash).build().perform();

		ac.release();

		driver.quit();

	}
}
