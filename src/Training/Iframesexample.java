package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframesexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.switchTo().frame("frame-one1434677811");
		WebElement firstName = driver.findElement(By.id("RESULT_TextField-1"));
		firstName.sendKeys("frame1");
		driver.switchTo().defaultContent() ;
		WebElement searchtextbox = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		searchtextbox.sendKeys("search");

	}

}
