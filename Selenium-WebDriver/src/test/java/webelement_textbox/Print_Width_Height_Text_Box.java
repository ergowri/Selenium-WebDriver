package webelement_textbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//script to print width and height of a text box
public class Print_Width_Height_Text_Box {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		WebElement email = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
		WebElement login = driver
				.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));

		Dimension d = email.getSize();
		System.out.println("Height of the text box: " + d.getHeight());
		System.out.println("Width of the text box: " + d.getWidth());

		// getText_vs_getAttribute
		System.out.println(login.getAttribute("type"));
		System.out.println(login.getText());

		driver.quit();
	}

}
