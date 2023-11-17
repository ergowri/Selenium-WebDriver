package browser_window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//script to open google.com & verify that it is redirected to google.co.in

public class Verify_URL_Of_Webpage {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");

		String expected_url = "https://www.google.co.in/";
		String actual_url = driver.getCurrentUrl();

		if (actual_url.contains(expected_url)) {
			System.out.println("Pass: URL contains .co.in");
		} else {
			System.out.println("Fail: URL doesn't contains .co.in");
		}
		driver.quit();
	}
}
