package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chromedriver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		driver.get("https://www.flipkart.com/");
		WebElement ele = driver.findElement(By.xpath("//span[.='Electronics']"));
		action.moveToElement(ele).perform();
		WebElement ele2 = driver.findElement(By.linkText("Gaming"));
		action.moveToElement(ele2).perform();
		driver.findElement(By.linkText("Gaming Consoles")).click();
	}
}