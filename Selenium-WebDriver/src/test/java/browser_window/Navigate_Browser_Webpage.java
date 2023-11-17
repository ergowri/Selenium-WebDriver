package browser_window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//script to navigate within browser webpage 
public class Navigate_Browser_Webpage {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());

		driver.navigate().to("https://www.amazon.in/");
		System.out.println(driver.getTitle());

		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());

		driver.navigate().refresh();
		driver.navigate().forward();

		System.out.println(driver.getCurrentUrl());

		driver.quit();
	}

}
