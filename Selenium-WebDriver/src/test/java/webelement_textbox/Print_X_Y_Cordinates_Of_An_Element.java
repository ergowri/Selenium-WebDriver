package webelement_textbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//script to print x and y coordinates of an element
public class Print_X_Y_Cordinates_Of_An_Element {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		WebElement email = driver.findElement(By.xpath("//*[@id=\"Email\"]"));

		Point p = email.getLocation();
		System.out.println("X coordinate (in pixels): " + p.getX());
		System.out.println("Y coordinate (in pixels): " + p.getY());

		driver.quit();

	}

}
