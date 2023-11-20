package webelement_check_box;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//script to verify number of check boxes in a webpage
public class Number_Of_Check_Boxes_Page {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		List<WebElement> number_of_checkboxes_page = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		System.out.println(number_of_checkboxes_page.size());

		driver.quit();

	}

}
