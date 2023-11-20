package webelement_textbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//script to clear the text present in the text box by pressing back space
public class Clear_Text_Inthe_Text_Box_By_Pressing_Backspace {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement email = driver.findElement(By.xpath("//*[@id=\"Email\"]"));

		String email_value = email.getAttribute("value");
		System.out.println(email_value);
		int count = email_value.length();

		for (int i = 1; i <= count; i++) {
			email.sendKeys(Keys.BACK_SPACE);
		}

		driver.quit();
	}

}
