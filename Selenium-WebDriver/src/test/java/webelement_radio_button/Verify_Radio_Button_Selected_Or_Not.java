package webelement_radio_button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//script to verify the status of the radio button is selected or not
public class Verify_Radio_Button_Selected_Or_Not {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

		WebElement male = driver.findElement(By.id("gender-male"));
		WebElement female = driver.findElement(By.name("Gender"));

		male.click();
		System.out.println("Male radio button is selected: " + male.isSelected());

		if (male.isSelected()) {
			female.click();
			System.out.println("Female radio button is selected: " + female.isSelected());
		} else {
			System.out.println("Radio button is not selected: ");
		}

		driver.quit();

	}

}
