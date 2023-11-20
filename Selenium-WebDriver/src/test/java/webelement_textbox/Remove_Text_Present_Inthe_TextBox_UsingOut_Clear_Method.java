package webelement_textbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//script to remove text present in the text box without using clear method
public class Remove_Text_Present_Inthe_TextBox_UsingOut_Clear_Method {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		WebElement email = driver.findElement(By.xpath("//*[@id=\"Email\"]"));

		email.sendKeys(Keys.CONTROL + "a");
		email.sendKeys(Keys.CONTROL.DELETE);

		driver.quit();

	}

}
