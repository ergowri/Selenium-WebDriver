package browser_newtab;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

//script open new browser tab & switch focus to newly opened window
public class Open_New_Window_Tab {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.orangehrm.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		String originalWindowHandle = driver.getWindowHandle();

		// Open a new tab and switch to it
		WebDriver newTab = driver.switchTo().newWindow(WindowType.TAB);

		// Navigate to a URL in the new tab
		newTab.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// Interact with elements in the new tab
		WebElement element = newTab.findElement(
				By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));

		element.sendKeys("Admin");

		driver.switchTo().window(originalWindowHandle);
		System.out.println(driver.getTitle());

		driver.quit();

	}

}
