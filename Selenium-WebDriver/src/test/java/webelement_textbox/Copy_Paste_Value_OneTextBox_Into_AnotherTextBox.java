package webelement_textbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//script to copy&paste the value present in onetextbox into anothertextbox
public class Copy_Paste_Value_OneTextBox_Into_AnotherTextBox {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement email = driver.findElement(By.xpath("//*[@id=\"Email\"]"));

		email.sendKeys(Keys.CONTROL + "a");
		email.sendKeys(Keys.CONTROL + "c");
		email.clear();
		email.sendKeys(Keys.CONTROL + "v");

		driver.quit();

	}

}
