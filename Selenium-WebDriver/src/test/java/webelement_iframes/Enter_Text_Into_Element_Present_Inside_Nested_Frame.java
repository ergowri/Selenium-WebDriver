package webelement_iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//script to enter text intoan element whichis present inside a nestedframe
public class Enter_Text_Into_Element_Present_Inside_Nested_Frame {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement iframeWithinFrame = driver
				.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a"));
		iframeWithinFrame.click();

		WebElement nestedFrame = driver
				.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[2]/div[2]/iframe"));
		driver.switchTo().frame(nestedFrame);

		WebElement iFrameDemo = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(iFrameDemo);

		WebElement iFrameTextBox = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		iFrameTextBox.sendKeys("iframe");

	}

}
