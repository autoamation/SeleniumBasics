package Training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.id("prompt")).click();
		driver.findElement(By.name("textboxn")).sendKeys("selenium");
		driver.findElement(By.linkText("onlytestingblog")).click();
		driver.findElement(By.partialLinkText("testingblog")).click();
		driver.findElement(By.xpath("//input[@title='search' and @type='text']")).sendKeys("java");
		driver.findElements(By.tagName("div"));
		List<WebElement> ele = driver.findElements(By.tagName("textarea"));
		System.out.println(ele.size());


	}

}
