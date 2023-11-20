package mouse_interactions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//script to right click on a element using contextClick() of actions class
public class Right_Click {

	public static void main(String[] args) throws AWTException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement rightClickMe = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));

		Actions actions = new Actions(driver);
		actions.contextClick(rightClickMe).build().perform();

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_W);

		driver.findElement(By.xpath("/html/body/ul/li[7]")).click();

		Alert alertWindow = driver.switchTo().alert();

		System.out.println(alertWindow.getText());

		driver.quit();

	}

}
