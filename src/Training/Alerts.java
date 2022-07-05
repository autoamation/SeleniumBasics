package Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		WebElement alertBtn = driver.findElement(By.id("alertButton"));
		alertBtn.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		WebElement timeralertBtn = driver.findElement(By.id("confirmButton"));
		timeralertBtn.click();
		alert.dismiss();
		
		WebElement promptBtn = driver.findElement(By.id("promtButton"));
		promptBtn.click();
		alert.sendKeys("alert");
		String msg = alert.getText();
		System.out.println(msg);
		alert.accept();
		

	}

}
