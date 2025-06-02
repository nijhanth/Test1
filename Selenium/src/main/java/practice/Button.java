package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Button {
	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chromedriver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in");
		driver.findElement(By.linkText("Work-Space")).click();
		driver.findElement(By.xpath("//a[@href='/button']")).click();
		WebElement ele = driver.findElement(By.xpath("//button[.='Find Location']"));
		System.out.println(ele.getLocation());
		WebElement clr = driver.findElement(By.id("color"));
		System.out.println(clr.getCssValue("background-color"));
		Rectangle rect = driver.findElement(By.id("property")).getRect();
		Dimension size = rect.getDimension();
		int x = size.getHeight();
		int y = size.getWidth();
		System.out.println("X: " + x);
		System.out.println("Y: " + y);
		WebElement btn = driver.findElement(By.id("isDisabled"));
		System.out.println(btn.isEnabled());
		WebElement hld = driver.findElement(By.xpath("//button[@id='isDisabled']/div"));
		System.out.println(hld.getText());
		Actions actions = new Actions(driver);
		actions.clickAndHold(hld).pause(3000L).release().perform();
		System.out.println(hld.getText());
		driver.quit();
	}
}