package webelement_check_box;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//script to verify the status of the check box is selected or not
public class Verify_Check_Box_Selected {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://demo.seleniumeasy.com/basic-checkbox-demo.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement check_box = driver
				.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/div[1]/form/label[1]"));
		check_box.click();

		WebElement result = driver.findElement(By.xpath("//*[@id=\"txtAge\"]"));
		System.out.println(result.getText());

		WebElement check_box_defaultchecked = driver
				.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/div[1]/form/label[2]/input"));

		if (check_box_defaultchecked.isSelected()) {
			System.out.println("Check box is selected");
		} else {
			System.out.println("Check box is not selected");
		}

		driver.quit();
	}

}
