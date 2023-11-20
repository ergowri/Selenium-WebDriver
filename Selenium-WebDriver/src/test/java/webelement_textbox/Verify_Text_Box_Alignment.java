package webelement_textbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//script to verify emailpassword present in loginpage  alignedhorizontally
public class Verify_Text_Box_Alignment {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		WebElement email = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
		WebElement login = driver
				.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
		WebElement password = driver.findElement(By.xpath("//*[@id=\"Password\"]"));

		Point p1 = email.getLocation();
		int x1 = p1.getX();
		System.out.println("X value of email field: " + x1);

		Point p2 = password.getLocation();
		int x2 = p2.getX();
		System.out.println("X value of password field: " + x2);

		if (x2 - x1 <= 0) {
			System.out.println("Email textbox and password textbox aligned horizontally");
		} else {
			System.out.println("Email textbox and paswword textbox not aligned horizontally");
		}

	}

}
