package webelement_link;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//script to find the total number of links present on google page
public class Print_Total_Number_Of_Links {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		int number_of_links = links.size();
		System.out.println("Total number of links present on webpage: " + number_of_links);

		driver.quit();

	}

}
