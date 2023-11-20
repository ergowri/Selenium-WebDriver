package webelement_radio_button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//script to verify status of the radiobutton is displayed,enabled or not
public class Verify_Radio_Button_Displayed_Enabled {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

		WebElement male = driver.findElement(By.id("gender-male"));
		WebElement female = driver.findElement(By.name("Gender"));

		if (female.isDisplayed()) {
			System.out.println("Female radio button is displayed ");
		} else {
			System.out.println("Female radio button is not displayed ");
		}

		if (female.isEnabled()) {
			System.out.println("Female radio button is enabled");
		} else {
			System.out.println("Female radio button is disabled");
		}

		driver.quit();

	}

}
