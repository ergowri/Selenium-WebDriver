package webelement_link;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//script to find the total no of visible&hidden links present on google pg
public class Print_Visible_Hidden_Links {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");

		List<WebElement> all_Links = driver.findElements(By.tagName("a"));

		int number_of_links = all_Links.size();
		System.out.println("Total number of links present on webpage: " + number_of_links);

		int visible_links_count = 0;
		int hidden_links_count = 0;
		for (WebElement visible_links : all_Links) {
			if (visible_links.isDisplayed()) {
				visible_links_count++;
				System.out.println(visible_links.getText());
			} else {
				hidden_links_count++;
			}
		}
		System.out.println("Number of visible links on a webpage:" + visible_links_count);
		System.out.println("Number of hidden links on the webpage: " + hidden_links_count);

		driver.quit();
	}

}
