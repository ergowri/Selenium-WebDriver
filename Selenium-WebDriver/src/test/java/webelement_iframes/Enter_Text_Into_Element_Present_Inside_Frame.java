package webelement_iframes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//script to enter a text into an element which is present inside a frame
public class Enter_Text_Into_Element_Present_Inside_Frame {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		List<WebElement> number_of_iframes = driver.findElements(By.tagName("iframe"));
		System.out.println("Number of Iframes in webpage: " + number_of_iframes.size());

		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("iframe");
	}

}
