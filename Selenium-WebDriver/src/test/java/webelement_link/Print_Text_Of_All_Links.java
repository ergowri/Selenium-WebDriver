package webelement_link;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//script to print text of links present on the page using getText()
public class Print_Text_Of_All_Links {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");

		List<WebElement> all_Links = driver.findElements(By.tagName("a"));

		int number_of_links = all_Links.size();
		System.out.println("Total number of links present on webpage: " + number_of_links);

		for (WebElement text_of_all_links : all_Links) {
			System.out.println("Text of links present on a webpage: " + text_of_all_links.getText());
		}
		driver.quit();
	}

}
