package webelement_alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//script to handle simple alert window using alert interface methods
public class Simple_Alert {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		WebElement simple_alert = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button"));
		simple_alert.click();

		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();

		WebElement result = driver.findElement(By.id("result"));
		System.out.println(result.getText());

		driver.quit();

	}

}
