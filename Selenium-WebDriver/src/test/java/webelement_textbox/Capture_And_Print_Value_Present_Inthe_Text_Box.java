package webelement_textbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//script to capture and print the value present in the text box
public class Capture_And_Print_Value_Present_Inthe_Text_Box {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		WebElement email = driver.findElement(By.xpath("//*[@id=\"Email\"]"));

		System.out.println(email.getAttribute("value"));

		driver.quit();

	}

}
