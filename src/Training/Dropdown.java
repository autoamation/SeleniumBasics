package Training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		WebElement dropdown = driver.findElement(By.id("cars"));
		
		
		Select drop = new Select(dropdown);
		//drop.selectByIndex(3);
		//drop.selectByValue("def");
		drop.selectByVisibleText("Volvo");
		drop.selectByVisibleText("Saab");
		drop.selectByVisibleText("Opel");
		drop.selectByVisibleText("Audi");
		//Thread.sleep(3000);
		
//		drop.deselectAll();
//		drop.selectByIndex(0);
//		drop.selectByIndex(1);
//		drop.selectByIndex(2);
//		drop.selectByIndex(3);
		drop.deselectByVisibleText("Audi");
		
		List<WebElement> options = drop.getOptions();
		
		for (WebElement o:options) {
			System.out.println(o.getText());
		}
		
		WebElement first = drop.getFirstSelectedOption();
		System.out.println(first.getText());
		
List<WebElement> seloptions = drop.getAllSelectedOptions();
		
		for (WebElement o:seloptions) {
			System.out.println(o.getText());
		}

		
		//drop.deselectByVisibleText("doc 4");
		System.out.println(drop.isMultiple());
		

	}

}
