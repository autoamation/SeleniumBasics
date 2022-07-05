package Training;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
		driver.findElement(By.id("windowButton")).click();
		String mainwindow = driver.getWindowHandle();
      	Set<String> childwindows = driver.getWindowHandles();
      	//System.out.println(mainwindow);
      	for(String s : childwindows)
      	{
      		System.out.println(s);
      		 driver.switchTo().window(s);
      		 System.out.println(driver.getCurrentUrl());

      	}
      	driver.close();


	}

}
