package browser_newtab;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/***
 * 
 * @author Gowri S
 * 
 * @see Write a script to automate the following scenarios:
 * 
 * @see 1. Count the number of browser windows opened by selenium
 * @see 2. Print the window handle of all the browser windows
 * @see 3. Print the title of all the browser windows
 * @see 4. Close all the browser windows
 * 
 * @see script to print title of all browser windows
 */
public class Title_All_Browser_Windows {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://app.vwo.com/#/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("//*[@id=\"js-login-wrap\"]/div[2]/div[2]/div/a")).click();

		Set<String> all_window_handles_id = driver.getWindowHandles();

		// Count the number of browser windows opened by selenium
		System.out.println("Number of browser windows opened by selenium is: " + all_window_handles_id.size());

		// Print the window handle of all the browser windows
		System.out.println("Window handle IDs of all browser windows: " + all_window_handles_id);

		for (String window_handle_id : all_window_handles_id) {
			// Print the title of all the browser windows
			driver.switchTo().window(window_handle_id);
			System.out.println("Title of all browser windows: " + driver.getTitle());
		}

		// Close all the browser windows
		driver.quit();
	}

}
