package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation {
	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chromedriver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/radio");
		WebElement opt1 = driver.findElement(By.xpath("//input[@id='yes']"));
		opt1.click();
		boolean verify1 = opt1.isSelected();
		WebElement opt2 = driver.findElement(By.id("no"));
		opt2.click();
		boolean verify2 = opt1.isSelected();
		if (verify1 != verify2) {
			System.out.println("Only one option is selected and there is not bug");
		} else {
			System.out.println("Two option is selected. so bug was there");
		}

		WebElement nobug = driver.findElement(By.id("nobug"));
		nobug.click();
		boolean find1 = nobug.isSelected();
		WebElement bug = driver.findElement(By.id("bug"));
		bug.click();
		boolean find2 = bug.isSelected();
		if (find1 != find2) {
			System.out.println("Only one option is selected and there is not bug");
		} else {
			System.out.println("Two option is selected. so bug was there");
		}

	}
}