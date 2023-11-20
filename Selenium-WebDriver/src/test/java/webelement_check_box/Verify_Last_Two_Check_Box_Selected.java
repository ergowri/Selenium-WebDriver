package webelement_check_box;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//script to verify last two check box is selected or not
public class Verify_Last_Two_Check_Box_Selected {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		List<WebElement> check_boxes = driver
				.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'checkBoxOption')]"));
		int total_checkboxes = check_boxes.size();
		for (int i = total_checkboxes - 2; i < total_checkboxes; i++) {
			check_boxes.get(i).click();

		}
		driver.quit();
	}

}
