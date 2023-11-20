package keyboard_interactions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//script to upload file using sendKeys() & robot class methods
public class Upload_File {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.monsterindia.com/");

		driver.findElement(By.xpath("//*[@id=\"heroSection-container\"]/div[3]/div[2]/div[2]")).click();

		Upload_File.using_sendKeys_Upload_File();
		Thread.sleep(2000);
		Upload_File.using_RobotClass_Upload_File();

		driver.quit();

	}

	public static void using_sendKeys_Upload_File() {
		driver.findElement(By.xpath(
				"/html/body/div[3]/section[1]/div/div[4]/div/div/section/div/form/div[1]/div[1]/div/div/input[1]"))
				.sendKeys("C:\\Users\\Gowri S\\Desktop\\New Text Document.txt");
	}

	public static void using_RobotClass_Upload_File() throws AWTException, InterruptedException {

		WebElement upload = driver.findElement(By.xpath(
				"/html/body/div[3]/section[1]/div/div[4]/div/div/section/div/form/div[1]/div[1]/div/div/input[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", upload);

		Robot r = new Robot();
		r.delay(2000);

		StringSelection ss = new StringSelection("C:\\Users\\Gowri S\\Desktop\\New Text Document.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);

		driver.quit();
	}
}
