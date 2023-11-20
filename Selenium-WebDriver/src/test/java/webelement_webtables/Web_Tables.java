package webelement_webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//script to read data from web tables 
public class Web_Tables {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/tables");

		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr"));
		System.out.println(rows.size());

		List<WebElement> columns = driver.findElements(By.xpath("//*[@id=\"table1\"]/thead//th"));
		System.out.println(columns.size());

		String specific_value = driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[1]/td[2]")).getText();
		System.out.println(specific_value);

		System.out.println();

		for (int r = 1; r <= rows.size(); r++) {
			for (int c = 1; c <= columns.size(); c++) {

				String data = driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[" + r + "]/td[" + c + "]"))
						.getText();
				System.out.print(data + "      ");
			}
			System.out.println();
		}

		driver.quit();
	}

}
