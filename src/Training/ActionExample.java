package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
//		WebElement  copyBtn= driver.findElement(By.xpath("//button[text()='Copy Text']"));
	Actions act =  new Actions(driver);
//		act.contextClick(copyBtn).perform();
//		act.doubleClick(copyBtn).perform();
//		
//		WebElement  dragbox= driver.findElement(By.id("draggable"));
//		WebElement  dropbox= driver.findElement(By.id("droppable"));
//		act.dragAndDrop(dragbox, dropbox).perform();
		//driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
//		WebElement  cBtn= driver.findElement(By.xpath("//li[text()='C']"));
//		WebElement  bBtn= driver.findElement(By.xpath("//li[text()='B']"));
//		act.moveToElement(cBtn).clickAndHold(cBtn).moveToElement(bBtn).build().perform();
	WebElement  textarea= driver.findElement(By.id("ta1"));
//	act.keyDown(textarea, Keys.SHIFT);
//	act.sendKeys(textarea,"this is text area");
//	act.keyUp(Keys.SHIFT);
//	act.perform();
	
	act.keyDown(textarea, Keys.SHIFT).sendKeys(textarea,"this is text area").keyUp(Keys.SHIFT).build().perform();
	
	
		
		

	}

}
