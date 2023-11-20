package webelement_textbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//script to change the value present in the text box
public class Change_Value_Present_Inthe_Text_Box {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement email = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
		email.clear();

		email.sendKeys("admin@store.com");

		driver.quit();

	}

}
