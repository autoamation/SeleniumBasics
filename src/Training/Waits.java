package Training;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		WebElement mainbtn = driver.findElement(By.id("display-other-button"));
		mainbtn.click();
		//driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		//Thread.sleep(11000);
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Enabled']")));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Enabled']")));
		WebElement enablebtn = driver.findElement(By.xpath("//button[text()='Enabled']"));
		enablebtn.click();
		driver.quit();
		
		

	}

}
