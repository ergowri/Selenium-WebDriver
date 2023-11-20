package webelement_datepicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//script to pick date, month, year from the datepicker
public class Date_Picker {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.redbus.in/");

		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]")).click();

		String expected_month = "Sep";
		String expected_year = "2022";
		String expected_date = "10";

		while (true) {

			String month_year = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			String arr[] = month_year.split(" ");
			String split_month = arr[0];
			String split_year = arr[1];

			if (split_month.equals(expected_month) && split_year.equals(expected_year)) {
				break;
			} else {
				driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button"))
						.click();
			}

			List<WebElement> all_dates = driver
					.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));

			for (WebElement dates : all_dates) {
				String dt = dates.getText();
				if (dt.equals(expected_date)) {
					dates.click();
					break;
				}
			}
			Thread.sleep(2000);
			driver.close();
		}

	}
}
