package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxRadio {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement male_radiobtn = driver.findElement(By.xpath("//input[@value='male']"));
		male_radiobtn.click();
		
		WebElement female_radiobtn = driver.findElement(By.xpath("//input[@value='female']"));
		female_radiobtn.click();
		
		WebElement orange_Checkbox = driver.findElement(By.xpath("//input[@value='orange']"));
		System.out.println(orange_Checkbox.isSelected());
		if (orange_Checkbox.isSelected()==false)
		{
			orange_Checkbox.click();
		}
		
		WebElement blue_Checkbox = driver.findElement(By.xpath("//input[@value='blue']"));
		System.out.println(blue_Checkbox.isSelected());
		if (blue_Checkbox.isSelected()==false)
		{
			blue_Checkbox.click();
		}

	}

}
