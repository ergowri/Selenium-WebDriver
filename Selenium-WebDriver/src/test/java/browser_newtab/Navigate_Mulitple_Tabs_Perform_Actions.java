package browser_newtab;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//script to navigate b/w multiple tabs & perform some action on each tabs
public class Navigate_Mulitple_Tabs_Perform_Actions {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[1]")).click();

		Set<String> all_window_IDs = driver.getWindowHandles();

		for (String window_handle_ID : all_window_IDs) {
			driver.switchTo().window(window_handle_ID);
			System.out.println(driver.getTitle());
			driver.close();
		}
		driver.quit();
	}

}
