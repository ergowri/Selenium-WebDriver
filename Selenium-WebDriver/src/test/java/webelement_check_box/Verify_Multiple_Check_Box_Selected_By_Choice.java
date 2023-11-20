package webelement_check_box;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//script to verify multiple check box selected by choice or not
public class Verify_Multiple_Check_Box_Selected_By_Choice {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		List<WebElement> check_boxes = driver
				.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'checkBoxOption')]"));
		for (WebElement checkboxes : check_boxes) {
			String checkbox_name = checkboxes.getAttribute("id");
			if (checkbox_name.equals("checkBoxOption1") | checkbox_name.equals("checkBoxOption3")) {
				checkboxes.click();
			}
		}

		driver.quit();

	}

}
