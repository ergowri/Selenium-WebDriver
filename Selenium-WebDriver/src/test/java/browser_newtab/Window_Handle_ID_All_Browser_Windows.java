package browser_newtab;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//script to print window handle IDs of all browser windows
public class Window_Handle_ID_All_Browser_Windows {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Return window handle ID of current browser window
		System.out.println("Window handle ID of current browser window is: " + driver.getWindowHandle());

		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();

		Set<String> all_windows_IDs = driver.getWindowHandles();

		// Return the window handle IDs of all the browser windows
		System.out.println(all_windows_IDs);

		// Using for each loop
		for (String windows_IDs : all_windows_IDs) {
			System.out.println(windows_IDs);
		}

		/*
		 * // To retrieve id's we use iterator method Iterator<String> it =
		 * all_windows_IDs.iterator(); String parent_window_id = it.next(); String
		 * child_window_id = it.next(); System.out.println("Parent Window ID: " +
		 * parent_window_id); System.out.println("Child Window ID: " + child_window_id);
		 */

		driver.quit();
	}

}
