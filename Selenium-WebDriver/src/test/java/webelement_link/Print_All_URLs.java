package webelement_link;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

//script to print all the URL present on the page using getAttribute()
public class Print_All_URLs {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.co.in/");

		List<WebElement> all_Links = driver.findElements(By.tagName("a"));

		int number_of_links = all_Links.size();
		System.out.println("Total number of links present on webpage: " + number_of_links);

		for (WebElement urls : all_Links) {
			System.out.println("URL present on the webpage" + urls.getAttribute("href"));

		}
		driver.quit();
	}

}
