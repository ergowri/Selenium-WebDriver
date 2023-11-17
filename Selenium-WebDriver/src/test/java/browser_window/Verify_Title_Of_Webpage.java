package browser_window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//script to open google.com & verify title of the webpage
public class Verify_Title_Of_Webpage {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");

		String expected_title = "Google";
		String actual_title = driver.getTitle();

		if (actual_title.equals(expected_title)) {
			System.out.println("Pass: Title is Google");
		} else {
			System.out.println("Fail: Title is not Google");
		}

		// System.out.println(driver.getPageSource());
		driver.quit();
	}

}
